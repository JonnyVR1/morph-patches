package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoDeviceFacing {
    FRONT(0),
    BACK(1),
    UNKNOWN(2);

    private int value;

    VideoDeviceFacing(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoDeviceFacing fromId(int i) {
        for (VideoDeviceFacing videoDeviceFacing : values()) {
            if (videoDeviceFacing.value() == i) {
                return videoDeviceFacing;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
