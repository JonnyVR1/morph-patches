package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import p149l.lmr;

/* JADX INFO: renamed from: com.google.common.collect.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2964c<K, V> extends Maps.AbstractC2877l<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.c$b */
    public final class b extends Maps.AbstractC2874i<K, V> {
        public b() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2874i
        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> mo16060c() {
            return AbstractC2964c.this.mo16228b();
        }

        @Override // com.google.common.collect.Maps.AbstractC2874i
        /* JADX INFO: renamed from: f */
        public NavigableMap<K, V> mo16061f() {
            return AbstractC2964c.this;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo16228b();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.m16039n(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.m15886p(mo15610a(), null);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.m16039n(floorEntry(k));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) Maps.m16039n(higherEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.m15886p(mo16228b(), null);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.m16039n(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new Maps.C2879n(this);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.m15891u(mo15610a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.m15891u(mo16228b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }
}
