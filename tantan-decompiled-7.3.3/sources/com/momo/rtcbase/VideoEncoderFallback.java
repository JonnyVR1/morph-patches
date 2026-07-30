package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    private static native long nativeCreateEncoder(VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder(this.fallback, this.primary);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        return super.encode(videoFrame, encodeInfo);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ VideoEncoder.ScalingSettings getScalingSettings() {
        return super.getScalingSettings();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ Integer getVideoMode() {
        return super.getVideoMode();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        return super.initEncode(settings, callback);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        return super.setRateAllocation(bitrateAllocation, i);
    }

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public /* bridge */ /* synthetic */ void updateSharedContext(EglBase.Context context) {
        super.updateSharedContext(context);
    }
}
