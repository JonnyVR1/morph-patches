package p149l;

import com.google.common.collect.InterfaceC2972k;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzi<K, V> extends a0j implements bm10<K, V> {
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // p149l.bm10
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // p149l.bm10
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // p149l.bm10
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // p149l.a0j
    public abstract bm10<K, V> delegate();

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // p149l.bm10
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<V> get(K k) {
        return delegate().get(k);
    }

    @Override // p149l.bm10
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // p149l.bm10
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public InterfaceC2972k<K> keys() {
        return delegate().keys();
    }

    public boolean put(K k, V v2) {
        return delegate().put(k, v2);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    @Override // p149l.bm10
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
        return delegate().putAll(bm10Var);
    }
}
