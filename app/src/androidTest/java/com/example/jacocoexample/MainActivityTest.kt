package com.example.jacocoexample

import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * The kotlin equivalent to the ChangeTextBehaviorTest, that
 * showcases simple view matchers and actions like [ViewMatchers.withId],
 * [ViewActions.click] and [ViewActions.typeText], and ActivityScenarioRule
 *
 * Note that there is no need to tell Espresso that a view is in a different [Activity].
 */
@RunWith(AndroidJUnit4::class)
class ChangeTextBehaviorKtTest {

    /**
     * Use [activityScenarioRule] to create and launch the activity under test before each test,
     * and close it after each test.
     */
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun add_number() {
        val input1 = "2"
        val input2 = "3"
        val expect = "5"

        // Type text and then press the button.
        onView(withId(R.id.etNumber1)).perform(typeText(input1))
        onView(withId(R.id.etNumber2)).perform(typeText(input2))
        closeSoftKeyboard()
        onView(withId(R.id.btnAdd)).perform(click())

        // Check that the text was changed.
        onView(withId(R.id.tvResult)).check(matches(withText(expect)))
    }

    @Test
    fun add_number_emptyInput() {
        val input1 = "2"
        val input2 = ""
        val expect = "2"

        // Type text and then press the button.
        onView(withId(R.id.etNumber1)).perform(typeText(input1))
        onView(withId(R.id.etNumber2)).perform(typeText(input2))
        closeSoftKeyboard()
        onView(withId(R.id.btnAdd)).perform(click())

        // Check that the text was changed.
        onView(withId(R.id.tvResult)).check(matches(withText(expect)))
    }

}