package com.example.user.gloryroad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.user.gloryroad.userData;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userData.create(this);
    }

    @Override
    protected void onStop() {
        userData.save();
        super.onStop();
    }
}
