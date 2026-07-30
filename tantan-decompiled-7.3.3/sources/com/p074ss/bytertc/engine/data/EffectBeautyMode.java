package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum EffectBeautyMode {
    WHITE(0),
    SMOOTH(1),
    SHARPEN(2),
    CLEAR(3);

    private int value;

    EffectBeautyMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static EffectBeautyMode fromId(int i) {
        for (EffectBeautyMode effectBeautyMode : values()) {
            if (effectBeautyMode.value() == i) {
                return effectBeautyMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == WHITE) {
            return "kEffectBeautyWhiteMode";
        }
        if (this == SMOOTH) {
            return "kEffectBeautySmoothMode";
        }
        if (this == SHARPEN) {
            return "kEffectBeautySharpenMode";
        }
        return this == CLEAR ? "kEffectBeautyClearMode" : "";
    }

    public int value() {
        return this.value;
    }
}
