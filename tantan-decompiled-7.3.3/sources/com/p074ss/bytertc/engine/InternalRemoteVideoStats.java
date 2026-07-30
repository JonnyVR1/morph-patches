package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalRemoteVideoStats {
    public int avSyncDiffMs;
    public int capToRenderDelay;
    public int codecElapsePerFrame;
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public int jitter;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public InternalRemoteVideoStats(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.width = i;
        this.height = i2;
        this.videoLossRate = f;
        this.receivedKBitrate = f2;
        this.decoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.stallCount = i5;
        this.stallDuration = i6;
        this.e2eDelay = j;
        this.isScreen = z;
        this.statsInterval = i7;
        this.rtt = i8;
        this.frozenRate = i9;
        this.codecType = i10;
        this.videoIndex = i11;
        this.jitter = i12;
        this.superResolutionMode = i13;
        this.capToRenderDelay = i14;
        this.avSyncDiffMs = i15;
        this.codecElapsePerFrame = i16;
    }

    @CalledByNative
    private static InternalRemoteVideoStats create(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new InternalRemoteVideoStats(i, i2, f, f2, i3, i4, i5, i6, j, z, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public InternalRemoteVideoStats() {
    }
}
