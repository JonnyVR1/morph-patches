package com.p069ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes13.dex */
public enum LocalVideoSinkPosition {
    AFTER_CAPTURE(0),
    AFTER_PREPROCESS(1);

    private int value;

    LocalVideoSinkPosition(int i) {
        this.value = i;
    }

    public static LocalVideoSinkPosition convertFromInt(int i) {
        return values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
