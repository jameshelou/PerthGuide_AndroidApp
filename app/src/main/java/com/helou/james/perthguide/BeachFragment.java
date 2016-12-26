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

        ArrayList<Location> test = new ArrayList<Location>();
        test.add(new Location("SomeBeach", "Some information about the beach",
                R.drawable.beach_cott));
        test.add(new Location("SomeBeach2", "Some MORE information about the beach",
                R.drawable.beach_cott));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(getActivity(), test);
        listView.setAdapter(adapter);

        return rootView;
    }

}
