package com.google.common.cache;

import java.util.AbstractMap;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(K k, V v2, RemovalCause removalCause) {
        super(k, v2);
        this.cause = (RemovalCause) xn80.m212111p(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> create(K k, V v2, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v2, removalCause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
