package com.example.andrea.competitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class AddEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_events);

        EditText text1 = (EditText)findViewById(R.id.addEventName);
        String str1 = text1.getText().toString().trim();

        EditText text2 = (EditText)findViewById(R.id.textView3);
        String str2 = text2.getText().toString().trim();

        EditText text3 = (EditText)findViewById(R.id.textView4);
        String str3 = text3.getText().toString().trim();

        EditText text4 = (EditText)findViewById(R.id.textView5);
        String str4 = text4.getText().toString().trim();

        EditText text5 = (EditText)findViewById(R.id.textView6);
        String str5 = text5.getText().toString().trim();

        EditText text6 = (EditText)findViewById(R.id.textView7);
        String str6 = text6.getText().toString().trim();
    }
}
