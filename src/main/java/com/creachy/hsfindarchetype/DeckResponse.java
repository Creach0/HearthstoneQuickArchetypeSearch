package com.creachy.hsfindarchetype;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

public class DeckResponse {
    private String archetypeName;
    private int totalGames;
    private double winrate;
    private ArrayList<Pair<Integer, Card>> coreCards;

    public DeckResponse(String archetypeName, int totalGames, double winrate, ArrayList<Pair<Integer, Card>> coreCards) {
        this.archetypeName = archetypeName;
        this.totalGames = totalGames;
        this.winrate = winrate;
        this.coreCards = coreCards;
    }

    public ArrayList<Pair<Integer, Card>> getCoreCards() {
        return coreCards;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public String getArchetypeName() {
        return archetypeName;
    }

    public double getWinrate() {
        return winrate;
    }
}
