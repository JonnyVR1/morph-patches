package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // com.momo.rtcbase.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public Integer getVideoMode() {
        return 0;
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public void updateSharedContext(EglBase.Context context) {
    }
}
