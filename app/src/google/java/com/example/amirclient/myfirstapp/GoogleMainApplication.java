package com.example.amirclient.myfirstapp;

/**
 * Created by Amir on 25-01-2018.
 */

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;

public class GoogleMainApplication extends Application {

    private FirebaseAnalytics mfirebaseAnalytics;

    @Override
    public void onCreate() {
        super.onCreate();
        mfirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

}

