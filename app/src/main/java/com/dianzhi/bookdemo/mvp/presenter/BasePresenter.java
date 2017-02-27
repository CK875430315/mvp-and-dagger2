package com.dianzhi.bookdemo.mvp.presenter;

import com.dianzhi.bookdemo.mvp.view.BaseView;

/**
 * Created by CK on 2017/2/17.
 */

public interface BasePresenter<T extends BaseView>{

//    void attachView(T view);

//    void subscribe();

    void unsubscribe();

}
