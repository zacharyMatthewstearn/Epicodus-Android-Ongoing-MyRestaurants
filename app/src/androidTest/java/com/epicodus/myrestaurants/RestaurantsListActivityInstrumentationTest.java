package com.epicodus.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurants.ui.RestaurantsListActivity;

import org.junit.Rule;

public class RestaurantsListActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<RestaurantsListActivity> activityTestRule =
            new ActivityTestRule<>(RestaurantsListActivity.class);
}
