package com.example.mysignupapp;



import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class advair_diskus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advair_diskus);
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(view -> {
            Intent i = new Intent(advair_diskus.this, MainPage.class);
            startActivity(i);
                }
        );

    }

}