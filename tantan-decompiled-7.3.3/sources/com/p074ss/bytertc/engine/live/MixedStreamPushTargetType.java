package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamPushTargetType {
    PUSH_TO_CDN(0),
    PUSH_TO_WTN(1);

    private int targetType;

    MixedStreamPushTargetType(int i) {
        this.targetType = i;
    }

    public int value() {
        return this.targetType;
    }
}
