package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalRTCUser;

/* JADX INFO: loaded from: classes11.dex */
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
