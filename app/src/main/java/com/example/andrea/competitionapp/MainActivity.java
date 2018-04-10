package com.example.andrea.competitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int currentDate;
    private int currentMonth;
    private int currentYear;
    private String place;
    private int month1;
    private int month2;
    int realDays;
    private ArrayList<ReadFile> locations;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locations = new ArrayList<ReadFile> ();
        readLocationData();

        //These values are hardcoded for testing purposes. They will not be hardcoded in the final app.
        currentDate = 6;
        currentMonth = 4;
        currentYear = 2018;
        place = "Worcester";
        month1 = 4;
        month2 = 6;


        for (ReadFile locations : locations){
            Log.d("MainActivity", "The event is " + locations.getEventTitle() + ". It is located in " + locations.getCity() + ", " + locations.getState() + " at " + locations.getStreetNum() + " " + locations.getStreetName() + " " + locations.getZipCode() + ". It will take place on " + locations.getDay() + " " + locations.getMonth() + " " + locations.getYear());
            int day = Integer.parseInt(locations.getDay());
            int month = Integer.parseInt(locations.getMonth());
            int year = Integer.parseInt(locations.getYear());
            String streetName = locations.getStreetName();
            String city = locations.getCity();

            int changeTime = day - currentDate;


            //Possible changing interface for person in Worcester
            //Assuming same year
            //The printed strings are just to test the logic, will be used to order the listview
            if (city == place){
                System.out.println("The competition is in your city.");
            }

            else if (city != place){
                System.out.println("You will have to travel for this competition.");
            }

            if (month < currentMonth && year <= currentYear){
                System.out.println("This competition has passed. Please choose another.");
            }

            if (month == currentMonth ){
                if (changeTime < 0){
                    System.out.println("This competition has passed.");
                }

                if (changeTime == 0){
                    System.out.println("This competition is today. Check the competition website for information about walk-in registrations.");
                }

                if (changeTime > 0){
                    System.out.println("This competition is in " + changeTime + " days.");
                }
            }

            if (month > currentMonth){
                Months monthCalc = new Months();
                int between = monthCalc.monthsBetween(month1,month2);

                int daysMonthA = monthCalc.numDays(month1);
                int daysMonthB = daysMonthA-day;

                for (int j = month1+1; j < between; j++){
                    int monthC = monthCalc.numDays(j);
                    realDays = daysMonthB + monthC;
                }

                System.out.println("Your competition is " + realDays + "days away.");

            }
        }


    }

    public void readLocationData(){
        //Read the data from the file

        InputStream is = getResources().openRawResource(R.raw.locations);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        try {
            while ((line = reader.readLine()) != null){
                //Split line by ","
                String[] fields = line.split(",");

                ReadFile s = new ReadFile(fields[0], fields[1], fields [2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], fields[9]);
                locations.add(s);

            }
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading data from file on line " + line);
        }
    }

}
