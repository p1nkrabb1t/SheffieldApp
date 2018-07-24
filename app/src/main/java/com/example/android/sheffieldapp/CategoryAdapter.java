package com.example.android.sheffieldapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TravelFragment();
        } else if (position == 1) {
            return new POIFragment();
        } else if (position == 2) {
            return new SportsFragment();
        } else {
            return new NightclubFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.tab_travel);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_poi);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_sport);
        } else {
            return mContext.getString(R.string.tab_club);
        }
    }

}

