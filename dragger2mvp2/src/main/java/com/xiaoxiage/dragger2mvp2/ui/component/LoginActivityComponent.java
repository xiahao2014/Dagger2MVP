package com.xiaoxiage.dragger2mvp2.ui.component;

import com.xiaoxiage.dragger2mvp2.di.component.AppComponent;
import com.xiaoxiage.dragger2mvp2.di.scope.ActivityScope;
import com.xiaoxiage.dragger2mvp2.ui.LoginActivity;
import com.xiaoxiage.dragger2mvp2.ui.module.LoginAcivityModule;
import com.xiaoxiage.dragger2mvp2.ui.presenter.LoginActivityPresenter;

import dagger.Component;

/**
 * Created by xiahao on 2017/3/18.
 */

@ActivityScope
@Component(modules = LoginAcivityModule.class, dependencies = AppComponent.class)
public interface LoginActivityComponent {

    LoginActivity inject(LoginActivity mainActivity);

    LoginActivityPresenter presenter();
}
