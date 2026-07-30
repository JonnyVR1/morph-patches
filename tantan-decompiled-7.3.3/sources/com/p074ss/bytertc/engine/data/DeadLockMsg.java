package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class DeadLockMsg {
    public String blockPaths;
    public String blockSessionId;
    boolean isCritical;

    @CalledByNative
    public DeadLockMsg(String str, String str2, boolean z) {
        this.blockSessionId = str;
        this.blockPaths = str2;
        this.isCritical = z;
    }

    public String toString() {
        return "DeadLockMsg{blockSessionId:" + this.blockSessionId + "blockPths:" + this.blockPaths + "isCritical" + this.isCritical + "}";
    }
}
