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
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.sport_one, R.string.sport_description_one));
        locations.add(new Location(R.string.sport_two, R.string.sport_description_two));
        locations.add(new Location(R.string.sport_three, R.string.sport_description_three));
        locations.add(new Location(R.string.sport_four, R.string.sport_description_four));
        locations.add(new Location(R.string.sport_five, R.string.sport_description_five));
        locations.add(new Location(R.string.sport_six, R.string.sport_description_six));
        locations.add(new Location(R.string.sport_seven, R.string.sport_description_seven));
        locations.add(new Location(R.string.sport_eight, R.string.sport_description_eight));
        locations.add(new Location(R.string.sport_nine, R.string.sport_description_nine));
        locations.add(new Location(R.string.sport_ten, R.string.sport_description_ten));

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