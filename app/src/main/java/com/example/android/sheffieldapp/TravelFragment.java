package com.example.android.sheffieldapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class TravelFragment extends Fragment {


    public TravelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<com.example.android.sheffieldapp.Poi> sports = new ArrayList<com.example.android.sheffieldapp.Poi>();
        sports.add(new com.example.android.sheffieldapp.Poi("Sheffield Wednesday Football Ground", "sheffled", "www"));
        sports.add(new com.example.android.sheffieldapp.Poi("Sheffield United Football Ground", "sheffled", "www"));
        sports.add(new com.example.android.sheffieldapp.Poi("Ponds Forge Leisure Centre", "sheffled", "www"));
        sports.add(new com.example.android.sheffieldapp.Poi("Hillsborough Leisure Centre", "sheffled", "www"));
        sports.add(new com.example.android.sheffieldapp.Poi("English Institute of Sport", "sheffled", "www"));
        sports.add(new com.example.android.sheffieldapp.Poi("Concord Sports Centre", "sheffled", "www"));


        com.example.android.sheffieldapp.PoiAdapter adapter = new com.example.android.sheffieldapp.PoiAdapter(getActivity(), sports);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}