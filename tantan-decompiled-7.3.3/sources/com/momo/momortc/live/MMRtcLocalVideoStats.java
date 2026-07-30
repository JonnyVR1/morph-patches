package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes8.dex */
public class MMRtcLocalVideoStats {
    public int videoBitrate = 0;
    public int videoFramerate = 0;
    public int videowidth = 0;
    public int videoheight = 0;
    public long vCaptureCount = 0;
    public long vEncodeSize = 0;
    public int vEncodeCount = 0;
    public long vSendSize = 0;
    public long gopDuration = 0;
    public boolean videoMute = false;

    @CalledByNative
    public MMRtcLocalVideoStats() {
    }

    @CalledByNative
    public void setGopDuration(long j) {
        this.gopDuration = j;
    }

    @CalledByNative
    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    @CalledByNative
    public void setVideoFramerate(int i) {
        this.videoFramerate = i;
    }

    @CalledByNative
    public void setVideoMute(boolean z) {
        this.videoMute = z;
    }

    @CalledByNative
    public void setVideoheight(int i) {
        this.videoheight = i;
    }

    @CalledByNative
    public void setVideowidth(int i) {
        this.videowidth = i;
    }

    @CalledByNative
    public void setvCaptureCount(long j) {
        this.vCaptureCount = j;
    }

    @CalledByNative
    public void setvEncodeCount(int i) {
        this.vEncodeCount = i;
    }

    @CalledByNative
    public void setvEncodeSize(long j) {
        this.vEncodeSize = j;
    }

    @CalledByNative
    public void setvSendSize(long j) {
        this.vSendSize = j;
    }
}
