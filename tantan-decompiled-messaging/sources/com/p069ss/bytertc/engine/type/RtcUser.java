package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalRTCUser;

/* JADX INFO: loaded from: classes13.dex */
public class RtcUser {
    public String metaData;
    public String userId;

    public RtcUser(InternalRTCUser internalRTCUser) {
        this.userId = internalRTCUser.userId;
        this.metaData = internalRTCUser.metaData;
    }

    public String toString() {
        return "RtcUser{uid='" + this.userId + "', metaData='" + this.metaData + "'}";
    }

    public RtcUser() {
    }
}
