package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p153l.b7h0;
import p153l.qnd0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements qnd0<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.StandardRowSortedTable$b */
    public class C2953b extends StandardTable<R, C, V>.C2961h implements SortedMap<R, Map<C, V>> {
        public C2953b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15631g() {
            return new Maps.C2903o(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15632h() {
            return (SortedSet) super.mo15632h();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            xn80.m212111p(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(r), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            xn80.m212111p(r);
            xn80.m212111p(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            xn80.m212111p(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(r), StandardRowSortedTable.this.factory).rowMap();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, b7h0<? extends Map<C, V>> b7h0Var) {
        super(sortedMap, b7h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C2953b();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
