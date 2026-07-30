package com.immomo.medialog;

/* JADX INFO: loaded from: classes7.dex */
public enum LogLevel {
    INFO(1),
    ERROR(2),
    FATAL(3);

    private int value;

    LogLevel(int i) {
        this.value = i;
    }

    public static LogLevel fromId(int i) {
        for (LogLevel logLevel : values()) {
            if (logLevel.value() == i) {
                return logLevel;
            }
        }
        return INFO;
    }

    public int value() {
        return this.value;
    }
}
