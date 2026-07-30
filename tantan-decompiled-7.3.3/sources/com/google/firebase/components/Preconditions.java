package com.google.firebase.components;

import p153l.mnd0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        wg3.m206174a(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        wtq0.m207906a(str);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
