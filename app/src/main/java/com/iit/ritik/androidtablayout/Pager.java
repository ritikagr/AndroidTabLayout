package com.iit.ritik.androidtablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.ActionBar;

/**
 * Created by ritik on 8/8/2016.
 */
public class Pager extends FragmentStatePagerAdapter {

    int tabCount;
    public Pager(FragmentManager fm,int count) {
        super(fm);
        this.tabCount = count;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
