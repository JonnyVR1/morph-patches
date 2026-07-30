package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoDeviceType {
    VIDEO_DEVICE_TYPE_UNKNOWN(-1),
    VIDEO_DEVICE_TYPE_RENDER_DEVICE(0),
    VIDEO_DEVICE_TYPE_CAPTURE_DEVICE(1),
    VIDEO_DEVICE_TYPE_SCREEN_CAPTURE_DEVICE(2);

    private final int value;

    VideoDeviceType() {
        this.value = 0;
    }

    @CalledByNative
    public static VideoDeviceType fromId(int i) {
        for (VideoDeviceType videoDeviceType : values()) {
            if (videoDeviceType.value() == i) {
                return videoDeviceType;
            }
        }
        return VIDEO_DEVICE_TYPE_UNKNOWN;
    }

    public int value() {
        return this.value;
    }

    VideoDeviceType(int i) {
        this.value = i;
    }
}
