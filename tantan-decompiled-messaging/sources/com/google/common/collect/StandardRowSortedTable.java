package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p149l.nfd0;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements nfd0<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.StandardRowSortedTable$b */
    public class C2930b extends StandardTable<R, C, V>.C2938h implements SortedMap<R, Map<C, V>> {
        public C2930b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15577g() {
            return new Maps.C2880o(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15578h() {
            return (SortedSet) super.mo15578h();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            sf80.m183894p(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(r), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            sf80.m183894p(r);
            sf80.m183894p(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            sf80.m183894p(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(r), StandardRowSortedTable.this.factory).rowMap();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, tyg0<? extends Map<C, V>> tyg0Var) {
        super(sortedMap, tyg0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C2930b();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
