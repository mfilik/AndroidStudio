package com.example.martaapp;

import java.util.ArrayList;

public class Ride {

    private String Trip;
    private String Date;
    private String Time;

    public Ride(String trip, String date, String time) {
        this.Trip = trip;
        this.Date = date;
        this.Time = time;
    }

    public String getTrip() {
        return Trip;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }
}
