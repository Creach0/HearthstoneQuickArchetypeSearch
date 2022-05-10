package com.creachy.hsfindarchetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CardsCacheService {
    private RestTemplate restTemplate;
    private Card[] cardCache;

    @Autowired
    public CardsCacheService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

        refreshCache();
    }

    private void refreshCache() {
        ResponseEntity<Card[]> responseEntity = restTemplate.getForEntity("https://api.hearthstonejson.com/v1/137436/enUS/cards.json", Card[].class);
        cardCache = responseEntity.getBody();
    }

    public Card getCardById(String cardId) {
        if (cardCache == null) return null;
        for (Card card : cardCache) {
            if (card.getId().equals(cardId)) {
                return card;
            }
        }
        return null;
    }
}
