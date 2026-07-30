package com.facebook.common.memory;

import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
public enum MemoryTrimType {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackgroundLowSeverity(1.0d),
    OnSystemModerateMemory(0.5d),
    OnAppBackgrounded(1.0d),
    OnJavaMemoryRed(1.0d),
    OnJavaMemoryYellow(0.5d),
    OnSystemMemoryRed(1.0d),
    OnSystemMemoryYellow(0.5d);

    private double mSuggestedTrimRatio;

    MemoryTrimType(double d) {
        this.mSuggestedTrimRatio = d;
    }

    public static MemoryTrimType fromInt(int i) {
        for (MemoryTrimType memoryTrimType : values()) {
            if (memoryTrimType.ordinal() == i) {
                return memoryTrimType;
            }
        }
        za50.m219101a("Unknown type: ", i);
        return null;
    }

    public double getSuggestedTrimRatio() {
        return this.mSuggestedTrimRatio;
    }
}
