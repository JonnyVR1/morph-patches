package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: loaded from: classes7.dex */
public final class C2997m {
    /* JADX INFO: renamed from: a */
    public static <T> T[] m16349a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m16350b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> Map<K, V> m16351c(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: d */
    public static <E> Set<E> m16352d(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> Map<K, V> m16353e(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: f */
    public static <E> Set<E> m16354f(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Set<E> m16355g() {
        return CompactHashSet.create();
    }

    /* JADX INFO: renamed from: h */
    public static <K, V> Map<K, V> m16356h() {
        return CompactHashMap.create();
    }

    /* JADX INFO: renamed from: i */
    public static MapMaker m16357i(MapMaker mapMaker) {
        return mapMaker.m16002l();
    }
}
