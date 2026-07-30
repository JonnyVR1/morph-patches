package com.momo.momortc.live;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class MMRtcRemoteVideoStats {
    public int videoBitrate = 0;
    public int videoFramerate = 0;
    public long vReceiveSize = 0;
    public int videowidth = 0;
    public int videoheight = 0;
    public int videoDelay = 0;
    public float videoLost = 0.0f;
    public int videoPlayLag = 0;
    public String videoDelayEx = "";
    public boolean videoMute = false;
    public long videoRenderCount = 0;

    @CalledByNative
    public MMRtcRemoteVideoStats() {
    }

    @CalledByNative
    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    @CalledByNative
    public void setVideoDelay(int i) {
        this.videoDelay = i;
    }

    @CalledByNative
    public void setVideoDelayEx(String str) {
        this.videoDelayEx = str;
    }

    @CalledByNative
    public void setVideoFramerate(int i) {
        this.videoFramerate = i;
    }

    @CalledByNative
    public void setVideoLost(float f) {
        this.videoLost = f;
    }

    @CalledByNative
    public void setVideoMute(boolean z) {
        this.videoMute = z;
    }

    @CalledByNative
    public void setVideoPlayLag(int i) {
        this.videoPlayLag = i;
    }

    @CalledByNative
    public void setVideoRenderCount(long j) {
        this.videoRenderCount = j;
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
    public void setvReceiveSize(long j) {
        this.vReceiveSize = j;
    }
}
