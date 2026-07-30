package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodeBufferPrepared(long j);

        void onDecodeReset();

        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2, int i, int i2, int i3, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public int codecProfile;
        public int height;
        public int lumaBitDepth;
        public int numberOfCores;
        public int width;

        @CalledByNative("Settings")
        public Settings(int i, int i2, int i3, int i4, int i5) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.lumaBitDepth = i4;
            this.codecProfile = i5;
        }
    }

    @CalledByNative
    VideoCodecStatus attachProxyThread();

    @CalledByNative
    long createNativeVideoDecoder();

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);

    @CalledByNative
    VideoCodecStatus detachProxyThread();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    boolean getPrefersLateDecoding();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareDecoder();

    @CalledByNative
    VideoCodecStatus release();
}
