package com.example.martaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    private ArrayList<Ride> mRideHistory;
    RecyclerView rv;
    LinearLayoutManager llm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        mRideHistory = new ArrayList<Ride>();

        rv = (RecyclerView)findViewById(R.id.rv);
        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        RecycleAdapter adapter = new RecycleAdapter(mRideHistory);
        rv.setAdapter(adapter);
    }

    private void initializeData() {
        mRideHistory = new ArrayList<>();
        mRideHistory.add(new Ride("Airport to Art Center", "03/29/2021", "3:00 PM"));
        mRideHistory.add(new Ride("Bankhead to Five Points", "03/10/2021", "1:32 PM"));
        mRideHistory.add(new Ride("Vine City to East Lake", "02/29/2021", "4:00 PM"));
        mRideHistory.add(new Ride("Lakewood to Garnett", "02/15/2021", "6:20 PM"));
        mRideHistory.add(new Ride("Ashby to Decatur", "02/10/2021", "7:01 PM"));
        mRideHistory.add(new Ride("Sandy Springs to Art Center", "02/05/2021", "2:23 PM"));
        mRideHistory.add(new Ride("North Springs to Medical Center", "01/31/2021", "10:50 AM"));
        mRideHistory.add(new Ride("Five Points to Airport", "01/25/2021", "3:13 PM"));
        mRideHistory.add(new Ride("Chamblee to Doraville", "01/10/2021", "9:15 AM"));
        mRideHistory.add(new Ride("North Springs to Buckhead", "01/05/2021", "7:27 PM"));
        mRideHistory.add(new Ride("Peachtree Center to Oakland City", "01/03/2021", "12:15 PM"));
    }

}