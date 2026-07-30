package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum ChorusCacheSyncMode {
    CHORUS_CACHE_SYNC_MODE_PRODUCER(0),
    CHORUS_CACHE_SYNC_MODE_RETRANSMITTER(1),
    CHORUS_CACHE_SYNC_MODE_CONSUMER(2);

    private int value;

    ChorusCacheSyncMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static ChorusCacheSyncMode fromId(int i) {
        for (ChorusCacheSyncMode chorusCacheSyncMode : values()) {
            if (chorusCacheSyncMode.value() == i) {
                return chorusCacheSyncMode;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
