package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public enum RXVideoMemoryType {
    kUNKNOWN(0),
    kBYTE_MEMORY(1),
    kOPENGL_TEXTURE(3);

    private int value;

    RXVideoMemoryType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RXVideoMemoryType fromId(int i) {
        for (RXVideoMemoryType rXVideoMemoryType : values()) {
            if (rXVideoMemoryType.value() == i) {
                return rXVideoMemoryType;
            }
        }
        return null;
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
