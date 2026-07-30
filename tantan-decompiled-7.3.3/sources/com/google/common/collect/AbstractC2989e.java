package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p153l.wgj0;

/* JADX INFO: renamed from: com.google.common.collect.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2989e<R, C, V> implements InterfaceC3002r<R, C, V> {
    private transient Set<InterfaceC3002r.a<R, C, V>> cellSet;
    private transient Collection<V> values;

    /* JADX INFO: renamed from: com.google.common.collect.e$a */
    public class a extends wgj0<InterfaceC3002r.a<R, C, V>, V> {
        public a(AbstractC2989e abstractC2989e, Iterator it) {
            super(it);
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo15951a(InterfaceC3002r.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.e$b */
    public class b extends AbstractSet<InterfaceC3002r.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC2989e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC3002r.a) {
                InterfaceC3002r.a aVar = (InterfaceC3002r.a) obj;
                Map map = (Map) Maps.m16103x(AbstractC2989e.this.rowMap(), aVar.getRowKey());
                if (map != null && C2991g.m16314c(map.entrySet(), Maps.m16089j(aVar.getColumnKey(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC3002r.a<R, C, V>> iterator() {
            return AbstractC2989e.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof InterfaceC3002r.a) {
                InterfaceC3002r.a aVar = (InterfaceC3002r.a) obj;
                Map map = (Map) Maps.m16103x(AbstractC2989e.this.rowMap(), aVar.getRowKey());
                if (map != null && C2991g.m16315d(map.entrySet(), Maps.m16089j(aVar.getColumnKey(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2989e.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.e$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2989e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2989e.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2989e.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2989e.this.size();
        }
    }

    public abstract Iterator<InterfaceC3002r.a<R, C, V>> cellIterator();

    @Override // com.google.common.collect.InterfaceC3002r
    public Set<InterfaceC3002r.a<R, C, V>> cellSet() {
        Set<InterfaceC3002r.a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<InterfaceC3002r.a<R, C, V>> setCreateCellSet = createCellSet();
        this.cellSet = setCreateCellSet;
        return setCreateCellSet;
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public void clear() {
        Iterators.m15929e(cellSet().iterator());
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) Maps.m16103x(rowMap(), obj);
        return map != null && Maps.m16102w(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean containsColumn(Object obj) {
        return Maps.m16102w(columnMap(), obj);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean containsRow(Object obj) {
        return Maps.m16102w(rowMap(), obj);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean containsValue(Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<InterfaceC3002r.a<R, C, V>> createCellSet() {
        return new b();
    }

    public Collection<V> createValues() {
        return new c();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean equals(Object obj) {
        return Tables.m16227b(this, obj);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public V get(Object obj, Object obj2) {
        Map map = (Map) Maps.m16103x(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.m16103x(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public V put(R r, C c2, V v2) {
        return row(r).put(c2, v2);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public void putAll(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
        for (InterfaceC3002r.a<? extends R, ? extends C, ? extends V> aVar : interfaceC3002r.cellSet()) {
            put(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
        }
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public V remove(Object obj, Object obj2) {
        Map map = (Map) Maps.m16103x(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.m16104y(map, obj2);
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.InterfaceC3002r
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
