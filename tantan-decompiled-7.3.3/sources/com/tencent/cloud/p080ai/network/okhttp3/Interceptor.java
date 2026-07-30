package com.tencent.cloud.p080ai.network.okhttp3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public interface Interceptor {

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        InterfaceC13865h connection();

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
