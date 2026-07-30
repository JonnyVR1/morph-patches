package p153l;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k2j<K, V> extends v2j implements ux3<K, V> {
    @Override // p153l.ux3
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // p153l.ux3
    public void cleanUp() {
        delegate().cleanUp();
    }

    @Override // p153l.v2j
    public abstract ux3<K, V> delegate();

    @Override // p153l.ux3
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }

    @Override // p153l.ux3
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // p153l.ux3
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // p153l.ux3
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // p153l.ux3
    public void invalidateAll(Iterable<? extends Object> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // p153l.ux3
    public void put(K k, V v2) {
        delegate().put(k, v2);
    }

    @Override // p153l.ux3
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // p153l.ux3
    public long size() {
        return delegate().size();
    }

    @Override // p153l.ux3
    public hy3 stats() {
        return delegate().stats();
    }

    @Override // p153l.ux3
    public void invalidateAll() {
        delegate().invalidateAll();
    }
}
