package com.quickjs;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes11.dex */
public class QuickJSException extends RuntimeException {
    private String name;

    public QuickJSException(String str, String str2) {
        super(str + SignParameters.NEW_LINE + str2);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public QuickJSException(String str, Throwable th) {
        super(str, th);
    }

    public QuickJSException(Throwable th) {
        super(th);
    }
}
