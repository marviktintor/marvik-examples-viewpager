package com.marvik.examples.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marvik.examples.R;
import com.marvik.examples.callbacks.FragOneCallbacks;

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
public class FragmentsOne extends Fragment {

    FragOneCallbacks fragOneCallbacks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        fragOneCallbacks = (FragOneCallbacks) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one
                , container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        fragOneCallbacks.onCreateFragOne();
    }
}
