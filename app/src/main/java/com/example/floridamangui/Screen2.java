package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashMap;

public class Screen2 extends AppCompatActivity {

int correct;
int incorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


          correct = 0;
          incorrect = 0;
        HeadlineBank hB = new HeadlineBank();
        MainActivity firstPage = new MainActivity();
        hB.assign();
        hB.createHashMap();
        TextView headline = findViewById(R.id.Headline);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        TextView correctScore = findViewById(R.id.textView4);
        TextView incorrectScore = findViewById(R.id.textView5);

        TextView usernameDisplay = findViewById(R.id.usernameDisplay);
        usernameDisplay.setText((CharSequence) firstPage.username);
        for(int i=0;i<20;i++) {
            String[] temp = new String[5];
            temp =  hB.hashmap.get(i);
            headline.setText(temp[0]);
            button.setText(temp[1]);
            button2.setText(temp[2]);
            button3.setText(temp[3]);
            button4.setText(temp[4]);
           correctScore.setText(correct);
            incorrectScore.setText(incorrect);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct!",Toast.LENGTH_SHORT )
                            .show();
                    correctScore.setText(correct);

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    incorrect++;
                    Toast.makeText(getApplicationContext(), "Incorrect!",Toast.LENGTH_SHORT )
                            .show();
                    incorrectScore.setText(incorrect);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    incorrect++;
                    Toast.makeText(getApplicationContext(), "Incorrect!",Toast.LENGTH_SHORT )
                            .show();
                    incorrectScore.setText(incorrect);

                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    incorrect++;
                    Toast.makeText(getApplicationContext(), "Incorrect!",Toast.LENGTH_SHORT )
                            .show();
                    incorrectScore.setText(incorrect);

                }
            });
        }
        Intent next = new Intent(Screen2.this, Screen3.class);
        startActivity(next);

    }
}
