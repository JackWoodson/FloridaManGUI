package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        HeadlineBank headlinebank = new HeadlineBank();
        TextView correct = findViewById(R.id.textView9);
        TextView incorrect = findViewById(R.id.textView10);
        Screen2 screen2 = new Screen2();
        int highscore = headlinebank.highscore;
        int playersHighScore = screen2.correct;
        correct.setText(screen2.correct); // just temporary for now
        incorrect.setText(screen2.incorrect);

        if(highscore<playersHighScore) {//high score greater
            Toast.makeText(getApplicationContext(), "New High Score!",Toast.LENGTH_LONG )
                    .show();
        }
        else {
            Toast.makeText(getApplicationContext(), "No high score",Toast.LENGTH_SHORT )
                    .show();
        }
        headlinebank.highscore = playersHighScore;
    }
}