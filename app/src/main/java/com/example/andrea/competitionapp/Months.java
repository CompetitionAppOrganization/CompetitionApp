package com.example.andrea.competitionapp;

/**
 * Created by havak on 4/6/18.
 */

public class Months {

    int monthsBetween;

    public int numDays (int month){
        if (month == 1){
            return 31;
        }

        if (month == 2){
            return 28;
        }

        if (month == 3){
            return 31;
        }

        if (month == 4){
            return 30;
        }

        if (month == 5){
            return 31;
        }

        if (month == 6){
            return 30;
        }

        if (month == 7){
            return 31;
        }

        if (month == 8){
            return 31;
        }

        if (month == 9){
            return 30;
        }

        if (month == 10){
            return 31;
        }

        if (month == 11){
            return 30;
        }

        if (month == 12){
            return 31;
        }

        return month;
    }

    public int monthsBetween (int month1, int month2){
        monthsBetween = month1 - month2;
        return monthsBetween;
    }
}
