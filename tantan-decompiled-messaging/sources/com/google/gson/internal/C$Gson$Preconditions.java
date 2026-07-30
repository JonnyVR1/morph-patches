package com.google.gson.internal;

import p149l.x9g0;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
