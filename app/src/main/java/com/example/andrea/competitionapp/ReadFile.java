package com.example.andrea.competitionapp;

/**
 * Created by havak on 4/4/18.
 */

public class ReadFile {
    private String eventTitle;
    private String state;
    private String day;
    private String month; 
    private String year;
    private String building;
    private String streetNum;
    private String streetName;
    private String city;
    private String zipCode;

    public ReadFile (String eventTitle, String day, String month, String year, String building, String streetNum, String streetName, String city, String state, String zipCode){
        this.building = building;
        this.city = city;
        this.eventTitle = eventTitle;
        this.state = state;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.zipCode = zipCode;
    }

    public String getEventTitle(){
        return eventTitle;
    }

    public String getState(){
        return state;
    }

    public String getDay(){
        return day;
    }

    public String getMonth(){
        return month;
    }

    public String getYear () {
        return year;
    }

    public String getBuilding(){
        return building;
    }

    public String getStreetNum () {
        return streetNum;
    }

    public String getStreetName(){
        return streetName;
    }

    public String getCity(){
        return city;
    }

    public String getZipCode (){
        return zipCode;
    }
}




