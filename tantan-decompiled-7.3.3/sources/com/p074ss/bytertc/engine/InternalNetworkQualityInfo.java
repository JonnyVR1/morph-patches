package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int rtt;
    public int rxNetQuality;
    public int totalBandwidth;
    public int txNetQuality;
    public String uid;

    public InternalNetworkQualityInfo(double d, int i, int i2, int i3, int i4) {
        this.uid = "";
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }

    @CalledByNative
    private static InternalNetworkQualityInfo create(String str, double d, int i, int i2, int i3, int i4) {
        return new InternalNetworkQualityInfo(str, d, i, i2, i3, i4);
    }

    public String toString() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",txNetQuality=" + this.txNetQuality + ",rxNetQuality=" + this.rxNetQuality;
    }

    public InternalNetworkQualityInfo(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }
}
