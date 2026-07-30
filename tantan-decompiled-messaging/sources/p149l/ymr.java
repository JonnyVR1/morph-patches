package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ymr<K, V> extends bm10<K, V> {
    @Override // 
    List<V> get(K k);

    @Override // 
    List<V> removeAll(Object obj);

    @Override // 
    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
