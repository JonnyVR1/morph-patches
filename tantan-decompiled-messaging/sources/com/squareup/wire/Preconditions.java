package com.squareup.wire;

import p149l.jfd0;

/* JADX INFO: loaded from: classes11.dex */
final class Preconditions {
    private Preconditions() {
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jfd0.m141176a(str);
    }
}
