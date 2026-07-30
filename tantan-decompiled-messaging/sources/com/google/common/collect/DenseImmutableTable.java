package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import p149l.dpj0;

/* JADX INFO: loaded from: classes7.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    public final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;

        public Column(int i) {
            super(DenseImmutableTable.this.columnCounts[i]);
            this.columnIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i) {
            return (V) DenseImmutableTable.this.values[i][this.columnIndex];
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        private ColumnMap() {
            super(DenseImmutableTable.this.columnCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, V> getValue(int i) {
            return new Column(i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        /* JADX INFO: renamed from: com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$a */
        public class C2760a extends AbstractIterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: c */
            public int f10855c = -1;

            /* JADX INFO: renamed from: d */
            public final int f10856d;

            public C2760a() {
                this.f10856d = ImmutableArrayMap.this.keyToIndex().size();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> mo15565a() {
                int i = this.f10855c;
                while (true) {
                    this.f10855c = i + 1;
                    int i2 = this.f10855c;
                    if (i2 >= this.f10856d) {
                        return m15566b();
                    }
                    Object value = ImmutableArrayMap.this.getValue(i2);
                    if (value != null) {
                        return Maps.m16035j(ImmutableArrayMap.this.getKey(this.f10855c), value);
                    }
                    i = this.f10855c;
                }
            }
        }

        public ImmutableArrayMap(int i) {
            this.size = i;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public dpj0<Map.Entry<K, V>> entryIterator() {
            return new C2760a();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(Object obj) {
            Integer num = keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        public K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        public abstract V getValue(int i);

        public abstract ImmutableMap<K, Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
            return this.size;
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;

        public Row(int i) {
            super(DenseImmutableTable.this.rowCounts[i]);
            this.rowIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i) {
            return (V) DenseImmutableTable.this.values[this.rowIndex][i];
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        private RowMap() {
            super(DenseImmutableTable.this.rowCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, V> getValue(int i) {
            return new Row(i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    public DenseImmutableTable(ImmutableList<InterfaceC2979r.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.values = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapM16036k = Maps.m16036k(immutableSet);
        this.rowKeyToIndex = immutableMapM16036k;
        ImmutableMap<C, Integer> immutableMapM16036k2 = Maps.m16036k(immutableSet2);
        this.columnKeyToIndex = immutableMapM16036k2;
        this.rowCounts = new int[immutableMapM16036k.size()];
        this.columnCounts = new int[immutableMapM16036k2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            InterfaceC2979r.a<R, C, V> aVar = immutableList.get(i);
            R rowKey = aVar.getRowKey();
            C columnKey = aVar.getColumnKey();
            Integer num = this.rowKeyToIndex.get(rowKey);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.columnKeyToIndex.get(columnKey);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[iIntValue][iIntValue2], aVar.getValue());
            this.values[iIntValue][iIntValue2] = aVar.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.columnCounts;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new RowMap();
        this.columnMap = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public InterfaceC2979r.a<R, C, V> getCell(int i) {
        int i2 = this.cellRowIndices[i];
        int i3 = this.cellColumnIndices[i];
        R r = rowKeySet().asList().get(i2);
        C c = columnKeySet().asList().get(i3);
        V v2 = this.values[i2][i3];
        Objects.requireNonNull(v2);
        return ImmutableTable.cellOf(r, c, v2);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int i) {
        V v2 = this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]];
        Objects.requireNonNull(v2);
        return v2;
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
