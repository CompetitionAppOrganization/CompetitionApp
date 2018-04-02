package com.example.andrea.competitionapp;

/**
 * Created by havak on 3/28/18.
 */

public class Location {

    private String streetName;
    private String streetNum;
    private String city;
    private String state;
    private String zipCode;
    private String delimiter;
    private String address;

    public Location(String address){
        delimiter = " ";
    }

    private String getStreetNum(){
        for (int i = 0; i < address.length(); i++){
            if (address.matches(delimiter)){
                break;
            }
        }
    }


}
