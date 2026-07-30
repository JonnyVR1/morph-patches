package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import p153l.mor;

/* JADX INFO: renamed from: com.google.common.collect.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2987c<K, V> extends Maps.AbstractC2900l<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.c$b */
    public final class b extends Maps.AbstractC2897i<K, V> {
        public b() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2897i
        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> mo16114c() {
            return AbstractC2987c.this.mo16282b();
        }

        @Override // com.google.common.collect.Maps.AbstractC2897i
        /* JADX INFO: renamed from: f */
        public NavigableMap<K, V> mo16115f() {
            return AbstractC2987c.this;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo16282b();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.m16093n(ceilingEntry(k));
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
        return (Map.Entry) Iterators.m15940p(mo15664a(), null);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.m16093n(floorEntry(k));
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
        return (K) Maps.m16093n(higherEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.m15940p(mo16282b(), null);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.m16093n(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new Maps.C2902n(this);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.m15945u(mo15664a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.m15945u(mo16282b());
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
