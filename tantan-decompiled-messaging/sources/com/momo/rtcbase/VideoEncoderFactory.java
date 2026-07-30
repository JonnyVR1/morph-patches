package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public interface VideoEncoderFactory {
    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
