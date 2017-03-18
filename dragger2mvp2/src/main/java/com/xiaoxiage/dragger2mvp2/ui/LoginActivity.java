package com.xiaoxiage.dragger2mvp2.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.xiaoxiage.dragger2mvp2.R;
import com.xiaoxiage.dragger2mvp2.base.BaseActivity;
import com.xiaoxiage.dragger2mvp2.di.component.AppComponent;
import com.xiaoxiage.dragger2mvp2.ui.component.DaggerLoginActivityComponent;
import com.xiaoxiage.dragger2mvp2.ui.module.LoginAcivityModule;
import com.xiaoxiage.dragger2mvp2.ui.presenter.LoginActivityPresenter;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {

    private TextView mytext;

    @Inject
    LoginActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = (TextView) findViewById(R.id.mytext);

        presenter.showUserName();

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerLoginActivityComponent.builder()
                .appComponent(appComponent)
                .loginAcivityModule(new LoginAcivityModule(this))
                .build()
                .inject(this);
    }

    public void setUserName(String userName){
        mytext.setText(userName);
    }


}
