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

public class CardsCacheServiceTests {
    CardsCacheService cardsCache;
    @Mock
    RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        Card[] dummyCards = HearthstoneCardsDummyDataGenerator.dummyCardsResponse();
        ResponseEntity responseEntity = new ResponseEntity(dummyCards, HttpStatus.OK); // dummy response entity

        MockitoAnnotations.openMocks(this);
        Mockito.doReturn(responseEntity).when(restTemplate).getForEntity(anyString(), eq(Card[].class));

        cardsCache = new CardsCacheService(restTemplate);
        verify(restTemplate).getForEntity(anyString(), eq(Card[].class)); //caches on startup
        verifyNoMoreInteractions(restTemplate);
    }

    @Test
    public void contextLoads() {
        assertNotNull(cardsCache);
    }

    @Test
    public void testDirectMatch() {
        Card card = cardsCache.getCardById(2545);
        assertNotNull(card);
        assertEquals("Fallen Hero", card.getName());
    }

    @Test
    public void testNoMatch() {
        Card card = cardsCache.getCardById(123124314);
        assertNull(card);
    }
}
