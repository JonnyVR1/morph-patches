package p149l;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface tw2<K, V> extends Map<K, V> {
    V forcePut(K k, V v2);

    tw2<V, K> inverse();

    @Override // p149l.tw2
    Set<V> values();
}
