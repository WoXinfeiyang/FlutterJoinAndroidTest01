package com.fxj.flutterjoinandroidtest01;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction transaction= fm.beginTransaction();
        transaction.replace(R.id.framelayout_container,MainFragment.newInstance());
        transaction.commit();
    }
}
