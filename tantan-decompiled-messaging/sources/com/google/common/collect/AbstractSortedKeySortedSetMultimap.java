package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    public AbstractSortedKeySortedSetMultimap(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, p149l.tlf0
    public abstract /* synthetic */ Comparator valueComparator();
}
