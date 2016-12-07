package com.epicodus.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurants.ui.MainActivity;

import org.junit.Rule;

/**
 * Created by Guest on 11/14/16.
 */
public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);
}
