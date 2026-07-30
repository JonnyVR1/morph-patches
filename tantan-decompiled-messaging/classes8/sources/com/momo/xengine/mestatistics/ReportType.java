package com.momo.xengine.mestatistics;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum ReportType {
    COUNT(1),
    DURATION(2);

    private final int value;

    ReportType(int i) {
        this.value = i;
    }

    public static ReportType valueOf(int i) {
        if (i == 1) {
            return COUNT;
        }
        if (i != 2) {
            return null;
        }
        return DURATION;
    }

    public int getValue() {
        return this.value;
    }
}
