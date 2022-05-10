package com.creachy.hsfindarchetype;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class HSReplayCacheServiceTests {
    HSReplayCacheService hsReplayCacheService;
    @Mock
    RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        Archetype[] dummyArchetypes = HSReplayDummyDataGenerator.dummyArchetypeResponse();
        DecksResponseContainer dummyDecks = HSReplayDummyDataGenerator.dummyDecksResponse();
        ResponseEntity responseEntity = new ResponseEntity(dummyArchetypes, HttpStatus.OK); // dummy response entity

        MockitoAnnotations.openMocks(this);
        Mockito.doReturn(responseEntity).when(restTemplate).getForEntity(anyString(), eq(Archetype[].class));
        Mockito.doReturn(dummyDecks).when(restTemplate).getForObject(anyString(), eq(DecksResponseContainer.class));

        hsReplayCacheService = new HSReplayCacheService(restTemplate);
        verify(restTemplate).getForEntity(anyString(), eq(Archetype[].class)); //caches on startup
        verify(restTemplate).getForObject(anyString(), eq(DecksResponseContainer.class));
    }

    @Test
    public void contextLoads() {
        assertNotNull(hsReplayCacheService);
    }

    @Test
    public void cacheLoads () {
        Deck[] deckCacheDump = null;
        Archetype[] archetypeCacheDump = null;

        try {
            //cheeky cache edit
            archetypeCacheDump = (Archetype[])FieldUtils.readField(hsReplayCacheService, "archetypeCache", true);
            deckCacheDump = (Deck[]) FieldUtils.readField(hsReplayCacheService, "deckCache", true);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        assertNotNull(archetypeCacheDump);
        assertNotNull(deckCacheDump);
    }

    @Test
    public void closeArchetypeSearch() {
        verifyNoMoreInteractions(restTemplate); //shouldn't refresh cache
        Archetype archetype = hsReplayCacheService.getArchetypeByName("nzothpriest");

        assertNotNull(archetype);
        assertEquals("N'Zoth Priest", archetype.getName());
    }

    @Test
    public void directArchetypeSearch() {
        verifyNoMoreInteractions(restTemplate); //shouldn't refresh cache
        Archetype archetype = hsReplayCacheService.getArchetypeByName("Patron Warrior");

        assertNotNull(archetype);
        assertEquals("Patron Warrior", archetype.getName());
    }

    @Test
    public void directDeckSearch() {
        verifyNoMoreInteractions(restTemplate); //shouldn't refresh cache
        ArrayList<Deck> decks = hsReplayCacheService.getDecksByArchetypeId(162); //3 warrior decks

        assertNotNull(decks);
        assertEquals(3, decks.size());
    }

    @Test
    public void cacheAutoRefreshes() {
        try {
            Integer hoursBetweenCacheRefresh = (Integer)FieldUtils.readField(hsReplayCacheService, "hoursBetweenCacheRefresh", true);
            //refresh should be 1 hour overdue
            FieldUtils.writeField(hsReplayCacheService, "lastRefreshed", Instant.now().minus(Duration.ofHours(hoursBetweenCacheRefresh+1)), true);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        hsReplayCacheService.getDecksByArchetypeId(162);
        //verify that cache has refreshed
        verify(restTemplate, times(2)).getForEntity(anyString(), eq(Archetype[].class));
        verify(restTemplate, times(2)).getForObject(anyString(), eq(DecksResponseContainer.class));
    }
}
