package com.example.andrea.competitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CompetitionInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comp_details);
        TextView textView = (TextView) findViewById(R.id.Name);
        textView.setText(ListActivity.selectedEvent.getName()); //set text for text view
        textView= (TextView) findViewById(R.id.eventInfo);
        textView.setText("Date: "+ListActivity.selectedEvent.getMonth()+" "+ListActivity.selectedEvent.getNumberDate()+", "+ListActivity.selectedEvent.getYear()
                            +"\nLocation: "+ListActivity.selectedEvent.getStreet()+", "+ListActivity.selectedEvent.getCity());
    }
}
