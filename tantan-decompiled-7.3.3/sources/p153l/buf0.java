package p153l;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public final class buf0 {
    /* JADX INFO: renamed from: a */
    public static <E> Comparator<? super E> m106519a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106520b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        xn80.m212111p(comparator);
        xn80.m212111p(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m106519a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof auf0)) {
                return false;
            }
            comparator2 = ((auf0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
