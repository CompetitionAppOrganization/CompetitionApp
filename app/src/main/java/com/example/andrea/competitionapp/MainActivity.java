package com.example.andrea.competitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Event> events;
    ArrayAdapter<String> adapter;
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        /*//Creates a new list view
        final ListView lv = (ListView) findViewById(R.id.lv);

        //creates arrays of event information for each list view
        final List<String> eventNames = new ArrayList<String>();

        EditText inputSearch;
        inputSearch = (EditText) findViewById(R.id.inputSearch);


        // Adds eventNames to ListView
        adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, eventNames);

        lv.setAdapter(adapter);


        events=new ArrayList<Event>();
        readEventData();

        //These values are hardcoded for testing purposes. They will not be hardcoded in the final app


        for (Event event : events) {
            Log.d("MainActivity", "The event is " + event.getName());
            eventNames.add(event.getName()+"\t"+event.getMonth()+" "+event.getNumberDate()+", "+event.getYear());

        }
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
               MainActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });



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
*/
}
