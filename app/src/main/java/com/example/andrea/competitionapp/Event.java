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
    private String registrationLink;

    public Event(String name, Date date, Time time, Location location, String eventType, String registrationLink){
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
    }

}
