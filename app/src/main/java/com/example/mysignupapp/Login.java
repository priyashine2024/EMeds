package com.example.mysignupapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://emeds-81a51-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        TextView signup = (TextView)  findViewById(R.id.signup);
        MaterialButton logbtn = (MaterialButton) findViewById(R.id.loginbtn);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
                    Toast.makeText(Login.this,"Please enter your username or password",Toast.LENGTH_SHORT).show();
                }
                else {
                String username1 = username.getText().toString();
                databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        //to check if username exist in database
                        if (snapshot.hasChild(username.getText().toString())){
                            //username exist in DB
                            final String getPassword =snapshot.child(username.getText().toString()).child("password").getValue(String.class);

                            if(getPassword.equals(password.getText().toString()))
                            {
                                Toast.makeText(Login.this,username1+" Logged In Successfully",Toast.LENGTH_LONG).show();
                                Intent i = new Intent(getApplicationContext(),MainPage.class);
                                startActivity(i);
                                finish();
                            }
                            else {
                                Toast.makeText(Login.this, "Invalid password",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(Login.this, "Invalid username", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }}
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}