package com.example.mvpxnew.app.base;

/**
 * @classname: BasePresenter
 * @Description: TODO(p的基类)
 */
public interface BasePresenter<T extends BaseView>{

    void attachView(T view);

    void detachView();
}
