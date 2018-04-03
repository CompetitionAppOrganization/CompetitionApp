package com.example.andrea.competitionapp;

/**
 * Created by Andrea on 3/28/2018.
 */

public class Date {
    private String month;
    private String numberDate;
    private String year;
    private String hour;
    private String minute;
    public Date(String month,String numberDate, String year){
        this.month=month;
        this.numberDate=numberDate;
        this.year=year;
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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}
