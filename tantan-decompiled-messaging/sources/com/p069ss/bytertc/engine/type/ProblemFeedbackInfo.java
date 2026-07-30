package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ProblemFeedbackInfo {
    public String problemDesc;
    public List<ProblemFeedbackRoomInfo> roomInfo;

    public ProblemFeedbackInfo(String str) {
        this.problemDesc = str;
    }

    @CalledByNative
    public String getProblemDesc() {
        return this.problemDesc;
    }

    @CalledByNative
    public ProblemFeedbackRoomInfo[] getRoomInfo() {
        List<ProblemFeedbackRoomInfo> list = this.roomInfo;
        if (list == null) {
            return null;
        }
        return (ProblemFeedbackRoomInfo[]) list.toArray(new ProblemFeedbackRoomInfo[0]);
    }

    public ProblemFeedbackInfo() {
    }
}
