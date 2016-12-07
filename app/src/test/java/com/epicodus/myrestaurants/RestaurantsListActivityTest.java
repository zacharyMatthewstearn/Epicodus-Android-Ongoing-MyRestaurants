package com.epicodus.myrestaurants;

import android.os.Build;
import android.widget.ListView;

import com.epicodus.myrestaurants.ui.RestaurantsListActivity;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Guest on 11/14/16.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class RestaurantsListActivityTest {
    private RestaurantsListActivity activity;
    private ListView mRestaurantListView;
}
