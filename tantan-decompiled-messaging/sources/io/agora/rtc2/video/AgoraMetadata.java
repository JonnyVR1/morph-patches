package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraMetadata {
    public String channelId;
    public byte[] data;
    public long timeStampMs;
    public int uid;

    public AgoraMetadata() {
        this.channelId = null;
        this.uid = 0;
        this.data = null;
        this.timeStampMs = 0L;
    }

    @CalledByNative
    public AgoraMetadata(String str, int i, byte[] bArr, long j) {
        this.channelId = str;
        this.uid = i;
        this.data = bArr;
        this.timeStampMs = j;
    }
}
