package com.framework.base;

import com.rxjsoupnetwork.manager.RxJsoupNetWork;
import com.rxjsoupnetwork.manager.RxJsoupNetWorkListener;

/**
 * by y on 2017/3/23
 */

public abstract class PresenterImplCompat<M, V extends BaseView<M>>
        implements RxJsoupNetWorkListener<M>, RxJsoupNetWork.DocumentCallback<M> {

    protected final V view;

    public PresenterImplCompat(V view) {
        this.view = view;
    }

    @Override
    public void onNetWorkStart() {
        view.showProgress();
    }

    @Override
    public void onNetWorkError(Throwable e) {
        view.hideProgress();
        view.netWorkError(e);
    }

    @Override
    public void onNetWorkCompleted() {
        view.hideProgress();
    }

    @Override
    public void onNetWorkSuccess(M data) {
        view.netWorkSuccess(data);
    }
}