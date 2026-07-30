package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum SnapshotErrorCode {
    OK(0),
    CREATE_FAIL(-1),
    STREAM_INVALID(-2),
    TIMEOUT(-3),
    FILE_SAVE_ERROR(-4);

    private int value;

    SnapshotErrorCode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SnapshotErrorCode fromId(int i) {
        for (SnapshotErrorCode snapshotErrorCode : values()) {
            if (snapshotErrorCode.value() == i) {
                return snapshotErrorCode;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
