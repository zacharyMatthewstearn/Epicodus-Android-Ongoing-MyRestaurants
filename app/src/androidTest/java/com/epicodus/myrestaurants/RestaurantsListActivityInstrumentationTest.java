package com.epicodus.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurants.ui.RestaurantsListActivity;

import org.junit.Rule;

public class RestaurantsListActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<RestaurantsListActivity> activityTestRule =
            new ActivityTestRule<>(RestaurantsListActivity.class);

//    @Test
//    public void listItemClickDisplaysToastWithCorrectRestaurant() {
//        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
//        String restaurantName = "Mi Mero Mole";
//        onData(anything())
//                .inAdapterView(withId(R.id.listView))
//                .atPosition(0)
//                .perform(click());
//        onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
//                .check(matches(withText(restaurantName)));
//    }
}
