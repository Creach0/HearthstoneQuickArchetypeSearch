package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

public class DeckSearchServiceTests {
    @Mock
    CardsCacheService cardsCache;
    @Mock
    HSReplayCacheService hsReplayCache;

    DeckSearchService deckSearchService;

    public DeckSearchServiceTests() {
        Card dummyCard = HearthstoneCardsDummyDataGenerator.dummyCardResponse();
        Archetype dummyArchetype = HSReplayDummyDataGenerator.dummyArchetypeResponse();
        DecksResponseContainer decksResponseContainer = HSReplayDummyDataGenerator.dummyDecksResponse();

        MockitoAnnotations.openMocks(this);
        Mockito.doReturn(dummyCard).when(cardsCache).getCardById(any());
        Mockito.doReturn(dummyArchetype).when(hsReplayCache).getArchetypeByName(any());
        ArrayList<Deck> decks = new ArrayList<>(Arrays.asList(decksResponseContainer.getData()));
        Mockito.doReturn(decks).when(hsReplayCache).getDecksByArchetypeId(7);//dummyarchetype has id 7

        deckSearchService = new DeckSearchService(cardsCache, hsReplayCache, new ObjectMapper());
    }

    //ArrayList<Pair<Integer, Card>> getCardsFromDeck(Deck deck)
    @Test
    public void cardsFromDeckTest() {
        Deck[] data = HSReplayDummyDataGenerator.dummyDecksResponse().getData();
        ArrayList<Pair<Integer, Card>> cardsFromDeck = deckSearchService.getCardsFromDeck(data[0]);
        assertNotNull(cardsFromDeck);

        //check 30 cards are returned
        Integer cardCount = 0;
        for (Pair<Integer, Card> subTotals : cardsFromDeck) {
            cardCount += subTotals.getLeft();
        }
        assertEquals(30, cardCount);
    }

    //DeckResponse searchForDeck(String deckName, Boolean sortByPopularity, Integer topX)
    @Test
    public void archetypeSearchIdentifiesCorrectDeckByPopularityTest() {
        DeckResponse token_druid = deckSearchService.searchForDeck("Token Druid",true); //explicit in case defaults change
        assertNotNull(token_druid);

        //correct deck was identified
        //8191 is most popular deck in dummy response
        assertEquals(8191, token_druid.getTotalGames());
    }


    @Test
    public void archetypeSearchIdentifiesCorrectDeckByWinrateTest() {
        DeckResponse token_druid = deckSearchService.searchForDeck("Token Druid",false); //explicit in case defaults change
        assertNotNull(token_druid);

        //correct deck was identified
        //65.46 is the highest winrate in dummy data (first in returned data = highest WR)
        assertEquals(65.46, token_druid.getWinrate());
    }
}