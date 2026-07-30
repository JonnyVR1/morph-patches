package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalRemoteStreamStats {
    public InternalRemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public InternalRemoteVideoStats videoStats;

    public InternalRemoteStreamStats(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        this.uid = str;
        this.audioStats = internalRemoteAudioStats;
        this.videoStats = internalRemoteVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }

    @CalledByNative
    public static InternalRemoteStreamStats create(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        return new InternalRemoteStreamStats(str, internalRemoteAudioStats, internalRemoteVideoStats, z, i, i2);
    }

    public InternalRemoteStreamStats() {
    }
}
