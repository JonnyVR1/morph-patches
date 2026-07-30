package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalRemoteAudioStats;

/* JADX INFO: loaded from: classes13.dex */
public class RemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public double decodeFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitter;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public float receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int totalRtt;

    public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        this.audioLossRate = internalRemoteAudioStats.audioLossRate;
        this.receivedKBitrate = internalRemoteAudioStats.receivedKBitrate;
        this.stallCount = internalRemoteAudioStats.stallCount;
        this.stallDuration = internalRemoteAudioStats.stallDuration;
        this.e2eDelay = internalRemoteAudioStats.e2eDelay;
        this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
        this.statsInterval = internalRemoteAudioStats.statsInterval;
        this.rtt = internalRemoteAudioStats.rtt;
        this.totalRtt = internalRemoteAudioStats.totalRtt;
        this.quality = internalRemoteAudioStats.quality;
        this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
        this.numChannels = internalRemoteAudioStats.numChannels;
        this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
        this.frozenRate = internalRemoteAudioStats.frozenRate;
        this.concealedSamples = internalRemoteAudioStats.concealedSamples;
        this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
        this.decSampleRate = internalRemoteAudioStats.decSampleRate;
        this.decDuration = internalRemoteAudioStats.decDuration;
        this.jitter = internalRemoteAudioStats.jitter;
        this.decodeFrameRate = internalRemoteAudioStats.decodeFrameRate;
    }

    public String toString() {
        return "RemoteAudioStats{audioLossRate='" + this.audioLossRate + "', receivedKBitrate='" + this.receivedKBitrate + "', stallCount='" + this.stallCount + "', stallDuration='" + this.stallDuration + "', playoutSampleRate='" + this.playoutSampleRate + "', e2eDelay='" + this.e2eDelay + "', rtt='" + this.rtt + "', quality='" + this.quality + "', jitterBufferDelay='" + this.jitterBufferDelay + "', numChannels='" + this.numChannels + "', receivedSampleRate='" + this.receivedSampleRate + "', frozenRate='" + this.frozenRate + "', concealedSamples='" + this.concealedSamples + "', concealmentEvent='" + this.concealmentEvent + "', decSampleRate='" + this.decSampleRate + "', decDuration='" + this.decDuration + "', total_rtt='" + this.totalRtt + "', jitter='" + this.jitter + "', decodeFrameRate='" + this.decodeFrameRate + "'}";
    }

    public RemoteAudioStats() {
    }
}
