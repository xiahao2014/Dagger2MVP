package com.xiaoxiage.dagger2mvp.di.module;

import android.app.Activity;
import com.xiaoxiage.dagger2mvp.di.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
