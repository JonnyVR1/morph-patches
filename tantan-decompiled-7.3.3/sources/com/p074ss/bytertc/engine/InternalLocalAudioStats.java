package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalLocalAudioStats {
    public int audioDeviceLoopDelay;
    public float audioLossRate;
    public double encodeFrameRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public InternalLocalAudioStats(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d) {
        this.audioLossRate = f;
        this.sendKBitrate = i;
        this.recordSampleRate = i2;
        this.statsInterval = i3;
        this.rtt = i4;
        this.numChannels = i5;
        this.sentSampleRate = i6;
        this.jitter = i7;
        this.audioDeviceLoopDelay = i8;
        this.encodeFrameRate = d;
    }

    @CalledByNative
    private static InternalLocalAudioStats create(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d) {
        return new InternalLocalAudioStats(f, i, i2, i3, i4, i5, i6, i7, i8, d);
    }

    public InternalLocalAudioStats() {
    }
}
