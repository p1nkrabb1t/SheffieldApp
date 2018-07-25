package com.example.android.sheffieldapp;


public class Poi {

    // Integer value
    private int mImageResourceId;

    // String value
    private String mTitle;

    // String value
    private String mAddress;

    // String value
    private String mWeb;

    // String value
    private String mPhone;

    // Integer value
    private int mIcon1Id;

    // Integer value
    private int mIcon2Id;

    // Integer value
    private int mIcon3Id;

    // Integer value
    private int mIcon4Id;

    // Integer value
    private int mIcon5Id;

    /**
     * Constructs a new object containing name, address and website
     */
    public Poi(String Title, String Address, String Website) {
        mTitle = Title;
        mAddress = Address;
        mWeb = Website;

    }

    /**
     * Constructs a new object containing image, name, address and website
     */
    public Poi(int ImageResourceId, String Title, String Address, String Website) {
        mImageResourceId = ImageResourceId;
        mTitle = Title;
        mAddress = Address;
        mWeb = Website;
    }


    /**
     * Constructs a new object containing name, phone and icon information for use with taxis
     */
    public Poi(String Title, String Phone, int Icon1) {
        mTitle = Title;
        mPhone = Phone;
        mIcon1Id = Icon1;

    }

    /**
     * Constructs a new object containing name, address and two icons
     */
    public Poi(String Title, String Address, int Icon1, int Icon2) {
        mTitle = Title;
        mAddress = Address;
        mIcon1Id = Icon1;
        mIcon2Id = Icon2;
    }

    /**
     * Constructs a new object containing name, address and three icons
     */
    public Poi(String Title, String Address, int Icon1, int Icon2, int Icon3) {
        mTitle = Title;
        mAddress = Address;
        mIcon1Id = Icon1;
        mIcon2Id = Icon2;
        mIcon3Id = Icon3;

    }


    /**
     * Constructs a new object containing name, address and four icons
     */
    public Poi(String Title, String Address, int Icon1, int Icon2, int Icon3, int Icon4) {
        mTitle = Title;
        mAddress = Address;
        mIcon1Id = Icon1;
        mIcon2Id = Icon2;
        mIcon3Id = Icon3;
        mIcon4Id = Icon4;
    }


    /**
     * Constructs a new object containing name, address and five icons
     */
    public Poi(String Title, String Address, int Icon1, int Icon2, int Icon3, int Icon4, int Icon5) {
        mTitle = Title;
        mAddress = Address;
        mIcon1Id = Icon1;
        mIcon2Id = Icon2;
        mIcon3Id = Icon3;
        mIcon4Id = Icon4;
        mIcon5Id = Icon5;
    }

    // Get the resource ID if applicable
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //get the name
    public String getTitle() {
        return mTitle;
    }

    //get the location
    public String getAddress() {
        return mAddress;
    }

    //get the web address
    public String getWeb() {
        return mWeb;
    }

    //get the phone number
    public String getPhone() {
        return mPhone;
    }

    // Get icon resource ID
    public int getIcon1Id() {
        return mIcon1Id;
    }

    // Get icon resource ID
    public int getIcon2Id() {
        return mIcon2Id;
    }

    // Get icon resource ID
    public int getIcon3Id() {
        return mIcon3Id;
    }

    // Get icon resource ID
    public int getIcon4Id() {
        return mIcon4Id;
    }

    // Get icon resource ID
    public int getIcon5Id() {
        return mIcon5Id;
    }


}