package org.o7planning.playvideo;

import junit.framework.TestCase;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import androidx.test.rule.ActivityTestRule;

@RunWith(AndroidJUnit4.class)

public class UITest extends TestCase {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String nComm = "С новым годом!!!";

    @Test
    public void testSendComment(){

        onView(withId(R.id.input_comment)).perform(replaceText(nComm));

        closeSoftKeyboard();

        onView(withId(R.id.button_comment)).perform(click());

    }

    @Test
    public void testButtonPlay() {

        onView(withId(R.id.button_play)).perform(click());

    }

}