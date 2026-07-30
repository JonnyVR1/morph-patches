package p153l;

import com.google.common.collect.InterfaceC2995k;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface ju10<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(Object obj);

    Collection<V> get(K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    InterfaceC2995k<K> keys();

    boolean put(K k, V v2);

    boolean putAll(K k, Iterable<? extends V> iterable);

    boolean putAll(ju10<? extends K, ? extends V> ju10Var);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    Collection<V> replaceValues(K k, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
