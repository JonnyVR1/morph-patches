package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalLocalVideoStats;

/* JADX INFO: loaded from: classes11.dex */
public class LocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int jitter;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;

    public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
        this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
        this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
        this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
        this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
        this.statsInterval = internalLocalVideoStats.statsInterval;
        this.videoLossRate = internalLocalVideoStats.videoLossRate;
        this.rtt = internalLocalVideoStats.rtt;
        this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
        this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
        this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
        this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
        this.codecType = internalLocalVideoStats.codecType;
        this.isScreen = internalLocalVideoStats.isScreen;
        this.jitter = internalLocalVideoStats.jitter;
        this.videoDenoiseMode = internalLocalVideoStats.videoDenoiseMode;
    }

    public String toString() {
        return "LocalVideoStats{sentKBitrate='" + this.sentKBitrate + "', inputFrameRate='" + this.inputFrameRate + "', sentFrameRate='" + this.sentFrameRate + "', encoderOutputFrameRate='" + this.encoderOutputFrameRate + "', rendererOutputFrameRate='" + this.rendererOutputFrameRate + "', videoLossRate='" + this.videoLossRate + "', rtt='" + this.rtt + "', statsInterval='" + this.statsInterval + "', encodedBitrate='" + this.encodedBitrate + "', encodedFrameWidth='" + this.encodedFrameWidth + "', encodedFrameHeight='" + this.encodedFrameHeight + "', encodedFrameCount='" + this.encodedFrameCount + "', codecType='" + this.codecType + "', isScreen='" + this.isScreen + "', jitter='" + this.jitter + "', videoDenoiseMode" + this.videoDenoiseMode + "'}";
    }

    public LocalVideoStats() {
    }
}
