package com.edi.tabview.custome.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edi.tabview.custome.fragment.DuaFragment;
import com.edi.tabview.custome.fragment.SatuFragment;
import com.edi.tabview.custome.fragment.TigaFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public ViewPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SatuFragment homeFragment = new SatuFragment();
                return homeFragment;
            case 1:
                DuaFragment sportFragment = new DuaFragment();
                return sportFragment;
            case 2:
                TigaFragment movieFragment = new TigaFragment();
                return movieFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}