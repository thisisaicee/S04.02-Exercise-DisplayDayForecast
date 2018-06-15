package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView detailsTextView;
    String weatherForDay;

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // DONE (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        detailsTextView = (TextView) findViewById(R.id.weather_details_textview);
        if (intent != null) {
            if (intent.hasExtra(Intent.EXTRA_TEXT)) {
                weatherForDay = intent.getStringExtra(Intent.EXTRA_TEXT);
                detailsTextView.setText(weatherForDay);
            }
        }
    }
}