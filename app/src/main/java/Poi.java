package com.example.android.sheffieldapp;


/**
 * Displays brief playlist summary
 */
public class Poi {

    // Integer value
    private int mImageResourceId;

    // String value
    private String mTitle;

    // String value
    private String mAddress;

    // String value
    private String mWeb;



    /**
     * Constructs a new object containing image, name, genre, number of tracks and length
     */
    public Poi(String Title, String Address, String Website) {
        mTitle = Title;
        mAddress = Address;
        mWeb = Website;

    }

    /**
     * Constructs a new object containing image, name, genre, number of tracks and length
     */
    public Poi(int ImageResourceId, String Title, String Address, String Website) {
        mImageResourceId = ImageResourceId;
        mTitle = Title;
        mAddress = Address;
        mWeb = Website;
    }

    // Get the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //get the POI name
    public String getTitle() {
        return mTitle;
    }

    //allow a new POI title to be added
    public void setTitle(String Title) {
        mTitle = Title;
    }

    //get the POI location
    public String getAddress() {
        return ("Genre: " + mAddress);
    }

    //allow a new POI address to be added
    public void setAddress(String Address) {
        mAddress = Address;
    }

    //get the number of tracks
    public String getWeb() {
        return (mWeb);
    }

    //allow a new POI website to be added
    public void setWeb(String Website) {
        mWeb = Website;
    }



}