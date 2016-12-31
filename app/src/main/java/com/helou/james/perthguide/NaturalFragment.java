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
public class NaturalFragment extends Fragment {


    public NaturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Kings Park", getString(R.string.kings_park),
                R.drawable.natural_kings_park));
        locations.add(new Location("Rottnest Island", getString(R.string.rottnest_island),
                R.drawable.natural_rottnest));
        locations.add(new Location("Caversham Wildlife Park", getString(R.string.caversham_park),
                R.drawable.natural_caversham));
        locations.add(new Location("The Pinnacles", getString(R.string.the_pinnacles),
                R.drawable.natural_pinnacles));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(adapter);

        return rootView;
    }

}
