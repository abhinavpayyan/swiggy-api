package com.myapp.swiggy;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestaurantController {

    private Restaurantservice restaurantservice;

    public RestaurantController(Restaurantservice restaurantservice) {
        this.restaurantservice = restaurantservice;
    }

    @GetMapping("/restaurants")
    public List<Restaurant>getrestaurant(){
        return restaurantservice.getAllrestaurant();
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantservice.addRestaurant(restaurant);
    }
    @PutMapping("/restaurants/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id,@RequestBody Restaurant restaurant){
        return restaurantservice.updateRestaurant(id,restaurant);
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantservice.getRestaurantById(id);
    }
    @DeleteMapping("/restaurants/{id}")
    public String deleteById(@PathVariable Long id){
         restaurantservice.deleteById(id);
         return "restaurant deleted successfully";
    }
}
