package com.p074ss.bytertc.engine.type;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p074ss.bytertc.engine.InternalRTCStats;

/* JADX INFO: loaded from: classes11.dex */
public class RTCRoomStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public long rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public long txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public RTCRoomStats(InternalRTCStats internalRTCStats) {
        this.totalDuration = internalRTCStats.totalDuration;
        this.txBytes = internalRTCStats.txBytes;
        this.rxBytes = internalRTCStats.rxBytes;
        this.txKBitRate = internalRTCStats.txKBitRate;
        this.rxKBitRate = internalRTCStats.rxKBitRate;
        this.txAudioKBitRate = internalRTCStats.txAudioKBitRate;
        this.rxAudioKBitRate = internalRTCStats.rxAudioKBitRate;
        this.txVideoKBitRate = internalRTCStats.txVideoKBitRate;
        this.rxVideoKBitRate = internalRTCStats.rxVideoKBitRate;
        this.txScreenKBitRate = internalRTCStats.txScreenKBitRate;
        this.rxScreenKBitRate = internalRTCStats.rxScreenKBitRate;
        this.users = internalRTCStats.users;
        this.cpuTotalUsage = internalRTCStats.cpuTotalUsage;
        this.cpuAppUsage = internalRTCStats.cpuAppUsage;
        this.txLostrate = internalRTCStats.txLostrate;
        this.rxLostrate = internalRTCStats.rxLostrate;
        this.rtt = internalRTCStats.rtt;
        this.txJitter = internalRTCStats.txJitter;
        this.rxJitter = internalRTCStats.rxJitter;
        this.txCellularKBitrate = internalRTCStats.txCellularKBitrate;
        this.rxCellularKBitrate = internalRTCStats.rxCellularKBitrate;
    }

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0L;
        this.rxBytes = 0L;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.txScreenKBitRate = 0;
        this.rxScreenKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.cpuAppUsage = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.txJitter = 0;
        this.rxJitter = 0;
        this.txLostrate = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.rxLostrate = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.rtt = 0;
        this.txCellularKBitrate = 0;
        this.rxCellularKBitrate = 0;
    }

    public String toString() {
        return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", txScreenKBitRate=" + this.txScreenKBitRate + ", rxScreenKBitRate=" + this.rxScreenKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", txLostrate=" + this.txLostrate + ", rxLostrate=" + this.rxLostrate + ", rtt=" + this.rtt + ", txJitter=" + this.txJitter + ", rxJitter=" + this.rxJitter + ", txCellularKBitRate=" + this.txCellularKBitrate + ", rxCellularKBitRate=" + this.rxCellularKBitrate + '}';
    }

    public RTCRoomStats() {
    }
}
