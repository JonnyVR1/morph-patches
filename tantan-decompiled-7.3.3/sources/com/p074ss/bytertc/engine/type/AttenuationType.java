package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum AttenuationType {
    ATTENUATION_TYPE_NONE(0),
    ATTENUATION_TYPE_LINEAR(1),
    ATTENUATION_TYPE_EXPONENTIAL(2);

    private final int value;

    AttenuationType(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
