package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
