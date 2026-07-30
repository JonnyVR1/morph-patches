package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoDenoiseMode {
    VIDEO_DENOISE_MODE_OFF(0),
    VIDEO_DENOISE_MODE_AUTO(1);

    private int value;

    VideoDenoiseMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoDenoiseMode fromId(int i) {
        for (VideoDenoiseMode videoDenoiseMode : values()) {
            if (videoDenoiseMode.value() == i) {
                return videoDenoiseMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            return i != 1 ? "" : "kVideoDenoiseModeAuto";
        }
        return "kVideoDenoiseModeOff";
    }

    public int value() {
        return this.value;
    }
}
