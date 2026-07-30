package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;
import p153l.AbstractC20777v7;
import p153l.gyj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    /* JADX INFO: renamed from: com.google.common.collect.RegularContiguousSet$a */
    public class C2932a extends AbstractC20777v7<C> {

        /* JADX INFO: renamed from: b */
        public final C f11123b;

        public C2932a(Comparable comparable) {
            super(comparable);
            this.f11123b = (C) RegularContiguousSet.this.last();
        }

        @Override // p153l.AbstractC20777v7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C mo15593a(C c) {
            if (RegularContiguousSet.equalsOrThrow(c, this.f11123b)) {
                return null;
            }
            return (C) RegularContiguousSet.this.domain.next(c);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.RegularContiguousSet$b */
    public class C2933b extends AbstractC20777v7<C> {

        /* JADX INFO: renamed from: b */
        public final C f11125b;

        public C2933b(Comparable comparable) {
            super(comparable);
            this.f11125b = (C) RegularContiguousSet.this.first();
        }

        @Override // p153l.AbstractC20777v7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C mo15593a(C c) {
            if (RegularContiguousSet.equalsOrThrow(c, this.f11125b)) {
                return null;
            }
            return (C) RegularContiguousSet.this.domain.previous(c);
        }
    }

    public RegularContiguousSet(Range<C> range, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsOrThrow(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && Range.compareOrThrow(comparable, comparable2) == 0;
    }

    private ContiguousSet<C> intersectionInCurrentDomain(Range<C> range) {
        return this.range.isConnected(range) ? ContiguousSet.create(this.range.intersection(range), this.domain) : new EmptyContiguousSet(this.domain);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return C2991g.m16312a(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
        return this.domain.supportsFastOffset ? new ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
            @Override // java.util.List
            public C get(int i) {
                xn80.m212109n(i, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return (C) regularContiguousSet.domain.offset(regularContiguousSet.first(), i);
            }

            @Override // com.google.common.collect.ImmutableAsList
            public ImmutableSortedSet<C> delegateCollection() {
                return RegularContiguousSet.this;
            }
        } : super.createAsList();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public gyj0<C> descendingIterator() {
        return new C2933b(last());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
        Comparable comparableLeastValueAbove = this.range.lowerBound.leastValueAbove(this.domain);
        Objects.requireNonNull(comparableLeastValueAbove);
        return (C) comparableLeastValueAbove;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m16173d(this);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(Range.upTo(c, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        DiscreteDomain<C> discreteDomain = this.domain;
        Comparable comparableFirst = first();
        Objects.requireNonNull(obj);
        return (int) discreteDomain.distance(comparableFirst, (Comparable) obj);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        xn80.m212111p(contiguousSet);
        xn80.m212099d(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.natural().max(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.natural().min(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.domain) : new EmptyContiguousSet(this.domain);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public gyj0<C> iterator() {
        return new C2932a(first());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
        Comparable comparableGreatestValueBelow = this.range.upperBound.greatestValueBelow(this.domain);
        Objects.requireNonNull(comparableGreatestValueBelow);
        return (C) comparableGreatestValueBelow;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.create(this.range.lowerBound.withLowerBoundType(boundType, this.domain), this.range.upperBound.withUpperBoundType(boundType2, this.domain));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.domain.distance(first(), last());
        return jDistance >= 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        return (c.compareTo(c2) != 0 || z || z2) ? intersectionInCurrentDomain(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2))) : new EmptyContiguousSet(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(Range.downTo(c, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.range, this.domain, null);
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        final DiscreteDomain<C> domain;
        final Range<C> range;

        private SerializedForm(Range<C> range, DiscreteDomain<C> discreteDomain) {
            this.range = range;
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.range, this.domain);
        }

        public /* synthetic */ SerializedForm(Range range, DiscreteDomain discreteDomain, C2932a c2932a) {
            this(range, discreteDomain);
        }
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }
}
