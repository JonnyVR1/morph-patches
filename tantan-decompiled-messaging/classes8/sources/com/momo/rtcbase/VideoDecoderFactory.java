package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface VideoDecoderFactory {
    @CalledByNative
    default VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return createDecoder(videoCodecInfo.getName());
    }

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }

    @Deprecated
    default VideoDecoder createDecoder(String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }
}
