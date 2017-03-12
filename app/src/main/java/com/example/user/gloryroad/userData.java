package com.example.user.gloryroad;

import android.content.Context;
import android.content.SharedPreferences;


public class userData {
    private static SharedPreferences data = null;

    public static void create(Context mainActivity) {
        String prefsTag =  "saveFile";
        data = mainActivity.getSharedPreferences(prefsTag,0);
    }

    public static SharedPreferences get() {
        return data;
    }

    public static void save() {
        data.edit().apply();
    }
}
