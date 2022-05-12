package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
    private Integer cost;
    private Integer dbfId;
    private String name;
    private String text;
    private String id;

    public String getId() {
        return id;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getDbfId() {
        return dbfId;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
