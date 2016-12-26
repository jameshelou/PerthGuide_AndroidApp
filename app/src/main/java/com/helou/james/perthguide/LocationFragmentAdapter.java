package com.helou.james.perthguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by James on 23-Dec-16.
 */

public class LocationFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public LocationFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LandmarkFragment();
            case 1:
                return new NaturalFragment();
            case 2:
                return new BeachFragment();
            case 3:
                return new FoodFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.landmark_tab);
            case 1:
                return mContext.getString(R.string.natural_tab);
            case 2:
                return mContext.getString(R.string.beaches_tab);
            case 3:
                return mContext.getString(R.string.food_tab);
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return 4; }
}
