package com.customview.zkx.sparkletablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Barry.Zhou on 2019/1/21
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<CharSequence> mFragmentTitleList = new ArrayList<>();

    public CustomFragmentPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return (mFragmentList != null && mFragmentList.size() > position) ? mFragmentList.get(position) : null;
    }

    @Override
    public int getCount() {
        return mFragmentList != null ? mFragmentList.size() : 0;
    }

    public void addFragment(Fragment fragment, CharSequence title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public void cleanFragment() {
        mFragmentList.clear();
        mFragmentTitleList.clear();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
