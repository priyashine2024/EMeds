package com.example.mysignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText username = (EditText) findViewById(R.id.username);
        TextView signin = (TextView)  findViewById(R.id.signin);
        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.username);
               EditText email = (EditText) findViewById(R.id.email);
                EditText phone = (EditText) findViewById(R.id.phone);
                EditText password = (EditText) findViewById(R.id.password);
                CheckBox check = (CheckBox) findViewById(R.id.check);
                if (username.getText().toString().isEmpty() || email.getText().toString().isEmpty() || phone.getText().toString().isEmpty() || password.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    String username1 = username.getText().toString();


                    Toast.makeText(MainActivity.this, username1 +" Registered Successfully", Toast.LENGTH_SHORT).show();

                    FirebaseDatabase db = FirebaseDatabase.getInstance();
                    DatabaseReference root = db.getReference("users");
                    DataHolder obj = new DataHolder(username.getText().toString(), email.getText().toString(), password.getText().toString(), phone.getText().toString(), check.isChecked());

                    root.child(username.getText().toString()).setValue(obj);

                    username.setText("");
                    email.setText("");
                    phone.setText("");
                    password.setText("");
                    check.setSelected(false);
                    Intent i = new Intent(getApplicationContext(), Login.class);
                    startActivity(i);
                }

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });
    }
}