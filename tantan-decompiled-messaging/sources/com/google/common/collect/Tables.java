package com.google.common.collect;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p149l.gaj;
import p149l.nfd0;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class Tables {

    /* JADX INFO: renamed from: a */
    public static final gaj<? extends Map<?, ?>, ? extends Map<?, ?>> f11138a = new C2945a();

    public static final class ImmutableCell<R, C, V> extends AbstractC2946b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        public ImmutableCell(R r, C c, V v2) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v2;
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public V getValue() {
            return this.value;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements nfd0<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(nfd0<R, ? extends C, ? extends V> nfd0Var) {
            super(nfd0Var);
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2971j, p149l.a0j
        public nfd0<R, C, V> delegate() {
            return (nfd0) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(Maps.m16016E(delegate().rowMap(), Tables.m16175d()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Tables$a */
    public class C2945a implements gaj<Map<Object, Object>, Map<Object, Object>> {
        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Tables$b */
    public static abstract class AbstractC2946b<R, C, V> implements InterfaceC2979r.a<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InterfaceC2979r.a) {
                InterfaceC2979r.a aVar = (InterfaceC2979r.a) obj;
                if (v050.m196470a(getRowKey(), aVar.getRowKey()) && v050.m196470a(getColumnKey(), aVar.getColumnKey()) && v050.m196470a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(getRowKey(), getColumnKey(), getValue());
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
    public static boolean m16173b(InterfaceC2979r<?, ?, ?> interfaceC2979r, Object obj) {
        if (obj == interfaceC2979r) {
            return true;
        }
        if (obj instanceof InterfaceC2979r) {
            return interfaceC2979r.cellSet().equals(((InterfaceC2979r) obj).cellSet());
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static <R, C, V> InterfaceC2979r.a<R, C, V> m16174c(R r, C c, V v2) {
        return new ImmutableCell(r, c, v2);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> gaj<Map<K, V>, Map<K, V>> m16175d() {
        return (gaj<Map<K, V>, Map<K, V>>) f11138a;
    }

    public static class UnmodifiableTable<R, C, V> extends AbstractC2971j<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final InterfaceC2979r<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
            this.delegate = (InterfaceC2979r) sf80.m183894p(interfaceC2979r);
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Map<R, V> column(C c) {
            return Collections.unmodifiableMap(super.column(c));
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.m16015D(super.columnMap(), Tables.m16175d()));
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public V put(R r, C c, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public V remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Map<C, V> row(R r) {
            return Collections.unmodifiableMap(super.row(r));
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.m16015D(super.rowMap(), Tables.m16175d()));
        }

        @Override // com.google.common.collect.AbstractC2971j, com.google.common.collect.InterfaceC2979r
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // com.google.common.collect.AbstractC2971j, p149l.a0j
        public InterfaceC2979r<R, C, V> delegate() {
            return this.delegate;
        }
    }
}
