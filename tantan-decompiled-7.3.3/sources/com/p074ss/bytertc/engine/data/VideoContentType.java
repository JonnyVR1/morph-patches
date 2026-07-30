package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoContentType {
    NORMAL_FRAME(0),
    BLACK_FRAME(1);

    private int value;

    VideoContentType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoContentType fromId(int i) {
        for (VideoContentType videoContentType : values()) {
            if (videoContentType.value() == i) {
                return videoContentType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == NORMAL_FRAME ? "kVideoContentTypeNormalFrame" : "kVideoContentTypeBlackFrame";
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
