package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
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
