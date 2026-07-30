package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
class H264Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
