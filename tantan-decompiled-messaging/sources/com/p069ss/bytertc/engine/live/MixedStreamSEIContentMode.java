package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamSEIContentMode {
    MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT(0),
    MIXED_STREAM_SEI_CONTENT_MODE_ENABLE_VOLUME_INDICATION(1);

    private int seiContentMode;

    MixedStreamSEIContentMode(int i) {
        this.seiContentMode = i;
    }

    public int getValue() {
        return this.seiContentMode;
    }
}
