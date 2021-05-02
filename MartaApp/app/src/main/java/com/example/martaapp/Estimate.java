package com.example.martaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Estimate extends AppCompatActivity {

    Spinner sSpin,dSpin;
    Button getEta;
    TextView etaR;
    TextView etaT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate);

        // Get elements from XML file
        getEta = findViewById(R.id.button);
        etaR = findViewById(R.id.eta);
        etaT = findViewById(R.id.etaTitle);
        sSpin = findViewById(R.id.sLocatinon);
        dSpin = findViewById(R.id.dLocatinon);

        // Create red line list with data access
        String[] loc = getResources().getStringArray(R.array.redLoc);
        ArrayAdapter adapterS = new ArrayAdapter(this, android.R.layout.simple_spinner_item, loc);
        adapterS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSpin.setAdapter(adapterS);

        // Get second spinner data
        // region "Access Location List"

        String[] r0 = getResources().getStringArray(R.array.r0);
        String[] r1 = getResources().getStringArray(R.array.r1);
        String[] r2 = getResources().getStringArray(R.array.r2);
        String[] r3 = getResources().getStringArray(R.array.r3);
        String[] r4 = getResources().getStringArray(R.array.r4);
        String[] r5 = getResources().getStringArray(R.array.r5);
        String[] r6 = getResources().getStringArray(R.array.r6);
        String[] r7 = getResources().getStringArray(R.array.r7);
        String[] r8 = getResources().getStringArray(R.array.r8);
        String[] r9 = getResources().getStringArray(R.array.r9);
        String[] r10 = getResources().getStringArray(R.array.r10);
        String[] r11 = getResources().getStringArray(R.array.r11);
        String[] r12 = getResources().getStringArray(R.array.r12);
        String[] r13 = getResources().getStringArray(R.array.r13);
        String[] r14 = getResources().getStringArray(R.array.r14);
        String[] r15 = getResources().getStringArray(R.array.r15);
        String[] r16 = getResources().getStringArray(R.array.r16);
        String[] r17 = getResources().getStringArray(R.array.r17);
        String[] r18 = getResources().getStringArray(R.array.r18);

        // endregion

        // Based on previous spinner display secondary spinner elements
        sSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r0);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                // region "Get Location"
                else if (position == 1) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r1);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 2) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r2);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 3) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r3);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 4) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r4);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 5) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r5);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 6) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r6);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 7) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r7);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 8) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r8);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 9) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r9);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 10) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r10);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 11) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r11);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 12) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r12);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 13) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r13);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 14) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r14);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 15) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r15);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 16) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r16);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 17) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r17);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                else if (position == 18) {
                    ArrayAdapter adapterD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, r18);
                    adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dSpin.setAdapter(adapterD);
                }
                // endregion
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // On click display the eta
        getEta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // region "Get ETA"

                if (sSpin.getSelectedItem().toString().equals("North Springs")) {
                    if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("23 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("28 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("33 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("35 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("38 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("41 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("43 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("29 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("33 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("36 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("39 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("41 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Dunwoody")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("27 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("29 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("34 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("37 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("39 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Medical Center")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("28 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("34 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("36 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Buckhead")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("27 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("30 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("32 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("23 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("28 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Arts Center")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("24 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Midtown")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("22 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("North Avenue")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("21 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Civic Center")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("23 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("20 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("1 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("19 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Five Points")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("17 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Garnett")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("28 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("15 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("West End")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("29 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("27 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("12 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Oakland City")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("33 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("29 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("10 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("35 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("33 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("28 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("11 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("9 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("4 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("2 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("8 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("East Point")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("38 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("36 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("34 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("31 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("27 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("23 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("16 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("14 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("7 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("5 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("College Park")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("41 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("39 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("37 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("34 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("30 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("26 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("18 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("13 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("6 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("3 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Airport")) {
                        etaR.setText("2 Minutes");
                    }
                }
                else if (sSpin.getSelectedItem().toString().equals("Airport")) {
                    if (dSpin.getSelectedItem().toString().equals("North Springs")) {
                        etaR.setText("43 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Sandy Springs")) {
                        etaR.setText("41 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Dunwoody")) {
                        etaR.setText("39 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Medical Center")) {
                        etaR.setText("36 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Buckhead")) {
                        etaR.setText("32 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lindbergh Center")) {
                        etaR.setText("28 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Arts Center")) {
                        etaR.setText("24 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Midtown")) {
                        etaR.setText("22 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("North Avenue")) {
                        etaR.setText("21 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Civic Center")) {
                        etaR.setText("20 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Peachtree Center")) {
                        etaR.setText("19 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Five Points")) {
                        etaR.setText("17 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Garnett")) {
                        etaR.setText("15 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("West End")) {
                        etaR.setText("12 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Oakland City")) {
                        etaR.setText("10 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("Lakewood/Ft. McPherson")) {
                        etaR.setText("8 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("East Point")) {
                        etaR.setText("5 Minutes");
                    } else if (dSpin.getSelectedItem().toString().equals("College Park")) {
                        etaR.setText("2 Minutes");
                    }
                }

                // endregion

                etaT.setVisibility(View.VISIBLE);
                etaR.setVisibility(View.VISIBLE);
            }
        });

    }

}