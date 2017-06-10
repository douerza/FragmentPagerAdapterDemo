package com.example.douzaer.fragmentpageradapterdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    //页面常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;

    //自定义的适配器对象
    private MyFragmentPagerAdapter mAdapter;

    //定义ViewPager对象
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //用自定义的MyFragmentPagerAdapter实例化mAdapter对象
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewpager1);
        //加载适配器
        mViewPager.setAdapter(mAdapter);
    }
}
