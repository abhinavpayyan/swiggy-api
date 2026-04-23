package com.myapp.swiggy;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Restaurantservice {
    private RestaurantRepository restaurantRepository;

    public Restaurantservice(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    public Restaurant getRestaurantById(Long id){
        return restaurantRepository.findById(id).get();
    }
    public void deleteById(Long id){
        restaurantRepository.deleteById(id);
    }

    public List<Restaurant> getAllrestaurant(){
        return restaurantRepository.findAll();
    }
    public Restaurant addRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }
    public Restaurant updateRestaurant(Long id,Restaurant updateRestaurant){
        Restaurant existing =restaurantRepository.findById(id).get();
        existing.setName(updateRestaurant.getName());
        existing.setCity(updateRestaurant.getCity());
        existing.setRating(updateRestaurant.getRating());
        return restaurantRepository.save(existing);
    }
}
