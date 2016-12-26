package com.helou.james.perthguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static java.security.AccessController.getContext;

/**
 * Created by James on 20-Dec-16.
 */

public class TouristActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist);

        // Set up ViewPager and attach custom Adapter
        ViewPager viewPager = (ViewPager) findViewById(R.id.tourist_viewpager);
        viewPager.setAdapter(new LocationFragmentAdapter(TouristActivity.this,
                getSupportFragmentManager()));

        // Set up TabLayout and provide the Viewpager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tourist_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
