package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface zor<K, V> extends ju10<K, V> {
    @Override // 
    List<V> get(K k);

    @Override // 
    List<V> removeAll(Object obj);

    @Override // 
    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
