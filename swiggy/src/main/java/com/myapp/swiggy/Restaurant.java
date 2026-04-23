package com.myapp.swiggy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;


    private String name;
    private String city;
    private double rating;
    public Restaurant(){}
    public Long getId() {
        return id;
    }

    public Restaurant(String name, String city, double rating) {
        this.name = name;
        this.city = city;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
