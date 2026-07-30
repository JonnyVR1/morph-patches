package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedHdrMetadata implements VideoFrame.HdrMetadata {
    private int luminanceMax;
    private int luminanceMin;
    private int maxContentLightLevel;
    private int maxFrameAverageLightLevel;
    private VideoFrame.HdrMetadata.Chromaticity primaryB;
    private VideoFrame.HdrMetadata.Chromaticity primaryG;
    private VideoFrame.HdrMetadata.Chromaticity primaryR;
    private VideoFrame.HdrMetadata.Chromaticity whitePoint;

    @CalledByNative
    public WrappedHdrMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.maxContentLightLevel = i;
        this.maxFrameAverageLightLevel = i2;
        this.primaryR = new VideoFrame.HdrMetadata.Chromaticity(i3, i4);
        this.primaryG = new VideoFrame.HdrMetadata.Chromaticity(i5, i6);
        this.primaryB = new VideoFrame.HdrMetadata.Chromaticity(i7, i8);
        this.whitePoint = new VideoFrame.HdrMetadata.Chromaticity(i9, i10);
        this.luminanceMax = i11;
        this.luminanceMin = i12;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public int getLuminanceMax() {
        return this.luminanceMax;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public int getLuminanceMin() {
        return this.luminanceMin;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public int getMaxContentLightLevel() {
        return this.maxContentLightLevel;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public int getMaxFrameAverageLightLevel() {
        return this.maxFrameAverageLightLevel;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public VideoFrame.HdrMetadata.Chromaticity getWhitePoint() {
        return this.whitePoint;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public VideoFrame.HdrMetadata.Chromaticity getprimaryB() {
        return this.primaryB;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public VideoFrame.HdrMetadata.Chromaticity getprimaryG() {
        return this.primaryG;
    }

    @Override // io.agora.base.VideoFrame.HdrMetadata
    public VideoFrame.HdrMetadata.Chromaticity getprimaryR() {
        return this.primaryR;
    }

    private WrappedHdrMetadata() {
    }
}
