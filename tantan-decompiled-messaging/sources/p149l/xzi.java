package p149l;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xzi<K, V> extends a0j implements Map<K, V> {
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // p149l.a0j
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(K k, V v2) {
        return delegate().put(k, v2);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterators.m15875e(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return Maps.m16032g(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return Maps.m16033h(this, obj);
    }

    public boolean standardEquals(Object obj) {
        return Maps.m16034i(this, obj);
    }

    public int standardHashCode() {
        return Sets.m16119d(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.m16046u(this, map);
    }

    public V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (v050.m196470a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.m16051z(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
