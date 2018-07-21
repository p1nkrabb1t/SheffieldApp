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

import com.example.android.sheffieldapp.R;

import java.util.ArrayList;

/**
 * Created by Ha3el on 15/04/2018.
 */

public class PoiAdapter extends ArrayAdapter<com.example.android.sheffieldapp.Poi> {

    public PoiAdapter(Activity context, ArrayList<com.example.android.sheffieldapp.Poi> playlistsAvailable) {
        super(context, 0, playlistsAvailable);
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
        // Get the playlist object located at this position in the list
        com.example.android.sheffieldapp.Poi currentPlaylist = getItem(position);

        // Find and update the ImageView in the playlist_item.xml layout with the image ID
        ImageView playlistImageView = listItemView.findViewById(R.id.image);
        playlistImageView.setImageResource(currentPlaylist.getImageResourceId());

        // Find and update the TextView in the playlist_item.xml layout with the ID playlist_name
        TextView playlistNameTextView = listItemView.findViewById(R.id.title);
        playlistNameTextView.setText(currentPlaylist.getTitle());

        // Find and update the TextView in the playlist_item.xml layout with the ID Genre
        TextView genreTextView = listItemView.findViewById(R.id.address);
        genreTextView.setText(currentPlaylist.getAddress());

        // Find and update the TextView in the playlist_item.xml layout with the ID num_tracks
        TextView tracksTextView = listItemView.findViewById(R.id.web);
        tracksTextView.setText(currentPlaylist.getWeb());




        return listItemView;
    }
}