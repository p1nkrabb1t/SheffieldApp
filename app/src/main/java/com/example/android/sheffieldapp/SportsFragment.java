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
        View rootView = inflater.inflate(R.layout.list_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<com.example.android.sheffieldapp.Poi> sports = new ArrayList<com.example.android.sheffieldapp.Poi>();
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.swfc, "Sheffield Wednesday Football Ground", "Hillsborough", "https://www.swfc.co.uk/"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.sufc,"Sheffield United Football Ground", "Sheffled Centre", "https://www.sufc.co.uk/"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.pondsforge,"Ponds Forge Leisure Centre", "Sheffled Centre", "https://www.siv.org.uk/page/ponds-forge"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.hillslc,"Hillsborough Leisure Centre", "Hillsborough", "https://www.siv.org.uk/page/hillsborough-leisure-centre"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.eis,"English Institute of Sport", "Attercliffe", "https://www.siv.org.uk/page/eis-sheffield"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.concord,"Concord Sports Centre", "Shiregreen", "https://www.siv.org.uk/page/concord-sports-centre"));
        sports.add(new com.example.android.sheffieldapp.Poi(R.drawable.icesheff,"Ice Sheffield", "Attercliffe", "https://www.siv.org.uk/page/icesheffield"));

        com.example.android.sheffieldapp.PoiAdapter adapter = new com.example.android.sheffieldapp.PoiAdapter(getActivity(), sports);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}
