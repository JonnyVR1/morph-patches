package com.p006ss.bytertc.base.media;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface CapturerObserver {
    void onCapturerError(String str);

    void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5);

    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
