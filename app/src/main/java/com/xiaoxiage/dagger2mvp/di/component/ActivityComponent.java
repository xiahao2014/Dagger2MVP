package com.xiaoxiage.dagger2mvp.di.component;

import android.app.Activity;

import com.xiaoxiage.dagger2mvp.activity.MainActivity;
import com.xiaoxiage.dagger2mvp.di.module.ActivityModule;
import com.xiaoxiage.dagger2mvp.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(MainActivity mainActivity);

}
