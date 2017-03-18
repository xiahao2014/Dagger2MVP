package com.xiaoxiage.dagger2mvp.presenter.contract;


import com.xiaoxiage.dagger2mvp.base.BaseView;

/**
 * Created by xiahao on 2017/3/4.
 */

public interface LoginContract {

    interface View extends BaseView {
        void shwoProgress();

        void loginSuccess();

        void loginFailed();
    }

    interface Presenter {

        void login(String user, String password);

        void getUserInfo();
    }
}
