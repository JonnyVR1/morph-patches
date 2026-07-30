package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus attachProxyThread() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public abstract long createNativeVideoDecoder();

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus detachProxyThread() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public boolean isHardwareDecoder() {
        return false;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
