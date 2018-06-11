package com.example.jason.letseat;

/**
 * Created by Jason on 2018-03-12.
 */

public abstract class Establishment {
    String name;
    Double lat;
    Double lon;

    void setName(String name){
        this.name = name;
    }
    void setLatitude(Double lat) {
        this.lat = lat;
    }
    void setLongitude(Double lon){
        this.lon = lon;
    }

    String getName(){
        return name;
    }
}
