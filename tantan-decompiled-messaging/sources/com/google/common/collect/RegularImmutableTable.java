package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<InterfaceC2979r.a<R, C, V>> {
        private CellSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2979r.a) {
                InterfaceC2979r.a aVar = (InterfaceC2979r.a) obj;
                Object obj2 = RegularImmutableTable.this.get(aVar.getRowKey(), aVar.getColumnKey());
                if (obj2 != null && obj2.equals(aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public InterfaceC2979r.a<R, C, V> get(int i) {
            return RegularImmutableTable.this.getCell(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    public final class Values extends ImmutableList<V> {
        private Values() {
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) RegularImmutableTable.this.getValue(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m16115a(Comparator comparator, Comparator comparator2, InterfaceC2979r.a aVar, InterfaceC2979r.a aVar2) {
        int iCompare = comparator == null ? 0 : comparator.compare(aVar.getRowKey(), aVar2.getRowKey());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.getColumnKey(), aVar2.getColumnKey());
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(List<InterfaceC2979r.a<R, C, V>> list, final Comparator<? super R> comparator, final Comparator<? super C> comparator2) {
        sf80.m183894p(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: com.google.common.collect.n
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return RegularImmutableTable.m16115a(comparator, comparator2, (InterfaceC2979r.a) obj, (InterfaceC2979r.a) obj2);
                }
            });
        }
        return forCellsInternal(list, comparator, comparator2);
    }

    private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(Iterable<InterfaceC2979r.a<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        for (InterfaceC2979r.a<R, C, V> aVar : iterable) {
            linkedHashSet.add(aVar.getRowKey());
            linkedHashSet2.add(aVar.getColumnKey());
        }
        return forOrderedComponents(immutableListCopyOf, comparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf((Collection) linkedHashSet2) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(ImmutableList<InterfaceC2979r.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    public final void checkNoDuplicate(R r, C c, V v2, V v3) {
        sf80.m183891m(v2 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v3, v2);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2966e
    public final ImmutableSet<InterfaceC2979r.a<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.m15768of() : new CellSet();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractC2966e
    public final ImmutableCollection<V> createValues() {
        return isEmpty() ? ImmutableList.m15685of() : new Values();
    }

    public abstract InterfaceC2979r.a<R, C, V> getCell(int i);

    public abstract V getValue(int i);

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.InterfaceC2979r
    public abstract /* synthetic */ int size();

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(Iterable<InterfaceC2979r.a<R, C, V>> iterable) {
        return forCellsInternal(iterable, null, null);
    }
}
