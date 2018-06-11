package com.example.jason.letseat;

/**
 * Created by Jason on 2018-03-12.
 */

public class Restaurant extends Establishment {
    Integer price;
    Integer rating;
    String cuisine;

    void setPrice(Integer price){
        this.price = price;
    }

    void setRating(Integer rating){
        this.rating = rating;
    }

    void setPrice(String cuisine){
        this.cuisine = cuisine;
    }
}
