package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p149l.a0j;

/* JADX INFO: renamed from: com.google.common.collect.j */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2971j<R, C, V> extends a0j implements InterfaceC2979r<R, C, V> {
    public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    public void clear() {
        delegate().clear();
    }

    public Map<R, V> column(C c) {
        return delegate().column(c);
    }

    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean contains(Object obj, Object obj2) {
        return delegate().contains(obj, obj2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsColumn(Object obj) {
        return delegate().containsColumn(obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsRow(Object obj) {
        return delegate().containsRow(obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // p149l.a0j
    public abstract InterfaceC2979r<R, C, V> delegate();

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public V get(Object obj, Object obj2) {
        return delegate().get(obj, obj2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public V put(R r, C c, V v2) {
        return delegate().put(r, c, v2);
    }

    public void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        delegate().putAll(interfaceC2979r);
    }

    public V remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Map<C, V> row(R r) {
        return delegate().row(r);
    }

    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
