package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class FrameUpdateInfo {
    public int frameRate;
    public int pixel;

    @CalledByNative
    public FrameUpdateInfo(int i, int i2) {
        this.pixel = i;
        this.frameRate = i2;
    }

    public String toString() {
        return "FrameUpdateInfo{pixel='" + this.pixel + "', frameRate='" + this.frameRate + '}';
    }
}
