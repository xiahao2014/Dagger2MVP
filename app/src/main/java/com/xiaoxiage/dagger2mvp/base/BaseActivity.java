package com.xiaoxiage.dagger2mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xiaoxiage.dagger2mvp.App;
import com.xiaoxiage.dagger2mvp.di.component.ActivityComponent;
import com.xiaoxiage.dagger2mvp.di.component.DaggerActivityComponent;
import com.xiaoxiage.dagger2mvp.di.module.ActivityModule;

import javax.inject.Inject;


/**
 * Created by codeest on 2016/8/2.
 * MVP activity基类
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    @Inject
    protected T mPresenter;
    protected Activity mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mContext = this;
        initInject();
        if (mPresenter != null)
            mPresenter.attachView(this);
        initEventAndData();

    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.detachView();

    }


    protected abstract void initInject();

    protected abstract int getLayout();

    protected abstract void initEventAndData();

}