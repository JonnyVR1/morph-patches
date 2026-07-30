package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalRemoteVideoStats;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteVideoStats {
    public int avSyncDiffMs;
    public int capToRenderDelay;
    public int codecElapsePerFrame;
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public int jitter;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        this.width = internalRemoteVideoStats.width;
        this.height = internalRemoteVideoStats.height;
        this.videoLossRate = internalRemoteVideoStats.videoLossRate;
        this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
        this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
        this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
        this.stallCount = internalRemoteVideoStats.stallCount;
        this.stallDuration = internalRemoteVideoStats.stallDuration;
        this.e2eDelay = internalRemoteVideoStats.e2eDelay;
        this.isScreen = internalRemoteVideoStats.isScreen;
        this.statsInterval = internalRemoteVideoStats.statsInterval;
        this.rtt = internalRemoteVideoStats.rtt;
        this.frozenRate = internalRemoteVideoStats.frozenRate;
        this.codecType = internalRemoteVideoStats.codecType;
        this.videoIndex = internalRemoteVideoStats.videoIndex;
        this.jitter = internalRemoteVideoStats.jitter;
        this.superResolutionMode = internalRemoteVideoStats.superResolutionMode;
        this.capToRenderDelay = internalRemoteVideoStats.capToRenderDelay;
        this.avSyncDiffMs = internalRemoteVideoStats.avSyncDiffMs;
        this.codecElapsePerFrame = internalRemoteVideoStats.codecElapsePerFrame;
    }

    public String toString() {
        return "RemoteVideoStats{width='" + this.width + "', height='" + this.height + "', videoLossRate='" + this.videoLossRate + "', receivedKBitrate='" + this.receivedKBitrate + "', decoderOutputFrameRate='" + this.decoderOutputFrameRate + "', rendererOutputFrameRate='" + this.rendererOutputFrameRate + "', stallCount='" + this.stallCount + "', stallDuration='" + this.stallDuration + "', e2eDelay='" + this.e2eDelay + "', isScreen='" + this.isScreen + "', rtt='" + this.rtt + "', frozenRate='" + this.frozenRate + "', videoIndex='" + this.videoIndex + "', jitter='" + this.jitter + "', codecType='" + this.codecType + "', superResolutionMode='" + this.superResolutionMode + "', capToRenderDelay='" + this.capToRenderDelay + "', avSyncDiffMs='" + this.avSyncDiffMs + "', codecElapsePerFrame='" + this.codecElapsePerFrame + "'}";
    }

    public RemoteVideoStats() {
    }
}
