package com.creachy.hsfindarchetype;

import java.util.ArrayList;

public class DeckDefinition {
    private ArrayList<Card> commonCards;

    public DeckDefinition(ArrayList<Card> commonCards, ArrayList<Card> uncommonCards) {
        this.commonCards = commonCards;
        this.uncommonCards = uncommonCards;
    }

    private ArrayList<Card> uncommonCards;

    public ArrayList<Card> getCommonCards() {
        return commonCards;
    }

    public ArrayList<Card> getUncommonCards() {
        return uncommonCards;
    }
}
