package p149l;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: renamed from: l.y7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC21329y7<C extends Comparable> implements ecc0<C> {
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    @Override // p149l.ecc0
    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecc0) {
            return asRanges().equals(((ecc0) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    @Override // p149l.ecc0
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public abstract Range<C> rangeContaining(C c);

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void addAll(ecc0<C> ecc0Var) {
        addAll(ecc0Var.asRanges());
    }

    @Override // p149l.ecc0
    public void removeAll(ecc0<C> ecc0Var) {
        removeAll(ecc0Var.asRanges());
    }

    public boolean enclosesAll(ecc0<C> ecc0Var) {
        return enclosesAll(ecc0Var.asRanges());
    }
}
