package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LengthActivity extends AppCompatActivity {

    Spinner lengthsp1, lengthsp2;
    EditText lengthed1;
    Button lengthb1;

    final double meters = 0.01;
    final double centimeter = 1;
    final double kilometer = 0.00001;
    final double inch = 0.393701;
    final double foot = 0.0328084;
    final double mile = 0.0000062137;
    final double yard = 0.0109361;

    double nmeters = 100;
    double nkilometer = 100000;
    double ninch = 2.54;
    double nfoot = 30.48;
    double nmile = 160934;
    double nyard = 91.44;

    //double res;

    public static double sant (double num, double form, double to){
        return num*form * to;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        lengthed1 = findViewById(R.id.editTextTextPersonName);
        lengthsp1 = findViewById(R.id.spinner);
        lengthsp2 = findViewById(R.id.spinner2);
        lengthb1 = findViewById(R.id.button);

        String[] from = {"centimeter", "meter", "kilometer", "inch", "mile", "yard", "foot"};
        ArrayAdapter lengthad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        lengthsp1.setAdapter(lengthad);

        String[] to = {"centimeter", "meter", "kilometer", "inch", "mile", "yard", "foot"};
        ArrayAdapter lengthad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        lengthsp2.setAdapter(lengthad1);

        //String text = String.valueOf(lengthed1);

        lengthb1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Double lengthtot = null;
                Double lengthamount = Double.parseDouble(lengthed1.getText().toString());

                switch(lengthsp1.getSelectedItem().toString()){
                    case "centimeter":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(centimeter, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(centimeter, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(centimeter, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(centimeter, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(centimeter, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(centimeter, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(centimeter, lengthamount, foot);
                                break;
                        }
                        break;
                    case "meter":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(nmeters, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(nmeters, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(nmeters, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(nmeters,lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(nmeters, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(nmeters, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(nmeters, lengthamount, foot);
                                break;
                        }
                        break;
                    case "kilometer":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(nkilometer, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(nkilometer, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(nkilometer, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(nkilometer, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(nkilometer, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(nkilometer, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(nkilometer, lengthamount, foot);
                                break;
                        }
                        break;
                    case "inch":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(ninch, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(ninch, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(ninch, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(ninch, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(ninch, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(ninch, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(ninch, lengthamount, foot);
                                break;
                        }
                        break;
                    case "mile":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(nmile, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(nmile, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(nmile, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(nmile, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(nmile, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(nmile, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(nmile, lengthamount, foot);
                                break;
                        }
                        break;
                    case "yard":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(nyard, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(nyard, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(nyard, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(nyard, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(nyard, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(nyard, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(nyard, lengthamount, foot);
                                break;
                        }
                        break;
                    case "foot":
                        switch (lengthsp2.getSelectedItem().toString()){
                            case "centimeter":
                                lengthtot = sant(nfoot, lengthamount, centimeter);
                                break;
                            case "meter":
                                lengthtot = sant(nfoot, lengthamount, meters);
                                break;
                            case "kilometer":
                                lengthtot = sant(nfoot, lengthamount, kilometer);
                                break;
                            case "inch":
                                lengthtot = sant(nfoot, lengthamount, inch);
                                break;
                            case "mile":
                                lengthtot = sant(nfoot, lengthamount, mile);
                                break;
                            case "yard":
                                lengthtot = sant(nfoot, lengthamount, yard);
                                break;
                            case "foot":
                                lengthtot = sant(nfoot, lengthamount, foot);
                                break;
                        }
                        break;

                }

                Toast.makeText(getApplicationContext(), lengthtot.toString(), Toast.LENGTH_LONG).show();

            }
        });

    }
}