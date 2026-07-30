package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class ProblemFeedbackRoomInfo {
    public String roomId;
    public String userId;

    public ProblemFeedbackRoomInfo(String str, String str2) {
        this.roomId = str;
        this.userId = str2;
    }

    @CalledByNative
    public String getRoomId() {
        return this.roomId;
    }

    @CalledByNative
    public String getUserId() {
        return this.userId;
    }

    public ProblemFeedbackRoomInfo() {
    }
}
