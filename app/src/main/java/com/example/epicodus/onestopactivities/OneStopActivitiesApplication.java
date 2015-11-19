package com.example.epicodus.onestopactivities;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Guest on 11/5/15.
 */
public class OneStopActivitiesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "2BIKvLgIZufqNghnOH0oVDdIFj7qf9pTGHUkgi8u", "1qHH6iMDyKXYdkHmhXdC5fQVGnJT0zUu4eTaXGH3");

//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();

    }
}
