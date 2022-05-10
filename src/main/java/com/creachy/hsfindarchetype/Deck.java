package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deck {
    @JsonProperty("deck_list")
    private String cardIds;
    @JsonProperty("archetype_id")
    private Integer archetypeId;
    @JsonProperty("total_games")
    private Integer gamesCount;
    @JsonProperty("win_rate")
    private Double winRate;

    //ArrayList<Integer[]>
    public String getCardIds() {
        return cardIds;
    }

    public void setCardIds(String cardIds) {
        this.cardIds = cardIds;
    }

    public Integer getArchetypeId() {
        return archetypeId;
    }

    public void setArchetypeId(Integer archetypeId) {
        this.archetypeId = archetypeId;
    }

    public Integer getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(Integer gamesCount) {
        this.gamesCount = gamesCount;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }
}
