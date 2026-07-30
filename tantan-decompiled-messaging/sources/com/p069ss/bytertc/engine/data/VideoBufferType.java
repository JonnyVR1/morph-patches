package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoBufferType {
    RAW_MEMORY(0),
    GL_TEXTURE(2);

    private int value;

    VideoBufferType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoBufferType fromId(int i) {
        for (VideoBufferType videoBufferType : values()) {
            if (videoBufferType.value() == i) {
                return videoBufferType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == RAW_MEMORY ? "kVideoBufferTypeRawMemory" : "kVideoBufferTypeGLTexture";
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
