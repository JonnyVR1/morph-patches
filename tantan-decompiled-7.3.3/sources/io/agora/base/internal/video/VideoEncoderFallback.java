package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import io.agora.base.VideoFrame;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    private static native long nativeCreateEncoder(VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus attachProxyThread() {
        return super.attachProxyThread();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder(this.fallback, this.primary);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus detachProxyThread() {
        return super.detachProxyThread();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo) {
        return super.encode(videoFrame, encodeInfo, codecSpecificInfo);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus flush() {
        return super.flush();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    @Nullable
    public /* bridge */ /* synthetic */ VideoEncoder.EncoderStyle getEncoderStyle() {
        return super.getEncoderStyle();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ long getResetCoolDownTimeMs() {
        return super.getResetCoolDownTimeMs();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoEncoder.ScalingSettings getScalingSettings() {
        return super.getScalingSettings();
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    @Nullable
    public VideoEncoder.VideoHWCodecSpec getVideoHWCodecSpec() {
        return null;
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        return super.initEncode(settings, callback);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ boolean isQcomHardware() {
        return super.isQcomHardware();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus resume() {
        return super.resume();
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus setChannelParameters(short s, long j) {
        return super.setChannelParameters(s, j);
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        return super.setRateAllocation(bitrateAllocation, i);
    }
}
