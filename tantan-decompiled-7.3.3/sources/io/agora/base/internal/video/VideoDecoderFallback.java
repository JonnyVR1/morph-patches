package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    private static native long nativeCreateDecoder(VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus attachProxyThread() {
        return super.attachProxyThread();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder(this.fallback, this.primary);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo) {
        return super.decode(encodedImage, decodeInfo, codecSpecificInfo, frameExtraInfo);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus detachProxyThread() {
        return super.detachProxyThread();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ boolean getPrefersLateDecoding() {
        return super.getPrefersLateDecoding();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        return super.initDecode(settings, callback);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public boolean isHardwareDecoder() {
        return this.primary.isHardwareDecoder();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }
}
