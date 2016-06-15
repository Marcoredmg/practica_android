package com.coredevelopers.fmplatzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coredevelopers.fmplatzi.ui.HypedArtistsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.main_container, new HypedArtistsFragment()).commit();
    }
}
