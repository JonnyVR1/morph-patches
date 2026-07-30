package com.apm.lite;

/* JADX INFO: loaded from: classes.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ANR("anr"),
    ENSURE("ensure"),
    DART("dart"),
    OOM("oom"),
    ALL("all");

    private String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
