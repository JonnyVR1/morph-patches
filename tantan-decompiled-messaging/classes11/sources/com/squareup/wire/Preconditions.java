package com.squareup.wire;

import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
final class Preconditions {
    private Preconditions() {
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jfd0.a(str);
    }
}
