package io.agora.meta;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MetaUserInfo {
    public String mUserIconUrl;
    public String mUserId;
    public String mUserName;

    public MetaUserInfo() {
        this.mUserId = "";
        this.mUserName = "";
        this.mUserIconUrl = "";
    }

    @CalledByNative
    public String getUserIconUrl() {
        return this.mUserIconUrl;
    }

    @CalledByNative
    public String getUserId() {
        return this.mUserId;
    }

    @CalledByNative
    public String getUserName() {
        return this.mUserName;
    }

    public String toString() {
        return "MetaUserInfo{mUserId='" + this.mUserId + "', mUserName='" + this.mUserName + "', mUserIconUrl='" + this.mUserIconUrl + '}';
    }

    @CalledByNative
    public MetaUserInfo(String str, String str2, String str3) {
        this.mUserId = str;
        this.mUserName = str2;
        this.mUserIconUrl = str3;
    }
}
