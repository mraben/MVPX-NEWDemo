package com.example.mvpxnew.ui.fragment;


import com.example.mvpxnew.R;
import com.example.mvpxnew.app.base.PresenterFragment;
import com.example.mvpxnew.presenter.LikePresenter;
import com.example.mvpxnew.presenter.contract.LikeContract;

/**
 * Description:
 */

public class LikeFragment extends PresenterFragment<LikePresenter> implements LikeContract.View {


    @Override
    protected void initInject() {

    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.likefragment;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String msg) {

    }
}
