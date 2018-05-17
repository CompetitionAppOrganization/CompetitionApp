package com.example.andrea.competitionapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
                            +"\nLocation: "+ListActivity.selectedEvent.getStreet()+"\n"+ListActivity.selectedEvent.getCity()+", "+ListActivity.selectedEvent.getState()+" "+ListActivity.selectedEvent.getZipCode());

        final Button buttonLink = findViewById(R.id.link);
        buttonLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(ListActivity.selectedEvent.getLink()));
                startActivity(i);
            }
        });
        final Button buttonList = findViewById(R.id.button4);
        buttonList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://calendar.google.com"));
                startActivity(viewIntent);
            }
        });
    }
}
