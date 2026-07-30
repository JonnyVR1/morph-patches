package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum SubscribeMode {
    AUTO_SUBSCRIBE_MODE(0),
    MANUAL_SUBSCRIBE_MODE(1);

    private int value;

    SubscribeMode(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
