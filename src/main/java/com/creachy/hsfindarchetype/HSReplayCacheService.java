package com.creachy.hsfindarchetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.text.similarity.LevenshteinDistance;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 * HSReplay's API doesn't seem to support many search functions, as the website itself doesn't allow any searches.
 * This means that we need to load every archetype and deck before searching for a set of decks.
 * <br/><br/>
 * To prevent delay between requesting the information and receiving it, we're using a cache here that refreshes every
 * {@link HSReplayCacheService#hoursBetweenCacheRefresh} hours.
 */
@Service
public class HSReplayCacheService {
    private RestTemplate restTemplate;
    private Archetype[] archetypeCache;
    private Deck[] deckCache;
    private Instant lastRefreshed;
    private final Integer hoursBetweenCacheRefresh = 2;

    @Autowired
    public HSReplayCacheService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        refreshCache();
    }

    /**
     * Refreshes the stored {@link HSReplayCacheService#archetypeCache} and {@link HSReplayCacheService#deckCache} from
     * HSReplay's API. Sets {@link HSReplayCacheService#lastRefreshed} using Instant.now()
     */
    private void refreshCache() {
        lastRefreshed = Instant.now();
        ResponseEntity<Archetype[]> archetypeResponse = restTemplate.getForEntity("https://hsreplay.net/api/v1/archetypes/", Archetype[].class);
        archetypeCache = archetypeResponse.getBody();

        DecksResponseContainer deckResponse = restTemplate.getForObject("https://hsreplay.net/analytics/query/list_decks_by_win_rate_v2/?GameType=RANKED_STANDARD&LeagueRankRange=GOLD&TimeRange=CURRENT_PATCH", DecksResponseContainer.class);
        deckCache = deckResponse.getData();
    }


    /**
     * Checks if we need to refresh, based on whether {@link HSReplayCacheService#hoursBetweenCacheRefresh}
     * has elapsed since last refresh
     * @return boolean
     */
    private Boolean shouldRefresh() {
        Instant refreshAfter = lastRefreshed.plus(Duration.ofHours(hoursBetweenCacheRefresh));
        return Instant.now().isAfter(refreshAfter);
    }

    /**
     * @param archetypeName Name of requested archetype. Does not have to be exact.
     * @return Archetype with closest match to given name
     */
    public Archetype getArchetypeByName(String archetypeName) {
        if (shouldRefresh()) {
            refreshCache();
        }
        if (archetypeCache == null) {
            return null;
        }

        int closestDistance = Integer.MAX_VALUE;
        Archetype closestMatch = null;
        for (Archetype archetype : archetypeCache) {
            //LevenshteinDistance between query name and any given archetype = find "closest match"
            int currentDistance = LevenshteinDistance.getDefaultInstance().apply(archetypeName, archetype.getName());
            if(currentDistance < closestDistance) {
                closestDistance = currentDistance;
                closestMatch = archetype;
            }
        }

        return closestMatch;
    }

    /**
     * @param archetypeId of requested archetype
     * @return Arraylist of decks with the requested archetypeId
     */
    public ArrayList<Deck> getDecksByArchetypeId(int archetypeId) {
        if (shouldRefresh()) {
            refreshCache();
        }
        if (deckCache == null) {
            return null;
        }

        ArrayList<Deck> decksOfArchetype = new ArrayList<>();
        for (Deck deck : deckCache) {
            //looking for a direct match here
            if (deck.getArchetypeId() == archetypeId) {
                decksOfArchetype.add(deck);
            }
        }

        return decksOfArchetype;
    }
}
