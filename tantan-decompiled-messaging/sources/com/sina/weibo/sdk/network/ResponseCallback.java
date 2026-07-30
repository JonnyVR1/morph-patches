package com.sina.weibo.sdk.network;

import com.sina.weibo.sdk.network.base.RequestResult;

/* JADX INFO: loaded from: classes11.dex */
public interface ResponseCallback<E> {
    void onFailure(Exception exc);

    void onSuccess(RequestResult requestResult);

    void onSuccess(E e);
}
