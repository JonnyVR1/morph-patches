package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamPushMode {
    ON_STREAM(0),
    ON_START_REQUEST(1);

    private int pushMode;

    MixedStreamPushMode(int i) {
        this.pushMode = i;
    }

    public int getValue() {
        return this.pushMode;
    }
}
