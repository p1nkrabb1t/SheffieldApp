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
        travel.add(new Poi("Doncaster Sheffield Airport", "First Ave, Doncaster, DN9 3RH", R.drawable.flight,
                R.drawable.parking));
        travel.add(new Poi("Sheffield Station", "Sheffield, S1 2BP", R.drawable.train,
                R.drawable.tram, R.drawable.taxi, R.drawable.parking));
        travel.add(new Poi("Sheffield Interchange", "Archway Centre, Pond Square, Sheffield, S1 2BD",
                R.drawable.bus));
        travel.add(new Poi("Meadowhall Interchange", "Sheffield, S9 1EQ", R.drawable.train,
                R.drawable.bus, R.drawable.tram, R.drawable.taxi, R.drawable.parking));
        travel.add(new Poi("Hillsborough Interchange", "Sheffield, S6 2LG", R.drawable.bus));
        travel.add(new Poi("City Taxis", "0114 2393939", R.drawable.taxi));
        travel.add(new Poi("Mercury Taxis", "0114 266 2662", R.drawable.taxi));
        travel.add(new Poi("Excel Taxis", "0114 245 0000", R.drawable.taxi));
        travel.add(new Poi("Express Taxis", "0114 243 0430", R.drawable.taxi));

        TravelAdapter adapter = new TravelAdapter(getActivity(), travel);

        ListView listView = rootView.findViewById(R.id.list2);

        listView.setAdapter(adapter);

        return rootView;
    }

}