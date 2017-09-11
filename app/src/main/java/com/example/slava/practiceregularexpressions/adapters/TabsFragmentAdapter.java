package com.example.slava.practiceregularexpressions.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.slava.practiceregularexpressions.fragments.CreditCardFragment;
import com.example.slava.practiceregularexpressions.fragments.DriverLicenseFragment;
import com.example.slava.practiceregularexpressions.fragments.TechnicalPassportFragment;

import java.util.List;

public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private List<String> mList;

    public TabsFragmentAdapter(FragmentManager fragmentManager, List<String> mList) {
        super(fragmentManager);
        this.mList = mList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DriverLicenseFragment.getInstance();
            case 1:
                return CreditCardFragment.getInstance();
            case 2:
                return TechnicalPassportFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}