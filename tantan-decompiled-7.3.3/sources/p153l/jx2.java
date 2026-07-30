package p153l;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface jx2<K, V> extends Map<K, V> {
    V forcePut(K k, V v2);

    jx2<V, K> inverse();

    @Override // p153l.jx2
    Set<V> values();
}
