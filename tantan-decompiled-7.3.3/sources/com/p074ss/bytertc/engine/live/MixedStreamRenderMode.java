package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
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
