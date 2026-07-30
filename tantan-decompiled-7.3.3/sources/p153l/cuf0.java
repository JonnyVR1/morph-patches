package p153l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public interface cuf0<K, V> extends wte0<K, V> {
    @Override // p153l.wte0, p153l.ju10, p153l.zor
    SortedSet<V> get(K k);

    @Override // p153l.wte0, p153l.ju10, p153l.zor
    SortedSet<V> removeAll(Object obj);

    @Override // p153l.wte0, p153l.ju10, p153l.zor
    SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
