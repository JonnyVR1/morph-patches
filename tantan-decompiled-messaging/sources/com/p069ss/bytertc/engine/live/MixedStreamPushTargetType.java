package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
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
