package com.xiaoxiage.dagger2mvp.activity;

import com.xiaoxiage.dagger2mvp.R;
import com.xiaoxiage.dagger2mvp.base.BaseActivity;
import com.xiaoxiage.dagger2mvp.presenter.LoginPresenter;

public class MainActivity extends BaseActivity<LoginPresenter> {
//    @Override
//    protected void initInject() {
//        getActivityComponent().inject(this);
//    }
//
//    @Override
//    protected int getLayout() {
//        return R.layout.activity_main;
//    }
//
//    @Override
//    protected void initEventAndData() {
//        mPresenter.getUserInfo();
//    }

    private static final String TAG = "DaggerActivity";

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {
        mPresenter.login("123","123");
    }


    @Override
    public void showError(String msg) {

    }

    @Override
    public void useNightMode(boolean isNight) {

    }
}
