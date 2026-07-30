package com.sina.weibo.sdk.network.target;

import com.sina.weibo.sdk.network.base.WbResponse;

/* JADX INFO: loaded from: classes11.dex */
public interface Target<R> {
    void onError();

    void onFailure(Exception exc);

    void onRequestDone();

    void onRequestSuccess(R r);

    void onRequestSuccessBg(R r);

    void onStart();

    void onStartBg();

    R transResponse(WbResponse wbResponse) throws Exception;
}
