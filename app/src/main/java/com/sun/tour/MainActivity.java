package com.sun.tour;

import android.os.Bundle;
import android.view.KeyEvent;

import com.sun.tour.base.BaseActivity;

/**
 *
 *
 * 首页
 *
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTopTitle("首页");
        //dasfdasf

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            exit();
        }
        return false;
    }
}
