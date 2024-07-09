package com.example.mvpxnew.presenter.contract;


import com.example.mvpxnew.app.base.BasePresenter;
import com.example.mvpxnew.app.base.BaseView;

public interface HomeContract {

    interface View extends BaseView {

        void showLoading();
    }

    interface Presenter extends BasePresenter<View> {

    }
}
