package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p153l.ju10;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.collect.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2985a<K, V> implements ju10<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient InterfaceC2995k<K> keys;
    private transient Collection<V> values;

    /* JADX INFO: renamed from: com.google.common.collect.a$a */
    public class a extends Multimaps.AbstractC2917b<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.Multimaps.AbstractC2917b
        /* JADX INFO: renamed from: a */
        public ju10<K, V> mo16142a() {
            return AbstractC2985a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC2985a.this.entryIterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a$b */
    public class b extends AbstractC2985a<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(AbstractC2985a abstractC2985a) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16170a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16173d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2985a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2985a.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2985a.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2985a.this.size();
        }
    }

    @Override // p153l.ju10
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // p153l.ju10
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // p153l.ju10
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

    public abstract InterfaceC2995k<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // p153l.ju10
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

    @Override // p153l.ju10
    public boolean equals(Object obj) {
        return Multimaps.m16132c(this, obj);
    }

    @Override // p153l.ju10
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // p153l.ju10
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // p153l.ju10
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySet = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // p153l.ju10
    public InterfaceC2995k<K> keys() {
        InterfaceC2995k<K> interfaceC2995k = this.keys;
        if (interfaceC2995k != null) {
            return interfaceC2995k;
        }
        InterfaceC2995k<K> interfaceC2995kCreateKeys = createKeys();
        this.keys = interfaceC2995kCreateKeys;
        return interfaceC2995kCreateKeys;
    }

    @Override // p153l.ju10
    public boolean put(K k, V v2) {
        return get(k).add(v2);
    }

    @Override // p153l.ju10
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        xn80.m212111p(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.m15925a(get(k), it);
    }

    @Override // p153l.ju10
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // p153l.ju10, p153l.zor
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        xn80.m212111p(iterable);
        Collection<V> collectionRemoveAll = removeAll(k);
        putAll(k, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.m16077L(entries().iterator());
    }

    @Override // p153l.ju10
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    @Override // p153l.ju10
    public boolean putAll(ju10<? extends K, ? extends V> ju10Var) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : ju10Var.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
