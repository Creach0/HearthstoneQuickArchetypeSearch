package com.creachy.hsfindarchetype;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArchetypeSearchController {

    @GetMapping("/findCommonDecklist")
    public DeckResponse findCommonDecklist(@RequestParam(value = "query") String query) {
        return new DeckResponse(new ArrayList<Card>(), new ArrayList<Card>());
    }
}
