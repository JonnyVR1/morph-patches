package com.p074ss.bytertc.engine.video;

import p153l.za50;

/* JADX INFO: loaded from: classes11.dex */
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
        za50.m219101a("VideoSinkMirrorType enum value invalidate: ", i);
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
