package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum ChorusCacheSyncEvent {
    CHORUS_CACHE_SYNC_EVENT_START_SUCCESS(0),
    CHORUS_CACHE_SYNC_EVENT_START_FAILED(1);

    private int value;

    ChorusCacheSyncEvent(int i) {
        this.value = i;
    }

    @CalledByNative
    public static ChorusCacheSyncEvent fromId(int i) {
        for (ChorusCacheSyncEvent chorusCacheSyncEvent : values()) {
            if (chorusCacheSyncEvent.value() == i) {
                return chorusCacheSyncEvent;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
