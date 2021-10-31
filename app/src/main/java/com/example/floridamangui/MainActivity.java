package com.example.floridamangui;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username = (EditText) findViewById(R.id.user);
    EditText password = (EditText) findViewById(R.id.passwordInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username == null || password == null) {
                    Toast.makeText(getApplicationContext(), "Incorrect Log in",Toast.LENGTH_SHORT )
                    .show();
                }
                else {
                    Intent i=new Intent(MainActivity.this, Screen2.class);
                    startActivity(i);
                }
            }
        });

    }
}