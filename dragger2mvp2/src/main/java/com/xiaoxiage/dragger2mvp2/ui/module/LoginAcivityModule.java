package com.xiaoxiage.dragger2mvp2.ui.module;

import com.xiaoxiage.dragger2mvp2.di.scope.ActivityScope;
import com.xiaoxiage.dragger2mvp2.model.User;
import com.xiaoxiage.dragger2mvp2.ui.LoginActivity;
import com.xiaoxiage.dragger2mvp2.ui.presenter.LoginActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xiahao on 2017/3/18.
 */

@Module
public class LoginAcivityModule {

    private LoginActivity mLoginActivity;

    public LoginAcivityModule(LoginActivity loginActivity) {
        this.mLoginActivity = loginActivity;
    }


    @Provides
    @ActivityScope
    LoginActivity provideMainActivity() {
        return mLoginActivity;
    }


    @Provides
    @ActivityScope
    LoginActivityPresenter provideMainActivityPresenter(LoginActivity loginActivity, User user) {
        return new LoginActivityPresenter(loginActivity, user);
    }
}
