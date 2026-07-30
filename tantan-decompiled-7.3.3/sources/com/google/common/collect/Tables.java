package com.google.common.collect;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p153l.adj;
import p153l.k950;
import p153l.qnd0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Tables {

    /* JADX INFO: renamed from: a */
    public static final adj<? extends Map<?, ?>, ? extends Map<?, ?>> f11175a = new C2968a();

    public static final class ImmutableCell<R, C, V> extends AbstractC2969b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        public ImmutableCell(R r, C c, V v2) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v2;
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public V getValue() {
            return this.value;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements qnd0<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(qnd0<R, ? extends C, ? extends V> qnd0Var) {
            super(qnd0Var);
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2994j, p153l.v2j
        public qnd0<R, C, V> delegate() {
            return (qnd0) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(Maps.m16070E(delegate().rowMap(), Tables.m16229d()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Tables$a */
    public class C2968a implements adj<Map<Object, Object>, Map<Object, Object>> {
        @Override // p153l.adj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Tables$b */
    public static abstract class AbstractC2969b<R, C, V> implements InterfaceC3002r.a<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InterfaceC3002r.a) {
                InterfaceC3002r.a aVar = (InterfaceC3002r.a) obj;
                if (k950.m148863a(getRowKey(), aVar.getRowKey()) && k950.m148863a(getColumnKey(), aVar.getColumnKey()) && k950.m148863a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            String strValueOf = String.valueOf(getRowKey());
            String strValueOf2 = String.valueOf(getColumnKey());
            String strValueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
            sb.append("(");
            sb.append(strValueOf);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(strValueOf2);
            sb.append(")=");
            sb.append(strValueOf3);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16227b(InterfaceC3002r<?, ?, ?> interfaceC3002r, Object obj) {
        if (obj == interfaceC3002r) {
            return true;
        }
        if (obj instanceof InterfaceC3002r) {
            return interfaceC3002r.cellSet().equals(((InterfaceC3002r) obj).cellSet());
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static <R, C, V> InterfaceC3002r.a<R, C, V> m16228c(R r, C c, V v2) {
        return new ImmutableCell(r, c, v2);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> adj<Map<K, V>, Map<K, V>> m16229d() {
        return (adj<Map<K, V>, Map<K, V>>) f11175a;
    }

    public static class UnmodifiableTable<R, C, V> extends AbstractC2994j<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final InterfaceC3002r<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
            this.delegate = (InterfaceC3002r) xn80.m212111p(interfaceC3002r);
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Set<InterfaceC3002r.a<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Map<R, V> column(C c) {
            return Collections.unmodifiableMap(super.column(c));
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.m16069D(super.columnMap(), Tables.m16229d()));
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public V put(R r, C c, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public void putAll(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public V remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Map<C, V> row(R r) {
            return Collections.unmodifiableMap(super.row(r));
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.m16069D(super.rowMap(), Tables.m16229d()));
        }

        @Override // com.google.common.collect.AbstractC2994j, com.google.common.collect.InterfaceC3002r
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // com.google.common.collect.AbstractC2994j, p153l.v2j
        public InterfaceC3002r<R, C, V> delegate() {
            return this.delegate;
        }
    }
}
