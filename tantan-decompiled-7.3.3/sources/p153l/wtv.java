package p153l;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public interface wtv<K, V> extends ux3<K, V>, adj<K, V> {
    @Override // p153l.adj
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k);

    void refresh(K k);
}
