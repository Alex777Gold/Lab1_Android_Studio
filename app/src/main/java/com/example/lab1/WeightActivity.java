package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class WeightActivity extends AppCompatActivity {

    Spinner weightsp3, weightsp4;
    EditText weighted2;
    Button weightb2;

    final double gramm = 1;
    final double kilogramm = 0.001;
    final double tonna = 0.000001;
    final double carat = 5;
    final double foont = 0.00220462;
    final double pud = 0.000061047;

    double nkilogramm = 1000;
    double ntonna = 100000;
    double ncarat = 0.2;
    double nfoont = 453.592;
    double npud = 16380.7;

    //double res1;

    public static double killogram (double num, double form, double to){
        return num*form * to;
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

            weighted2 = findViewById(R.id.editTextTextPersonName5);
            weightsp3 = findViewById(R.id.spinner8);
            weightsp4 = findViewById(R.id.spinner9);
            weightb2 = findViewById(R.id.button5);

            String[] from = {"gramm", "kilogramm", "tonna", "carat", "foont", "pud"};
            ArrayAdapter ad3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
            weightsp3.setAdapter(ad3);

            String[] to = {"gramm", "kilogramm", "tonna", "carat", "foont", "pud"};
            ArrayAdapter ad4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
            weightsp4.setAdapter(ad4);

            String text1 = String.valueOf(weighted2);

            weightb2.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Double weighttot1 = null;
                    Double weightamount1 = Double.parseDouble(weighted2.getText().toString());

                    switch(weightsp3.getSelectedItem().toString()) {
                        case "gramm":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = weightamount1;
                                    break;
                                case "kilogramm":
                                    weighttot1 = killogram(gramm, weightamount1, kilogramm);
                                    break;
                                case "tonna":
                                    weighttot1 = killogram(gramm, weightamount1, tonna);
                                    break;
                                case "carat":
                                    weighttot1 = killogram(gramm, weightamount1, carat);
                                    break;
                                case "foont":
                                    weighttot1 = killogram(gramm, weightamount1, foont);
                                    break;
                                case "pud":
                                    weighttot1 = killogram(gramm, weightamount1, pud);
                                    break;
                            }
                            break;
                        case "kilogramm":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = killogram(nkilogramm, weightamount1, gramm);
                                    break;
                                case "kilogramm":
                                    weighttot1 = weightamount1;
                                    break;
                                case "tonna":
                                    weighttot1 = killogram(nkilogramm, weightamount1, tonna);
                                    break;
                                case "carat":
                                    weighttot1 = killogram(nkilogramm, weightamount1, carat);
                                    break;
                                case "foont":
                                    weighttot1 = killogram(nkilogramm, weightamount1, foont);
                                    break;
                                case "pud":
                                    weighttot1 = killogram(nkilogramm, weightamount1, pud);
                                    break;
                            }
                            break;
                        case "tonna":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = killogram(ntonna, weightamount1, gramm);
                                    break;
                                case "kilogramm":
                                    weighttot1 = killogram(ntonna, weightamount1, kilogramm);
                                    break;
                                case "tonna":
                                    weighttot1 = weightamount1;
                                    break;
                                case "carat":
                                    weighttot1 = killogram(ntonna, weightamount1, carat);
                                    break;
                                case "foont":
                                    weighttot1 = killogram(ntonna, weightamount1, foont);
                                    break;
                                case "pud":
                                    weighttot1 = killogram(ntonna, weightamount1, pud);
                                    break;
                            }
                            break;
                        case "carat":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = killogram(ncarat, weightamount1, gramm);
                                    break;
                                case "kilogramm":
                                    weighttot1 = killogram(ncarat, weightamount1, kilogramm);
                                    break;
                                case "tonna":
                                    weighttot1 = killogram(ncarat, weightamount1, tonna);
                                    break;
                                case "carat":
                                    weighttot1 = weightamount1;
                                    break;
                                case "foont":
                                    weighttot1 = killogram(ncarat, weightamount1, foont);
                                    break;
                                case "pud":
                                    weighttot1 = killogram(ncarat, weightamount1, pud);
                                    break;
                            }
                            break;
                        case "foont":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = killogram(nfoont, weightamount1, gramm);
                                    break;
                                case "kilogramm":
                                    weighttot1 = killogram(nfoont, weightamount1, kilogramm);
                                    break;
                                case "tonna":
                                    weighttot1 = killogram(nfoont, weightamount1, tonna);
                                    break;
                                case "carat":
                                    weighttot1 = killogram(nfoont, weightamount1, carat);
                                    break;
                                case "foont":
                                    weighttot1 = weightamount1;
                                    break;
                                case "pud":
                                    weighttot1 = killogram(nfoont, weightamount1, pud);
                                    break;
                            }
                            break;
                        case "pud":
                            switch (weightsp4.getSelectedItem().toString()) {
                                case "gramm":
                                    weighttot1 = killogram(npud, weightamount1, gramm);
                                    break;
                                case "kilogramm":
                                    weighttot1 = killogram(npud, weightamount1, kilogramm);
                                    break;
                                case "tonna":
                                    weighttot1 = killogram(npud, weightamount1, tonna);
                                    break;
                                case "carat":
                                    weighttot1 = killogram(npud, weightamount1, carat);
                                    break;
                                case "foont":
                                    weighttot1 = killogram(npud, weightamount1, foont);
                                    break;
                                case "pud":
                                    weighttot1 = weightamount1;
                                    break;
                            }
                            break;
                    }

                        Toast.makeText(getApplicationContext(), weighttot1.toString(), Toast.LENGTH_LONG).show();
                    }
                });

            }
        }