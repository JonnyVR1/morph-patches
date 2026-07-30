package p149l;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rzi<K, V> extends xzi<K, V> implements ConcurrentMap<K, V> {
    @Override // p149l.xzi, p149l.a0j
    public abstract ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v2) {
        return delegate().putIfAbsent(k, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v2) {
        return delegate().replace(k, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v2, V v3) {
        return delegate().replace(k, v2, v3);
    }
}
