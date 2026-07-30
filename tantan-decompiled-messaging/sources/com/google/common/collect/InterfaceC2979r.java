package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.r */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2979r<R, C, V> {

    /* JADX INFO: renamed from: com.google.common.collect.r$a */
    public interface a<R, C, V> {
        C getColumnKey();

        R getRowKey();

        V getValue();
    }

    Set<a<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(C c);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(Object obj, Object obj2);

    boolean containsColumn(Object obj);

    boolean containsRow(Object obj);

    boolean containsValue(Object obj);

    boolean equals(Object obj);

    V get(Object obj, Object obj2);

    int hashCode();

    boolean isEmpty();

    V put(R r, C c, V v2);

    void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r);

    V remove(Object obj, Object obj2);

    Map<C, V> row(R r);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
