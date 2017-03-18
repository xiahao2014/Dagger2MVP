package com.xiaoxiage.dragger2mvp2.ui.presenter;

import com.xiaoxiage.dragger2mvp2.model.User;
import com.xiaoxiage.dragger2mvp2.ui.LoginActivity;

/**
 * Created by xiahao on 2017/3/18.
 */

public class LoginActivityPresenter {

    private LoginActivity mainActivity;
    private User user;

    public LoginActivityPresenter(LoginActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }


    public void showUserName() {
        System.out.println(user.getName());
        mainActivity.setUserName(user.getName());
    }
}
