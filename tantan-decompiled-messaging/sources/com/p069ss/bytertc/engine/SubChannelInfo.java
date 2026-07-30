package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class SubChannelInfo {
    private String channelName;
    private double volumeScale;

    public SubChannelInfo(String str, double d) {
        this.channelName = str;
        this.volumeScale = d;
    }

    @CalledByNative
    public String getChannelName() {
        return this.channelName;
    }

    @CalledByNative
    public double getVolumeScale() {
        return this.volumeScale;
    }
}
