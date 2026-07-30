package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoOrientation {
    ADAPTIVE(0),
    PORTRAIT(1),
    LANDSCAPE(2);

    private int value;

    VideoOrientation(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoOrientation fromId(int i) {
        for (VideoOrientation videoOrientation : values()) {
            if (videoOrientation.value() == i) {
                return videoOrientation;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i == 0) {
            return "kVideoOrientationAdaptive";
        }
        if (i != 1) {
            return i != 2 ? "" : "kVideoOrientationLandscape";
        }
        return "kVideoOrientationPortrait";
    }

    public int value() {
        return this.value;
    }
}
