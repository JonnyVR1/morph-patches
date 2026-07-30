package com.google.common.collect;

import java.util.Map;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    public SingletonImmutableTable(R r, C c, V v2) {
        this.singleRowKey = (R) sf80.m183894p(r);
        this.singleColumnKey = (C) sf80.m183894p(c);
        this.singleValue = (V) sf80.m183894p(v2);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<R, V> column(C c) {
        sf80.m183894p(c);
        return containsColumn(c) ? ImmutableMap.m15716of(this.singleRowKey, (Object) this.singleValue) : ImmutableMap.m15715of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.m15716of(this.singleColumnKey, ImmutableMap.m15716of(this.singleRowKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2966e
    public ImmutableSet<InterfaceC2979r.a<R, C, V>> createCellSet() {
        return ImmutableSet.m15769of(ImmutableTable.cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2966e
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.m15769of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.m15716of(this.singleRowKey, ImmutableMap.m15716of(this.singleColumnKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public int size() {
        return 1;
    }

    public SingletonImmutableTable(InterfaceC2979r.a<R, C, V> aVar) {
        this(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
    }
}
