package com.example.android.tourguideapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.restaurant_one, R.string.restaurant_description_one, R.drawable.wendys));
        locations.add(new Location(R.string.restaurant_two, R.string.restaurant_description_two, R.drawable.mcdonalds));
        locations.add(new Location(R.string.restaurant_three, R.string.restaurant_description_three, R.drawable.cookout));
        locations.add(new Location(R.string.restaurant_four, R.string.restaurant_description_four, R.drawable.sidewall));
        locations.add(new Location(R.string.restaurant_five, R.string.restaurant_description_five, R.drawable.tokyo));
        locations.add(new Location(R.string.restaurant_six, R.string.restaurant_description_six, R.drawable.habaneros));
        locations.add(new Location(R.string.restaurant_seven, R.string.restaurant_description_seven, R.drawable.mcalisters));
        locations.add(new Location(R.string.restaurant_eight, R.string.restaurant_description_eight, R.drawable.sushi356));
        locations.add(new Location(R.string.restaurant_nine, R.string.restaurant_description_nine, R.drawable.ttt));
        locations.add(new Location(R.string.restaurant_ten, R.string.restaurant_description_ten, R.drawable.backstreets));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Location location = locations.get(position);
            }
        });

        return rootView;
    }
}