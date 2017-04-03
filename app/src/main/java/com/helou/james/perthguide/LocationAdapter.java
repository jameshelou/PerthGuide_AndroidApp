package com.helou.james.perthguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by James on 23-Dec-16.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the view will be reused - else inflate a new view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item,
                    parent, false);
        }

        Location currentLocation = getItem(position);

        // Find the location name TextView
        TextView headerTextView = (TextView) convertView.findViewById(R.id.loc_header);

        // Find the location body TextView
        TextView bodyTextView = (TextView) convertView.findViewById(R.id.loc_body);

        // Assign the current list items TextView content
        headerTextView.setText(currentLocation.getLocName());
        bodyTextView.setText(currentLocation.getLocInfo());

        // Handle image viewing (if there is an image)
        ImageView locationImageView = (ImageView) convertView.findViewById(R.id.loc_image);
        if (currentLocation.hasImage()) {
            locationImageView.setImageResource(currentLocation.getImageId());
        } else {
            locationImageView.setVisibility(View.GONE);
        }


        return convertView;
    }
}
