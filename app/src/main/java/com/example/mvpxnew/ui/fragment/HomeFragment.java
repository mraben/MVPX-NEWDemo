package com.example.mvpxnew.ui.fragment;

import com.example.mvpxnew.R;
import com.example.mvpxnew.app.base.PresenterFragment;
import com.example.mvpxnew.presenter.HomePresenter;
import com.example.mvpxnew.presenter.contract.HomeContract;

/**
 * Description:
 */

public class HomeFragment extends PresenterFragment<HomePresenter> implements HomeContract.View {


    @Override
    protected void initInject() {

    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.homefragment;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String msg) {

    }
}
