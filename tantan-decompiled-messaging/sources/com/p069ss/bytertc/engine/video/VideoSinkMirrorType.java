package com.p069ss.bytertc.engine.video;

import p149l.k250;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoSinkMirrorType {
    ON(1),
    OFF(2);

    private int value;

    VideoSinkMirrorType(int i) {
        this.value = i;
    }

    public static VideoSinkMirrorType convertFromInt(int i) {
        if (i == 1) {
            return ON;
        }
        if (i == 2) {
            return OFF;
        }
        k250.m144273a("VideoSinkMirrorType enum value invalidate: ", i);
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
