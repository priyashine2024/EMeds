package com.example.mysignupapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bismatrol extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bismatrol);
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(view -> {
                    Intent i = new Intent(bismatrol.this, MainPage.class);
                    startActivity(i);
                }
        );
    }
}