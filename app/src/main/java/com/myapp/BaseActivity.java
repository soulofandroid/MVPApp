package com.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.myapp.presenter.BasePresenter;

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=createPresenter();
        presenter.attachView((V)this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
