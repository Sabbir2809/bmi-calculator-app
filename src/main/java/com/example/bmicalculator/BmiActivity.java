package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BmiActivity extends AppCompatActivity {

    android.widget.Button recalculateBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().hide();
        recalculateBMI = findViewById(R.id.recalculateBmi);

        recalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmiActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}