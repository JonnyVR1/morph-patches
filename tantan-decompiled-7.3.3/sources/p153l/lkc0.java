package p153l;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface lkc0<C extends Comparable> {
    Set<Range<C>> asRanges();

    lkc0<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(lkc0<C> lkc0Var);

    lkc0<C> subRangeSet(Range<C> range);
}
