package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
// I have tried importing get

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");


        int i = 0;
        while(i< numbers.size()) {
            LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
            TextView wordView = new TextView(this);
            wordView.setText(numbers.get(i));
            rootView.addView(wordView);
            i++;

        }
    }

}