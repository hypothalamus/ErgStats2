package com.ergapp.laris.ergstats;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FloatingActionButton addWorkout_btn = findViewById(R.id.addWorkout_btn);
        addWorkout_btn.setOnClickListener(new View.OnClickListener() { public void onClick(View v) { openInput(); } } );

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
    }

    private void openInput() {
        Intent change = new Intent(getBaseContext(), ManualInput.class);
        startActivity(change);
    }
}