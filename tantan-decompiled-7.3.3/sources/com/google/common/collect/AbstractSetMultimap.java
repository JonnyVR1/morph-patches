package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p153l.wte0;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements wte0<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract Set<V> createCollection();

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public Set<V> get(K k) {
        return (Set) super.get((Object) k);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean put(K k, V v2) {
        return super.put(k, v2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new AbstractMapBasedMultimap.C2755n(k, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_SET;
    }
}
