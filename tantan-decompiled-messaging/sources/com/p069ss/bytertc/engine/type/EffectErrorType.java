package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum EffectErrorType {
    OK(0),
    EFFECT_ERROR_VIRTUAL_BACKFROUND_FAILURE(1),
    EFFECT_ERROR_CHILD_PROC_TERMINATE(2);

    private int value;

    EffectErrorType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static EffectErrorType fromId(int i) {
        for (EffectErrorType effectErrorType : values()) {
            if (effectErrorType.value() == i) {
                return effectErrorType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
