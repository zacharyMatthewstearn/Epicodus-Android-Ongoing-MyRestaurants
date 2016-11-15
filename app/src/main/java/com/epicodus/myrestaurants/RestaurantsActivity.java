package com.epicodus.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ListResourceBundle;

public class RestaurantsActivity extends AppCompatActivity {
    public static final String TAG = RestaurantsActivity.class.getSimpleName();
    private TextView mLocationTextView;
    private String[] restaurants = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);
        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.custom_expandable_list_item_1, restaurants);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(RestaurantsActivity.this, restaurant, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);
        Typeface boopeeFont = Typeface.createFromAsset(getAssets(), "fonts/boopee.ttf");
        mLocationTextView.setTypeface(boopeeFont);
    }
}
