package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p149l.acc0;
import p149l.aiq;
import p149l.gaj;
import p149l.oh80;
import p149l.sf80;
import p149l.shg0;
import p149l.zm5;

/* JADX INFO: loaded from: classes7.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements oh80<C>, Serializable {
    private static final Range<Comparable> ALL = new Range<>(Cut.belowAll(), Cut.aboveAll());
    private static final long serialVersionUID = 0;
    final Cut<C> lowerBound;
    final Cut<C> upperBound;

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        static final Ordering<Range<?>> INSTANCE = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Range<?> range, Range<?> range2) {
            return zm5.m219305k().mo219308f(range.lowerBound, range2.lowerBound).mo219308f(range.upperBound, range2.upperBound).mo219312j();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Range$a */
    public static /* synthetic */ class C2905a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11085a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f11085a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11085a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Range$b */
    public static class C2906b implements gaj<Range, Cut> {
        static final C2906b INSTANCE = new C2906b();

        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.lowerBound;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Range$c */
    public static class C2907c implements gaj<Range, Cut> {
        static final C2907c INSTANCE = new C2907c();

        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.upperBound;
        }
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        this.lowerBound = (Cut) sf80.m183894p(cut);
        this.upperBound = (Cut) sf80.m183894p(cut2);
        if (cut.compareTo((Cut) cut2) > 0 || cut == Cut.aboveAll() || cut2 == Cut.belowAll()) {
            String strValueOf = String.valueOf(toString(cut, cut2));
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) ALL;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return create(Cut.belowValue(c), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return create(Cut.belowAll(), Cut.aboveValue(c));
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
        return create(Cut.belowValue(c), Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return create(Cut.belowValue(c), Cut.belowValue(c2));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> create(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        int i = C2905a.f11085a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(c);
        }
        if (i == 2) {
            return atLeast(c);
        }
        shg0.m184191a();
        return null;
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        sf80.m183894p(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) sf80.m183894p(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) sf80.m183894p(it.next());
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
        return create(Cut.aboveValue(c), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
        return create(Cut.belowAll(), Cut.belowValue(c));
    }

    public static <C extends Comparable<?>> gaj<Range<C>, Cut<C>> lowerBoundFn() {
        return C2906b.INSTANCE;
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
        return create(Cut.aboveValue(c), Cut.belowValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
        return create(Cut.aboveValue(c), Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        sf80.m183894p(boundType);
        sf80.m183894p(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return create(boundType == boundType3 ? Cut.aboveValue(c) : Cut.belowValue(c), boundType2 == boundType3 ? Cut.belowValue(c2) : Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
        return (Ordering<Range<C>>) RangeLexOrdering.INSTANCE;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
        return closed(c, c);
    }

    private static String toString(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.describeAsLowerBound(sb);
        sb.append("..");
        cut2.describeAsUpperBound(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        int i = C2905a.f11085a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(c);
        }
        if (i == 2) {
            return atMost(c);
        }
        shg0.m184191a();
        return null;
    }

    public static <C extends Comparable<?>> gaj<Range<C>, Cut<C>> upperBoundFn() {
        return C2907c.INSTANCE;
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        sf80.m183894p(discreteDomain);
        Cut<C> cutCanonical = this.lowerBound.canonical(discreteDomain);
        Cut<C> cutCanonical2 = this.upperBound.canonical(discreteDomain);
        return (cutCanonical == this.lowerBound && cutCanonical2 == this.upperBound) ? this : create(cutCanonical, cutCanonical2);
    }

    public boolean contains(C c) {
        sf80.m183894p(c);
        return this.lowerBound.isLessThan(c) && !this.upperBound.isLessThan(c);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (aiq.m96885k(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        return this.lowerBound.compareTo((Cut) range.lowerBound) <= 0 && this.upperBound.compareTo((Cut) range.upperBound) >= 0;
    }

    @Override // p149l.oh80
    public boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public Range<C> gap(Range<C> range) {
        if (this.lowerBound.compareTo((Cut) range.upperBound) < 0 && range.lowerBound.compareTo((Cut) this.upperBound) < 0) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(range);
            acc0.m95719a(strValueOf.length() + 39 + strValueOf2.length(), "Ranges have a nonempty intersection: ", strValueOf, ", ", strValueOf2);
            return null;
        }
        boolean z = this.lowerBound.compareTo((Cut) range.lowerBound) < 0;
        Range<C> range2 = z ? this : range;
        if (z) {
            this = range;
        }
        return create(range2.upperBound, this.lowerBound);
    }

    public boolean hasLowerBound() {
        return this.lowerBound != Cut.belowAll();
    }

    public boolean hasUpperBound() {
        return this.upperBound != Cut.aboveAll();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int iCompareTo = this.lowerBound.compareTo((Cut) range.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((Cut) range.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        Cut<C> cut = iCompareTo >= 0 ? this.lowerBound : range.lowerBound;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.upperBound : range.upperBound;
        sf80.m183890l(cut.compareTo((Cut) cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return create(cut, cut2);
    }

    public boolean isConnected(Range<C> range) {
        return this.lowerBound.compareTo((Cut) range.upperBound) <= 0 && range.lowerBound.compareTo((Cut) this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public C lowerEndpoint() {
        return (C) this.lowerBound.endpoint();
    }

    public Object readResolve() {
        return equals(ALL) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int iCompareTo = this.lowerBound.compareTo((Cut) range.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((Cut) range.upperBound);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return range;
        }
        Cut<C> cut = iCompareTo <= 0 ? this.lowerBound : range.lowerBound;
        if (iCompareTo2 < 0) {
            this = range;
        }
        return create(cut, this.upperBound);
    }

    public BoundType upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public C upperEndpoint() {
        return (C) this.upperBound.endpoint();
    }

    @Override // p149l.oh80
    @Deprecated
    public boolean apply(C c) {
        return contains(c);
    }

    public String toString() {
        return toString(this.lowerBound, this.upperBound);
    }
}
