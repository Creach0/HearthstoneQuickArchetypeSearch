package com.creachy.hsfindarchetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * This Service loads and caches all Hearthstone cards as Card objects.
 * Given that this cache would only need to reload every 3 months, this just loads the cache once on startup.
 */
@Service
public class CardsCacheService {
    private RestTemplate restTemplate;
    private Card[] cardCache;

    @Autowired
    public CardsCacheService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

        refreshCache();
    }

    /**
     * Reloads the {@link CardsCacheService#cardCache} from hearthstonejson.com and converts them into {@link Card}s
     */
    private void refreshCache() {
        ResponseEntity<Card[]> responseEntity = restTemplate.getForEntity("https://api.hearthstonejson.com/v1/latest/enUS/cards.json", Card[].class);
        cardCache = responseEntity.getBody();
    }

    /**
     * @param cardId DbfId of card to pull. This is used in {@link Deck} to denote card ids.
     * @return {@link Card} with the requested ID, or null if no card was found.
     */
    public Card getCardById(Integer cardId) {
        if (cardCache == null) return null;
        for (Card card : cardCache) {
            if (card.getDbfId().equals(cardId)) {
                return card;
            }
        }
        return null;
    }
}
