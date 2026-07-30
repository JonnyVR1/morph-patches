package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class UserInfo {
    public String extraInfo;
    public String uid;

    public UserInfo(String str, String str2) {
        this.uid = str;
        this.extraInfo = str2;
    }

    @CalledByNative
    public static UserInfo create(String str, String str2) {
        return new UserInfo(str, str2);
    }

    @CalledByNative
    public String getExtraInfo() {
        return this.extraInfo;
    }

    @CalledByNative
    public String getUid() {
        return this.uid;
    }
}
