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
        poi.add(new Poi(R.drawable.cathedral, "Sheffield Cathedral",
                "Church St, Sheffield, S1 1HA", "http://www.sheffieldcathedral.org"));
        poi.add(new Poi(R.drawable.cityhall, "City Hall",
                "Barker's Pool, Sheffield, S1 2JA", "https://sheffieldcityhall.sivtickets.com"));
        poi.add(new Poi(R.drawable.millenium, "Millenium Gallery",
                "48 Arundel Gate, Sheffield, S1 2PP", "http://www.museums-sheffield.org.uk/museums/millennium-gallery/home"));
        poi.add(new Poi(R.drawable.wintergarden, "Winter Garden", "90 Surrey St, Sheffield, S1 2LH",
                "https://www.sheffield.gov.uk/home/parks-sport-recreation/public-spaces/winter-garden.html"));
        poi.add(new Poi(R.drawable.fountains, "Peace Gardens", "50 Pinstone St, Sheffield, S1 2HH",
                "https://www.sheffield.gov.uk/home/parks-sport-recreation/public-spaces/peace-gardens"));
        poi.add(new Poi(R.drawable.botanical, "Botanical Gardens",
                "Clarkehouse Rd, Sheffield, S10 2LN", "http://www.sbg.org.uk"));
        poi.add(new Poi(R.drawable.chatsworth, "Chatsworth House",
                "Bakewell, DE45 1PP", "https://www.chatsworth.org"));
        poi.add(new Poi(R.drawable.kelham, "Kelham Island Museum",
                "Alma St, Sheffield, S3 8RY", "http://www.simt.co.uk"));
        poi.add(new Poi(R.drawable.arena, "Sheffield Arena",
                "Broughton Ln, Sheffield, S9 2DF", "http://www.flydsaarena.co.uk"));
        poi.add(new Poi(R.drawable.crucible, "Crucible Theatre",
                "55 Norfolk Street, Sheffield, S1 1DA", "https://www.sheffieldtheatres.co.uk"));
        poi.add(new Poi(R.drawable.meadowhall, "Meadowhall Shopping Centre",
                "Sheffield, S9 1EP", "https://www.meadowhall.co.uk"));
        poi.add(new Poi(R.drawable.butterflyhouse, "Butterfly House",
                "Woodsetts Rd, North Anston, Sheffield, S25 4EQ", "https://www.butterflyhouse.co.uk"));


        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);

        GridView gridView = rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}