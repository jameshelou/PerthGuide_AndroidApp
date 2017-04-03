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
public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Scarborough Beach", getString(R.string.scarborough_beach),
                R.drawable.beach_scarbs));
        locations.add(new Location("Cottesloe Beach", getString(R.string.cottesloe_beach),
                R.drawable.beach_cott));
        locations.add(new Location("Hillarys Boat Harbour",
                getString(R.string.hillarys_boat_harbour), R.drawable.beach_hillarys));

        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(adapter);

        return rootView;
    }

}
