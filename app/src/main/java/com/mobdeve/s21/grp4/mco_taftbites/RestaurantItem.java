package com.mobdeve.s21.grp4.mco_taftbites;

public class RestaurantItem {
    private String name;
    private float rating;
    private String distance;
    private String cuisineType;

    public RestaurantItem(String name, float rating, String distance, String cuisineType) {
        this.name = name;
        this.rating = rating;
        this.distance = distance;
        this.cuisineType = cuisineType;
    }

    public String getName() { return name; }
    public float getRating() { return rating; }
    public String getDistance() { return distance; }
    public String getCuisineType() { return cuisineType; }
}

