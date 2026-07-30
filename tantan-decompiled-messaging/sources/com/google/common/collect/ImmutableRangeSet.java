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
import p149l.AbstractC21329y7;
import p149l.aiq;
import p149l.dpj0;
import p149l.ecc0;
import p149l.ig3;
import p149l.lmr;
import p149l.ni60;
import p149l.sf80;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractC21329y7<C> implements Serializable {
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.m15685of());
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.m15686of(Range.all()));

    public final class AsSet extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> domain;
        private transient Integer size;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$a */
        public class C2799a extends AbstractIterator<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Range<C>> f10917c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f10918d = Iterators.m15879i();

            public C2799a() {
                this.f10917c = ImmutableRangeSet.this.ranges.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C mo15565a() {
                while (!this.f10918d.hasNext()) {
                    if (!this.f10917c.hasNext()) {
                        return (C) m15566b();
                    }
                    this.f10918d = ContiguousSet.create(this.f10917c.next(), AsSet.this.domain).iterator();
                }
                return this.f10918d.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$b */
        public class C2800b extends AbstractIterator<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Range<C>> f10920c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f10921d = Iterators.m15879i();

            public C2800b() {
                this.f10920c = ImmutableRangeSet.this.ranges.reverse().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C mo15565a() {
                while (!this.f10921d.hasNext()) {
                    if (!this.f10920c.hasNext()) {
                        return (C) m15566b();
                    }
                    this.f10921d = ContiguousSet.create(this.f10920c.next(), AsSet.this.domain).descendingIterator();
                }
                return this.f10921d.next();
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
        public dpj0<C> descendingIterator() {
            return new C2800b();
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
            dpj0 it = ImmutableRangeSet.this.ranges.iterator();
            long size = 0;
            while (it.hasNext()) {
                Range range = (Range) it.next();
                boolean zContains = range.contains(comparable);
                DiscreteDomain<C> discreteDomain = this.domain;
                if (zContains) {
                    return Ints.m16468m(size + ((long) ContiguousSet.create(range, discreteDomain).indexOf(comparable)));
                }
                size += (long) ContiguousSet.create(range, discreteDomain).size();
            }
            y9g0.m213537a("impossible");
            return 0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public dpj0<C> iterator() {
            return new C2799a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.size;
            if (numValueOf == null) {
                dpj0 it = ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.m16468m(size));
                this.size = numValueOf;
            }
            return numValueOf.intValue();
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.domain);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            return (z || z2 || Range.compareOrThrow(c, c2) != 0) ? subSet(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2))) : ImmutableSortedSet.m15844of();
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
            boolean zHasUpperBound = ((Range) aiq.m96881g(ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = ImmutableRangeSet.this.ranges.size();
            size = zHasLowerBound ? size : size - 1;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Range<C> get(int i) {
            Cut<C> cutBelowAll;
            sf80.m183892n(i, this.size);
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
                return ImmutableRangeSet.m15761of();
            }
            return this.ranges.equals(ImmutableList.m15686of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.ranges);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$a */
    public static class C2801a<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a */
        public final List<Range<C>> f10923a = Lists.m15923j();

        /* JADX INFO: renamed from: a */
        public C2801a<C> m15765a(Range<C> range) {
            sf80.m183889k(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f10923a.add(range);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C2801a<C> m15766b(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                m15765a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableRangeSet<C> m15767c() {
            ImmutableList.C2781a c2781a = new ImmutableList.C2781a(this.f10923a.size());
            Collections.sort(this.f10923a, Range.rangeLexOrdering());
            ni60 ni60VarM15890t = Iterators.m15890t(this.f10923a.iterator());
            while (ni60VarM15890t.hasNext()) {
                Range rangeSpan = (Range) ni60VarM15890t.next();
                while (ni60VarM15890t.hasNext()) {
                    Range<C> range = (Range) ni60VarM15890t.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    sf80.m183890l(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((Range) ni60VarM15890t.next());
                }
                c2781a.mo15683a(rangeSpan);
            }
            ImmutableList immutableListM15702m = c2781a.m15702m();
            if (immutableListM15702m.isEmpty()) {
                return ImmutableRangeSet.m15761of();
            }
            return (immutableListM15702m.size() == 1 && ((Range) aiq.m96884j(immutableListM15702m)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(immutableListM15702m);
        }
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> C2801a<C> builder() {
        return new C2801a<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(ecc0<C> ecc0Var) {
        sf80.m183894p(ecc0Var);
        if (ecc0Var.isEmpty()) {
            return m15761of();
        }
        if (ecc0Var.encloses(Range.all())) {
            return all();
        }
        if (ecc0Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) ecc0Var;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) ecc0Var.asRanges()));
    }

    private ImmutableList<Range<C>> intersectRanges(final Range<C> range) {
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.m15685of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        final int iM16131b = range.hasLowerBound() ? SortedLists.m16131b(this.ranges, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        boolean zHasUpperBound = range.hasUpperBound();
        ImmutableList<Range<C>> immutableList = this.ranges;
        final int iM16131b2 = (zHasUpperBound ? SortedLists.m16131b(immutableList, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : immutableList.size()) - iM16131b;
        return iM16131b2 == 0 ? ImmutableList.m15685of() : (ImmutableList<Range<C>>) new ImmutableList<Range<C>>() { // from class: com.google.common.collect.ImmutableRangeSet.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<C> get(int i) {
                sf80.m183892n(i, iM16131b2);
                return (i == 0 || i == iM16131b2 + (-1)) ? ((Range) ImmutableRangeSet.this.ranges.get(i + iM16131b)).intersection(range) : (Range) ImmutableRangeSet.this.ranges.get(i + iM16131b);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iM16131b2;
            }
        };
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m15762of(Range<C> range) {
        sf80.m183894p(range);
        if (range.isEmpty()) {
            return m15761of();
        }
        return range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.m15686of(range));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Override // p149l.AbstractC21329y7
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.AbstractC21329y7
    @Deprecated
    public void addAll(ecc0<C> ecc0Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: asDescendingSetOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> m223792asDescendingSetOfRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m15768of() : new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse());
    }

    @Override // p149l.ecc0
    public ImmutableSet<Range<C>> asRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m15768of() : new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering());
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        sf80.m183894p(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.m15844of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (!rangeCanonical.hasLowerBound()) {
            ig3.m135964a("Neither the DiscreteDomain nor this range set are bounded below");
            return null;
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (NoSuchElementException unused) {
                ig3.m135964a("Neither the DiscreteDomain nor this range set are bounded above");
                return null;
            }
        }
        return new AsSet(discreteDomain);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p149l.ecc0
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
            ImmutableRangeSet<C> immutableRangeSetM15761of = m15761of();
            this.complement = immutableRangeSetM15761of;
            return immutableRangeSetM15761of;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(ecc0<C> ecc0Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(ecc0Var);
        return copyOf(treeRangeSetCreate);
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    public boolean encloses(Range<C> range) {
        int iM16132c = SortedLists.m16132c(this.ranges, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iM16132c != -1 && this.ranges.get(iM16132c).encloses(range);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(ecc0<C> ecc0Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(ecc0Var.complement());
        return copyOf(treeRangeSetCreate);
    }

    @Override // p149l.AbstractC21329y7
    public boolean intersects(Range<C> range) {
        int iM16132c = SortedLists.m16132c(this.ranges, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iM16132c < this.ranges.size() && this.ranges.get(iM16132c).isConnected(range) && !this.ranges.get(iM16132c).intersection(range).isEmpty()) {
            return true;
        }
        if (iM16132c <= 0) {
            return false;
        }
        int i = iM16132c - 1;
        return this.ranges.get(i).isConnected(range) && !this.ranges.get(i).intersection(range).isEmpty();
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    @Override // p149l.AbstractC21329y7
    public Range<C> rangeContaining(C c) {
        int iM16132c = SortedLists.m16132c(this.ranges, Range.lowerBoundFn(), Cut.belowValue(c), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16132c != -1) {
            Range<C> range = this.ranges.get(iM16132c);
            if (range.contains(c)) {
                return range;
            }
        }
        return null;
    }

    @Override // p149l.AbstractC21329y7
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    @Deprecated
    public void removeAll(ecc0<C> ecc0Var) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (this.ranges.isEmpty()) {
            lmr.m150601a();
            return null;
        }
        Cut<C> cut = this.ranges.get(0).lowerBound;
        ImmutableList<Range<C>> immutableList = this.ranges;
        return Range.create(cut, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // p149l.ecc0
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
        return m15761of();
    }

    public ImmutableRangeSet<C> union(ecc0<C> ecc0Var) {
        return unionOf(aiq.m96878d(asRanges(), ecc0Var.asRanges()));
    }

    public Object writeReplace() {
        return new SerializedForm(this.ranges);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean enclosesAll(ecc0 ecc0Var) {
        return super.enclosesAll(ecc0Var);
    }

    @Override // p149l.AbstractC21329y7
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.AbstractC21329y7
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m15761of() {
        return EMPTY;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new C2801a().m15766b(iterable).m15767c();
    }
}
