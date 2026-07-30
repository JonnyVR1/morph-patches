package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum BackgroundMode {
    BACKGROUND_A(0),
    BACKGROUND_B(1),
    BLUR(2),
    NONE(3);

    private int value;

    BackgroundMode(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
