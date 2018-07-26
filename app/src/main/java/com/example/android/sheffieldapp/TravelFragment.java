package com.example.android.sheffieldapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        final ArrayList<Poi> travel = new ArrayList<Poi>();
        travel.add(new Poi(getString(R.string.poi_DSA), getString(R.string.loc_DSA), R.drawable.flight,
                R.drawable.parking));
        travel.add(new Poi(getString(R.string.poi_station_sheff), getString(R.string.loc_station_sheff), R.drawable.train,
                R.drawable.tram, R.drawable.taxi, R.drawable.parking));
        travel.add(new Poi(getString(R.string.poi_bus_sheff), getString(R.string.loc_bus_sheff),
                R.drawable.bus));
        travel.add(new Poi(getString(R.string.poi_station_mhall), getString(R.string.loc_station_mhall), R.drawable.train,
                R.drawable.bus, R.drawable.tram, R.drawable.taxi, R.drawable.parking));
        travel.add(new Poi(getString(R.string.poi_bus_hills), getString(R.string.loc_bus_hills), R.drawable.bus));
        travel.add(new Poi(getString(R.string.poi_taxi_city), getString(R.string.tel_taxi_city), R.drawable.taxi));
        travel.add(new Poi(getString(R.string.poi_taxi_merc), getString(R.string.tel_taxi_merc), R.drawable.taxi));
        travel.add(new Poi(getString(R.string.poi_taxi_excel), getString(R.string.tel_taxi_excel), R.drawable.taxi));
        travel.add(new Poi(getString(R.string.poi_taxi_exp), getString(R.string.tel_taxi_exp), R.drawable.taxi));

        TravelAdapter adapter = new TravelAdapter(getActivity(), travel);

        ListView listView = rootView.findViewById(R.id.list2);

        listView.setAdapter(adapter);

        return rootView;
    }

}