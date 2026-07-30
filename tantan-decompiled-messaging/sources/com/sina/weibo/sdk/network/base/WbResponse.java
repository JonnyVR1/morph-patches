package com.sina.weibo.sdk.network.base;

/* JADX INFO: loaded from: classes11.dex */
public class WbResponse {
    private WbResponseBody responseBody;
    private int resultCode;

    public WbResponse(WbResponseBody wbResponseBody) {
        this.resultCode = 200;
        this.responseBody = wbResponseBody;
    }

    public WbResponseBody body() {
        return this.responseBody;
    }

    public boolean isSuccessful() {
        return this.resultCode == 200;
    }

    public WbResponse(WbResponseBody wbResponseBody, int i) {
        this.responseBody = wbResponseBody;
        this.resultCode = i;
    }
}
