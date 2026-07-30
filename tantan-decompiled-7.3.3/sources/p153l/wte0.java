package p153l;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface wte0<K, V> extends ju10<K, V> {
    @Override // p153l.ju10
    Set<Map.Entry<K, V>> entries();

    @Override // p153l.ju10, p153l.zor
    Set<V> get(K k);

    @Override // p153l.ju10, p153l.zor
    Set<V> removeAll(Object obj);

    @Override // p153l.ju10, p153l.zor
    Set<V> replaceValues(K k, Iterable<? extends V> iterable);
}
