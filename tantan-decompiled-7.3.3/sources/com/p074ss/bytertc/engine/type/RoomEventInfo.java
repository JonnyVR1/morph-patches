package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalRoomEventInfo;

/* JADX INFO: loaded from: classes11.dex */
public class RoomEventInfo {
    public long forbiddenTime;

    public RoomEventInfo(InternalRoomEventInfo internalRoomEventInfo) {
        this.forbiddenTime = 0L;
        this.forbiddenTime = internalRoomEventInfo.forbiddenTime;
    }
}
