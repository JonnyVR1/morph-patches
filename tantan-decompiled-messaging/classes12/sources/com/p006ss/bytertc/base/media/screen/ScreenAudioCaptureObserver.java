package com.p006ss.bytertc.base.media.screen;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface ScreenAudioCaptureObserver {
    void onAudioFrameCapture(byte[] bArr, int i, int i2, int i3);

    void onCapturerStarted();

    void onCapturerStopped();
}
