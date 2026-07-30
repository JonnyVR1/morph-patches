package com.p074ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes11.dex */
public class RTCWatermarkConfig {
    public ByteWatermark positionInLandscapeMode;
    public ByteWatermark positionInPortraitMode;
    public boolean visibleInPreview;

    public RTCWatermarkConfig(boolean z, ByteWatermark byteWatermark, ByteWatermark byteWatermark2) {
        this.visibleInPreview = z;
        this.positionInLandscapeMode = byteWatermark;
        this.positionInPortraitMode = byteWatermark2;
    }

    public RTCWatermarkConfig() {
        this.visibleInPreview = true;
    }
}
