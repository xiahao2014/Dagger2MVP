package com.xiaoxiage.dagger2mvp.base;

/**
 * Created by xiahao on 2017/3/12.
 */

public class RxPresenter<T> implements BasePresenter<T> {
    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
