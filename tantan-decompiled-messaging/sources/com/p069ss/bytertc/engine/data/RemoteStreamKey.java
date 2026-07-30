package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class RemoteStreamKey {
    public String roomId;
    public StreamIndex streamIndex;
    public String userId;

    @CalledByNative
    public RemoteStreamKey(String str, String str2, StreamIndex streamIndex) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public StreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean hasNullProperty() {
        return this.roomId == null || this.userId == null || this.streamIndex == null;
    }

    public String toString() {
        return "RemoteStreamKey{roomId='" + this.roomId + "', userId='" + this.userId + "', streamIndex=" + this.streamIndex + '}';
    }
}
