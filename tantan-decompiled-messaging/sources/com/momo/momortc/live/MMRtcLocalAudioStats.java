package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class MMRtcLocalAudioStats {
    public long audioBitrate = 0;
    public long aCaptureSize = 0;
    public long aEncodeSize = 0;
    public long aSendSize = 0;
    public boolean audioMute = false;
    public long rtt_ms = 0;

    @CalledByNative
    public MMRtcLocalAudioStats() {
    }

    @CalledByNative
    public void setAudioBitrate(long j) {
        this.audioBitrate = j;
    }

    @CalledByNative
    public void setAudioMute(boolean z) {
        this.audioMute = z;
    }

    @CalledByNative
    public void setRtt_ms(long j) {
        this.rtt_ms = j;
    }

    @CalledByNative
    public void setaCaptureSize(long j) {
        this.aCaptureSize = j;
    }

    @CalledByNative
    public void setaEncodeSize(long j) {
        this.aEncodeSize = j;
    }

    @CalledByNative
    public void setaSendSize(long j) {
        this.aSendSize = j;
    }
}
