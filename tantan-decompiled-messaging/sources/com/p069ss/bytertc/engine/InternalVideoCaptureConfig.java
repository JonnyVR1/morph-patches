package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalVideoCaptureConfig {
    public int capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public InternalVideoCaptureConfig(int i, int i2, int i3, int i4) {
        this.capturePreference = i;
        this.width = i2;
        this.height = i3;
        this.frameRate = i4;
    }

    @CalledByNative
    public int getCapturePreference() {
        return this.capturePreference;
    }

    @CalledByNative
    public int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }
}
