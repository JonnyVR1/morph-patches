package io.agora.base.internal.video;

import io.agora.base.VideoFrame;

/* JADX INFO: loaded from: classes2.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
