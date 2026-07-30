package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioFrameType {
    FRAME_TYPE_PCM16(0);

    private int value;

    AudioFrameType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioFrameType fromId(int i) {
        for (AudioFrameType audioFrameType : values()) {
            if (audioFrameType.value() == i) {
                return audioFrameType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == FRAME_TYPE_PCM16 ? "kFrameTypePCM16" : "kFrameTypeUnknown";
    }

    public int value() {
        return this.value;
    }
}
