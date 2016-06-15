package com.coredevelopers.fmplatzi.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coredevelopers.fmplatzi.MainActivity;
import com.coredevelopers.fmplatzi.R;

/**
 * Created by sears on 14/06/16.
 */
public class HypedArtistsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);
        return root;
    }

}
