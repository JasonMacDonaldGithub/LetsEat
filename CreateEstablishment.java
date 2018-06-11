package com.example.jason.letseat;

/**
 * Created by Jason on 2018-03-12.
 */

public class CreateEstablishment {

    public Establishment makeEstablishment(String instructions){

        Establishment newEst = null;
        String parts[] = instructions.split("\\/");
        String type = parts[0];

        if(type.equals("Restaurant")){
            newEst = new Restaurant();
            newEst.setName(parts[1]);
            newEst.setLatitude(Double.parseDouble(parts[2]));
            newEst.setLongitude(Double.parseDouble(parts[3]));
        }
        else{
            newEst = new Restaurant();
            newEst.setName("Nothing Found");
        }

        return newEst;
    }
}
