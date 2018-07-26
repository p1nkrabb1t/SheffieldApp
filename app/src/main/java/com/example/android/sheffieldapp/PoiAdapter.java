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


public class PoiAdapter extends ArrayAdapter<Poi> {

    public PoiAdapter(Activity context, ArrayList<Poi> poi_shown) {
        super(context, 0, poi_shown);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.poi_item, parent, false);
        }
        // Get the object located at this position in the list
        Poi currentSelection = getItem(position);

        // Find and update the ImageView in the poi_item.xml layout with the image ID
        ImageView poiImageView = listItemView.findViewById(R.id.image);
        poiImageView.setImageResource(currentSelection.getImageResourceId());

        // Find and update the TextView in the poi_item.xml layout with the title
        TextView nameTextView = listItemView.findViewById(R.id.title);
        nameTextView.setText(currentSelection.getTitle());

        // Find and update the TextView in the poi_item.xml layout with the address
        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentSelection.getAddress());

        // Find and update the TextView in the poi_item.xml layout with the website address
        TextView websiteTextView = listItemView.findViewById(R.id.web);
        websiteTextView.setText(currentSelection.getWeb());


        return listItemView;
    }
}