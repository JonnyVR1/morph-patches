package com.google.firebase.components;

import p149l.ig3;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        ig3.m135964a(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(str);
        return null;
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        qkq0.m175383a(str);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
