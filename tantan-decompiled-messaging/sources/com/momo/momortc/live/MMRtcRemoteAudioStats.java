package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class MMRtcRemoteAudioStats {
    public int audioBitrate = 0;
    public long aReceiveSize = 0;
    public int audioDelay = 0;
    public int audioLost = 0;
    public int audioPlayLag = 0;
    public int expandCount = 0;
    public int expandCartonCount = 0;
    public int expandRealCount = 0;
    public int audioCache = 0;
    public boolean audioMute = false;
    public int audiLossTimestamp = 0;
    public int networkRtt = 0;

    @CalledByNative
    public MMRtcRemoteAudioStats() {
    }

    @CalledByNative
    public void setAudiLossTimestamp(int i) {
        this.audiLossTimestamp = i;
    }

    @CalledByNative
    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    @CalledByNative
    public void setAudioCache(int i) {
        this.audioCache = i;
    }

    @CalledByNative
    public void setAudioDelay(int i) {
        this.audioDelay = i;
    }

    @CalledByNative
    public void setAudioLost(int i) {
        this.audioLost = i;
    }

    @CalledByNative
    public void setAudioMute(boolean z) {
        this.audioMute = z;
    }

    @CalledByNative
    public void setAudioPlayLag(int i) {
        this.audioPlayLag = i;
    }

    @CalledByNative
    public void setExpandCartonCount(int i) {
        this.expandCartonCount = i;
    }

    @CalledByNative
    public void setExpandCount(int i) {
        this.expandCount = i;
    }

    @CalledByNative
    public void setExpandRealCount(int i) {
        this.expandRealCount = i;
    }

    @CalledByNative
    public void setNetworkRtt(int i) {
        this.networkRtt = i;
    }

    @CalledByNative
    public void setaReceiveSize(long j) {
        this.aReceiveSize = j;
    }
}
