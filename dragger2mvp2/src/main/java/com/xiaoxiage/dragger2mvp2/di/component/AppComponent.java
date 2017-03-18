package com.xiaoxiage.dragger2mvp2.di.component;


import com.xiaoxiage.dragger2mvp2.App;
import com.xiaoxiage.dragger2mvp2.di.module.AppModule;
import com.xiaoxiage.dragger2mvp2.di.module.AppServiceModule;
import com.xiaoxiage.dragger2mvp2.model.User;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = {AppModule.class, AppServiceModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

    User getUser();

}
