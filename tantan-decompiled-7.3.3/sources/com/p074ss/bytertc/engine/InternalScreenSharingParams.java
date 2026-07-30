package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.video.ScreenSharingParameters;

/* JADX INFO: loaded from: classes11.dex */
public class InternalScreenSharingParams {
    public int bitrate;
    public int frameRate;
    public int maxHeight;
    public int maxWidth;
    public int minBitrate;

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.frameRate = 15;
        this.bitrate = -1;
        this.minBitrate = 0;
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
            this.minBitrate = screenSharingParameters.minBitrate;
        }
    }

    @CalledByNative
    public int getBitrate() {
        return this.bitrate;
    }

    @CalledByNative
    public int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    public int getHeight() {
        return this.maxHeight;
    }

    @CalledByNative
    public int getMinBitrate() {
        return this.minBitrate;
    }

    @CalledByNative
    public int getWidth() {
        return this.maxWidth;
    }

    public InternalScreenSharingParams(int i, int i2, int i3, int i4, int i5) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
        this.minBitrate = i5;
    }
}
