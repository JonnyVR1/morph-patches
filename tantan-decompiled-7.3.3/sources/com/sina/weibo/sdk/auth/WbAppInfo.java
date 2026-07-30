package com.sina.weibo.sdk.auth;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class WbAppInfo {
    private int supportVersion;
    private String packageName = "com.sina.weibo";
    private String authActivityName = "com.sina.weibo.SSOActivity";

    public String getAuthActivityName() {
        return this.authActivityName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getSupportVersion() {
        return this.supportVersion;
    }

    public boolean isLegal() {
        return !TextUtils.isEmpty(this.packageName) && this.supportVersion > 0;
    }

    public void setAuthActivityName(String str) {
        this.authActivityName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSupportVersion(int i) {
        this.supportVersion = i;
    }
}
