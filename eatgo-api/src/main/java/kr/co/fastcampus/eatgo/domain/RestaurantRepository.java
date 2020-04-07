package kr.co.fastcampus.eatgo.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();


    public RestaurantRepository()
    {
        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));


    }

    public void x()
    {

    }

    public List<Restaurant> findAll() {

        return restaurants;
    }

    public Restaurant findById(Long id) {

                return restaurants.stream()
                .filter(r -> ((Long)r.getId()).equals((Long)id))
                .findFirst()
                .orElse(null);

    }
}
