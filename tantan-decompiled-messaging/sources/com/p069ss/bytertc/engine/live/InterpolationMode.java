package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum InterpolationMode {
    LAST_FRAME_FILL(0),
    BACKGROUND_IMAGE_FILL(1);

    private int mode;

    InterpolationMode(int i) {
        this.mode = i;
    }

    public int value() {
        return this.mode;
    }
}
