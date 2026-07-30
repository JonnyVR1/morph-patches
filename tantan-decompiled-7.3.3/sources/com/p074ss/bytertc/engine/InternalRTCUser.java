package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalRTCUser {
    public String metaData;
    public String userId;

    public InternalRTCUser(String str, String str2) {
        this.userId = str;
        this.metaData = str2;
    }

    @CalledByNative
    private static InternalRTCUser create(String str, String str2) {
        return new InternalRTCUser(str, str2);
    }

    public String toString() {
        return "InternalRtcUser{userId='" + this.userId + "', metaData='" + this.metaData + "'}";
    }
}
