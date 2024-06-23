package com.example.mysignupapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class antitussive extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antitussive);
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(view -> {
                        Intent i = new Intent(antitussive.this, MainPage.class);
                        startActivity(i);
                }
        );
        }
}