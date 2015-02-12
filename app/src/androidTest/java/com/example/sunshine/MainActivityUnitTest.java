package com.example.sunshine;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

import org.mockito.Mockito;

public class MainActivityUnitTest extends ActivityUnitTestCase<MainActivity> {
    public MainActivityUnitTest() {
        super(MainActivity.class);
    }

    Intent i;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        i = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
    }

    public void testCanary() throws Exception {
        startActivity(i, null, null);
        assertTrue(true);
    }

    public void testSomething() throws Exception {
        startActivity(i, null, null);
        assertNotNull(getActivity());
    }

    public void testSomethingElse() throws Exception {
        MainActivity activity = startActivity(i, null, null);
        assertFalse(activity.testing);
        activity.onPostResume();
        assertTrue(activity.testing);
    }

    public void testOnCreate() throws Exception {
        //On Create is automagically called
//        assertFalse(activity.onCreate);
    }

    public void testOnResume() throws Exception {
        MainActivity activity = startActivity(i, null, null);
        assertFalse(activity.onResumse);
        activity.onResume();
        assertTrue(activity.onResumse);
    }
}
