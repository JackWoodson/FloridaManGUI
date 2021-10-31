package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        HeadlineBank hB = new HeadlineBank();
        MainActivity firstPage = new MainActivity();
        hB.assign();
        hB.createHashMap();
        HashMap<Object, Object> hashmap = new HashMap<Object, Object>(hB.hashmap);
        TextView headline = findViewById(R.id.Headline);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        //TextView userName = firstPage.username;

        for(int i=0;i<20;i++) {
            headline.setText((String)hashmap.get(0));
            button.setText((String)hashmap.get(1));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                }
            });
        }



    }
}
