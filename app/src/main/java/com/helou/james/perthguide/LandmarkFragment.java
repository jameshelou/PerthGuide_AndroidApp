package com.helou.james.perthguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarkFragment extends Fragment {


    public LandmarkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("The Bell Tower", getString(R.string.bell_tower),
                R.drawable.landmark_belltower));
        locations.add(new Location("Elizabeth Quay", getString(R.string.elizabeth_quay),
                R.drawable.landmark_quay));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(adapter);

        return rootView;
    }

}
