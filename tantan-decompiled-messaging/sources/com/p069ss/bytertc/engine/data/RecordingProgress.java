package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class RecordingProgress {
    public long duration;
    public long fileSize;

    public RecordingProgress(long j, long j2) {
        this.duration = j;
        this.fileSize = j2;
    }

    @CalledByNative
    public static RecordingProgress create(long j, long j2) {
        return new RecordingProgress(j, j2);
    }
}
