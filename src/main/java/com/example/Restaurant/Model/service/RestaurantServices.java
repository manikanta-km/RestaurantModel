package com.example.Restaurant.Model.service;

import com.example.Restaurant.Model.entity.Restaurant;
import com.example.Restaurant.Model.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class RestaurantServices {
    @Autowired
    RestaurantRepo restaurantRepo ;



    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurantList();
    }

    public String addRestaurant(Restaurant restaurant){
        getAllRestaurants().add(restaurant);
        return "Restaurant Added";
    }

    public String addRestaurants(List<Restaurant> restaurants){
        getAllRestaurants().addAll(restaurants);
        return restaurants.size() +"Restaurants Added";
    }

    public List<Restaurant> getRestaurantById(Integer id){
        List<Restaurant> rest = new ArrayList<>();
        for(Restaurant res : getAllRestaurants()){
            if(res.getResId().equals(id)){
                rest.add(res);
            }
        }
        return  rest;
    }

    public String updateRes(Integer id ,String special ){
        for(Restaurant res : getAllRestaurants()){
            if(res.getResId().equals(id)){
                res.setResChefsSpecial(special);
            }
        }
        return "Today's Chefs Special :  " + special;
    }

    public String deleteRestaurant(Integer id){
        for(Restaurant res : getAllRestaurants()){
            if(res.getResId().equals(id)){
                getAllRestaurants().remove(res);
            }
        }
        return "Restaurant with "+id+" removed";
    }


}
