package com.challenge.simpledaggerapplication2;

import android.app.Application;

public class MyApp extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder().build();
    }

    public static void inject(MainActivity mainActivity) {
        appComponent.inject(mainActivity);
    }

}
