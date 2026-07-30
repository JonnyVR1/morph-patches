package com.tencent.cloud.p075ai.network.okhttp3;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response);
}
