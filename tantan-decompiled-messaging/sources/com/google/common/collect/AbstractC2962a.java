package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.bm10;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.collect.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2962a<K, V> implements bm10<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient InterfaceC2972k<K> keys;
    private transient Collection<V> values;

    /* JADX INFO: renamed from: com.google.common.collect.a$a */
    public class a extends Multimaps.AbstractC2894b<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.Multimaps.AbstractC2894b
        /* JADX INFO: renamed from: a */
        public bm10<K, V> mo16088a() {
            return AbstractC2962a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC2962a.this.entryIterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a$b */
    public class b extends AbstractC2962a<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(AbstractC2962a abstractC2962a) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16116a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16119d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2962a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2962a.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2962a.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2962a.this.size();
        }
    }

    @Override // p149l.bm10
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // p149l.bm10
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // p149l.bm10
    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract InterfaceC2972k<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // p149l.bm10
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.entries = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // p149l.bm10
    public boolean equals(Object obj) {
        return Multimaps.m16078c(this, obj);
    }

    @Override // p149l.bm10
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // p149l.bm10
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // p149l.bm10
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySet = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // p149l.bm10
    public InterfaceC2972k<K> keys() {
        InterfaceC2972k<K> interfaceC2972k = this.keys;
        if (interfaceC2972k != null) {
            return interfaceC2972k;
        }
        InterfaceC2972k<K> interfaceC2972kCreateKeys = createKeys();
        this.keys = interfaceC2972kCreateKeys;
        return interfaceC2972kCreateKeys;
    }

    @Override // p149l.bm10
    public boolean put(K k, V v2) {
        return get(k).add(v2);
    }

    @Override // p149l.bm10
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        sf80.m183894p(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.m15871a(get(k), it);
    }

    @Override // p149l.bm10
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // p149l.bm10, p149l.ymr
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        sf80.m183894p(iterable);
        Collection<V> collectionRemoveAll = removeAll(k);
        putAll(k, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.m16023L(entries().iterator());
    }

    @Override // p149l.bm10
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    @Override // p149l.bm10
    public boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : bm10Var.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
