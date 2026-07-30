package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamRenderMode {
    MIXED_STREAM_RENDER_MODE_HIDDEN(1),
    MIXED_STREAM_RENDER_MODE_FIT(2),
    MIXED_STREAM_RENDER_MODE_ADAPTIVE(3);

    private int renderMode;

    MixedStreamRenderMode(int i) {
        this.renderMode = i;
    }

    public int getValue() {
        return this.renderMode;
    }
}
