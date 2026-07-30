package com.bytedance.realx.video;

import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class VideoEncoderWrapper {
    @CalledByNative
    public static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: com.bytedance.realx.video.e
            @Override // com.bytedance.realx.video.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), codecSpecificInfo.codec_standard.toInt(), encodedImage.svcLayerNum, encodedImage.compositionTimeUs, encodedImage.f4768qp.intValue());
            }
        };
    }

    @Nullable
    @CalledByNative
    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @Nullable
    @CalledByNative
    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f4773on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, long j2, int i3, int i4, int i5, long j3, int i6);
}
