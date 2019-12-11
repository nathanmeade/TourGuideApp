package com.example.android.tourguideapp;

public class Location {

    private int locationName;
    private int locationDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int location, int locDescription){
        locationName = location;
        locationDescription = locDescription;
    }
    

    public Location(int location, int locDescription, int imageResourceId){
        locationName = location;
        locationDescription = locDescription;
        mImageResourceId = imageResourceId;
    }

    public int getLocationName(){
        return locationName;
    }

    public int getLocationDescription(){
        return locationDescription;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public boolean hasImage(){
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}