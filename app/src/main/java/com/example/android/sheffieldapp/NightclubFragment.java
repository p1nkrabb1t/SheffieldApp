package com.example.android.sheffieldapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class NightclubFragment extends Fragment {


    public NightclubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_holder, container, false);

        // Create an arraylist of custom objects
        final ArrayList<com.example.android.sheffieldapp.Poi> clubs = new ArrayList<com.example.android.sheffieldapp.Poi>();
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.area, "Area", "1 Burgess St, Sheffield, S1 2HF", "http://www.areasheffield.co.uk"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.plug, "Plug Warehouse", "14-16 Matilda St, Sheffield, S1 4QD", "https://the-plug.com"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.code, "Code:", "28 Eyre St, Sheffield, S1 4QY", "http://codesheffield.com"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.leadmill, "The Leadmill", "6 Leadmill Rd, Sheffield, S1 4SE", "https://www.leadmill.co.uk"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.corp, "Corporation", "2 Milton St, Sheffield, S1 4JU", "http://www.corporation.org.uk"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.tnk, "The Night Kitchen", "7 Smithfield, Sheffield, S3 7AW", "http://www.thenightkitchen.org"));
        clubs.add(new com.example.android.sheffieldapp.Poi(R.drawable.hopeworks, "Hope Works", "1A, Sussex Rd, Sheffield, S4 7YQ", "http://www.hope-works.co.uk"));


        com.example.android.sheffieldapp.PoiAdapter adapter = new com.example.android.sheffieldapp.PoiAdapter(getActivity(), clubs);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}