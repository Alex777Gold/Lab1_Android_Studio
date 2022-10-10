package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TemperatureActivity extends AppCompatActivity {

    Spinner temperaturesp5, temperaturesp6;
    EditText temperatureed3;
    Button temperatureb3;

    final double celsius = 1;
    final double kelvin = 274.15;
    final double fahrenheit = 33.8;

    double nkelvin = 274.15;
    double nfahrenheit = 33.8;

    //double res2;
/*
    public static double grad (double num, double form, double to){
        return num*form * to;
    }

 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        temperatureed3 = findViewById(R.id.editTextTextPersonName2);
        temperaturesp5 = findViewById(R.id.spinner3);
        temperaturesp6 = findViewById(R.id.spinner4);
        temperatureb3 = findViewById(R.id.button6);

        String[] from = {"celsius", "kelvin", "fahrenheit"};
        ArrayAdapter temperaturead3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        temperaturesp5.setAdapter(temperaturead3);

        String[] to = {"celsius", "kelvin", "fahrenheit"};
        ArrayAdapter temperaturead4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        temperaturesp6.setAdapter(temperaturead4);

        //String text2 = String.valueOf(ed3);

        temperatureb3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double temperaturetot2 = null;
                Double temperatureamount2 = Double.parseDouble(temperatureed3.getText().toString());

                switch(temperaturesp5.getSelectedItem().toString()) {
                    case "celsius":
                        switch (temperaturesp6.getSelectedItem().toString()) {
                            case "celsius":
                                temperaturetot2 = temperatureamount2;
                                break;
                            case "kelvin":
                                temperaturetot2 = temperatureamount2+273.15;
                                break;
                            case "fahrenheit":
                                temperaturetot2 = (temperatureamount2*1.8)+32;
                                break;
                        }
                        break;
                    case "kelvin":
                        switch (temperaturesp6.getSelectedItem().toString()) {
                            case "celsius":
                                temperaturetot2 = temperatureamount2 + 274.15;
                                break;
                            case "kelvin":
                                temperaturetot2 = temperatureamount2;
                                break;
                            case "fahrenheit":
                                temperaturetot2 = (temperatureamount2-273.15)*1.8+32;
                                break;
                        }
                        break;
                    case "fahrenheit":
                        switch (temperaturesp6.getSelectedItem().toString()) {
                            case "celsius":
                                temperaturetot2 = (temperatureamount2-32)*1.8;
                                break;
                            case "kelvin":
                                temperaturetot2 = (temperatureamount2-32)*0.555+273.15;
                                break;
                            case "fahrenheit":
                                temperaturetot2 = temperatureamount2;
                                break;
                        }
                        break;
                }

                Toast.makeText(getApplicationContext(), temperaturetot2.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}