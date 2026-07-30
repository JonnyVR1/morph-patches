package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import p149l.tlf0;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements tlf0<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public AbstractSortedSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public abstract SortedSet<V> createCollection();

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return (SortedSet<V>) unmodifiableCollectionSubclass((Collection) createCollection());
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public SortedSet<V> get(K k) {
        return (SortedSet) super.get((Object) k);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return collection instanceof NavigableSet ? Sets.m16128m((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    public abstract /* synthetic */ Comparator valueComparator();

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.C2731m(k, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.C2733o(k, (SortedSet) collection, null);
    }
}
