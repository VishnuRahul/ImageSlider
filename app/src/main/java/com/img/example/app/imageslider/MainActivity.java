package com.img.example.app.imageslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    CustomSlider adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =(ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomSlider(this);
        viewPager.setAdapter(adapter);
    }
}
