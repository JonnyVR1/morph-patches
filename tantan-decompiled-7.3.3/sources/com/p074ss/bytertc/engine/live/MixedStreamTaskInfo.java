package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamTaskInfo {
    private String taskId = "";
    private MixedStreamPushTargetType targetType = MixedStreamPushTargetType.PUSH_TO_CDN;

    @CalledByNative
    public static MixedStreamTaskInfo from(String str, int i) {
        MixedStreamTaskInfo mixedStreamTaskInfo = new MixedStreamTaskInfo();
        if (i == 0 || i != 1) {
            mixedStreamTaskInfo.setTargetType(MixedStreamPushTargetType.PUSH_TO_CDN);
        } else {
            mixedStreamTaskInfo.setTargetType(MixedStreamPushTargetType.PUSH_TO_WTN);
        }
        mixedStreamTaskInfo.setTaskId(str);
        return mixedStreamTaskInfo;
    }

    public MixedStreamPushTargetType getTargetType() {
        return this.targetType;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public MixedStreamTaskInfo setTargetType(MixedStreamPushTargetType mixedStreamPushTargetType) {
        this.targetType = mixedStreamPushTargetType;
        return this;
    }

    public MixedStreamTaskInfo setTaskId(String str) {
        this.taskId = str;
        return this;
    }
}
