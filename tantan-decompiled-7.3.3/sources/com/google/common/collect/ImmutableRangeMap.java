package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.adj;
import p153l.gyj0;
import p153l.hkc0;
import p153l.jkc0;
import p153l.mor;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements jkc0<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.m15739of(), ImmutableList.m15739of());
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
            C2820a c2820a = new C2820a();
            gyj0<Map.Entry<Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                c2820a.m15814b(next.getKey(), next.getValue());
            }
            return c2820a.m15813a();
        }

        public Object readResolve() {
            return this.mapOfRanges.isEmpty() ? ImmutableRangeMap.m15811of() : createRangeMap();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$a */
    public static final class C2820a<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a */
        public final List<Map.Entry<Range<K>, V>> f10953a = Lists.m15977j();

        /* JADX INFO: renamed from: a */
        public ImmutableRangeMap<K, V> m15813a() {
            Collections.sort(this.f10953a, Range.rangeLexOrdering().onKeys());
            ImmutableList.C2804a c2804a = new ImmutableList.C2804a(this.f10953a.size());
            ImmutableList.C2804a c2804a2 = new ImmutableList.C2804a(this.f10953a.size());
            for (int i = 0; i < this.f10953a.size(); i++) {
                Range<K> key = this.f10953a.get(i).getKey();
                if (i > 0) {
                    Range<K> key2 = this.f10953a.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        String strValueOf = String.valueOf(key2);
                        String strValueOf2 = String.valueOf(key);
                        hkc0.m135621a(strValueOf.length() + 47 + strValueOf2.length(), "Overlapping ranges: range ", strValueOf, " overlaps with entry ", strValueOf2);
                        return null;
                    }
                }
                c2804a.mo15737a(key);
                c2804a2.mo15737a(this.f10953a.get(i).getValue());
            }
            return new ImmutableRangeMap<>(c2804a.m15756m(), c2804a2.m15756m());
        }

        /* JADX INFO: renamed from: b */
        public C2820a<K, V> m15814b(Range<K> range, V v2) {
            xn80.m212111p(range);
            xn80.m212111p(v2);
            xn80.m212106k(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f10953a.add(Maps.m16089j(range, v2));
            return this;
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public static <K extends Comparable<?>, V> C2820a<K, V> builder() {
        return new C2820a<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(jkc0<K, ? extends V> jkc0Var) {
        if (jkc0Var instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) jkc0Var;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = jkc0Var.asMapOfRanges();
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a(mapAsMapOfRanges.size());
        ImmutableList.C2804a c2804a2 = new ImmutableList.C2804a(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            c2804a.mo15737a((Range) entry.getKey());
            c2804a2.mo15737a(entry.getValue());
        }
        return new ImmutableRangeMap<>(c2804a.m15756m(), c2804a2.m15756m());
    }

    /* JADX INFO: renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m15812of(Range<K> range, V v2) {
        return new ImmutableRangeMap<>(ImmutableList.m15740of(range), ImmutableList.m15740of(v2));
    }

    @Override // 
    /* JADX INFO: renamed from: asDescendingMapOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> mo225036asDescendingMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.m15769of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // p153l.jkc0
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.m15769of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof jkc0) {
            return asMapOfRanges().equals(((jkc0) obj).asMapOfRanges());
        }
        return false;
    }

    public V get(K k) {
        int iM16185b = SortedLists.m16185b(this.ranges, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16185b != -1 && this.ranges.get(iM16185b).contains(k)) {
            return this.values.get(iM16185b);
        }
        return null;
    }

    public Map.Entry<Range<K>, V> getEntry(K k) {
        int iM16185b = SortedLists.m16185b(this.ranges, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iM16185b == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(iM16185b);
        if (range.contains(k)) {
            return Maps.m16089j(range, this.values.get(iM16185b));
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
    public final void putAll(jkc0<K, V> jkc0Var) {
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
            mor.m159308a();
            return null;
        }
        Range<K> range = this.ranges.get(0);
        ImmutableList<Range<K>> immutableList = this.ranges;
        return Range.create(range.lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // 
    /* JADX INFO: renamed from: subRangeMap */
    public ImmutableRangeMap<K, V> mo225037subRangeMap(final Range<K> range) {
        if (((Range) xn80.m212111p(range)).isEmpty()) {
            return m15811of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.ranges;
        adj adjVarUpperBoundFn = Range.upperBoundFn();
        Comparable comparable = range.lowerBound;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int iM16185b = SortedLists.m16185b(immutableList, adjVarUpperBoundFn, comparable, keyPresentBehavior, keyAbsentBehavior);
        int iM16185b2 = SortedLists.m16185b(this.ranges, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (iM16185b >= iM16185b2) {
            return m15811of();
        }
        final int i = iM16185b2 - iM16185b;
        return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>() { // from class: com.google.common.collect.ImmutableRangeMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<K> get(int i2) {
                xn80.m212109n(i2, i);
                return (i2 == 0 || i2 == i + (-1)) ? ((Range) ImmutableRangeMap.this.ranges.get(i2 + iM16185b)).intersection(range) : (Range) ImmutableRangeMap.this.ranges.get(i2 + iM16185b);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }
        }, this.values.subList(iM16185b, iM16185b2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            @Override // com.google.common.collect.ImmutableRangeMap
            /* JADX INFO: renamed from: asDescendingMapOfRanges */
            public /* bridge */ /* synthetic */ Map mo225036asDescendingMapOfRanges() {
                return super.mo225036asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, p153l.jkc0
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
            public ImmutableRangeMap<K, V> mo225037subRangeMap(Range<K> range2) {
                return range.isConnected(range2) ? this.mo225037subRangeMap((Range) range2.intersection(range)) : ImmutableRangeMap.m15811of();
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
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m15811of() {
        return (ImmutableRangeMap<K, V>) EMPTY;
    }
}
