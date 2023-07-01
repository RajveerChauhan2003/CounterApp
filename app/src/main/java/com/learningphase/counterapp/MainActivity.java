package com.learningphase.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;
    Button button1;
    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView1 = findViewById(R.id.appHeadingText);
        textView2 = findViewById(R.id.counterTextView);
        button1 = findViewById(R.id.clickMeButton);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter+=1;
                textView2.setText(""+counter);
                if(counter%25==0){
                    Toast.makeText(MainActivity.this, "Congrats you have clicked "+counter+" times !!", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}