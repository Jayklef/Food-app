package com.jerry.Food_app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Restaurant {
    private String id;
    private String name;
    private String cuisine;
    private String streetaddress;
    private String city;
    private String state;
    private int zip;
    private long phonenumber;
    private int pricerange;
    private boolean delivery;

    @JsonProperty("dietaryrestrictions")
    private DietaryRestrictions dietaryRestrictions;
}
