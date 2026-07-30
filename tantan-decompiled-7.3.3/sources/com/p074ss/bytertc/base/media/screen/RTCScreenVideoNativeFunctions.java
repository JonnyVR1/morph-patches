package com.p074ss.bytertc.base.media.screen;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes11.dex */
public final class RTCScreenVideoNativeFunctions {
    public static native void nativeOnCapturerError(long j, int i, String str);

    public static native void nativeOnCapturerSetType(long j, int i);

    public static native void nativeOnCapturerStarted(long j);

    public static native void nativeOnCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);
}
