package com.jerry.Food_app.repository;

import com.jerry.Food_app.model.FavoriteRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRestaurantRepository extends JpaRepository<FavoriteRestaurant, Long> {
}
