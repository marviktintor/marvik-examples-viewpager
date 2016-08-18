package com.marvik.examples.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.marvik.examples.R;
import com.marvik.examples.callbacks.DashboardCallbacks;
import com.marvik.examples.callbacks.FragOneCallbacks;
import com.marvik.examples.callbacks.FragThreeCallbacks;
import com.marvik.examples.callbacks.FragTwoCallbacks;
import com.marvik.examples.fragments.FragmentDashboard;

/**
 * Project - ViewPagerHack
 * Package - com.marvik.examples.activities
 * <p/>
 * Victor Mwenda
 * 0718034449
 * <p/>
 * Android App Development Laptop
 * Created by victor on 8/18/2016.
 */
public class SampleActivity extends AppCompatActivity implements DashboardCallbacks, FragOneCallbacks,
        FragTwoCallbacks, FragThreeCallbacks {

    TextView frag1, frag2, frag3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = (TextView) findViewById(R.id.frag1);
        frag2 = (TextView) findViewById(R.id.frag2);
        frag3 = (TextView) findViewById(R.id.frag3);

        getFragmentManager().beginTransaction().replace(R.id.parent_container, new FragmentDashboard())
                .addToBackStack(getPackageName())
                .commit();
    }

    @Override
    public void onCreateDashboard() {
        Toast.makeText(getApplicationContext(), "Dashboard", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateFragOne() {
        Toast.makeText(getApplicationContext(), "frag 1", Toast.LENGTH_SHORT).show();
        frag1.setTextColor(Color.MAGENTA);
        frag2.setTextColor(Color.BLACK);
        frag3.setTextColor(Color.BLACK);
    }

    @Override
    public void onCreateFragThree() {
        Toast.makeText(getApplicationContext(), "frag 3", Toast.LENGTH_SHORT).show();
        frag1.setTextColor(Color.BLACK);
        frag2.setTextColor(Color.BLACK);
        frag3.setTextColor(Color.MAGENTA);
    }

    @Override
    public void onCreateFragTwo() {
        Toast.makeText(getApplicationContext(), "frag 2", Toast.LENGTH_SHORT).show();
        frag1.setTextColor(Color.BLACK);
        frag2.setTextColor(Color.MAGENTA);
        frag3.setTextColor(Color.BLACK);
    }
}
