package com.p069ss.bytertc.engine.video;

import p149l.k250;

/* JADX INFO: loaded from: classes13.dex */
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
        k250.m144273a("VideoApplyRotation enum value invalidate: ", i);
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
