package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum StreamLayoutMode {
    AUTO(0),
    CUSTOM(2);

    private int mode;

    StreamLayoutMode(int i) {
        this.mode = i;
    }

    public int value() {
        return this.mode;
    }
}
