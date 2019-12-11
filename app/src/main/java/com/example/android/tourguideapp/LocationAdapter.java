package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColor;
    public LocationAdapter(Activity context, ArrayList<Location> locations, int color){
        super(context, 0, locations);
        mColor = color;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.text1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        locationNameTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.text2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationDescriptionTextView.setText(currentLocation.getLocationDescription());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        ImageView imageTextView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation.hasImage()){
            imageTextView.setImageResource(currentLocation.getImageResourceId());
            imageTextView.setVisibility(View.VISIBLE);
        }
        else {
            imageTextView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.wordLayout);
        int color = ContextCompat.getColor(getContext(), mColor);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}