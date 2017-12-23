package com.example.vstremoukhov.memapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_single_video)
public class SingleVideoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if (state == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.containerView, VideoFragment.build(Video.ORANGE_1.url))
                    .commit();
        }
    }
    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }
}
