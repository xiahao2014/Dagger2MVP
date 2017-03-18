package com.xiaoxiage.dragger2mvp2.di.module;

import com.xiaoxiage.dragger2mvp2.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xiahao on 2017/3/18.
 */
@Module
public class AppServiceModule {

    @Provides
    User provideUser() {
        User user = new User();
        user.setId("1");
        user.setName("hello world");
        return user;
    }
}
