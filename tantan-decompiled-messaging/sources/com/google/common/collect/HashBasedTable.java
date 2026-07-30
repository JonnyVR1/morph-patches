package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p149l.sd5;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements tyg0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        public Factory(int i) {
            this.expectedSize = i;
        }

        @Override // p149l.tyg0
        public Map<C, V> get() {
            return Maps.m16045t(this.expectedSize);
        }
    }

    public HashBasedTable(Map<R, Map<C, V>> map, Factory<C, V> factory) {
        super(map, factory);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        sd5.m183444b(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(Maps.m16045t(i), new Factory(i2));
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ void putAll(InterfaceC2979r interfaceC2979r) {
        super.putAll(interfaceC2979r);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2966e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new Factory(0));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        HashBasedTable<R, C, V> hashBasedTableCreate = create();
        hashBasedTableCreate.putAll(interfaceC2979r);
        return hashBasedTableCreate;
    }
}
