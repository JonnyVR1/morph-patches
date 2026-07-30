package p149l;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public interface vrv<K, V> extends vw3<K, V>, gaj<K, V> {
    @Override // p149l.gaj
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k);

    void refresh(K k);
}
