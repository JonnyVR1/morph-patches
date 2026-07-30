package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalLocalAudioStats;

/* JADX INFO: loaded from: classes13.dex */
public class LocalAudioStats {
    public int audioDeviceLoopDelay;
    public float audioLossRate;
    public double encodeFrameRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public float sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        this.audioLossRate = internalLocalAudioStats.audioLossRate;
        this.sendKBitrate = internalLocalAudioStats.sendKBitrate;
        this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
        this.statsInterval = internalLocalAudioStats.statsInterval;
        this.rtt = internalLocalAudioStats.rtt;
        this.numChannels = internalLocalAudioStats.numChannels;
        this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        this.jitter = internalLocalAudioStats.jitter;
        this.audioDeviceLoopDelay = internalLocalAudioStats.audioDeviceLoopDelay;
        this.encodeFrameRate = internalLocalAudioStats.encodeFrameRate;
    }

    public String toString() {
        return "LocalAudioStats{audioLossRate='" + this.audioLossRate + "', sendKBitrate='" + this.sendKBitrate + "', recordSampleRate='" + this.recordSampleRate + "', statsInterval='" + this.statsInterval + "', rtt='" + this.rtt + "', numChannels='" + this.numChannels + "', sentSampleRate='" + this.sentSampleRate + "', jitter='" + this.jitter + "', audioDeviceLoopDelay='" + this.audioDeviceLoopDelay + "', encodeFrameRate='" + this.encodeFrameRate + "'}";
    }

    public LocalAudioStats() {
    }
}
