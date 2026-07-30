package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
abstract class HashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    public HashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
