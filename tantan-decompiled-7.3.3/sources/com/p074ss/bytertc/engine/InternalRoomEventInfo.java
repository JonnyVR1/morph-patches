package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalRoomEventInfo {
    public long forbiddenTime;

    public InternalRoomEventInfo(long j) {
        this.forbiddenTime = j;
    }

    @CalledByNative
    private static InternalRoomEventInfo create(long j) {
        return new InternalRoomEventInfo(j);
    }
}
