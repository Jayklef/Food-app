package com.jerry.Food_app.service;

import com.jerry.Food_app.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    List<Restaurant> getAllRestaurants();
    List<Restaurant> getRestaurantsByState(String state);
    List<Restaurant> getRestaurantsWithDelivery();
}

