package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    android.widget.Button calculateBMI;

    TextView currentHeight;
    TextView currentAge, currentWeight;
    ImageView incrementAge, incrementWeight, decrementWeight, decrementAge;
    SeekBar seekbarForHeight;
    RelativeLayout Male, Female;

    int weight = 50;
    int age = 25;
    int currentProgress;
    String progress = "170";
    String typeOfUser = "0";
    String weight2 = "50";
    String age2 = "25";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        calculateBMI = findViewById(R.id.calculateBmi);
        currentAge = findViewById(R.id.currentage);
        currentWeight = findViewById(R.id.currentweight);
        currentHeight = findViewById(R.id.currentheight);
        incrementAge = findViewById(R.id.incrementage);
        incrementWeight = findViewById(R.id.incrementweight);
        decrementWeight = findViewById(R.id.decrementweight);
        decrementAge = findViewById(R.id.decrementweight);
        seekbarForHeight = findViewById(R.id.seekbarforheight);
        Male = findViewById(R.id.male);
        Female = findViewById(R.id.female);




        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });

    }
}