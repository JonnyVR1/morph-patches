package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okio.C13795x;

/* JADX INFO: loaded from: classes13.dex */
public interface Call extends Cloneable {
    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C13795x timeout();
}
