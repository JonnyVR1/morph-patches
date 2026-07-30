package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p149l.acc0;
import p149l.ccc0;
import p149l.dpj0;
import p149l.gaj;
import p149l.lmr;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements ccc0<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.m15685of(), ImmutableList.m15685of());
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        public Object createRangeMap() {
            C2797a c2797a = new C2797a();
            dpj0<Map.Entry<Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                c2797a.m15760b(next.getKey(), next.getValue());
            }
            return c2797a.m15759a();
        }

        public Object readResolve() {
            return this.mapOfRanges.isEmpty() ? ImmutableRangeMap.m15757of() : createRangeMap();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$a */
    public static final class C2797a<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a */
        public final List<Map.Entry<Range<K>, V>> f10916a = Lists.m15923j();

        /* JADX INFO: renamed from: a */
        public ImmutableRangeMap<K, V> m15759a() {
            Collections.sort(this.f10916a, Range.rangeLexOrdering().onKeys());
            ImmutableList.C2781a c2781a = new ImmutableList.C2781a(this.f10916a.size());
            ImmutableList.C2781a c2781a2 = new ImmutableList.C2781a(this.f10916a.size());
            for (int i = 0; i < this.f10916a.size(); i++) {
                Range<K> key = this.f10916a.get(i).getKey();
                if (i > 0) {
                    Range<K> key2 = this.f10916a.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        String strValueOf = String.valueOf(key2);
                        String strValueOf2 = String.valueOf(key);
                        acc0.m95719a(strValueOf.length() + 47 + strValueOf2.length(), "Overlapping ranges: range ", strValueOf, " overlaps with entry ", strValueOf2);
                        return null;
                    }
                }
                c2781a.mo15683a(key);
                c2781a2.mo15683a(this.f10916a.get(i).getValue());
            }
            return new ImmutableRangeMap<>(c2781a.m15702m(), c2781a2.m15702m());
        }

        /* JADX INFO: renamed from: b */
        public C2797a<K, V> m15760b(Range<K> range, V v2) {
            sf80.m183894p(range);
            sf80.m183894p(v2);
            sf80.m183889k(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f10916a.add(Maps.m16035j(range, v2));
            return this;
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public static <K extends Comparable<?>, V> C2797a<K, V> builder() {
        return new C2797a<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(ccc0<K, ? extends V> ccc0Var) {
        if (ccc0Var instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) ccc0Var;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = ccc0Var.asMapOfRanges();
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a(mapAsMapOfRanges.size());
        ImmutableList.C2781a c2781a2 = new ImmutableList.C2781a(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            c2781a.mo15683a((Range) entry.getKey());
            c2781a2.mo15683a(entry.getValue());
        }
        return new ImmutableRangeMap<>(c2781a.m15702m(), c2781a2.m15702m());
    }

    /* JADX INFO: renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m15758of(Range<K> range, V v2) {
        return new ImmutableRangeMap<>(ImmutableList.m15686of(range), ImmutableList.m15686of(v2));
    }

    @Override // 
    /* JADX INFO: renamed from: asDescendingMapOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> mo223790asDescendingMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.m15715of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // p149l.ccc0
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.m15715of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ccc0) {
            return asMapOfRanges().equals(((ccc0) obj).asMapOfRanges());
        }
        return false;
    }

    public V get(K k) {
        int iM16131b = SortedLists.m16131b(this.ranges, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16131b != -1 && this.ranges.get(iM16131b).contains(k)) {
            return this.values.get(iM16131b);
        }
        return null;
    }

    public Map.Entry<Range<K>, V> getEntry(K k) {
        int iM16131b = SortedLists.m16131b(this.ranges, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16131b == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(iM16131b);
        if (range.contains(k)) {
            return Maps.m16035j(range, this.values.get(iM16131b));
        }
        return null;
    }

    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Deprecated
    public final void put(Range<K> range, V v2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(ccc0<K, V> ccc0Var) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putCoalescing(Range<K> range, V v2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    public Range<K> span() {
        if (this.ranges.isEmpty()) {
            lmr.m150601a();
            return null;
        }
        Range<K> range = this.ranges.get(0);
        ImmutableList<Range<K>> immutableList = this.ranges;
        return Range.create(range.lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // 
    /* JADX INFO: renamed from: subRangeMap */
    public ImmutableRangeMap<K, V> mo223791subRangeMap(final Range<K> range) {
        if (((Range) sf80.m183894p(range)).isEmpty()) {
            return m15757of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.ranges;
        gaj gajVarUpperBoundFn = Range.upperBoundFn();
        Comparable comparable = range.lowerBound;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int iM16131b = SortedLists.m16131b(immutableList, gajVarUpperBoundFn, comparable, keyPresentBehavior, keyAbsentBehavior);
        int iM16131b2 = SortedLists.m16131b(this.ranges, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (iM16131b >= iM16131b2) {
            return m15757of();
        }
        final int i = iM16131b2 - iM16131b;
        return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>() { // from class: com.google.common.collect.ImmutableRangeMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<K> get(int i2) {
                sf80.m183892n(i2, i);
                return (i2 == 0 || i2 == i + (-1)) ? ((Range) ImmutableRangeMap.this.ranges.get(i2 + iM16131b)).intersection(range) : (Range) ImmutableRangeMap.this.ranges.get(i2 + iM16131b);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }
        }, this.values.subList(iM16131b, iM16131b2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            @Override // com.google.common.collect.ImmutableRangeMap
            /* JADX INFO: renamed from: asDescendingMapOfRanges */
            public /* bridge */ /* synthetic */ Map mo223790asDescendingMapOfRanges() {
                return super.mo223790asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, p149l.ccc0
            public /* bridge */ /* synthetic */ Map asMapOfRanges() {
                return super.asMapOfRanges();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.ImmutableRangeMap
            /* JADX INFO: renamed from: subRangeMap, reason: merged with bridge method [inline-methods] */
            public ImmutableRangeMap<K, V> mo223791subRangeMap(Range<K> range2) {
                return range.isConnected(range2) ? this.mo223791subRangeMap((Range) range2.intersection(range)) : ImmutableRangeMap.m15757of();
            }
        };
    }

    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(asMapOfRanges());
    }

    /* JADX INFO: renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m15757of() {
        return (ImmutableRangeMap<K, V>) EMPTY;
    }
}
