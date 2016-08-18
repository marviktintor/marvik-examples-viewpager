package com.marvik.examples.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marvik.examples.R;
import com.marvik.examples.adapters.VPAdapter;
import com.marvik.examples.callbacks.DashboardCallbacks;

import java.util.ArrayList;
import java.util.List;

/**
 * Project - ViewPagerHack
 * Package - com.marvik.examples.fragments
 * <p/>
 * Victor Mwenda
 * 0718034449
 * <p/>
 * Android App Development Laptop
 * Created by victor on 8/18/2016.
 */
public class FragmentDashboard extends Fragment {

    DashboardCallbacks dashboardCallbacks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        dashboardCallbacks = (DashboardCallbacks) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentsOne());
        fragments.add(new FragmentTwo());
        fragments.add(new FragmentThree());
        viewPager.setAdapter(new VPAdapter(getChildFragmentManager(), fragments));
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        dashboardCallbacks.onCreateDashboard();
    }
}
