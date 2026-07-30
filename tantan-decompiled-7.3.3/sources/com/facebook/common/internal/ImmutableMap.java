package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMap<K, V> extends HashMap<K, V> {
    private ImmutableMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return new ImmutableMap<>(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8207of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7) {
        HashMap map = new HashMap(6);
        map.put(k, v2);
        map.put(k2, v3);
        map.put(k3, v4);
        map.put(k4, v5);
        map.put(k5, v6);
        map.put(k6, v7);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8202of(K k, V v2) {
        HashMap map = new HashMap(1);
        map.put(k, v2);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8203of(K k, V v2, K k2, V v3) {
        HashMap map = new HashMap(2);
        map.put(k, v2);
        map.put(k2, v3);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8204of(K k, V v2, K k2, V v3, K k3, V v4) {
        HashMap map = new HashMap(3);
        map.put(k, v2);
        map.put(k2, v3);
        map.put(k3, v4);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8205of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        HashMap map = new HashMap(4);
        map.put(k, v2);
        map.put(k2, v3);
        map.put(k3, v4);
        map.put(k4, v5);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8206of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        HashMap map = new HashMap(5);
        map.put(k, v2);
        map.put(k2, v3);
        map.put(k3, v4);
        map.put(k4, v5);
        map.put(k5, v6);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8201of() {
        return Collections.unmodifiableMap(new HashMap());
    }
}
