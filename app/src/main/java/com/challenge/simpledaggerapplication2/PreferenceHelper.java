package com.challenge.simpledaggerapplication2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

import javax.inject.Inject;

public class PreferenceHelper {

    private static final String MY_PREF = "MY-PREF";
    private static final String TAG = "TAG_1";

    @Inject
    public PreferenceHelper() {
    }

    public void log(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        for (Map.Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.v(TAG, entry.getKey() + " " + entry.getValue());
        }
    }

    public boolean add(Context context, String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        return sharedPreferences.edit().putString(key, value).commit();
    }

}
