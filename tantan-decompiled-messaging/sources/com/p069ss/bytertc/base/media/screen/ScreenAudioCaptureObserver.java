package com.p069ss.bytertc.base.media.screen;

/* JADX INFO: loaded from: classes12.dex */
public interface ScreenAudioCaptureObserver {
    void onAudioFrameCapture(byte[] bArr, int i, int i2, int i3);

    void onCapturerStarted();

    void onCapturerStopped();
}
