package p149l;

import com.google.common.collect.InterfaceC2972k;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface bm10<K, V> {
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

    InterfaceC2972k<K> keys();

    boolean put(K k, V v2);

    boolean putAll(K k, Iterable<? extends V> iterable);

    boolean putAll(bm10<? extends K, ? extends V> bm10Var);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    Collection<V> replaceValues(K k, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
