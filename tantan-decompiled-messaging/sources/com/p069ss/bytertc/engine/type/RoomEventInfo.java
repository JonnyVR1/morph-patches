package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalRoomEventInfo;

/* JADX INFO: loaded from: classes13.dex */
public class RoomEventInfo {
    public long forbiddenTime;

    public RoomEventInfo(InternalRoomEventInfo internalRoomEventInfo) {
        this.forbiddenTime = 0L;
        this.forbiddenTime = internalRoomEventInfo.forbiddenTime;
    }
}
