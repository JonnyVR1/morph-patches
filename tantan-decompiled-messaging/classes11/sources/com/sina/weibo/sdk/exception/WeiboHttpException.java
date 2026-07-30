package com.sina.weibo.sdk.exception;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeiboHttpException extends WeiboException {
    private static final long serialVersionUID = 1;
    private final int mStatusCode;

    public WeiboHttpException(String str, int i) {
        super(str);
        this.mStatusCode = i;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }
}
