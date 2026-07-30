package com.p074ss.bytertc.engine.live;

import com.p074ss.bytertc.engine.video.IVideoFrame;

/* JADX INFO: loaded from: classes11.dex */
public interface IClientMixedStreamObserver {
    void onCacheSyncVideoFrames(String str, String[] strArr, IVideoFrame[] iVideoFrameArr, byte[][] bArr, int i);

    void onClientMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamType mixedStreamType, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode);

    void onMixedAudioFrame(String str, byte[] bArr, int i, long j);

    void onMixedDataFrame(String str, byte[] bArr, long j);

    void onMixedFirstAudioFrame(String str);

    void onMixedFirstVideoFrame(String str);

    void onMixedVideoFrame(String str, IVideoFrame iVideoFrame);
}
