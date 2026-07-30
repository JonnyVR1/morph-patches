package com.google.gson.internal;

import p153l.fig0;

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
        fig0.m125680a();
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
