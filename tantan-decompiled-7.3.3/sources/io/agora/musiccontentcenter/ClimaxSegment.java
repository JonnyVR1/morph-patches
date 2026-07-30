package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ClimaxSegment {
    public int endTimeMs;
    public int startTimeMs;

    @CalledByNative
    public ClimaxSegment(int i, int i2) {
        this.startTimeMs = i;
        this.endTimeMs = i2;
    }

    @CalledByNative
    public int getEndTimeMs() {
        return this.endTimeMs;
    }

    @CalledByNative
    public int getStartTimeMs() {
        return this.startTimeMs;
    }
}
