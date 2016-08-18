package com.marvik.examples.adapters;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Project - ViewPagerHack
 * Package - com.marvik.examples.adapters
 * <p/>
 * Victor Mwenda
 * 0718034449
 * <p/>
 * Android App Development Laptop
 * Created by victor on 8/18/2016.
 */
public class VPAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragments;

    public VPAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return getFragments().get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return getFragments().size();
    }

    public List<Fragment> getFragments() {
        return fragments;
    }
}
