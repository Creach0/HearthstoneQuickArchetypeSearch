package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchetypeSearchController {
    private DeckSearchService deckSearchService;
    private ObjectMapper objectMapper;

    @Autowired
    public ArchetypeSearchController(DeckSearchService deckSearchService, ObjectMapper objectMapper) {
        this.deckSearchService = deckSearchService;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/findCommonDecklist")
    public DeckResponse findCommonDecklist(@RequestParam(value = "query") String query) {
        return deckSearchService.searchForDeck(query);
    }
}
