package com.example.shreyesh.sarinstituteofmedicalscience;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar homeToolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private SectionsPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise
        homeToolbar = (Toolbar) findViewById(R.id.homeToolbar);
        viewPager = (ViewPager) findViewById(R.id.tabPager);
        tabLayout = (TabLayout) findViewById(R.id.mainTabs);

        //Setup Toolbar
        setSupportActionBar(homeToolbar);
        getSupportActionBar().setTitle("Home");

        //setup tabs
        pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(0);
        //startActivity(new Intent(MainActivity.this, AdminLoginActivity.class));
    }
}
