package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import p149l.aiq;
import p149l.gaj;
import p149l.lmr;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public static class Factory<C, V> implements tyg0<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        public Factory(Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // p149l.tyg0
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$a */
    public class C2947a extends AbstractIterator<C> {

        /* JADX INFO: renamed from: c */
        public C f11139c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Iterator f11140d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Comparator f11141e;

        public C2947a(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.f11140d = it;
            this.f11141e = comparator;
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: a */
        public C mo15565a() {
            while (this.f11140d.hasNext()) {
                C c = (C) this.f11140d.next();
                C c2 = this.f11139c;
                if (c2 == null || this.f11141e.compare(c, c2) != 0) {
                    this.f11139c = c;
                    return c;
                }
            }
            this.f11139c = null;
            return m15566b();
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
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

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
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

    @Override // com.google.common.collect.StandardTable
    public Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new C2947a(this, Iterators.m15889s(aiq.m96893s(this.backingMap.values(), new gaj() { // from class: l.haj0
            @Override // p149l.gaj
            public final Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        }), comparatorColumnComparator), comparatorColumnComparator);
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

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public SortedMap<C, V> row(R r) {
        return new C2948b(this, r);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
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

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC2979r
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        sf80.m183894p(comparator);
        sf80.m183894p(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$b */
    public class C2948b extends StandardTable<R, C, V>.C2937g implements SortedMap<C, V> {

        /* JADX INFO: renamed from: d */
        public final C f11142d;

        /* JADX INFO: renamed from: e */
        public final C f11143e;

        /* JADX INFO: renamed from: f */
        public transient SortedMap<C, V> f11144f;

        public C2948b(R r, C c, C c2) {
            super(r);
            this.f11142d = c;
            this.f11143e = c2;
            sf80.m183882d(c == null || c2 == null || m16178f(c, c2) <= 0);
        }

        @Override // com.google.common.collect.StandardTable.C2937g
        /* JADX INFO: renamed from: c */
        public void mo16142c() {
            m16182j();
            SortedMap<C, V> sortedMap = this.f11144f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.backingMap.remove(this.f11122a);
            this.f11144f = null;
            this.f11123b = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.StandardTable.C2937g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return m16181i(obj) && super.containsKey(obj);
        }

        /* JADX INFO: renamed from: f */
        public int m16178f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            lmr.m150601a();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.C2937g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> mo16141b() {
            m16182j();
            SortedMap<C, V> sortedMapTailMap = this.f11144f;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.f11142d;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.f11143e;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new Maps.C2880o(this);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            sf80.m183882d(m16181i(sf80.m183894p(c)));
            return new C2948b(this.f11122a, this.f11142d, c);
        }

        /* JADX INFO: renamed from: i */
        public boolean m16181i(Object obj) {
            if (obj == null) {
                return false;
            }
            C c = this.f11142d;
            if (c != null && m16178f(c, obj) > 0) {
                return false;
            }
            C c2 = this.f11143e;
            return c2 == null || m16178f(c2, obj) > 0;
        }

        /* JADX INFO: renamed from: j */
        public void m16182j() {
            SortedMap<C, V> sortedMap = this.f11144f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f11122a))) {
                this.f11144f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f11122a);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            lmr.m150601a();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.C2937g, java.util.AbstractMap, java.util.Map
        public V put(C c, V v2) {
            sf80.m183882d(m16181i(sf80.m183894p(c)));
            return (V) super.put(c, v2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            sf80.m183882d(m16181i(sf80.m183894p(c)) && m16181i(sf80.m183894p(c2)));
            return new C2948b(this.f11122a, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            sf80.m183882d(m16181i(sf80.m183894p(c)));
            return new C2948b(this.f11122a, c, this.f11143e);
        }

        public C2948b(TreeBasedTable treeBasedTable, R r) {
            this(r, null, null);
        }
    }
}
