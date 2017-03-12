package com.example.user.gloryroad;

import android.content.Context;
import android.content.SharedPreferences;


public class userData implements playerInterface {
    private static SharedPreferences data = null;

    public static void create(Context mainActivity) {
        String prefsTag =  "anotherLife";
        data = mainActivity.getSharedPreferences(prefsTag,0);
    }

    public static SharedPreferences get() {
        return data;
    }

    public static void save() {
        data.edit().apply();
    }
}
