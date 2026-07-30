package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamLayoutRegionType {
    MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM(0),
    MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE(1);

    private int regionType;

    MixedStreamLayoutRegionType(int i) {
        this.regionType = i;
    }

    public int getValue() {
        return this.regionType;
    }
}
