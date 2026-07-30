package com.tencent.cloud.p075ai.network.okhttp3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public interface Interceptor {

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        InterfaceC13702h connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    Response intercept(Chain chain);
}
