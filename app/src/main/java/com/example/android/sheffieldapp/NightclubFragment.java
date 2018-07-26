package com.example.android.sheffieldapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class NightclubFragment extends Fragment {


    public NightclubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.grid_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<Poi> clubs = new ArrayList<>();
        clubs.add(new Poi(R.drawable.area, getString(R.string.poi_area),
                getString(R.string.loc_area), getString(R.string.web_area)));
        clubs.add(new Poi(R.drawable.plug, getString(R.string.poi_plug),
                getString(R.string.loc_plug), getString(R.string.web_plug)));
        clubs.add(new Poi(R.drawable.code, getString(R.string.poi_code),
                getString(R.string.loc_code), getString(R.string.web_code)));
        clubs.add(new Poi(R.drawable.leadmill, getString(R.string.poi_leadhill),
                getString(R.string.loc_leadmill), getString(R.string.web_leadmill)));
        clubs.add(new Poi(R.drawable.corp, getString(R.string.poi_corp),
                getString(R.string.loc_corp), getString(R.string.web_corp)));
        clubs.add(new Poi(R.drawable.tnk, getString(R.string.poi_tnk),
                getString(R.string.loc_tnk), getString(R.string.web_tnk)));
        clubs.add(new Poi(R.drawable.hopeworks, getString(R.string.poi_hopeworks),
                getString(R.string.loc_hopeworks), getString(R.string.web_hopeworks)));


        PoiAdapter adapter = new PoiAdapter(getActivity(), clubs);

        GridView gridView = rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}