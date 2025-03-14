package com.jerry.Food_app.controller;

import com.jerry.Food_app.model.Restaurant;
import com.jerry.Food_app.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return service.getAllRestaurants();
    }

    @GetMapping("/state/{state}")
    public List<Restaurant> getRestaurantsByState(@PathVariable String state) {
        return service.getRestaurantsByState(state);
    }

    @GetMapping("/delivery")
    public List<Restaurant> getRestaurantsWithDelivery() {
        return service.getRestaurantsWithDelivery();
    }
}
