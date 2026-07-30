package com.google.common.collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p153l.gyj0;

/* JADX INFO: loaded from: classes7.dex */
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    static final ImmutableTable<Object, Object, Object> EMPTY = new SparseImmutableTable(ImmutableList.m15739of(), ImmutableSet.m15822of(), ImmutableSet.m15822of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList<InterfaceC3002r.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapM16090k = Maps.m16090k(immutableSet);
        LinkedHashMap linkedHashMapM16098s = Maps.m16098s();
        gyj0<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapM16098s.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapM16098s2 = Maps.m16098s();
        gyj0<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapM16098s2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            InterfaceC3002r.a<R, C, V> aVar = immutableList.get(i);
            R rowKey = aVar.getRowKey();
            C columnKey = aVar.getColumnKey();
            V value = aVar.getValue();
            Integer num = (Integer) immutableMapM16090k.get(rowKey);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapM16098s.get(rowKey);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            checkNoDuplicate(rowKey, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapM16098s2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        ImmutableMap.C2809b c2809b = new ImmutableMap.C2809b(linkedHashMapM16098s.size());
        for (Map.Entry entry : linkedHashMapM16098s.entrySet()) {
            c2809b.mo15715g(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.rowMap = c2809b.mo15714d();
        ImmutableMap.C2809b c2809b2 = new ImmutableMap.C2809b(linkedHashMapM16098s2.size());
        for (Map.Entry entry2 : linkedHashMapM16098s2.entrySet()) {
            c2809b2.mo15715g(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.columnMap = c2809b2.mo15714d();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        ImmutableMap immutableMapM16090k = Maps.m16090k(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        gyj0<InterfaceC3002r.a<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapM16090k.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public InterfaceC3002r.a<R, C, V> getCell(int i) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[i]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.cellColumnInRowIndices[i]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int i) {
        ImmutableMap<C, V> immutableMap = this.rowMap.values().asList().get(this.cellRowIndices[i]);
        return immutableMap.values().asList().get(this.cellColumnInRowIndices[i]);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.rowMap);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC3002r
    public int size() {
        return this.cellRowIndices.length;
    }
}
