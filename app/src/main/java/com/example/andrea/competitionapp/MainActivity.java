package com.example.andrea.competitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Event> events;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates a new list view
        final ListView lv = (ListView) findViewById(R.id.lv);

        //creates arrays of event information for each list view
        final List<String> eventNames = new ArrayList<String>();


        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, eventNames);

        lv.setAdapter(arrayAdapter);


        events=new ArrayList<Event>();
        readEventData();

        //These values are hardcoded for testing purposes. They will not be hardcoded in the final app


        for (Event event : events) {
            Log.d("MainActivity", "The event is " + event.getName());
            eventNames.add(event.getName()+"\t"+event.getMonth()+" "+event.getNumberDate()+", "+event.getYear());

        }




    }

    public void readEventData(){
        //Read the data from the file

        InputStream is = getResources().openRawResource(R.raw.locations);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        try {
            while ((line = reader.readLine()) != null){
                //Split line by ","
                String[] fields = line.split(",");
                Event ev = new Event(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],fields[7]);
                events.add(ev);

            }
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading data from file on line " + line);
        }
    }

}
