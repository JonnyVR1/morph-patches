package p149l;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public final class slf0 {
    /* JADX INFO: renamed from: a */
    public static <E> Comparator<? super E> m184800a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m184801b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        sf80.m183894p(comparator);
        sf80.m183894p(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m184800a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof rlf0)) {
                return false;
            }
            comparator2 = ((rlf0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
