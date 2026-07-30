package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.s7j0;

/* JADX INFO: renamed from: com.google.common.collect.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2966e<R, C, V> implements InterfaceC2979r<R, C, V> {
    private transient Set<InterfaceC2979r.a<R, C, V>> cellSet;
    private transient Collection<V> values;

    /* JADX INFO: renamed from: com.google.common.collect.e$a */
    public class a extends s7j0<InterfaceC2979r.a<R, C, V>, V> {
        public a(AbstractC2966e abstractC2966e, Iterator it) {
            super(it);
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo15897a(InterfaceC2979r.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.e$b */
    public class b extends AbstractSet<InterfaceC2979r.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC2966e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2979r.a) {
                InterfaceC2979r.a aVar = (InterfaceC2979r.a) obj;
                Map map = (Map) Maps.m16049x(AbstractC2966e.this.rowMap(), aVar.getRowKey());
                if (map != null && C2968g.m16260c(map.entrySet(), Maps.m16035j(aVar.getColumnKey(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2979r.a<R, C, V>> iterator() {
            return AbstractC2966e.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof InterfaceC2979r.a) {
                InterfaceC2979r.a aVar = (InterfaceC2979r.a) obj;
                Map map = (Map) Maps.m16049x(AbstractC2966e.this.rowMap(), aVar.getRowKey());
                if (map != null && C2968g.m16261d(map.entrySet(), Maps.m16035j(aVar.getColumnKey(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2966e.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.e$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2966e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2966e.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2966e.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2966e.this.size();
        }
    }

    public abstract Iterator<InterfaceC2979r.a<R, C, V>> cellIterator();

    @Override // com.google.common.collect.InterfaceC2979r
    public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
        Set<InterfaceC2979r.a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<InterfaceC2979r.a<R, C, V>> setCreateCellSet = createCellSet();
        this.cellSet = setCreateCellSet;
        return setCreateCellSet;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public void clear() {
        Iterators.m15875e(cellSet().iterator());
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) Maps.m16049x(rowMap(), obj);
        return map != null && Maps.m16048w(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsColumn(Object obj) {
        return Maps.m16048w(columnMap(), obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsRow(Object obj) {
        return Maps.m16048w(rowMap(), obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean containsValue(Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<InterfaceC2979r.a<R, C, V>> createCellSet() {
        return new b();
    }

    public Collection<V> createValues() {
        return new c();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean equals(Object obj) {
        return Tables.m16173b(this, obj);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public V get(Object obj, Object obj2) {
        Map map = (Map) Maps.m16049x(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.m16049x(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public V put(R r, C c2, V v2) {
        return row(r).put(c2, v2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        for (InterfaceC2979r.a<? extends R, ? extends C, ? extends V> aVar : interfaceC2979r.cellSet()) {
            put(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
        }
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public V remove(Object obj, Object obj2) {
        Map map = (Map) Maps.m16049x(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.m16050y(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        return new a(this, cellSet().iterator());
    }
}
