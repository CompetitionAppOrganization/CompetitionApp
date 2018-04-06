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

    private ArrayList<ReadFile> locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locations = new ArrayList<ReadFile> ();
        readLocationData();

        for (ReadFile locations : locations){
            Log.d("MainActivity", "The event is " + locations.getEventTitle() + ". It is located in " + locations.getCity() + ", " + locations.getState() + " at " + locations.getStreetNum() + " " + locations.getStreetName() + " " + locations.getZipCode() + ". It will take place on " + locations.getDay() + " " + locations.getMonth() + " " + locations.getYear());
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

                ReadFile s = new ReadFile(fields[0], fields[1], fields [2], fields[3], fields[4], fields[5], fields[6], fields[8], fields[9], fields[10]);
                locations.add(s);

            }
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading data from file on line " + line);
        }
    }
}
