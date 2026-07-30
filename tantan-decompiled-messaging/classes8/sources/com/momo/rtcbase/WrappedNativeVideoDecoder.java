package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // com.momo.rtcbase.VideoDecoder
    public abstract long createNativeVideoDecoder();

    @Override // com.momo.rtcbase.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoDecoder
    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoDecoder
    public boolean getPrefersLateDecoding() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoDecoder
    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
