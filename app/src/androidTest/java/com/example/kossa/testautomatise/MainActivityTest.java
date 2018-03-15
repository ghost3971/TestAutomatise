package com.example.kossa.testautomatise;

import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by KOSSA on 28/02/2018.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);
//    public ActivityTestRule<Main2Activity> activity2ActivityTestRule= new ActivityTestRule<Main2Activity>(Main2Activity.class);


    private MainActivity mainActivity=null;
    private Main2Activity main2Activity=null;

    Instrumentation.ActivityMonitor monitor=getInstrumentation().addMonitor(Main2Activity.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        mainActivity=activityActivityTestRule.getActivity();
//        main2Activity=activity2ActivityTestRule.getActivity();
    }

    @Test
    public  void testLanceSecondActivity(){

       assertNotNull(mainActivity.findViewById(R.id.btn1)) ;
       onView(withId(R.id.btn1)).perform(click());

        assertNotNull(mainActivity.findViewById(R.id.btn2)) ;
        onView(withId(R.id.btn2)).perform(click());

        pressBack();
//      pas obligé
//        Activity mainActivity2=getInstrumentation().waitForMonitorWithTimeout(monitor,1000000000);
//        assertNotNull(mainActivity2);
//        mainActivity2.finish();

//           assertNotNull(main2Activity.findViewById(R.id.btn3)) ;
//           onView(withId(R.id.btn3)).perform(click());
    }


    @After
    public void tearDown() throws Exception {
        mainActivity=null;
        main2Activity=null;
    }

}