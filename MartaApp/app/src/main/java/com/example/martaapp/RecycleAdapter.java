package com.example.martaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RideHolder> {

    List<Ride> rides;

    RecycleAdapter(List<Ride> ride){
        this.rides = ride;
    }

    @NonNull
    @Override
    public RideHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);
        RideHolder rH = new RideHolder(v);
        return rH;
    }

    @Override
    public void onBindViewHolder(@NonNull RideHolder holder, int i) {
        holder.ride_name.setText(rides.get(i).getTrip());
        holder.date_of_ride.setText(rides.get(i).getDate());
        holder.time_of_ride.setText(rides.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return rides.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    class RideHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView ride_name;
        TextView date_of_ride;
        TextView time_of_ride;

        RideHolder(View v) {
            super(v);
            card = (CardView)v.findViewById(R.id.cv);
            ride_name = (TextView)v.findViewById(R.id.ride);
            date_of_ride = (TextView)v.findViewById(R.id.date);
            time_of_ride = (TextView)v.findViewById(R.id.time);
        }
    }
}
