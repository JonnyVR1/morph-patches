package com.squareup.wire;

import p153l.mnd0;

/* JADX INFO: loaded from: classes11.dex */
final class Preconditions {
    private Preconditions() {
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        mnd0.m159157a(str);
    }
}
