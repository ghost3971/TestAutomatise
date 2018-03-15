package com.example.kossa.testautomatise;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by KOSSA on 28/02/2018.
 */
public class Main3ActivityTest {
    @Rule
    public ActivityTestRule<Main3Activity> activityActivityTestRule= new ActivityTestRule<Main3Activity>(Main3Activity.class);

    private Main3Activity main3Activity=null;

    @Before
    public void setUp() throws Exception {
        main3Activity=activityActivityTestRule.getActivity();
    }

    public void testNextActivity() {
        // Our test...

      //  La première étape consiste à récupérer la vue du bouton.
        assertNotNull(main3Activity.findViewById(R.id.main_b)) ;
        onView(withId(R.id.main_b));
        //La seconde étape consiste à vérifier que le texte initial est correct.
        onView(withId(R.id.main_b)).check(matches(withText(R.string.button_before)));

//Une fois cette vérification terminée, il faut cliquer sur le bouton et vérifier que son texte a bien changé. Pour se faire,
// il faut récupérer la vue du bouton comme pour la vérification précédente et cliquer dessus.
        onView(withId(R.id.main_b)).perform(click());

        // Pour finir, il faut effectuer une vérification à la suite de l'action qui se fera toujours grâce à la méthode check et
        // se positionne à la suite de la méthode perform. Sauf que cette fois, le texte du bouton doit avoir la valeur après le clic.
        onView(withId(R.id.main_b)).perform(click()).check(matches(withText(R.string.button_after)));
    }

    @After
    public void tearDown() throws Exception {
        main3Activity=null;
    }

}