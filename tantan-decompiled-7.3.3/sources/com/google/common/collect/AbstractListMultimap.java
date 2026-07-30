package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.zor;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements zor<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract List<V> createCollection();

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public List<V> get(K k) {
        return (List) super.get((Object) k);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean put(K k, V v2) {
        return super.put(k, v2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return wrapList(k, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_LIST;
    }
}
