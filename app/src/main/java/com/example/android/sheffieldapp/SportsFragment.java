package com.example.android.sheffieldapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<Poi> sports = new ArrayList<Poi>();
        sports.add(new Poi(R.drawable.swfc, getString(R.string.poi_swfc),
                getString(R.string.loc_swfc), getString(R.string.web_swfc)));
        sports.add(new Poi(R.drawable.sufc, getString(R.string.poi_sufc),
                getString(R.string.loc_sufc), getString(R.string.web_sufc)));
        sports.add(new Poi(R.drawable.pondsforge, getString(R.string.poi_pondslc),
                getString(R.string.loc_pondslc), getString(R.string.web_pondslc)));
        sports.add(new Poi(R.drawable.hillslc, getString(R.string.poi_hillslc), getString(R.string.loc_hillslc),
                getString(R.string.web_hillslc)));
        sports.add(new Poi(R.drawable.eis, getString(R.string.poi_eislc), getString(R.string.loc_eislc),
                getString(R.string.web_eislc)));
        sports.add(new Poi(R.drawable.concord, getString(R.string.poi_concordlc), getString(R.string.loc_concordlc),
                getString(R.string.web_concordlc)));
        sports.add(new Poi(R.drawable.icesheff, getString(R.string.poi_icesheff), getString(R.string.loc_icesheff),
                getString(R.string.web_iceshefflc)));

        PoiAdapter adapter = new PoiAdapter(getActivity(), sports);

        GridView gridView = rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}
