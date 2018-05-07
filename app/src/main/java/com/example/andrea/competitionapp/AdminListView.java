package com.example.andrea.competitionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AdminListView extends AppCompatActivity {
    DatabaseReference myRef;
    FirebaseDatabase database;
    ArrayList<Event> events=new ArrayList<Event>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_list_view);
        database = FirebaseDatabase.getInstance();

        // Read from the database
        for(int i=1;i<5;i++) {
            myRef=database.getReference("Event"+i);
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // This method is called once with the initial value and again
                    // whenever data at this location is updated.
                    Event event=( dataSnapshot.getValue(Event.class));
                    Log.d("names",event.getName());
                    Log.d("Months",event.getMonth());
                    events.add(event);
                    final ListView lv = (ListView) findViewById(R.id.lv);

                    //creates arrays of event information for each list view
                    final List<String> eventNames = new ArrayList<String>();


                    EditText inputSearch;
                    inputSearch = (EditText) findViewById(R.id.inputSearch);


                    // Adds eventNames to ListView
                    ArrayAdapter adapter=new ArrayAdapter<String>(lv.getContext(), android.R.layout.simple_list_item_1, eventNames);

                    lv.setAdapter(adapter);

                    //adds event info to eventnames arraylist
                    for(Event e: events){
                        eventNames.add(e.getName()+" "+e.getMonth()+" "+e.getNumberDate()+ " "+ e.getYear());
                    }
                    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            ListActivity.selectedEvent=events.get(i);
                            Intent intent= new Intent(view.getContext(),CompetitionInformation.class);
                            startActivity(intent);
                        }
                    });

                }
















                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                    Log.w("AdminListView", "Failed to read value.", error.toException());
                }
            });
        }
    }

}
