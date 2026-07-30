package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class StandardPitchInfo {
    public int duration;
    public int pitch;
    public int startTime;

    public StandardPitchInfo(int i, int i2, int i3) {
        this.startTime = i;
        this.duration = i2;
        this.pitch = i3;
    }

    @CalledByNative
    private static StandardPitchInfo create(int i, int i2, int i3) {
        return new StandardPitchInfo(i, i2, i3);
    }
}
