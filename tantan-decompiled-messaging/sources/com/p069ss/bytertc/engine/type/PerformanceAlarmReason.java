package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum PerformanceAlarmReason {
    BANDWIDTH_FALLBACKED(0),
    BANDWIDTH_RESUMED(1),
    PERFORMANCE_FALLBACKED(2),
    PERFORMANCE_RESUMED(3);

    private int value;

    PerformanceAlarmReason(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
