package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum UserVisibilityChangeError {
    OK(0),
    UNKNOWN(1),
    TOO_MANY_VISIBLE_USER(2);

    private int value;

    UserVisibilityChangeError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static UserVisibilityChangeError fromId(int i) {
        for (UserVisibilityChangeError userVisibilityChangeError : values()) {
            if (userVisibilityChangeError.value() == i) {
                return userVisibilityChangeError;
            }
        }
        return UNKNOWN;
    }

    public int value() {
        return this.value;
    }
}
