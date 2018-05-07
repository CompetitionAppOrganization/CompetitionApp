package com.example.andrea.competitionapp;

/**
 * Created by havak on 3/28/18.
 */

public class Event {

    private String name;
//blah
    private String zipCode;
    private String street;
    private String state;
    private String city;
    private String eventType;
    private String registration;
    private String link;

    private String month;
    private String numberDate;
    private String year;
    private String startTime;
    private String endTime;

    public Event(String name, String month, String numberDate, String year, String street, String city, String state, String zipCode, String link) {
        this.name = name;
        this.zipCode = zipCode;
        this.street = street;
        this.state = state;
        this.city = city;
        this.month = month;
        this.numberDate = numberDate;
        this.year = year;
        this.link=link;
    }
    public Event(){

    }
    public String getLink(){
        return link;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNumberDate() {
        return numberDate;
    }

    public void setNumberDate(String numberDate) {
        this.numberDate = numberDate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}