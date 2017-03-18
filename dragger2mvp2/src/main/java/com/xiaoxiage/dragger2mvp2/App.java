package com.xiaoxiage.dragger2mvp2;

import android.app.Application;

import com.xiaoxiage.dragger2mvp2.di.component.AppComponent;
import com.xiaoxiage.dragger2mvp2.di.component.DaggerAppComponent;
import com.xiaoxiage.dragger2mvp2.di.module.AppModule;
import com.xiaoxiage.dragger2mvp2.di.module.AppServiceModule;


/**
 * Created by xiahao on 2017/3/12.
 */

public class App extends Application {

    public static AppComponent appComponent;
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(instance))
                    .appServiceModule(new AppServiceModule())
                    .build();
        }
        return appComponent;
    }
}
