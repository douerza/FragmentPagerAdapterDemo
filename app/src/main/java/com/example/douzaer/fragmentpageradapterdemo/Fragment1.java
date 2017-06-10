package com.example.douzaer.fragmentpageradapterdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/6/10.
 */

public class Fragment1 extends Fragment {

    public Fragment1() {
    }

    //对应布局fg1
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg1, container, false);
    }

}
