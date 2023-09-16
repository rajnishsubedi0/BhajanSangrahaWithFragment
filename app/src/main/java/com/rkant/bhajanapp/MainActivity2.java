package com.rkant.bhajanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.rkant.bhajanapp.FirstActivities.MainRootFragment;
import com.rkant.bhajanapp.secondActivities.SecondRootFragment;

public class MainActivity2 extends AppCompatActivity {
    public static int numberOfChange = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.setCustomAnimations(R.anim.fade_in,R.anim.fade_in);
        fragmentTransaction.add(R.id.frameLayoutMain,new MainRootFragment()).commit();



    }

    public void switchToSecondFragment(int i) {
        String str= String.valueOf(i);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setCustomAnimations(R.anim.fade_in,R.anim.fade_in);
        fragmentTransaction.add(R.id.frameLayoutMain,new SecondRootFragment(str)).commit();

    }
}