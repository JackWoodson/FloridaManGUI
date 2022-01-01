package com.example.floridamangui;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.lang.reflect.Array;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeadlineBank headlinebank = new HeadlineBank();
         username = (EditText) findViewById(R.id.user);
         password = (EditText) findViewById(R.id.passwordInput);



        Button button = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = (EditText) username.getText();
                password = (EditText) password.getText();






                if(username == null || password == null) {
                    Toast.makeText(getApplicationContext(), "Incorrect Log in",Toast.LENGTH_SHORT )
                    .show();
                    Intent reset = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(reset);
                }
                else {
                    Intent f=new Intent(MainActivity.this, Screen2.class);
                    EditText[] temp = new EditText[2];
                    temp[0] = username;
                    temp[1] = password;

                    int count =0;

                    for(int i =0;i<HeadlineBank.players.size();i++) {
                        if (HeadlineBank.players.get(i)[0].equals(temp[0]) && HeadlineBank.players.get(i)[1].equals(temp[1]))
                            startActivity(f);
                    }
                    Toast.makeText(getApplicationContext(), "Incorrect Log in",Toast.LENGTH_SHORT )
                                .show();
                    HeadlineBank.SerializableParceable(username,password);
                    }


                }
            }
        });

    }
}