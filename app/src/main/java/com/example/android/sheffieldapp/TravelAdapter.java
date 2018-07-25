package com.example.android.sheffieldapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class TravelAdapter extends ArrayAdapter<Poi> {

    public TravelAdapter(Activity context, ArrayList<Poi> poi_shown) {
        super(context, 0, poi_shown);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.travel_item, parent, false);
        }
        // Get the object located at this position in the list
        Poi currentSelection = getItem(position);


        // Find and update the TextView in the travel_item.xml layout with the title
        TextView nameTextView = listItemView.findViewById(R.id.title);
        nameTextView.setText(currentSelection.getTitle());

        // Find and update the TextView in the travel_item.xml layout with the address
        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentSelection.getAddress());

        // Find and update the TextView in the travel_item.xml layout with the contact number
        TextView phoneTextView = listItemView.findViewById(R.id.phone);
        phoneTextView.setText(currentSelection.getPhone());

        // Find and update the ImageView in the travel_item.xml layout with the icon ID
        ImageView icon1 = listItemView.findViewById(R.id.ic_1);
        icon1.setImageResource(currentSelection.getIcon1Id());

        // Find and update the ImageView in the travel_item.xml layout with the icon ID
        ImageView icon2 = listItemView.findViewById(R.id.ic_2);
        icon2.setImageResource(currentSelection.getIcon2Id());

        // Find and update the ImageView in the travel_item.xml layout with the icon ID
        ImageView icon3 = listItemView.findViewById(R.id.ic_3);
        icon3.setImageResource(currentSelection.getIcon3Id());

        // Find and update the ImageView in the travel_item.xml layout with the icon ID
        ImageView icon4 = listItemView.findViewById(R.id.ic_4);
        icon4.setImageResource(currentSelection.getIcon4Id());

        // Find and update the ImageView in the travel_item.xml layout with the icon ID
        ImageView icon5 = listItemView.findViewById(R.id.ic_5);
        icon5.setImageResource(currentSelection.getIcon5Id());

        return listItemView;
    }
}