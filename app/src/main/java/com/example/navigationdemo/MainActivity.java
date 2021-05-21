package com.example.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.navigationdemo.MainFragment;
import android.net.Uri;
import android.app.Activity;


public class MainActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}


