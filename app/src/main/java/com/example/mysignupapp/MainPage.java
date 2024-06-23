package com.example.mysignupapp;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    private String selectedDisease;                //var to hold the values of selected Disease and Medicines

    private Spinner diseaseSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        //Disease Spinner
        diseaseSpinner = findViewById(R.id.spinner_disease);
        ArrayAdapter<CharSequence> diseaseAdapter = ArrayAdapter.createFromResource(this, R.array.array_disease, R.layout.spinner_layout);
        diseaseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diseaseSpinner.setAdapter(diseaseAdapter);
        //Medicines Spinner
        diseaseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                selectedDisease = diseaseSpinner.getSelectedItem().toString();
                int parentID = parent.getId();
                ImageView img1 = (ImageView) findViewById(R.id.img1);
                ImageView img2 = (ImageView) findViewById(R.id.img2);
                ImageView img3 = (ImageView) findViewById(R.id.img3);
                ImageView img4 = (ImageView) findViewById(R.id.img4);
                TextView txt1 = (TextView) findViewById(R.id.text1);
                TextView txt2 = (TextView) findViewById(R.id.text2);
                TextView txt3 = (TextView) findViewById(R.id.text3);
                TextView txt4 = (TextView) findViewById(R.id.text4);
                TextView textView = (TextView) findViewById(R.id.home);
                textView.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            int[] textLocation = new int[2];
                            textView.getLocationOnScreen(textLocation);

                            if (event.getRawX() <= textLocation[0] + textView.getTotalPaddingLeft()) {

                                finish();

                                textView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                       Intent i = new Intent(MainPage.this, Login.class);
                                       startActivity(i);
                                    }
                                });

                                return true;
                            }


                            if (event.getRawX() >= textLocation[0] + textView.getWidth() - textView.getTotalPaddingRight()) {
                                Intent i = new Intent(getApplicationContext(), Login.class);
                                startActivity(i);
                                Toast.makeText(MainPage.this, "Logged out", Toast.LENGTH_SHORT).show();

                                return true;
                            }
                        }
                        return true;
                    }
                });
                if (parentID == R.id.spinner_disease)
                {
                    switch(selectedDisease)
                    {
                        case "Select Disease":
                            img1.setImageResource(R.drawable.advair_diskus);
                            img2.setImageResource(R.drawable.armon_air);
                            img3.setImageResource(R.drawable.breo_ellipta);
                            img4.setImageResource(R.drawable.trelegy_ellipta);
                            txt1.setText("ADVAIR DISKUS");
                            txt2.setText("ARMOR AIR");
                            txt3.setText("BREO ELLIPTA");
                            txt4.setText("TRELEGY ELLIPTA");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),advair_diskus.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),armon_air.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),breo_ellipta.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),trelegy_ellipta.class);
                                startActivity(j);
                                finish();
                            });
                            break;
                        case "Asthama":
                            img1.setImageResource(R.drawable.advair_diskus);
                            img2.setImageResource(R.drawable.armon_air);
                            img3.setImageResource(R.drawable.breo_ellipta);
                            img4.setImageResource(R.drawable.trelegy_ellipta);
                            txt1.setText("ADVAIR DISKUS");
                            txt2.setText("ARMOR AIR");
                            txt3.setText("BREO ELLIPTA");
                            txt4.setText("TRELEGY ELLIPTA");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),advair_diskus.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),armon_air.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),breo_ellipta.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),trelegy_ellipta.class);
                                startActivity(j);

                            });
                            break;

                        case "Bronchitis":
                            img1.setImageResource(R.drawable.antitussive);
                            img2.setImageResource(R.drawable.guaifenex_g);
                            img3.setImageResource(R.drawable.mucinex);
                            img4.setImageResource(R.drawable.robitussin);
                            txt1.setText("ANTITUSSIVE");
                            txt2.setText("GUAIFENEX G");
                            txt3.setText("MUCINEX");
                            txt4.setText("ROBITUSSIN");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),antitussive.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),guaifenex_g.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),mucinex.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),robitussin.class);
                                startActivity(j);
                                finish();
                            });
                            break;

                        case "Diarrhea":
                            img1.setImageResource(R.drawable.bismarex);
                            img2.setImageResource(R.drawable.bismatrol);
                            img3.setImageResource(R.drawable.kaopectate);
                            img4.setImageResource(R.drawable.pepto_bismol);
                            txt1.setText("BISMAREX");
                            txt2.setText("BISMATROL");
                            txt3.setText("KAOPECTATE");
                            txt4.setText("PEPTO BISMOL");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),bismarex.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),bismatrol.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),kaopectate.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),pepto_bismol.class);
                                startActivity(j);
                                finish();
                            });
                            break;

                        case "Fever":

                            img1.setImageResource(R.drawable.alvedon);
                            img2.setImageResource(R.drawable.calpol);
                            img3.setImageResource(R.drawable.panadol);
                            img4.setImageResource(R.drawable.tylenol);
                            txt1.setText("ALVEDON");
                            txt2.setText("CALPOL");
                            txt3.setText("PANADOL");
                            txt4.setText("TYLENOL");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),alvedon.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),calpol.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),panadol.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),tylenol.class);
                                startActivity(j);
                                finish();
                            });
                            break;

                        case "Stress":
                            img1.setImageResource(R.drawable.prozac);
                            img2.setImageResource(R.drawable.rapiflux);
                            img3.setImageResource(R.drawable.sarafem);
                            img4.setImageResource(R.drawable.selfemra);
                            txt1.setText("PROZAC");
                            txt2.setText("RAPIFLUX");
                            txt3.setText("SARAFEM");
                            txt4.setText("SELFEMRA");
                            img1.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),prozac.class);
                                startActivity(j);
                                finish();
                            });
                            img2.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),rapiflux.class);
                                startActivity(j);
                                finish();
                            });
                            img3.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),sarafem.class);
                                startActivity(j);
                                finish();
                            });
                            img4.setOnClickListener(view1 -> {
                                Intent j = new Intent(getApplicationContext(),selfemra.class);
                                startActivity(j);
                                finish();
                            });
                            break;

                        default: break;
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ImageView img1 = (ImageView) findViewById(R.id.img1);
                ImageView img2 = (ImageView) findViewById(R.id.img2);
                ImageView img3 = (ImageView) findViewById(R.id.img3);
                ImageView img4 = (ImageView) findViewById(R.id.img4);
                TextView txt1 = (TextView) findViewById(R.id.text1);
                TextView txt2 = (TextView) findViewById(R.id.text2);
                TextView txt3 = (TextView) findViewById(R.id.text3);
                TextView txt4 = (TextView) findViewById(R.id.text4);
                img1.setImageResource(R.drawable.bismarex);
                img2.setImageResource(R.drawable.bismatrol);
                img3.setImageResource(R.drawable.kaopectate);
                img4.setImageResource(R.drawable.pepto_bismol);
                txt1.setText("BISMAREX");
                txt2.setText("BISMATROL");
                txt3.setText("KAOPECTATE");
                txt4.setText("PEPTO BISMOL");
                img1.setOnClickListener(view1 -> {
                    Intent j = new Intent(getApplicationContext(),bismarex.class);
                    startActivity(j);
                    finish();
                });
                img2.setOnClickListener(view1 -> {
                    Intent j = new Intent(getApplicationContext(),bismatrol.class);
                    startActivity(j);
                    finish();
                });
                img3.setOnClickListener(view1 -> {
                    Intent j = new Intent(getApplicationContext(),kaopectate.class);
                    startActivity(j);
                    finish();
                });
                img4.setOnClickListener(view1 -> {
                    Intent j = new Intent(getApplicationContext(),pepto_bismol.class);
                    startActivity(j);
                    finish();
                });

            }
        });
    }

}
