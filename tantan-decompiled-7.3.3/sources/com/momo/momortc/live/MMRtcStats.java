package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class MMRtcStats {
    public MMRtcLocalAudioStats audioStats;
    public MMRtcLocalVideoStats videoStats;
    public long txBytes = 0;
    public long rxBytes = 0;
    public long userCount = 0;
    public String channelID = "";
    public List<MMRtcRemoteStats> remoteStats = new ArrayList();

    @CalledByNative
    public MMRtcStats() {
    }

    @CalledByNative
    public void setAudioStats(MMRtcLocalAudioStats mMRtcLocalAudioStats) {
        this.audioStats = mMRtcLocalAudioStats;
    }

    @CalledByNative
    public void setChannelID(String str) {
        this.channelID = str;
    }

    @CalledByNative
    public void setRemoteStats(MMRtcRemoteStats mMRtcRemoteStats) {
        this.remoteStats.add(mMRtcRemoteStats);
    }

    @CalledByNative
    public void setRxBytes(long j) {
        this.rxBytes = j;
    }

    @CalledByNative
    public void setTxBytes(long j) {
        this.txBytes = j;
    }

    @CalledByNative
    public void setUserCount(long j) {
        this.userCount = j;
    }

    @CalledByNative
    public void setVideoStats(MMRtcLocalVideoStats mMRtcLocalVideoStats) {
        this.videoStats = mMRtcLocalVideoStats;
    }
}
