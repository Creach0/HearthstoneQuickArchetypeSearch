package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * DeckSearchService handles the logic for retrieving a {@link DeckResponse} by Archetype name, or retrieving {@link Card}s from
 * a given {@link Deck}.
 * <br/><br/>
 * This interfaces with the {@link CardsCacheService} and {@link HSReplayCacheService} to collate data and return it in
 * a way that would be useful for quick reference by a Hearthstone player.
 */
@Service
public class DeckSearchService {
    private CardsCacheService cardsCache;
    private HSReplayCacheService deckCache;
    private ObjectMapper objectMapper;

    @Autowired
    public DeckSearchService(CardsCacheService cardsCache, HSReplayCacheService deckCache, ObjectMapper objectMapper) {
        this.cardsCache = cardsCache;
        this.deckCache = deckCache;
        this.objectMapper = objectMapper;
    }

    public DeckResponse searchForDeck(String deckName) {
        return searchForDeck(deckName, true);
    }

    /**
     * Finds the most popular, or highest winrate, deck and returns a DeckResponse containing the deck's cards.
     * @param deckName Search term for deck archetype.
     * @param sortByPopularity Default true, determines whether popularity or winrate will be used to find top decks.
     * @return A DeckResponse containing the deck's cards.
     */
    public DeckResponse searchForDeck(String deckName, Boolean sortByPopularity) {
        Archetype archetype = deckCache.getArchetypeByName(deckName);
        ArrayList<Deck> decks = deckCache.getDecksByArchetypeId(archetype.getId());

        //decks are default sorted by winrate, so we need not sort if popularity = false
        Deck deck = decks.get(0);

        if (sortByPopularity) {
            for (Deck currentDeck : decks) {
                if (deck.getGamesCount() < currentDeck.getGamesCount()) {
                    deck = currentDeck;
                }
            }
        }

        ArrayList<Pair<Integer, Card>> coreCards = getCardsFromDeck(deck);

        return new DeckResponse(archetype.getName(), deck.getGamesCount(), deck.getWinRate(), coreCards);
    }

    /**
     * This takes a Deck object and returns a list of Cards using Card ID.
     * @param deck Object containing deck data
     * @return List of (count, cards)
     */
    public ArrayList<Pair<Integer, Card>> getCardsFromDeck(Deck deck) {
        ArrayList<Pair<Integer, Card>> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> cardIds = null;
        try {
            cardIds = objectMapper.readValue(deck.getCardIds(), new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        if (cardIds == null) {
            return null;
        }

        for (ArrayList<Integer> idAndCount: cardIds){
            Integer cardId = idAndCount.get(0);
            Integer count = idAndCount.get(1);

            Card card = cardsCache.getCardById(cardId);

            //Just make sure it's being inserted in order of cost
            if (result.isEmpty()) {
                result.add(new ImmutablePair<>(count, card));
            } else {
                boolean added = false;
                for (int i = 0; i < result.size(); i++) {
                    Integer cost = card.getCost();
                    if (cost < result.get(i).getRight().getCost()) {
                        result.add(i, new ImmutablePair<>(count, card));
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    result.add(new ImmutablePair<>(count, card));
                }
            }
        }

        return result;
    }
}
