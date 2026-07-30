package io.agora.base.internal.video;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
class H264Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public static native boolean nativeIsSupported();

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    @Nullable
    public VideoEncoder.VideoHWCodecSpec getVideoHWCodecSpec() {
        return null;
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
