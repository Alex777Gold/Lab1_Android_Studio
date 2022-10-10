package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button_length(View v) {
        Intent intent = new Intent(this, LengthActivity.class);
        startActivity(intent);
    }

    public void Button_weight(View v) {
        Intent intent = new Intent(this, WeightActivity.class);
        startActivity(intent);
    }

    public void Button_temperature(View v) {
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }
}