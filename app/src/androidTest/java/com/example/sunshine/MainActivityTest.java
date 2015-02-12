package com.example.sunshine;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testCanary() {
        assertTrue(true);
    }

    public void testStuff() {
        this.getActivity().onResume();
    }

    public void testNow() {
        assertTrue(getActivity().isVisible());
    }

}
