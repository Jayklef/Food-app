package com.jerry.Food_app.service;

import com.jerry.Food_app.model.FavoriteRestaurant;

import java.util.List;

public interface FavoriteRestaurantService {

    FavoriteRestaurant addFavorite(FavoriteRestaurant favorite);
    void removeFavorite(Long id);
    List<FavoriteRestaurant> getAllFavorites();
}
