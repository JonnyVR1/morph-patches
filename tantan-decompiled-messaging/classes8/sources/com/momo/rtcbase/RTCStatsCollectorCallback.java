package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface RTCStatsCollectorCallback {
    @CalledByNative
    void onStatsDelivered(RTCStatsReport rTCStatsReport);
}
