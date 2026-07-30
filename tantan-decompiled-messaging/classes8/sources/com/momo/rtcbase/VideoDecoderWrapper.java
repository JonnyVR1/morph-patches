package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: com.momo.rtcbase.e
            @Override // com.momo.rtcbase.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
