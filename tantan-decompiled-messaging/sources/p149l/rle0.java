package p149l;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface rle0<K, V> extends bm10<K, V> {
    @Override // p149l.bm10
    Set<Map.Entry<K, V>> entries();

    @Override // p149l.bm10, p149l.ymr
    Set<V> get(K k);

    @Override // p149l.bm10, p149l.ymr
    Set<V> removeAll(Object obj);

    @Override // p149l.bm10, p149l.ymr
    Set<V> replaceValues(K k, Iterable<? extends V> iterable);
}
