package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = (TextView) findViewById(R.id.tv_weather_info);
        // TODODONE (2) Display the weather forecast that was passed from MainActivity
        Intent detailActivityIntent = getIntent();
        if(detailActivityIntent.hasExtra("weather")){
            String weather = detailActivityIntent.getStringExtra("weather");
            textView.setText(weather);
        }

    }
}