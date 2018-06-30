package me.mrsaingchakkrey.organicforhealth;

/**
 * Created by MR Saingchakkrey on 29-Jun-18.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1Fruits  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_fruits, container, false);
        return rootView;
    }
}
