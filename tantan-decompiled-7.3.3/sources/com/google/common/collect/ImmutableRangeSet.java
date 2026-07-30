package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p153l.AbstractC20250t7;
import p153l.akq;
import p153l.gig0;
import p153l.gyj0;
import p153l.lkc0;
import p153l.mor;
import p153l.sq60;
import p153l.wg3;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractC20250t7<C> implements Serializable {
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.m15739of());
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.m15740of(Range.all()));

    public final class AsSet extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> domain;
        private transient Integer size;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$a */
        public class C2822a extends AbstractIterator<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Range<C>> f10954c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f10955d = Iterators.m15933i();

            public C2822a() {
                this.f10954c = ImmutableRangeSet.this.ranges.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C mo15619a() {
                while (!this.f10955d.hasNext()) {
                    if (!this.f10954c.hasNext()) {
                        return (C) m15620b();
                    }
                    this.f10955d = ContiguousSet.create(this.f10954c.next(), AsSet.this.domain).iterator();
                }
                return this.f10955d.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$b */
        public class C2823b extends AbstractIterator<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Range<C>> f10957c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f10958d = Iterators.m15933i();

            public C2823b() {
                this.f10957c = ImmutableRangeSet.this.ranges.reverse().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C mo15619a() {
                while (!this.f10958d.hasNext()) {
                    if (!this.f10957c.hasNext()) {
                        return (C) m15620b();
                    }
                    this.f10958d = ContiguousSet.create(this.f10957c.next(), AsSet.this.domain).descendingIterator();
                }
                return this.f10958d.next();
            }
        }

        public AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.natural());
            this.domain = discreteDomain;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public gyj0<C> descendingIterator() {
            return new C2823b();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return subSet(Range.upTo(c, BoundType.forBoolean(z)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Objects.requireNonNull(obj);
            Comparable comparable = (Comparable) obj;
            gyj0 it = ImmutableRangeSet.this.ranges.iterator();
            long size = 0;
            while (it.hasNext()) {
                Range range = (Range) it.next();
                boolean zContains = range.contains(comparable);
                DiscreteDomain<C> discreteDomain = this.domain;
                if (zContains) {
                    return Ints.m16523m(size + ((long) ContiguousSet.create(range, discreteDomain).indexOf(comparable)));
                }
                size += (long) ContiguousSet.create(range, discreteDomain).size();
            }
            gig0.m130323a("impossible");
            return 0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public gyj0<C> iterator() {
            return new C2822a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.size;
            if (numValueOf == null) {
                gyj0 it = ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.m16523m(size));
                this.size = numValueOf;
            }
            return numValueOf.intValue();
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.domain);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            return (z || z2 || Range.compareOrThrow(c, c2) != 0) ? subSet(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2))) : ImmutableSortedSet.m15898of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return subSet(Range.downTo(c, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.ranges, this.domain);
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        public AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.ranges).asSet(this.domain);
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        /* JADX WARN: Multi-variable type inference failed */
        public ComplementRanges() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.positiveBoundedBelow = zHasLowerBound;
            boolean zHasUpperBound = ((Range) akq.m98599g(ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = ImmutableRangeSet.this.ranges.size();
            size = zHasLowerBound ? size : size - 1;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Range<C> get(int i) {
            Cut<C> cutBelowAll;
            xn80.m212109n(i, this.size);
            if (this.positiveBoundedBelow) {
                cutBelowAll = i == 0 ? Cut.belowAll() : ((Range) ImmutableRangeSet.this.ranges.get(i - 1)).upperBound;
            } else {
                cutBelowAll = ((Range) ImmutableRangeSet.this.ranges.get(i)).upperBound;
            }
            return Range.create(cutBelowAll, (this.positiveBoundedAbove && i == this.size + (-1)) ? Cut.aboveAll() : ((Range) ImmutableRangeSet.this.ranges.get(i + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        public Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.m15815of();
            }
            return this.ranges.equals(ImmutableList.m15740of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.ranges);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$a */
    public static class C2824a<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a */
        public final List<Range<C>> f10960a = Lists.m15977j();

        /* JADX INFO: renamed from: a */
        public C2824a<C> m15819a(Range<C> range) {
            xn80.m212106k(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f10960a.add(range);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C2824a<C> m15820b(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                m15819a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableRangeSet<C> m15821c() {
            ImmutableList.C2804a c2804a = new ImmutableList.C2804a(this.f10960a.size());
            Collections.sort(this.f10960a, Range.rangeLexOrdering());
            sq60 sq60VarM15944t = Iterators.m15944t(this.f10960a.iterator());
            while (sq60VarM15944t.hasNext()) {
                Range rangeSpan = (Range) sq60VarM15944t.next();
                while (sq60VarM15944t.hasNext()) {
                    Range<C> range = (Range) sq60VarM15944t.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    xn80.m212107l(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((Range) sq60VarM15944t.next());
                }
                c2804a.mo15737a(rangeSpan);
            }
            ImmutableList immutableListM15756m = c2804a.m15756m();
            if (immutableListM15756m.isEmpty()) {
                return ImmutableRangeSet.m15815of();
            }
            return (immutableListM15756m.size() == 1 && ((Range) akq.m98602j(immutableListM15756m)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(immutableListM15756m);
        }
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> C2824a<C> builder() {
        return new C2824a<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(lkc0<C> lkc0Var) {
        xn80.m212111p(lkc0Var);
        if (lkc0Var.isEmpty()) {
            return m15815of();
        }
        if (lkc0Var.encloses(Range.all())) {
            return all();
        }
        if (lkc0Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) lkc0Var;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) lkc0Var.asRanges()));
    }

    private ImmutableList<Range<C>> intersectRanges(final Range<C> range) {
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.m15739of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        final int iM16185b = range.hasLowerBound() ? SortedLists.m16185b(this.ranges, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        boolean zHasUpperBound = range.hasUpperBound();
        ImmutableList<Range<C>> immutableList = this.ranges;
        final int iM16185b2 = (zHasUpperBound ? SortedLists.m16185b(immutableList, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : immutableList.size()) - iM16185b;
        return iM16185b2 == 0 ? ImmutableList.m15739of() : (ImmutableList<Range<C>>) new ImmutableList<Range<C>>() { // from class: com.google.common.collect.ImmutableRangeSet.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<C> get(int i) {
                xn80.m212109n(i, iM16185b2);
                return (i == 0 || i == iM16185b2 + (-1)) ? ((Range) ImmutableRangeSet.this.ranges.get(i + iM16185b)).intersection(range) : (Range) ImmutableRangeSet.this.ranges.get(i + iM16185b);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iM16185b2;
            }
        };
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m15816of(Range<C> range) {
        xn80.m212111p(range);
        if (range.isEmpty()) {
            return m15815of();
        }
        return range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.m15740of(range));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Override // p153l.AbstractC20250t7
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.AbstractC20250t7
    @Deprecated
    public void addAll(lkc0<C> lkc0Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: asDescendingSetOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> m225038asDescendingSetOfRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m15822of() : new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse());
    }

    @Override // p153l.lkc0
    public ImmutableSet<Range<C>> asRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m15822of() : new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering());
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        xn80.m212111p(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.m15898of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (!rangeCanonical.hasLowerBound()) {
            wg3.m206174a("Neither the DiscreteDomain nor this range set are bounded below");
            return null;
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (NoSuchElementException unused) {
                wg3.m206174a("Neither the DiscreteDomain nor this range set are bounded above");
                return null;
            }
        }
        return new AsSet(discreteDomain);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p153l.lkc0
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetAll = all();
            this.complement = immutableRangeSetAll;
            return immutableRangeSetAll;
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetM15815of = m15815of();
            this.complement = immutableRangeSetM15815of;
            return immutableRangeSetM15815of;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(lkc0<C> lkc0Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(lkc0Var);
        return copyOf(treeRangeSetCreate);
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    public boolean encloses(Range<C> range) {
        int iM16186c = SortedLists.m16186c(this.ranges, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iM16186c != -1 && this.ranges.get(iM16186c).encloses(range);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(lkc0<C> lkc0Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(lkc0Var.complement());
        return copyOf(treeRangeSetCreate);
    }

    @Override // p153l.AbstractC20250t7
    public boolean intersects(Range<C> range) {
        int iM16186c = SortedLists.m16186c(this.ranges, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iM16186c < this.ranges.size() && this.ranges.get(iM16186c).isConnected(range) && !this.ranges.get(iM16186c).intersection(range).isEmpty()) {
            return true;
        }
        if (iM16186c <= 0) {
            return false;
        }
        int i = iM16186c - 1;
        return this.ranges.get(i).isConnected(range) && !this.ranges.get(i).intersection(range).isEmpty();
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    @Override // p153l.AbstractC20250t7
    public Range<C> rangeContaining(C c) {
        int iM16186c = SortedLists.m16186c(this.ranges, Range.lowerBoundFn(), Cut.belowValue(c), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16186c != -1) {
            Range<C> range = this.ranges.get(iM16186c);
            if (range.contains(c)) {
                return range;
            }
        }
        return null;
    }

    @Override // p153l.AbstractC20250t7
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    @Deprecated
    public void removeAll(lkc0<C> lkc0Var) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (this.ranges.isEmpty()) {
            mor.m159308a();
            return null;
        }
        Cut<C> cut = this.ranges.get(0).lowerBound;
        ImmutableList<Range<C>> immutableList = this.ranges;
        return Range.create(cut, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // p153l.lkc0
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return m15815of();
    }

    public ImmutableRangeSet<C> union(lkc0<C> lkc0Var) {
        return unionOf(akq.m98596d(asRanges(), lkc0Var.asRanges()));
    }

    public Object writeReplace() {
        return new SerializedForm(this.ranges);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean enclosesAll(lkc0 lkc0Var) {
        return super.enclosesAll(lkc0Var);
    }

    @Override // p153l.AbstractC20250t7
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.AbstractC20250t7
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m15815of() {
        return EMPTY;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new C2824a().m15820b(iterable).m15821c();
    }
}
