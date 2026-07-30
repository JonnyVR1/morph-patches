package com.google.common.collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p149l.dpj0;

/* JADX INFO: loaded from: classes7.dex */
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    static final ImmutableTable<Object, Object, Object> EMPTY = new SparseImmutableTable(ImmutableList.m15685of(), ImmutableSet.m15768of(), ImmutableSet.m15768of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList<InterfaceC2979r.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapM16036k = Maps.m16036k(immutableSet);
        LinkedHashMap linkedHashMapM16044s = Maps.m16044s();
        dpj0<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapM16044s.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapM16044s2 = Maps.m16044s();
        dpj0<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapM16044s2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            InterfaceC2979r.a<R, C, V> aVar = immutableList.get(i);
            R rowKey = aVar.getRowKey();
            C columnKey = aVar.getColumnKey();
            V value = aVar.getValue();
            Integer num = (Integer) immutableMapM16036k.get(rowKey);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapM16044s.get(rowKey);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            checkNoDuplicate(rowKey, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapM16044s2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        ImmutableMap.C2786b c2786b = new ImmutableMap.C2786b(linkedHashMapM16044s.size());
        for (Map.Entry entry : linkedHashMapM16044s.entrySet()) {
            c2786b.mo15661g(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.rowMap = c2786b.mo15660d();
        ImmutableMap.C2786b c2786b2 = new ImmutableMap.C2786b(linkedHashMapM16044s2.size());
        for (Map.Entry entry2 : linkedHashMapM16044s2.entrySet()) {
            c2786b2.mo15661g(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.columnMap = c2786b2.mo15660d();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        ImmutableMap immutableMapM16036k = Maps.m16036k(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        dpj0<InterfaceC2979r.a<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapM16036k.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public InterfaceC2979r.a<R, C, V> getCell(int i) {
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

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.rowMap);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public int size() {
        return this.cellRowIndices.length;
    }
}
