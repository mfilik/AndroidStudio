package com.example.martaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class Breeze extends AppCompatActivity {

    Button getUI;
    TextView userBID;
    TextView idDisp;
    TextView riDisp;
    TextView suDisp;
    TextView accTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeze);

        // Get elements from XML file
        userBID = findViewById(R.id.userBID);
        getUI = findViewById(R.id.buttonB);
        accTitle = findViewById(R.id.accTitle);
        idDisp = findViewById(R.id.iDisp);
        riDisp = findViewById(R.id.rDisp);
        suDisp = findViewById(R.id.sDisp);

        // Get data for resources for user info
        // region "Access Database"
        String[] id0100 = getResources().getStringArray(R.array.id0100);
        String[] id0101 = getResources().getStringArray(R.array.id0101);
        String[] id0102 = getResources().getStringArray(R.array.id0102);
        String[] id0103 = getResources().getStringArray(R.array.id0103);
        // endregion

        getUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                closeKeyboard();

                String idInput = userBID.getText().toString();
                String id = "id" + idInput;

                // Check user input and get info
                // region "Check ID and get user info."

                idDisp.setText("Breeze ID: " + idInput);
                if(idInput.equals("0100")){
                    riDisp.setText("Rides Left: " + id0100[0]);
                    suDisp.setText("Subscription: " + id0100[1]);
                } else if(idInput.equals("0101")){
                    riDisp.setText("Rides Left: " + id0101[0]);
                    suDisp.setText("Subscription: " + id0101[1]);
                } else if(idInput.equals("0102")){
                    riDisp.setText("Rides Left: " + id0102[0]);
                    suDisp.setText("Subscription: " + id0102[1]);
                } else if(idInput.equals("0103")){
                    riDisp.setText("Rides Left: " + id0103[0]);
                    suDisp.setText("Subscription: " + id0103[1]);
                } else {
                    riDisp.setText("Rides Left: N/A");
                    suDisp.setText("Subscription: N/A");
                }

                // endregion

                accTitle.setVisibility(View.VISIBLE);
                idDisp.setVisibility(View.VISIBLE);
                riDisp.setVisibility(View.VISIBLE);
                suDisp.setVisibility(View.VISIBLE);
            }
        });

    }

    // Function to hide keyboard after user clicks the button
    private void closeKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}