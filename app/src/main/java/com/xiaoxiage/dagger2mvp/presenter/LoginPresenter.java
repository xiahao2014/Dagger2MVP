package com.xiaoxiage.dagger2mvp.presenter;

import com.xiaoxiage.dagger2mvp.base.RxPresenter;
import com.xiaoxiage.dagger2mvp.presenter.contract.LoginContract;

import javax.inject.Inject;

/**
 * Created by xiahao on 2017/3/4.
 */

public class LoginPresenter extends RxPresenter<LoginContract.View> implements LoginContract.Presenter {

    @Inject
    public LoginPresenter() {
        System.out.println("Inject");
    }

    @Override
    public void login(String user, String password) {
        System.out.println(user);
        System.out.println(password);
//        mView.loginSuccess();

    }

    @Override
    public void getUserInfo() {

    }
}
