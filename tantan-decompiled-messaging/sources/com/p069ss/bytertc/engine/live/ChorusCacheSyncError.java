package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum ChorusCacheSyncError {
    CHORUS_CACHE_SYNC_ERROR_OK(0),
    CHORUS_CACHE_SYNC_ERROR_WRONG_STATE(1),
    CHORUS_CACHE_SYNC_ERROR_ALREADY_RUNNING(2);

    private int value;

    ChorusCacheSyncError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static ChorusCacheSyncError fromId(int i) {
        for (ChorusCacheSyncError chorusCacheSyncError : values()) {
            if (chorusCacheSyncError.value() == i) {
                return chorusCacheSyncError;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
