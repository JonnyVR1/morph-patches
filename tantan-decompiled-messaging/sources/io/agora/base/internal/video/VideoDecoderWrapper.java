package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: io.agora.base.internal.video.VideoDecoderWrapper.1
            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodeBufferPrepared(long j2) {
                VideoDecoderWrapper.nativeOnDecodeBufferPrepared(j, j2);
            }

            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodeReset() {
                VideoDecoderWrapper.nativeOnDecodeReset(j);
            }

            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2, int i, int i2, int i3, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2, i, i2, i3, codecSpecificInfo, frameExtraInfo);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodeBufferPrepared(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodeReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2, int i, int i2, int i3, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);
}
