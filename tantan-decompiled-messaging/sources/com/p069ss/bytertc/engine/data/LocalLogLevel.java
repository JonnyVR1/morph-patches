package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum LocalLogLevel {
    INFO(0),
    WARNING(1),
    ERROR(2),
    NONE(3);

    private int value;

    LocalLogLevel(int i) {
        this.value = i;
    }

    public static LocalLogLevel fromId(int i) {
        for (LocalLogLevel localLogLevel : values()) {
            if (localLogLevel.getValue() == i) {
                return localLogLevel;
            }
        }
        return WARNING;
    }

    public int getValue() {
        return this.value;
    }
}
