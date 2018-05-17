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
import android.widget.Button;
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
    public static Event selectedEvent;
    DatabaseReference myRef;
    FirebaseDatabase database;
    ArrayList<Event> events=new ArrayList<Event>();
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_list_view);
        final Button buttonList = findViewById(R.id.button4);
        buttonList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent=new Intent(v.getContext(),AddEventsActivity.class);
                startActivity(intent);
            }
        });
        database = FirebaseDatabase.getInstance();

        myRef=database.getReference();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Event event;
                events.clear();
                for(DataSnapshot snap: dataSnapshot.getChildren()) {
                    event = (snap.getValue(Event.class));
                    if (event == null){
                        Log.d("hava","event object is null");
                    }
                    Log.d("names", event.getName());
                    Log.d("Months", event.getMonth());
                    events.add(event);
                    final ListView lv = (ListView) findViewById(R.id.lv);

                    //creates arrays of event information for each list view
                    final List<String> eventNames = new ArrayList<String>();


                    EditText inputSearch;
                    inputSearch = (EditText) findViewById(R.id.inputSearch);


                    // Adds eventNames to ListView
                   final ArrayAdapter adapter = new ArrayAdapter<String>(lv.getContext(), android.R.layout.simple_list_item_1, eventNames);
                    etSearch = (EditText) findViewById(R.id.inputSearch);

                    etSearch.addTextChangedListener(new TextWatcher() {

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            // Call back the Adapter with current character to Filter
                            adapter.getFilter().filter(s.toString());
                        }

                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count,int after) {
                        }

                        @Override
                        public void afterTextChanged(Editable s) {
                        }
                    });
                    lv.setAdapter(adapter);
                    eventNames.clear();
                    //adds event info to eventnames arraylist
                    for (Event e : events) {
                        eventNames.add(e.getName() + " " + e.getMonth() + " " + e.getNumberDate() + " " + e.getYear());
                    }
                    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            selectedEvent = events.get(i);
                            Intent intent = new Intent(view.getContext(), AdminCompInfo.class);
                            startActivity(intent);
                        }
                    });


                }


            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("AdminListView", "Failed to read value.", error.toException());
            }
        });
    }
}



