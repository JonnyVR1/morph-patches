package com.google.common.collect;

import com.google.common.base.C2654a;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import p149l.AbstractC21329y7;
import p149l.ecc0;
import p149l.lmr;
import p149l.ni60;
import p149l.qzi;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractC21329y7<C> implements Serializable {
    private transient Set<Range<C>> asDescendingSetOfRanges;
    private transient Set<Range<C>> asRanges;
    private transient ecc0<C> complement;
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new C2959c(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.ecc0
        public ecc0<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubRangeSet(Range<C> range) {
            super(new C2961e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public void add(Range<C> range) {
            sf80.m183890l(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public boolean contains(C c) {
            return this.restriction.contains(c) && TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7, p149l.ecc0
        public boolean encloses(Range<C> range) {
            Range rangeRangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeRangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeRangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public Range<C> rangeContaining(C c) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(c) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.AbstractC21329y7
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, p149l.ecc0
        public ecc0<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            return range.isConnected(this.restriction) ? new SubRangeSet(this.restriction.intersection(range)) : ImmutableRangeSet.m15761of();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e */
    public static final class C2961e<C extends Comparable<?>> extends AbstractC2964c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final Range<Cut<C>> f11183a;

        /* JADX INFO: renamed from: b */
        public final Range<C> f11184b;

        /* JADX INFO: renamed from: c */
        public final NavigableMap<Cut<C>, Range<C>> f11185c;

        /* JADX INFO: renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> f11186d;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11187c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11188d;

            public a(Iterator it, Cut cut) {
                this.f11187c = it;
                this.f11188d = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                if (!this.f11187c.hasNext()) {
                    return (Map.Entry) m15566b();
                }
                Range range = (Range) this.f11187c.next();
                if (this.f11188d.isLessThan(range.lowerBound)) {
                    return (Map.Entry) m15566b();
                }
                Range rangeIntersection = range.intersection(C2961e.this.f11184b);
                return Maps.m16035j(rangeIntersection.lowerBound, rangeIntersection);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11190c;

            public b(Iterator it) {
                this.f11190c = it;
            }

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
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                if (!this.f11190c.hasNext()) {
                    return (Map.Entry) m15566b();
                }
                Range range = (Range) this.f11190c.next();
                if (C2961e.this.f11184b.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                    return (Map.Entry) m15566b();
                }
                Range rangeIntersection = range.intersection(C2961e.this.f11184b);
                return C2961e.this.f11183a.contains(rangeIntersection.lowerBound) ? Maps.m16035j(rangeIntersection.lowerBound, rangeIntersection) : (Map.Entry) m15566b();
            }
        }

        public C2961e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f11183a = (Range) sf80.m183894p(range);
            this.f11184b = (Range) sf80.m183894p(range2);
            this.f11185c = (NavigableMap) sf80.m183894p(navigableMap);
            this.f11186d = new C2960d(navigableMap);
        }

        /* JADX INFO: renamed from: h */
        private NavigableMap<Cut<C>, Range<C>> m16246h(Range<Cut<C>> range) {
            return !range.isConnected(this.f11183a) ? ImmutableSortedMap.m15791of() : new C2961e(this.f11183a.intersection(range), this.f11184b, this.f11185c);
        }

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
        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15610a() {
            Iterator<Range<C>> it;
            if (this.f11184b.isEmpty()) {
                return Iterators.m15879i();
            }
            if (this.f11183a.upperBound.isLessThan(this.f11184b.lowerBound)) {
                return Iterators.m15879i();
            }
            if (this.f11183a.lowerBound.isLessThan(this.f11184b.lowerBound)) {
                it = this.f11186d.tailMap(this.f11184b.lowerBound, false).values().iterator();
            } else {
                it = this.f11185c.tailMap((Cut) this.f11183a.lowerBound.endpoint(), this.f11183a.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new a(it, (Cut) Ordering.natural().min(this.f11183a.upperBound, Cut.belowValue(this.f11184b.upperBound)));
        }

        @Override // com.google.common.collect.AbstractC2964c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16228b() {
            if (this.f11184b.isEmpty()) {
                return Iterators.m15879i();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f11183a.upperBound, Cut.belowValue(this.f11184b.upperBound));
            return new b(this.f11185c.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

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
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f11183a.contains(cut) && cut.compareTo((Cut) this.f11184b.lowerBound) >= 0 && cut.compareTo((Cut) this.f11184b.upperBound) < 0) {
                        boolean zEquals = cut.equals(this.f11184b.lowerBound);
                        NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11185c;
                        if (zEquals) {
                            Range range = (Range) Maps.m16024M(navigableMap.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.f11184b.lowerBound) > 0) {
                                return range.intersection(this.f11184b);
                            }
                        } else {
                            Range<C> range2 = navigableMap.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f11184b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m16246h(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16246h(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16246h(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m15896z(mo15610a());
        }
    }

    private TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range<C> rangeEnclosing(Range<C> range) {
        sf80.m183894p(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        boolean zIsEmpty = range.isEmpty();
        NavigableMap<Cut<C>, Range<C>> navigableMap = this.rangesByLowerBound;
        if (zIsEmpty) {
            navigableMap.remove(range.lowerBound);
        } else {
            navigableMap.put(range.lowerBound, range);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p149l.AbstractC21329y7
    public void add(Range<C> range) {
        sf80.m183894p(range);
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) cut) >= 0) {
                if (value.upperBound.compareTo((Cut) cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((Cut) cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, cut2));
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        C2958b c2958b = new C2958b(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = c2958b;
        return c2958b;
    }

    @Override // p149l.ecc0
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        C2958b c2958b = new C2958b(this, this.rangesByLowerBound.values());
        this.asRanges = c2958b;
        return c2958b;
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p149l.ecc0
    public ecc0<C> complement() {
        ecc0<C> ecc0Var = this.complement;
        if (ecc0Var != null) {
            return ecc0Var;
        }
        Complement complement = new Complement();
        this.complement = complement;
        return complement;
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    public boolean encloses(Range<C> range) {
        sf80.m183894p(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p149l.AbstractC21329y7
    public boolean intersects(Range<C> range) {
        sf80.m183894p(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p149l.AbstractC21329y7
    public Range<C> rangeContaining(C c) {
        sf80.m183894p(c);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

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
    @Override // p149l.AbstractC21329y7
    public void remove(Range<C> range) {
        sf80.m183894p(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry != null && entryLastEntry != null) {
            return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
        }
        lmr.m150601a();
        return null;
    }

    @Override // p149l.ecc0
    public ecc0<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$b */
    public final class C2958b extends qzi<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: a */
        public final Collection<Range<C>> f11165a;

        public C2958b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f11165a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16116a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16119d(this);
        }

        @Override // p149l.qzi, p149l.a0j
        public Collection<Range<C>> delegate() {
            return this.f11165a;
        }
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ void addAll(ecc0 ecc0Var) {
        super.addAll(ecc0Var);
    }

    @Override // p149l.AbstractC21329y7, p149l.ecc0
    public /* bridge */ /* synthetic */ void removeAll(ecc0 ecc0Var) {
        super.removeAll(ecc0Var);
    }

    @Override // p149l.AbstractC21329y7
    public /* bridge */ /* synthetic */ boolean enclosesAll(ecc0 ecc0Var) {
        return super.enclosesAll(ecc0Var);
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d */
    public static final class C2960d<C extends Comparable<?>> extends AbstractC2964c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<Cut<C>, Range<C>> f11177a;

        /* JADX INFO: renamed from: b */
        public final Range<Cut<C>> f11178b;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11179c;

            public a(Iterator it) {
                this.f11179c = it;
            }

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
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                if (!this.f11179c.hasNext()) {
                    return (Map.Entry) m15566b();
                }
                Range range = (Range) this.f11179c.next();
                return C2960d.this.f11178b.upperBound.isLessThan(range.upperBound) ? (Map.Entry) m15566b() : Maps.m16035j(range.upperBound, range);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ni60 f11181c;

            public b(ni60 ni60Var) {
                this.f11181c = ni60Var;
            }

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
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                if (!this.f11181c.hasNext()) {
                    return (Map.Entry) m15566b();
                }
                Range range = (Range) this.f11181c.next();
                return C2960d.this.f11178b.lowerBound.isLessThan(range.upperBound) ? Maps.m16035j(range.upperBound, range) : (Map.Entry) m15566b();
            }
        }

        public C2960d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f11177a = navigableMap;
            this.f11178b = Range.all();
        }

        /* JADX INFO: renamed from: g */
        private NavigableMap<Cut<C>, Range<C>> m16237g(Range<Cut<C>> range) {
            return range.isConnected(this.f11178b) ? new C2960d(this.f11177a, range.intersection(this.f11178b)) : ImmutableSortedMap.m15791of();
        }

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
        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15610a() {
            Iterator<Range<C>> it;
            boolean zHasLowerBound = this.f11178b.hasLowerBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11177a;
            if (zHasLowerBound) {
                Map.Entry<Cut<C>, Range<C>> entryLowerEntry = navigableMap.lowerEntry((Cut) this.f11178b.lowerEndpoint());
                if (entryLowerEntry == null) {
                    it = this.f11177a.values().iterator();
                } else {
                    boolean zIsLessThan = this.f11178b.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound);
                    NavigableMap<Cut<C>, Range<C>> navigableMap2 = this.f11177a;
                    it = zIsLessThan ? navigableMap2.tailMap(entryLowerEntry.getKey(), true).values().iterator() : navigableMap2.tailMap((Cut) this.f11178b.lowerEndpoint(), true).values().iterator();
                }
            } else {
                it = navigableMap.values().iterator();
            }
            return new a(it);
        }

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
        @Override // com.google.common.collect.AbstractC2964c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16228b() {
            boolean zHasUpperBound = this.f11178b.hasUpperBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11177a;
            ni60 ni60VarM15890t = Iterators.m15890t((zHasUpperBound ? navigableMap.headMap((Cut) this.f11178b.upperEndpoint(), false).descendingMap().values() : navigableMap.descendingMap().values()).iterator());
            if (ni60VarM15890t.hasNext() && this.f11178b.upperBound.isLessThan(((Range) ni60VarM15890t.peek()).upperBound)) {
                ni60VarM15890t.next();
            }
            return new b(ni60VarM15890t);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f11178b.contains(cut) && (entryLowerEntry = this.f11177a.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m16237g(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16237g(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16237g(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f11178b.equals(Range.all())) {
                return this.f11177a.isEmpty();
            }
            return !mo15610a().hasNext();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11178b.equals(Range.all()) ? this.f11177a.size() : Iterators.m15896z(mo15610a());
        }

        public C2960d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f11177a = navigableMap;
            this.f11178b = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(ecc0<C> ecc0Var) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(ecc0Var);
        return treeRangeSetCreate;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c */
    public static final class C2959c<C extends Comparable<?>> extends AbstractC2964c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<Cut<C>, Range<C>> f11166a;

        /* JADX INFO: renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f11167b;

        /* JADX INFO: renamed from: c */
        public final Range<Cut<C>> f11168c;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public Cut<C> f11169c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11170d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ni60 f11171e;

            public a(Cut cut, ni60 ni60Var) {
                this.f11170d = cut;
                this.f11171e = ni60Var;
                this.f11169c = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                Range rangeCreate;
                if (C2959c.this.f11168c.upperBound.isLessThan(this.f11169c) || this.f11169c == Cut.aboveAll()) {
                    return (Map.Entry) m15566b();
                }
                if (this.f11171e.hasNext()) {
                    Range range = (Range) this.f11171e.next();
                    rangeCreate = Range.create(this.f11169c, range.lowerBound);
                    this.f11169c = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.f11169c, Cut.aboveAll());
                    this.f11169c = Cut.aboveAll();
                }
                return Maps.m16035j(rangeCreate.lowerBound, rangeCreate);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public Cut<C> f11173c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11174d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ni60 f11175e;

            public b(Cut cut, ni60 ni60Var) {
                this.f11174d = cut;
                this.f11175e = ni60Var;
                this.f11173c = cut;
            }

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
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15565a() {
                if (this.f11173c == Cut.belowAll()) {
                    return (Map.Entry) m15566b();
                }
                if (this.f11175e.hasNext()) {
                    Range range = (Range) this.f11175e.next();
                    Range rangeCreate = Range.create(range.upperBound, this.f11173c);
                    this.f11173c = range.lowerBound;
                    if (C2959c.this.f11168c.lowerBound.isLessThan(rangeCreate.lowerBound)) {
                        return Maps.m16035j(rangeCreate.lowerBound, rangeCreate);
                    }
                } else if (C2959c.this.f11168c.lowerBound.isLessThan(Cut.belowAll())) {
                    Range rangeCreate2 = Range.create(Cut.belowAll(), this.f11173c);
                    this.f11173c = Cut.belowAll();
                    return Maps.m16035j(Cut.belowAll(), rangeCreate2);
                }
                return (Map.Entry) m15566b();
            }
        }

        public C2959c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f11166a = navigableMap;
            this.f11167b = new C2960d(navigableMap);
            this.f11168c = range;
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15610a() {
            Collection<Range<C>> collectionValues;
            Cut cutBelowAll;
            boolean zHasLowerBound = this.f11168c.hasLowerBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11167b;
            if (zHasLowerBound) {
                collectionValues = navigableMap.tailMap((Cut) this.f11168c.lowerEndpoint(), this.f11168c.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = navigableMap.values();
            }
            ni60 ni60VarM15890t = Iterators.m15890t(collectionValues.iterator());
            if (this.f11168c.contains(Cut.belowAll()) && (!ni60VarM15890t.hasNext() || ((Range) ni60VarM15890t.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else {
                if (!ni60VarM15890t.hasNext()) {
                    return Iterators.m15879i();
                }
                cutBelowAll = ((Range) ni60VarM15890t.next()).upperBound;
            }
            return new a(cutBelowAll, ni60VarM15890t);
        }

        @Override // com.google.common.collect.AbstractC2964c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16228b() {
            Cut<C> cutHigherKey;
            ni60 ni60VarM15890t = Iterators.m15890t(this.f11167b.headMap(this.f11168c.hasUpperBound() ? (Cut) this.f11168c.upperEndpoint() : Cut.aboveAll(), this.f11168c.hasUpperBound() && this.f11168c.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (ni60VarM15890t.hasNext()) {
                cutHigherKey = ((Range) ni60VarM15890t.peek()).upperBound == Cut.aboveAll() ? ((Range) ni60VarM15890t.next()).lowerBound : this.f11166a.higherKey(((Range) ni60VarM15890t.peek()).upperBound);
            } else {
                if (!this.f11168c.contains(Cut.belowAll()) || this.f11166a.containsKey(Cut.belowAll())) {
                    return Iterators.m15879i();
                }
                cutHigherKey = this.f11166a.higherKey(Cut.belowAll());
            }
            return new b((Cut) C2654a.m15426a(cutHigherKey, Cut.aboveAll()), ni60VarM15890t);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap(cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m16232g(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16232g(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        /* JADX INFO: renamed from: g */
        public final NavigableMap<Cut<C>, Range<C>> m16232g(Range<Cut<C>> range) {
            if (!this.f11168c.isConnected(range)) {
                return ImmutableSortedMap.m15791of();
            }
            return new C2959c(this.f11166a, range.intersection(this.f11168c));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16232g(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m15896z(mo15610a());
        }

        public C2959c(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }
    }
}
