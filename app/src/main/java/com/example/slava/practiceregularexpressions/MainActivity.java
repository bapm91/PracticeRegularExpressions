package com.example.slava.practiceregularexpressions;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.slava.practiceregularexpressions.adapters.TabsFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initTabs();
    }

    private void initTabs() {
        ViewPager mViewPager = (ViewPager) findViewById(R.id.view_pager);

        List<String> mList = new ArrayList<>();
        mList.add(getString(R.string.tab_driver_license));
        mList.add(getString(R.string.tab_credit_card));
        mList.add(getString(R.string.tab_technical_passport));

        TabsFragmentAdapter adapter = new TabsFragmentAdapter(getSupportFragmentManager(), mList);
        if (mViewPager != null) {
            mViewPager.setAdapter(adapter);
        }

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
}
