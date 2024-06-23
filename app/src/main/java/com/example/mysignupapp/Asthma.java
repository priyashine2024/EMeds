package com.example.mysignupapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Asthma extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asthama);
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        ImageView img4 = (ImageView) findViewById(R.id.img4);
        img1.setOnClickListener(view -> {
            Toast.makeText(Asthma.this," Successfully", Toast.LENGTH_SHORT).show();
            Intent act2 = new Intent(view.getContext(), advair_diskus.class);
            startActivity(act2);
        });

        img2.setOnClickListener(view -> {
            Intent act2 = new Intent(view.getContext(), armon_air.class);
            startActivity(act2);
        });

        img3.setOnClickListener(view -> {
            Intent act2 = new Intent(view.getContext(), breo_ellipta.class);
            startActivity(act2);
        });

        img4.setOnClickListener(view -> {
            Intent act2 = new Intent(view.getContext(), trelegy_ellipta.class);
            startActivity(act2);
        });}
}