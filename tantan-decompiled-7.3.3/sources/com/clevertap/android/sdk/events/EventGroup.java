package com.clevertap.android.sdk.events;

/* JADX INFO: loaded from: classes.dex */
public enum EventGroup {
    REGULAR("", ""),
    PUSH_NOTIFICATION_VIEWED("-spiky", ""),
    VARIABLES("", "/defineVars");

    public final String additionalPath;
    public final String httpResource;

    EventGroup(String str, String str2) {
        this.httpResource = str;
        this.additionalPath = str2;
    }
}
