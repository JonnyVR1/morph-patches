package io.agora.mediaplayer;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaPlayerVideoFrameObserver {
    @CalledByNative
    void onFrame(VideoFrame videoFrame);
}
