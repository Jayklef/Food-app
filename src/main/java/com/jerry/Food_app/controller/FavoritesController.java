package com.jerry.Food_app.controller;

import com.jerry.Food_app.model.FavoriteRestaurant;
import com.jerry.Food_app.service.FavoriteRestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/favorites")
    public class FavoritesController {
        private final FavoriteRestaurantService service;

        public FavoritesController(FavoriteRestaurantService service) {
            this.service = service;
        }

        @PostMapping
        public FavoriteRestaurant addFavorite(@RequestBody FavoriteRestaurant favorite) {
            return service.addFavorite(favorite);
        }

        @DeleteMapping("/{id}")
        public void removeFavorite(@PathVariable Long id) {
            service.removeFavorite(id);
        }

        @GetMapping
        public List<FavoriteRestaurant> getAllFavorites() {
            return service.getAllFavorites();
        }
    }
