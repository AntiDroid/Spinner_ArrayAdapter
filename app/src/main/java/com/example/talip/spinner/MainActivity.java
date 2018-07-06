package com.example.talip.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // String colors[] = {"Red", "Green", "Blue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner s = findViewById(R.id.spinner);
        ArrayAdapter<String> sArrayAdapter = new myArrayAdapter(this);
        //new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colors);
        sArrayAdapter.add("Red");
        sArrayAdapter.add("Yellow");
        sArrayAdapter.add("Orange");
        s.setAdapter(sArrayAdapter);
    }
}
