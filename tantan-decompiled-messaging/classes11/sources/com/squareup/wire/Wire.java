package com.squareup.wire;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class Wire {
    private Wire() {
    }

    public static <T> T get(T t, T t2) {
        return t != null ? t : t2;
    }
}
