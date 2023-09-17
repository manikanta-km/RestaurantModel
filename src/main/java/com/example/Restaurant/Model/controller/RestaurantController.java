package com.example.Restaurant.Model.controller;

import com.example.Restaurant.Model.entity.Restaurant;
import com.example.Restaurant.Model.service.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantServices restaurantServices;

    @GetMapping("Restaurants")
    public List<Restaurant> getAllRestaurants(){
        return  restaurantServices.getAllRestaurants();
    }

    @PostMapping("AddRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantServices.addRestaurant(restaurant);

    }

    @PostMapping("AddRestaurants")
    public String addRestaurants(@RequestBody List<Restaurant> restaurants){
       return restaurantServices.addRestaurants(restaurants);

    }

    @GetMapping("Restaurant/by/id/{id}")
    public List<Restaurant> getRestaurantById(@PathVariable Integer id){
       return restaurantServices.getRestaurantById(id);
    }

    @PutMapping("ChefsSpecial/id/{id}")
    public String updateRes(@PathVariable Integer id , @RequestParam String special ){
        return restaurantServices.updateRes(id,special);
    }

    @DeleteMapping("Restaurant/id/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
        return restaurantServices.deleteRestaurant(id);

    }
}
