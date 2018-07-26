package com.example.android.sheffieldapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class POIFragment extends Fragment {


    public POIFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<Poi> poi = new ArrayList<>();
        poi.add(new Poi(R.drawable.cathedral, getString(R.string.poi_cathedral),
                getString(R.string.loc_cathedral), getString(R.string.web_cathedral)));
        poi.add(new Poi(R.drawable.cityhall, getString(R.string.poi_cityhall),
                getString(R.string.loc_cityhall), getString(R.string.web_cityhall)));
        poi.add(new Poi(R.drawable.millenium, getString(R.string.poi_millenium),
                getString(R.string.loc_millenium), getString(R.string.web_millenium)));
        poi.add(new Poi(R.drawable.wintergarden, getString(R.string.poi_winter), getString(R.string.loc_winter),
                getString(R.string.web_winter)));
        poi.add(new Poi(R.drawable.fountains, getString(R.string.poi_peace), getString(R.string.loc_peace),
                getString(R.string.web_peace)));
        poi.add(new Poi(R.drawable.botanical, getString(R.string.poi_botanical),
                getString(R.string.loc_botanical), getString(R.string.web_botanical)));
        poi.add(new Poi(R.drawable.chatsworth, getString(R.string.poi_chatsworth),
                getString(R.string.loc_chatsworth), getString(R.string.web_chatsworth)));
        poi.add(new Poi(R.drawable.kelham, getString(R.string.poi_kelham),
                getString(R.string.loc_kelham), getString(R.string.web_kelham)));
        poi.add(new Poi(R.drawable.arena, getString(R.string.poi_arena),
                getString(R.string.loc_arena), getString(R.string.web_arena)));
        poi.add(new Poi(R.drawable.crucible, getString(R.string.poi_crucible),
                getString(R.string.loc_crucible), getString(R.string.web_crucible)));
        poi.add(new Poi(R.drawable.meadowhall, getString(R.string.poi_mhall),
                getString(R.string.loc_mhall), getString(R.string.web_mhall)));
        poi.add(new Poi(R.drawable.butterflyhouse, getString(R.string.poi_butterfly),
                getString(R.string.loc_butterfly), getString(R.string.web_butterfly)));


        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);

        GridView gridView = rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}