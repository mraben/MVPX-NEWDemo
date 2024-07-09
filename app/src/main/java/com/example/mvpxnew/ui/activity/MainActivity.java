package com.example.mvpxnew.ui.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;


import com.example.mvpxnew.R;
import com.example.mvpxnew.app.base.PresenterActivity;
import com.example.mvpxnew.model.bean.TabEntity;
import com.example.mvpxnew.presenter.MainPresenter;
import com.example.mvpxnew.presenter.contract.MainContract;
import com.example.mvpxnew.ui.fragment.HomeFragment;
import com.example.mvpxnew.ui.fragment.LikeFragment;
import com.example.mvpxnew.ui.fragment.MineFragment;
import com.example.mvpxnew.utils.ConstantTool;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;


public class MainActivity extends PresenterActivity<MainPresenter> implements MainContract.View {

    private TextView mpText;
    private FrameLayout fmMain;
    private DrawerLayout dlMain;
    private CommonTabLayout ctlMain;
    private LinearLayout dLLeft;

    private String[] mTitles = new String[ConstantTool.THR];
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private int[] img_u = {R.drawable.home, R.drawable.like, R.drawable.search_tab};
    private int[] img_p = {R.drawable.home_p, R.drawable.like_p, R.drawable.search_tab_p};


    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    private void findView() {
        mpText = findViewById(R.id.mp_text);
        fmMain = findViewById(R.id.fm_main);
        dlMain = findViewById(R.id.dl_main);
        ctlMain = findViewById(R.id.ctl_main);
        dLLeft = findViewById(R.id.DL_left);
        mTitles[ConstantTool.ZERO] = getString(R.string.home);
        mTitles[ConstantTool.ONE] = getString(R.string.like);
        mTitles[ConstantTool.TWO] = getString(R.string.search);
    }

    @Override
    protected void initInject() {
        findView();
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initEventAndData() {
        mPresenter.check(1, true);
        initTab();
    }

    @Override
    protected void initListener() {
        dlMain.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                super.onDrawerStateChanged(newState);
            }
        });

        ctlMain.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Toast.makeText(MainActivity.this, mTitles[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

        setClick(findViewById(R.id.mp_menu), findViewById(R.id.mp_search),
                findViewById(R.id.left_home), findViewById(R.id.left_like),
                findViewById(R.id.left_search), findViewById(R.id.left_suggest),
                findViewById(R.id.left_setting), findViewById(R.id.left_shape));
    }

    private void setClick(View... view) {
        for (View v : view) {
            v.setOnClickListener(this::onCostomClick);
        }
    }

    private void initTab() {
        mFragments.add(new HomeFragment());
        mFragments.add(new LikeFragment());
        mFragments.add(new MineFragment());
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], img_p[i], img_u[i]));
        }
        ctlMain.setTabData(mTabEntities, this, R.id.fm_main, mFragments);
    }

    public void onCostomClick(View v) {
        int id = v.getId();
        if (id == R.id.mp_menu) {
            dlMain.openDrawer(dLLeft);
        } else if (id == R.id.mp_search) {
            Toast.makeText(this, getString(R.string.searchMenu), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.left_home) {
            closeDrawerAndSetTab(ConstantTool.ZERO);
        } else if (id == R.id.left_like) {
            closeDrawerAndSetTab(ConstantTool.ONE);
        } else if (id == R.id.left_search) {
            closeDrawerAndSetTab(ConstantTool.TWO);
        } else if (id == R.id.left_suggest) {
            Toast.makeText(this, getString(R.string.ProblemsAndProposals), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.left_setting) {
            Toast.makeText(this, getString(R.string.setting), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.left_shape) {
            Toast.makeText(this, getString(R.string.ShapeFriend), Toast.LENGTH_SHORT).show();
        }
    }

    private void closeDrawerAndSetTab(int tabIndex) {
        ctlMain.setCurrentTab(tabIndex);
        dlMain.closeDrawer(dLLeft);
    }


    @Override
    public void showText() {

    }

    @Override
    public void showAnimation() {

    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


}