package com.example.mvpxnew.ui.fragment;


import com.example.mvpxnew.R;
import com.example.mvpxnew.app.base.PresenterFragment;
import com.example.mvpxnew.presenter.MinePresenter;
import com.example.mvpxnew.presenter.contract.MineContract;

/**
 * Description:
 */

public class MineFragment extends PresenterFragment<MinePresenter> implements MineContract.View {


    @Override
    protected void initInject() {

    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.minefragment;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String msg) {

    }
}
