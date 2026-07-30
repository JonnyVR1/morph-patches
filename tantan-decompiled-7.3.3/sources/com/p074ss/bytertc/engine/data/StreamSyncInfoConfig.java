package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class StreamSyncInfoConfig {
    public int repeatCount;
    public StreamIndex streamIndex;
    public SyncInfoStreamType streamType;

    public enum SyncInfoStreamType {
        SYNC_INFO_STREAM_TYPE_AUDIO
    }

    public StreamSyncInfoConfig(StreamIndex streamIndex, int i, SyncInfoStreamType syncInfoStreamType) {
        this.streamIndex = streamIndex;
        this.repeatCount = i;
        this.streamType = syncInfoStreamType;
    }

    public String toString() {
        return "StreamSyncInfoConfig{ streamIndex='" + this.streamIndex.toString() + "'repeatCount='" + this.repeatCount + "'streamType=Audio }";
    }
}
