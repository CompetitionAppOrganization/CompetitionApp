package com.example.andrea.competitionapp;

/**
 * Created by havak on 3/28/18.
 */

public class Event {

    private String name;
    private Date date;
    private Time time;
    private Location location;
    private String eventType;
    private String registration;

    public Event(String name, Date date, Location location, String eventType, String registration){
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.eventType = eventType;
        this.registration = registration;
    }

    public String getName(){
        return name;
    }

    public Date getDate(){
        return date;
    }

    public Location getLocation(){
        return location;
    }

    public String getEventType(){
        return eventType;
    }

    public String getRegistration(){
        return registration;
    }

}
