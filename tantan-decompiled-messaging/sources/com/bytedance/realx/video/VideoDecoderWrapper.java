package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: com.bytedance.realx.video.VideoDecoderWrapper.1
            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onDecodedFrame(RXVideoFrameInterface rXVideoFrameInterface) {
                long j2 = j;
                if (j2 != 0) {
                    VideoDecoderWrapper.nativeOnDecodedFrame(j2, rXVideoFrameInterface);
                }
            }

            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str) {
                if (j == 0 || str == null || str.length() == 0) {
                    return;
                }
                VideoDecoderWrapper.nativeOnMediaCodecStatus(j, videoCodecStatus, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, RXVideoFrameInterface rXVideoFrameInterface);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnMediaCodecStatus(long j, VideoCodecStatus videoCodecStatus, String str);
}
