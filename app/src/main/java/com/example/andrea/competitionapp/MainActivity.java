package com.example.andrea.competitionapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        final Button buttonList = findViewById(R.id.button3);
        buttonList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent=new Intent(v.getContext(),ListActivity.class);
                startActivity(intent);
            }
        });

        final Button buttonAdmin = findViewById(R.id.adminButton);
        buttonAdmin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent=new Intent(v.getContext(),AdminListView.class);
                startActivity(intent);
            }
        });

        final Button buttonCalendar = findViewById(R.id.button2);
        buttonCalendar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String calendarUrl = "https://calendar.google.com/calendar/gp?h1=en";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(calendarUrl));
                startActivity(i);
            }
        });

    }

}
