package p149l;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface ecc0<C extends Comparable> {
    Set<Range<C>> asRanges();

    ecc0<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(ecc0<C> ecc0Var);

    ecc0<C> subRangeSet(Range<C> range);
}
