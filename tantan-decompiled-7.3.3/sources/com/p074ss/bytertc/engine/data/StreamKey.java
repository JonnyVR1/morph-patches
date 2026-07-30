package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class StreamKey {
    private String roomId;
    private StreamIndex streamIndex;
    private String userId;

    public StreamKey(String str, String str2, StreamIndex streamIndex) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex;
    }

    @CalledByNative
    public static StreamKey create(String str, String str2, StreamIndex streamIndex) {
        return new StreamKey(str, str2, streamIndex);
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
