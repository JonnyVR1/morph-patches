package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoSuperResolutionMode {
    VIDEO_SUPER_RESOLUTION_MODE_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_ON(1);

    private int value;

    VideoSuperResolutionMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoSuperResolutionMode fromId(int i) {
        for (VideoSuperResolutionMode videoSuperResolutionMode : values()) {
            if (videoSuperResolutionMode.value() == i) {
                return videoSuperResolutionMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            return i != 1 ? "" : "kVideoSuperResolutionModeOn";
        }
        return "kVideoSuperResolutionModeOff";
    }

    public int value() {
        return this.value;
    }
}
