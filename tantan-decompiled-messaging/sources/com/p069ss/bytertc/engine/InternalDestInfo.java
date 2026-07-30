package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.DestInfo;

/* JADX INFO: loaded from: classes13.dex */
public class InternalDestInfo {
    public String roomId;
    public String userId;

    public InternalDestInfo(DestInfo destInfo) {
        this.roomId = destInfo.roomId;
        this.userId = destInfo.userId;
    }

    @CalledByNative
    public String getRoomId() {
        String str = this.roomId;
        return str == null ? "" : str;
    }

    @CalledByNative
    public String getUserId() {
        String str = this.userId;
        return str == null ? "" : str;
    }

    public InternalDestInfo(String str, String str2) {
        this.roomId = str;
        this.userId = str2;
    }
}
