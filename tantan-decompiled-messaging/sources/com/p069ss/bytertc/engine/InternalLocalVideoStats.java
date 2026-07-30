package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalLocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int jitter;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;

    public InternalLocalVideoStats(float f, int i, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12, int i13) {
        this.sentKBitrate = f;
        this.inputFrameRate = i;
        this.sentFrameRate = i2;
        this.encoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.statsInterval = i5;
        this.videoLossRate = f2;
        this.rtt = i6;
        this.encodedBitrate = i7;
        this.encodedFrameWidth = i8;
        this.encodedFrameHeight = i9;
        this.encodedFrameCount = i10;
        this.codecType = i11;
        this.isScreen = z;
        this.jitter = i12;
        this.videoDenoiseMode = i13;
    }

    @CalledByNative
    private static InternalLocalVideoStats create(float f, int i, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12, int i13) {
        return new InternalLocalVideoStats(f, i, i2, i3, i4, i5, f2, i6, i7, i8, i9, i10, i11, z, i12, i13);
    }

    public InternalLocalVideoStats() {
    }
}
