package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum EarMonitorMode {
    EAR_MONITOR_MODE_OFF(0),
    EAR_MONITOR_MODE_ON(1);

    private int value;

    EarMonitorMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static EarMonitorMode fromId(int i) {
        for (EarMonitorMode earMonitorMode : values()) {
            if (earMonitorMode.value() == i) {
                return earMonitorMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == EAR_MONITOR_MODE_ON ? "kEarMonitorModeOn" : "kEarMonitorModeOff";
    }

    public int value() {
        return this.value;
    }
}
