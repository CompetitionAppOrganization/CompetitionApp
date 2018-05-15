package com.example.andrea.competitionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddEventsActivity extends AppCompatActivity {
    String yearString;
    String dayString;
    String monthString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_events);


        CalendarView view = (CalendarView) findViewById(R.id.calendarView);

        view.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView arg0, int year, int month,
                                            int date) {
                yearString=String.valueOf(year);
                dayString=String.valueOf(date);
                monthString=String.valueOf(month);
                Log.d("ahhh",yearString);

                final Button buttonList = findViewById(R.id.submit);
                buttonList.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                        EditText text1 = (EditText)findViewById(R.id.addEventName);
                        final String name = text1.getText().toString().trim();

                        EditText text2 = (EditText)findViewById(R.id.address);
                        final String address = text2.getText().toString().trim();

                        EditText text3 = (EditText)findViewById(R.id.city);
                        final String city = text3.getText().toString().trim();

                        EditText text4 = (EditText)findViewById(R.id.state);
                        final String state = text4.getText().toString().trim();

                        EditText text5 = (EditText)findViewById(R.id.zip);
                        final String zip = text5.getText().toString().trim();

                        EditText text6 = (EditText)findViewById(R.id.link);
                        final String link = text6.getText().toString().trim();
                        Log.d("killme",monthString);
                        Event event=new Event(name,monthString,dayString,yearString,address,city,state,zip,link);
                        FirebaseDatabase database=FirebaseDatabase.getInstance();
                        DatabaseReference myRef=database.getReference();
                        DatabaseReference newRef= myRef.push();
                        newRef.setValue(event);
                        Intent intent=new Intent(v.getContext(),AdminListView.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Event Successfully Added!",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }
}
