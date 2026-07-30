package com.google.common.collect;

import java.util.Map;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    public SingletonImmutableTable(R r, C c, V v2) {
        this.singleRowKey = (R) xn80.m212111p(r);
        this.singleColumnKey = (C) xn80.m212111p(c);
        this.singleValue = (V) xn80.m212111p(v2);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public ImmutableMap<R, V> column(C c) {
        xn80.m212111p(c);
        return containsColumn(c) ? ImmutableMap.m15770of(this.singleRowKey, (Object) this.singleValue) : ImmutableMap.m15769of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.m15770of(this.singleColumnKey, ImmutableMap.m15770of(this.singleRowKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2989e
    public ImmutableSet<InterfaceC3002r.a<R, C, V>> createCellSet() {
        return ImmutableSet.m15823of(ImmutableTable.cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2989e
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.m15823of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.m15770of(this.singleRowKey, ImmutableMap.m15770of(this.singleColumnKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public int size() {
        return 1;
    }

    public SingletonImmutableTable(InterfaceC3002r.a<R, C, V> aVar) {
        this(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
    }
}
