package com.taobao.main.presenter;


import android.support.annotation.MenuRes;

import com.taobao.R;
import com.taobao.main.view.MainView;

/**
 * by y on 2017/3/22
 */

public class MainPresenterImpl implements MainPresenter {

    private final MainView mainView;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void switchId(@MenuRes int id) {
        switch (id) {
            case R.id.jkjbaoyou:
                mainView.switchJKJBaoYou();
                break;
        }
    }
}