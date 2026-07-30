package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum StreamPriority {
    STREAM_PRIORITY_LOW(0),
    STREAM_PRIORITY_MEDIAM(1),
    STREAM_PRIORITY_HIGH(2);

    private int value;

    StreamPriority(int i) {
        this.value = i;
    }

    @CalledByNative
    public static StreamPriority fromId(int i) {
        for (StreamPriority streamPriority : values()) {
            if (streamPriority.value() == i) {
                return streamPriority;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
