package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum PublishFallbackOption {
    DISABLE(0),
    SIMULCAST_SMALL_VIDEO_ONLY(1);

    private int value;

    PublishFallbackOption(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PublishFallbackOption fromId(int i) {
        for (PublishFallbackOption publishFallbackOption : values()) {
            if (publishFallbackOption.value() == i) {
                return publishFallbackOption;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
