package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum SubscribeFallbackOptions {
    SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
    SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
    SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);

    private int value;

    SubscribeFallbackOptions(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SubscribeFallbackOptions fromId(int i) {
        for (SubscribeFallbackOptions subscribeFallbackOptions : values()) {
            if (subscribeFallbackOptions.value() == i) {
                return subscribeFallbackOptions;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
