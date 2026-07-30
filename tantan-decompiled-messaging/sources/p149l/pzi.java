package p149l;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pzi<K, V> extends a0j implements vw3<K, V> {
    @Override // p149l.vw3
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // p149l.vw3
    public void cleanUp() {
        delegate().cleanUp();
    }

    @Override // p149l.a0j
    public abstract vw3<K, V> delegate();

    @Override // p149l.vw3
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }

    @Override // p149l.vw3
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // p149l.vw3
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // p149l.vw3
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // p149l.vw3
    public void invalidateAll(Iterable<? extends Object> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // p149l.vw3
    public void put(K k, V v2) {
        delegate().put(k, v2);
    }

    @Override // p149l.vw3
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // p149l.vw3
    public long size() {
        return delegate().size();
    }

    @Override // p149l.vw3
    public ix3 stats() {
        return delegate().stats();
    }

    @Override // p149l.vw3
    public void invalidateAll() {
        delegate().invalidateAll();
    }
}
