package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes8.dex */
public class MMRtcRemoteStats {
    public MMRtcRemoteAudioStats AudioStats;
    public long uid;
    public MMRtcRemoteVideoStats videoStats;

    @CalledByNative
    public MMRtcRemoteStats() {
    }

    @CalledByNative
    public void setAudioStats(MMRtcRemoteAudioStats mMRtcRemoteAudioStats) {
        this.AudioStats = mMRtcRemoteAudioStats;
    }

    @CalledByNative
    public void setUid(long j) {
        this.uid = j;
    }

    @CalledByNative
    public void setVideoStats(MMRtcRemoteVideoStats mMRtcRemoteVideoStats) {
        this.videoStats = mMRtcRemoteVideoStats;
    }
}
