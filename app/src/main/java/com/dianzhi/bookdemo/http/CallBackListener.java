package com.dianzhi.bookdemo.http;

/**
 * Created by CK on 2016/10/15.
 */
public interface CallBackListener<T> {
    void onSuccess(T t);
    void onError(String msg);
    void onFinish();
}
