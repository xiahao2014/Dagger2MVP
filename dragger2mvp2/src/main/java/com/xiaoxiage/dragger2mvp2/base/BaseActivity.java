package com.xiaoxiage.dragger2mvp2.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xiaoxiage.dragger2mvp2.App;
import com.xiaoxiage.dragger2mvp2.di.component.AppComponent;

/**
 * Created by xiahao on 2017/3/18.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(App.getAppComponent());
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);
}
