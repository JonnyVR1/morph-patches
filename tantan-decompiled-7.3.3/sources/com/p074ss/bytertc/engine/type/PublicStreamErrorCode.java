package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum PublicStreamErrorCode {
    ERROR_CODE_SUCCESS(0),
    ERROR_CODE_PUSH_PARAM_ERROR(1191),
    ERROR_CODE_PUSH_STATE_ERROR(1192),
    ERROR_CODE_PUSH_INTERNAL_ERROR(1193),
    ERROR_CODE_PUSH_ERROR(1195),
    ERROR_CODE_PUSH_TIMEOUT(1196),
    ERROR_CODE_PULL_NO_PUSH_STREAM(1300);

    private final int value;

    PublicStreamErrorCode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PublicStreamErrorCode fromId(int i) {
        for (PublicStreamErrorCode publicStreamErrorCode : values()) {
            if (publicStreamErrorCode.value() == i) {
                return publicStreamErrorCode;
            }
        }
        return ERROR_CODE_SUCCESS;
    }

    public int value() {
        return this.value;
    }
}
