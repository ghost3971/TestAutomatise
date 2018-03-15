package com.example.kossa.testautomatise;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by KOSSA on 28/02/2018.
 */
public class Main2ActivityTest {
    @Rule
    public ActivityTestRule<Main2Activity> activity2ActivityTestRule= new ActivityTestRule<Main2Activity>(Main2Activity.class);
    private MainActivity mainActivity=null;
    private Main2Activity main2Activity=null;


    @Before
    public void setUp() throws Exception {
        main2Activity=activity2ActivityTestRule.getActivity();
    }

    @Test
    public void testClickZoneSaisie(){
        assertNotNull(main2Activity.findViewById(R.id.btn3)) ;
        onView(withId(R.id.btn3)).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        main2Activity=null;
    }

}