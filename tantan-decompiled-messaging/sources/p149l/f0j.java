package p149l;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f0j<K, V> extends xzi<K, V> implements SortedMap<K, V> {
    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // p149l.xzi, p149l.a0j
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.xzi
    public boolean standardContainsKey(Object obj) {
        try {
            return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    public SortedMap<K, V> standardSubMap(K k, K k2) {
        sf80.m183883e(unsafeCompare(comparator(), k, k2) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }
}
