package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;
import p153l.tg3;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    @Deprecated
    public static <E> ImmutableSortedSet.C2832a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        xn80.m212111p(range);
        xn80.m212111p(discreteDomain);
        try {
            Range<C> rangeIntersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(discreteDomain.minValue())) : range;
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableLeastValueAbove = range.lowerBound.leastValueAbove(discreteDomain);
                Objects.requireNonNull(comparableLeastValueAbove);
                Comparable comparableGreatestValueBelow = range.upperBound.greatestValueBelow(discreteDomain);
                Objects.requireNonNull(comparableGreatestValueBelow);
                if (Range.compareOrThrow(comparableLeastValueAbove, comparableGreatestValueBelow) <= 0) {
                    return new RegularContiguousSet(rangeIntersection, discreteDomain);
                }
            }
            return new EmptyContiguousSet(discreteDomain);
        } catch (NoSuchElementException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<C> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c) {
        return headSetImpl((Comparable) xn80.m212111p(c), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c, C c2) {
        xn80.m212111p(c);
        xn80.m212111p(c2);
        xn80.m212099d(comparator().compare(c, c2) <= 0);
        return subSetImpl((Comparable) c, true, (Comparable) c2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c) {
        return tailSetImpl((Comparable) xn80.m212111p(c), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> headSet(C c, boolean z) {
        return headSetImpl((Comparable) xn80.m212111p(c), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> tailSet(C c, boolean z) {
        return tailSetImpl((Comparable) xn80.m212111p(c), z);
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(Range.closed(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(Range.closedOpen(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        xn80.m212111p(c);
        xn80.m212111p(c2);
        xn80.m212099d(comparator().compare(c, c2) <= 0);
        return subSetImpl((Comparable) c, z, (Comparable) c2, z2);
    }
}
