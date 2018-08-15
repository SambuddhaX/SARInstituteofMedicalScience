package com.example.shreyesh.sarinstituteofmedicalscience;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                DepartmentsFragment departmentsFragment = new DepartmentsFragment();
                return departmentsFragment;
            case 1:
                PatientsFragment patientsFragment = new PatientsFragment();
                return patientsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Departments";
            case 1:
                return "Patient";
            default:
                return null;
        }
    }
}
