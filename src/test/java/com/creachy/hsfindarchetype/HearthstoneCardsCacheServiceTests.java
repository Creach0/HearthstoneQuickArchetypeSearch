package com.creachy.hsfindarchetype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class HearthstoneCardsCacheServiceTests {
    HearthstoneCardsCacheService hearthstoneCardsCache;
    @Mock
    RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        Card[] dummyCards = HearthstoneCardsDummyDataGenerator.dummyCardsResponse();
        ResponseEntity responseEntity = new ResponseEntity(dummyCards, HttpStatus.OK); // dummy response entity

        MockitoAnnotations.openMocks(this);
        Mockito.doReturn(responseEntity).when(restTemplate).getForEntity(anyString(), eq(Card[].class));

        hearthstoneCardsCache = new HearthstoneCardsCacheService(restTemplate);
        verify(restTemplate).getForEntity(anyString(), eq(Card[].class)); //caches on startup
        verifyNoMoreInteractions(restTemplate);
    }

    @Test
    public void contextLoads() {
        assertNotNull(hearthstoneCardsCache);
    }

    @Test
    public void testDirectMatch() {
        Card card = hearthstoneCardsCache.getCardById("AT_003");
        assertNotNull(card);
        assertEquals("Fallen Hero", card.getName());
    }

    @Test
    public void testNoMatch() {
        Card card = hearthstoneCardsCache.getCardById("bad id");
        assertNull(card);
    }
}
