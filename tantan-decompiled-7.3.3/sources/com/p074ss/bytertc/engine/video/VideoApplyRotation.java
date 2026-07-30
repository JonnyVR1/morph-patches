package com.p074ss.bytertc.engine.video;

import p153l.za50;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoApplyRotation {
    DEFAULT(-1),
    DEGREE_0(0);

    private int value;

    VideoApplyRotation(int i) {
        this.value = i;
    }

    public static VideoApplyRotation convertFromInt(int i) {
        if (i == -1) {
            return DEFAULT;
        }
        if (i == 0) {
            return DEGREE_0;
        }
        za50.m219101a("VideoApplyRotation enum value invalidate: ", i);
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
