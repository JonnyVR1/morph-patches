package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
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
        return false;
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
