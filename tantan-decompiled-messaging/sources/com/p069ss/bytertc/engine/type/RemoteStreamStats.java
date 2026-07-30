package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalRemoteStreamStats;

/* JADX INFO: loaded from: classes13.dex */
public class RemoteStreamStats {
    public RemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public RemoteVideoStats videoStats;

    public RemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        RemoteAudioStats remoteAudioStats = new RemoteAudioStats(internalRemoteStreamStats.audioStats);
        RemoteVideoStats remoteVideoStats = new RemoteVideoStats(internalRemoteStreamStats.videoStats);
        this.audioStats = remoteAudioStats;
        this.videoStats = remoteVideoStats;
        this.uid = internalRemoteStreamStats.uid;
        this.isScreen = internalRemoteStreamStats.isScreen;
        this.rxQuality = internalRemoteStreamStats.rxQuality;
        this.txQuality = internalRemoteStreamStats.txQuality;
    }

    public String toString() {
        return "RemoteStreamStats{uid='" + this.uid + "', audioStats=" + this.audioStats + ", videoStats=" + this.videoStats + ", isScreen=" + this.isScreen + ", txQuality=" + this.txQuality + ", rxQuality=" + this.rxQuality + '}';
    }

    public RemoteStreamStats() {
    }
}
