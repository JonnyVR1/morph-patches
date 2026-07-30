package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.video.IVideoSink;
import com.p074ss.bytertc.engine.video.RemoteVideoSinkConfig;

/* JADX INFO: loaded from: classes11.dex */
public interface IWTNStream {
    int setWTNRemoteAudioPlaybackVolume(String str, int i);

    int setWTNRemoteVideoCanvas(String str, VideoCanvas videoCanvas);

    int setWTNRemoteVideoSink(String str, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig);

    int setWTNStreamEventHandler(IWTNStreamEventHandler iWTNStreamEventHandler);

    int subscribeWTNAudioStream(String str, boolean z);

    int subscribeWTNVideoStream(String str, boolean z);
}
