package com.dianzhi.bookdemo.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by CK on 2016/10/20.
 */
public abstract class BaseFragment extends Fragment {
    public static final String TAG = "sssss";
    public Context mContext;
    private boolean isVisiable;
    private boolean isViewInit;
    private boolean isDataFinish;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        initView(view);
        return view;

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //view inited
        isViewInit = true;
        initData();
        prepareFetchData();
    }

    /**
     * 这个方法的传值直接影响fetchData会不会执行
     *
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisiable = isVisibleToUser;
        prepareFetchData();
    }

    private void prepareFetchData() {
        prepareFetchData(false);
    }

    /**
     * 刷新数据
     *
     * @param isNeedRefresh
     */
    private void prepareFetchData(boolean isNeedRefresh) {
        if (isVisiable && isViewInit && (!isDataFinish || isNeedRefresh)) {
            fetchData();
            isDataFinish = true;
        }

    }

    public abstract void fetchData();

    protected abstract int getLayoutId();

    protected abstract void initView(View view);

    protected void initData() {

    }
}
