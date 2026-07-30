package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalNetworkQualityInfo;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkQualityStats {
    public double fractionLost;
    public int rtt;
    public int rxQuality;
    public int totalBandwidth;
    public int txQuality;
    public String uid;

    public NetworkQualityStats(InternalNetworkQualityInfo internalNetworkQualityInfo) {
        this.uid = internalNetworkQualityInfo.uid;
        this.fractionLost = internalNetworkQualityInfo.fractionLost;
        this.rtt = internalNetworkQualityInfo.rtt;
        this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
        this.txQuality = internalNetworkQualityInfo.txNetQuality;
        this.rxQuality = internalNetworkQualityInfo.rxNetQuality;
    }

    public String toString() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",txQuality=" + this.txQuality + ",rxQuality=" + this.rxQuality;
    }

    public NetworkQualityStats(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txQuality = i3;
        this.rxQuality = i4;
    }
}
