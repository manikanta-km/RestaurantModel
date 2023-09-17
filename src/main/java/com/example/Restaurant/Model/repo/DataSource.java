package com.example.Restaurant.Model.repo;

import com.example.Restaurant.Model.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {
    @Bean
    public List<Restaurant> getRestaurantListInIt(){
        return new ArrayList<>();
    }
}

