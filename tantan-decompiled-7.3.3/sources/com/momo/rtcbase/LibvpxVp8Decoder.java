package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        return super.decode(encodedImage, decodeInfo);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public /* bridge */ /* synthetic */ boolean getPrefersLateDecoding() {
        return super.getPrefersLateDecoding();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        return super.initDecode(settings, callback);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }
}
