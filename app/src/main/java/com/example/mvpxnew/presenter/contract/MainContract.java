package com.example.mvpxnew.presenter.contract;


import com.example.mvpxnew.app.base.BasePresenter;
import com.example.mvpxnew.app.base.BaseView;

public interface MainContract {

    interface View extends BaseView {
        void showText();
        void showAnimation();
    }

    interface  Presenter extends BasePresenter<View> {
        void check(int current,boolean isFormClick);
    }
}
