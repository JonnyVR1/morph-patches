package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okio.C13958x;

/* JADX INFO: loaded from: classes12.dex */
public interface Call extends Cloneable {
    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C13958x timeout();
}
