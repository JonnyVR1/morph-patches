package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalLocalStreamStats {
    public InternalLocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public InternalLocalVideoStats videoStats;

    public InternalLocalStreamStats(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        this.audioStats = internalLocalAudioStats;
        this.videoStats = internalLocalVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }

    @CalledByNative
    public static InternalLocalStreamStats create(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        return new InternalLocalStreamStats(internalLocalAudioStats, internalLocalVideoStats, z, i, i2);
    }

    public InternalLocalStreamStats() {
    }
}
