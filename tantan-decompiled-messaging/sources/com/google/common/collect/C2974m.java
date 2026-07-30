package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: loaded from: classes7.dex */
public final class C2974m {
    /* JADX INFO: renamed from: a */
    public static <T> T[] m16295a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m16296b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> Map<K, V> m16297c(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: d */
    public static <E> Set<E> m16298d(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> Map<K, V> m16299e(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: f */
    public static <E> Set<E> m16300f(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Set<E> m16301g() {
        return CompactHashSet.create();
    }

    /* JADX INFO: renamed from: h */
    public static <K, V> Map<K, V> m16302h() {
        return CompactHashMap.create();
    }

    /* JADX INFO: renamed from: i */
    public static MapMaker m16303i(MapMaker mapMaker) {
        return mapMaker.m15948l();
    }
}
