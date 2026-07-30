package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamSyncStrategy {
    MIXED_STREAM_SYNC_STRATEGY_NO_SYNC(0),
    MIXED_STREAM_SYNC_STRATEGY_AUDIO_PRECISE_SYNC(1),
    MIXED_STREAM_SYNC_STRATEGY_SIMPLEX_MODE_SYNC(2);

    private int syncStrategy;

    MixedStreamSyncStrategy(int i) {
        this.syncStrategy = i;
    }

    public int getValue() {
        return this.syncStrategy;
    }
}
