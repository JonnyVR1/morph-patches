package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioRenderType {
    AUDIO_RENDER_TYPE_EXTERNAL(0),
    AUDIO_RENDER_TYPE_INTERNAL(1);

    private int value;

    AudioRenderType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioRenderType fromId(int i) {
        for (AudioRenderType audioRenderType : values()) {
            if (audioRenderType.value() == i) {
                return audioRenderType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == AUDIO_RENDER_TYPE_EXTERNAL ? "AUDIO_RENDER_TYPE_EXTERNAL" : "AUDIO_RENDER_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }
}
