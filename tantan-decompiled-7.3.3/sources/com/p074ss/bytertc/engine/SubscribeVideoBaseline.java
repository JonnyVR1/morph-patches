package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class SubscribeVideoBaseline {
    public int acceptableBadVideoFpsBaseline;
    public int acceptableBadVideoPixelBaseline;
    public int acceptableGoodVideoFpsBaseline;
    public int acceptableGoodVideoPixelBaseline;
    public int acceptableMinVideoResolutionHeight;
    public int acceptableMinVideoResolutionWidth;
    public int streamPriority;

    public SubscribeVideoBaseline(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.acceptableGoodVideoPixelBaseline = i;
        this.acceptableGoodVideoFpsBaseline = i2;
        this.acceptableBadVideoPixelBaseline = i3;
        this.acceptableBadVideoFpsBaseline = i4;
        this.acceptableMinVideoResolutionWidth = i5;
        this.acceptableMinVideoResolutionHeight = i6;
        this.streamPriority = i7;
    }

    @CalledByNative
    public int getAcceptableBadVideoFpsBaseline() {
        return this.acceptableBadVideoFpsBaseline;
    }

    @CalledByNative
    public int getAcceptableBadVideoPixelBaseline() {
        return this.acceptableBadVideoPixelBaseline;
    }

    @CalledByNative
    public int getAcceptableGoodVideoFpsBaseline() {
        return this.acceptableGoodVideoFpsBaseline;
    }

    @CalledByNative
    public int getAcceptableGoodVideoPixelBaseline() {
        return this.acceptableGoodVideoPixelBaseline;
    }

    @CalledByNative
    public int getAcceptableMinVideoResolutionHeight() {
        return this.acceptableMinVideoResolutionHeight;
    }

    @CalledByNative
    public int getAcceptableMinVideoResolutionWidth() {
        return this.acceptableMinVideoResolutionWidth;
    }

    @CalledByNative
    public int getStreamPriority() {
        return this.streamPriority;
    }
}
