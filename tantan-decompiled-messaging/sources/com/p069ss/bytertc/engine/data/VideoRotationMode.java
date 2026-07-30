package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoRotationMode {
    FOLLOW_APP(0),
    FOLLOW_GSENSOR(1);

    private int value;

    VideoRotationMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoRotationMode fromId(int i) {
        for (VideoRotationMode videoRotationMode : values()) {
            if (videoRotationMode.value() == i) {
                return videoRotationMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == FOLLOW_GSENSOR ? "kVideoRotationModeFollowGSensor" : "kVideoRotationModeFollowApp";
    }

    public int value() {
        return this.value;
    }
}
