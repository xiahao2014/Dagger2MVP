package com.xiaoxiage.dagger2mvp;

import android.app.Application;

import com.xiaoxiage.dagger2mvp.di.component.AppComponent;
import com.xiaoxiage.dagger2mvp.di.component.DaggerAppComponent;
import com.xiaoxiage.dagger2mvp.di.module.AppModule;

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
                    .build();
        }
        return appComponent;
    }
}
