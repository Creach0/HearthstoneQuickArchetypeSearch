package com.creachy.hsfindarchetype;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/* * * * * * * * * * * *
 *     this sucks      *
 * * * * * * * * * * * */
/**
 * This is just a container that represents the contents of HSReplay's API response JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class DataResponseContainer {
    private Map<String, Deck[]> data;

    public void setData(Map<String, Deck[]> data) {
        this.data = data;
    }

    public Deck[] getData() {
        ArrayList<Deck> decks = new ArrayList<>();
        Collection<Deck[]> values = data.values();

        for (Deck[] nestedDeckArray : values) {
            decks.addAll(Arrays.asList(nestedDeckArray));
        }

        return decks.toArray(Deck[]::new);
    }
}

/**
 * This is just a container that represents the contents of HSReplay's API response JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class DecksResponseContainer {
    @JsonProperty("series")
    private DataResponseContainer series;

    public Deck[] getData() {
        return series.getData();
    }

    public void setSeries(DataResponseContainer series) {
        this.series = series;
    }
}