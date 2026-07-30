package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okio.ByteString;

/* JADX INFO: loaded from: classes12.dex */
public interface WebSocket {
    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(ByteString byteString);

    boolean send(String str);
}
