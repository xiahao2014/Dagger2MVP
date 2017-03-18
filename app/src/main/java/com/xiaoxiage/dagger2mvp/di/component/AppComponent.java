package com.xiaoxiage.dagger2mvp.di.component;


import com.xiaoxiage.dagger2mvp.App;
import com.xiaoxiage.dagger2mvp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

}
