package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum MirrorMode {
    MIRROR_MODE_OFF(0),
    MIRROR_MODE_ON(1);

    private int value;

    MirrorMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static MirrorMode fromId(int i) {
        for (MirrorMode mirrorMode : values()) {
            if (mirrorMode.value() == i) {
                return mirrorMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == MIRROR_MODE_ON ? "kMirrorModeOn" : "kMirrorModeOff";
    }

    public int value() {
        return this.value;
    }
}
