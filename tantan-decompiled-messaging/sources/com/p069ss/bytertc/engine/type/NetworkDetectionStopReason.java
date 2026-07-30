package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum NetworkDetectionStopReason {
    USER(0),
    TIMEOUT(1),
    CONNECTION_LOST(2),
    STREAMING(3),
    INNER_ERR(4);

    int value;

    NetworkDetectionStopReason(int i) {
        this.value = i;
    }

    public static NetworkDetectionStopReason fromId(int i) {
        for (NetworkDetectionStopReason networkDetectionStopReason : values()) {
            if (networkDetectionStopReason.value() == i) {
                return networkDetectionStopReason;
            }
        }
        return USER;
    }

    public int value() {
        return this.value;
    }
}
