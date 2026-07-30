package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.data.ForwardStreamInfo;

/* JADX INFO: loaded from: classes11.dex */
public class InternalForwardStreamInfo {
    public String roomId;
    public String token;

    public InternalForwardStreamInfo(ForwardStreamInfo forwardStreamInfo) {
        this.roomId = forwardStreamInfo.roomId;
        this.token = forwardStreamInfo.token;
    }

    @CalledByNative
    public String getRoomId() {
        String str = this.roomId;
        return str == null ? "" : str;
    }

    @CalledByNative
    public String getToken() {
        String str = this.token;
        return str == null ? "" : str;
    }

    public InternalForwardStreamInfo(String str, String str2) {
        this.roomId = str;
        this.token = str2;
    }
}
