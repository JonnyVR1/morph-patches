package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class NetworkTimeInfo {
    public long timestamp;

    @CalledByNative
    public static NetworkTimeInfo create() {
        return new NetworkTimeInfo();
    }

    @CalledByNative
    public void nativeSetTimestamp(long j) {
        this.timestamp = j;
    }
}
