package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okio.ByteString;

/* JADX INFO: loaded from: classes13.dex */
public interface WebSocket {
    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(ByteString byteString);

    boolean send(String str);
}
