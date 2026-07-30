package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.video.IVideoSink;
import com.p069ss.bytertc.engine.video.RemoteVideoSinkConfig;

/* JADX INFO: loaded from: classes13.dex */
public interface IWTNStream {
    int setWTNRemoteAudioPlaybackVolume(String str, int i);

    int setWTNRemoteVideoCanvas(String str, VideoCanvas videoCanvas);

    int setWTNRemoteVideoSink(String str, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig);

    int setWTNStreamEventHandler(IWTNStreamEventHandler iWTNStreamEventHandler);

    int subscribeWTNAudioStream(String str, boolean z);

    int subscribeWTNVideoStream(String str, boolean z);
}
