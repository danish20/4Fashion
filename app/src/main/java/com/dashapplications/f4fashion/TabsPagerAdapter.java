package com.dashapplications.f4fashion;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dashapplications.f4fashion.FragmentsDir.Item1;


public class TabsPagerAdapter extends FragmentPagerAdapter
{

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index)
        {
            case 0:return new Item1();
            case 1:return new Item1();
            case 2:return new Item1();
            case 3:return new Item1();
            case 4:return new Item1();
            case 5:return new Item1();
            case 6:return new Item1();
            case 7:return new Item1();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 7;
    }

}
