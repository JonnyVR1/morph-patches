package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
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
