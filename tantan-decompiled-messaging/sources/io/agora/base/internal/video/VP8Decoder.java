package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
class VP8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
