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
import p153l.adj;
import p153l.akq;
import p153l.b7h0;
import p153l.mor;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public static class Factory<C, V> implements b7h0<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        public Factory(Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // p153l.b7h0
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$a */
    public class C2970a extends AbstractIterator<C> {

        /* JADX INFO: renamed from: c */
        public C f11176c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Iterator f11177d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Comparator f11178e;

        public C2970a(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.f11177d = it;
            this.f11178e = comparator;
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: a */
        public C mo15619a() {
            while (this.f11177d.hasNext()) {
                C c = (C) this.f11177d.next();
                C c2 = this.f11176c;
                if (c2 == null || this.f11178e.compare(c, c2) != 0) {
                    this.f11176c = c;
                    return c;
                }
            }
            this.f11176c = null;
            return m15620b();
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

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new C2970a(this, Iterators.m15943s(akq.m98611s(this.backingMap.values(), new adj() { // from class: l.ljj0
            @Override // p153l.adj
            public final Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        }), comparatorColumnComparator), comparatorColumnComparator);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ void putAll(InterfaceC3002r interfaceC3002r) {
        super.putAll(interfaceC3002r);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public SortedMap<C, V> row(R r) {
        return new C2971b(this, r);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2989e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.InterfaceC3002r
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        xn80.m212111p(comparator);
        xn80.m212111p(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$b */
    public class C2971b extends StandardTable<R, C, V>.C2960g implements SortedMap<C, V> {

        /* JADX INFO: renamed from: d */
        public final C f11179d;

        /* JADX INFO: renamed from: e */
        public final C f11180e;

        /* JADX INFO: renamed from: f */
        public transient SortedMap<C, V> f11181f;

        public C2971b(R r, C c, C c2) {
            super(r);
            this.f11179d = c;
            this.f11180e = c2;
            xn80.m212099d(c == null || c2 == null || m16232f(c, c2) <= 0);
        }

        @Override // com.google.common.collect.StandardTable.C2960g
        /* JADX INFO: renamed from: c */
        public void mo16196c() {
            m16236j();
            SortedMap<C, V> sortedMap = this.f11181f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.backingMap.remove(this.f11159a);
            this.f11181f = null;
            this.f11160b = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.StandardTable.C2960g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return m16235i(obj) && super.containsKey(obj);
        }

        /* JADX INFO: renamed from: f */
        public int m16232f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            mor.m159308a();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.C2960g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> mo16195b() {
            m16236j();
            SortedMap<C, V> sortedMapTailMap = this.f11181f;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.f11179d;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.f11180e;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new Maps.C2903o(this);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            xn80.m212099d(m16235i(xn80.m212111p(c)));
            return new C2971b(this.f11159a, this.f11179d, c);
        }

        /* JADX INFO: renamed from: i */
        public boolean m16235i(Object obj) {
            if (obj == null) {
                return false;
            }
            C c = this.f11179d;
            if (c != null && m16232f(c, obj) > 0) {
                return false;
            }
            C c2 = this.f11180e;
            return c2 == null || m16232f(c2, obj) > 0;
        }

        /* JADX INFO: renamed from: j */
        public void m16236j() {
            SortedMap<C, V> sortedMap = this.f11181f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f11159a))) {
                this.f11181f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f11159a);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            mor.m159308a();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.C2960g, java.util.AbstractMap, java.util.Map
        public V put(C c, V v2) {
            xn80.m212099d(m16235i(xn80.m212111p(c)));
            return (V) super.put(c, v2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            xn80.m212099d(m16235i(xn80.m212111p(c)) && m16235i(xn80.m212111p(c2)));
            return new C2971b(this.f11159a, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            xn80.m212099d(m16235i(xn80.m212111p(c)));
            return new C2971b(this.f11159a, c, this.f11180e);
        }

        public C2971b(TreeBasedTable treeBasedTable, R r) {
            this(r, null, null);
        }
    }
}
