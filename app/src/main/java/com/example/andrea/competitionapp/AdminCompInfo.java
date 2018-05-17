package com.example.andrea.competitionapp;

import android.app.Application;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AdminCompInfo extends AppCompatActivity {
    final List<Event> events=new ArrayList<Event>();
    DatabaseReference selectedEventReference;
    String keyFinal;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_comp_info);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference();
        myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    for(DataSnapshot eventsData: dataSnapshot.getChildren()) {
                        Event event= (Event) eventsData.getValue(Event.class);
                        Log.d("AdminCompInfo",event.getName());
                        if(event.getName().equals(AdminListView.selectedEvent.getName())){
                            keyFinal=eventsData.getKey();
                        }
                    }

                    TextView textView = (TextView) findViewById(R.id.Name);
                    textView.setText(AdminListView.selectedEvent.getName()); //set text for text view
                    textView= (TextView) findViewById(R.id.eventInfo);
                    textView.setText("Date: "+AdminListView.selectedEvent.getMonth()+" "+AdminListView.selectedEvent.getNumberDate()+", "+AdminListView.selectedEvent.getYear()
                            +"\nLocation: "+AdminListView.selectedEvent.getStreet()+", "+AdminListView.selectedEvent.getCity());
                    final Button buttonList = findViewById(R.id.deleteEvent);
                    buttonList.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Log.d("ahhh",keyFinal);
                            FirebaseDatabase.getInstance().getReference().child(keyFinal).removeValue();      // Code here executes on main thread after user presses button
                            Intent intent=new Intent(v.getContext(),AdminListView.class);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(),"Event Successfully Deleted!",Toast.LENGTH_SHORT).show();

                        }
                    });
                }


                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                    Log.w("AdminInfo", "Failed to read value.", error.toException());
                }
            });

    }
}
