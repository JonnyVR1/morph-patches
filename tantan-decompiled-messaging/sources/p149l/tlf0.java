package p149l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public interface tlf0<K, V> extends rle0<K, V> {
    @Override // p149l.rle0, p149l.bm10, p149l.ymr
    SortedSet<V> get(K k);

    @Override // p149l.rle0, p149l.bm10, p149l.ymr
    SortedSet<V> removeAll(Object obj);

    @Override // p149l.rle0, p149l.bm10, p149l.ymr
    SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
