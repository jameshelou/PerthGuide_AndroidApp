package com.helou.james.perthguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find TextViews
        TextView tourist_textview = (TextView) findViewById(R.id.tourism_textview);

        // Set up click listeners for category navigation
        tourist_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TouristActivity.class);
                startActivity(intent);
            }
        });

        // TODO other category click listeners
    }
}
