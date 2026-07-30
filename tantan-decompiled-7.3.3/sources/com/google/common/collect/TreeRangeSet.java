package com.google.common.collect;

import com.google.common.base.C2677a;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import p153l.AbstractC20250t7;
import p153l.l2j;
import p153l.lkc0;
import p153l.mor;
import p153l.sq60;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractC20250t7<C> implements Serializable {
    private transient Set<Range<C>> asDescendingSetOfRanges;
    private transient Set<Range<C>> asRanges;
    private transient lkc0<C> complement;
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new C2982c(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.lkc0
        public lkc0<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubRangeSet(Range<C> range) {
            super(new C2984e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public void add(Range<C> range) {
            xn80.m212107l(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public boolean contains(C c) {
            return this.restriction.contains(c) && TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7, p153l.lkc0
        public boolean encloses(Range<C> range) {
            Range rangeRangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeRangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeRangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public Range<C> rangeContaining(C c) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(c) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.AbstractC20250t7
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, p153l.lkc0
        public lkc0<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            return range.isConnected(this.restriction) ? new SubRangeSet(this.restriction.intersection(range)) : ImmutableRangeSet.m15815of();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e */
    public static final class C2984e<C extends Comparable<?>> extends AbstractC2987c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final Range<Cut<C>> f11220a;

        /* JADX INFO: renamed from: b */
        public final Range<C> f11221b;

        /* JADX INFO: renamed from: c */
        public final NavigableMap<Cut<C>, Range<C>> f11222c;

        /* JADX INFO: renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> f11223d;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11224c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11225d;

            public a(Iterator it, Cut cut) {
                this.f11224c = it;
                this.f11225d = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                if (!this.f11224c.hasNext()) {
                    return (Map.Entry) m15620b();
                }
                Range range = (Range) this.f11224c.next();
                if (this.f11225d.isLessThan(range.lowerBound)) {
                    return (Map.Entry) m15620b();
                }
                Range rangeIntersection = range.intersection(C2984e.this.f11221b);
                return Maps.m16089j(rangeIntersection.lowerBound, rangeIntersection);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$e$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11227c;

            public b(Iterator it) {
                this.f11227c = it;
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
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                if (!this.f11227c.hasNext()) {
                    return (Map.Entry) m15620b();
                }
                Range range = (Range) this.f11227c.next();
                if (C2984e.this.f11221b.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                    return (Map.Entry) m15620b();
                }
                Range rangeIntersection = range.intersection(C2984e.this.f11221b);
                return C2984e.this.f11220a.contains(rangeIntersection.lowerBound) ? Maps.m16089j(rangeIntersection.lowerBound, rangeIntersection) : (Map.Entry) m15620b();
            }
        }

        public C2984e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f11220a = (Range) xn80.m212111p(range);
            this.f11221b = (Range) xn80.m212111p(range2);
            this.f11222c = (NavigableMap) xn80.m212111p(navigableMap);
            this.f11223d = new C2983d(navigableMap);
        }

        /* JADX INFO: renamed from: h */
        private NavigableMap<Cut<C>, Range<C>> m16300h(Range<Cut<C>> range) {
            return !range.isConnected(this.f11220a) ? ImmutableSortedMap.m15845of() : new C2984e(this.f11220a.intersection(range), this.f11221b, this.f11222c);
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
        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15664a() {
            Iterator<Range<C>> it;
            if (this.f11221b.isEmpty()) {
                return Iterators.m15933i();
            }
            if (this.f11220a.upperBound.isLessThan(this.f11221b.lowerBound)) {
                return Iterators.m15933i();
            }
            if (this.f11220a.lowerBound.isLessThan(this.f11221b.lowerBound)) {
                it = this.f11223d.tailMap(this.f11221b.lowerBound, false).values().iterator();
            } else {
                it = this.f11222c.tailMap((Cut) this.f11220a.lowerBound.endpoint(), this.f11220a.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new a(it, (Cut) Ordering.natural().min(this.f11220a.upperBound, Cut.belowValue(this.f11221b.upperBound)));
        }

        @Override // com.google.common.collect.AbstractC2987c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16282b() {
            if (this.f11221b.isEmpty()) {
                return Iterators.m15933i();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f11220a.upperBound, Cut.belowValue(this.f11221b.upperBound));
            return new b(this.f11222c.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator());
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
                    if (this.f11220a.contains(cut) && cut.compareTo((Cut) this.f11221b.lowerBound) >= 0 && cut.compareTo((Cut) this.f11221b.upperBound) < 0) {
                        boolean zEquals = cut.equals(this.f11221b.lowerBound);
                        NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11222c;
                        if (zEquals) {
                            Range range = (Range) Maps.m16078M(navigableMap.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.f11221b.lowerBound) > 0) {
                                return range.intersection(this.f11221b);
                            }
                        } else {
                            Range<C> range2 = navigableMap.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f11221b);
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
            return m16300h(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16300h(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16300h(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m15950z(mo15664a());
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
        xn80.m212111p(range);
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
    @Override // p153l.AbstractC20250t7
    public void add(Range<C> range) {
        xn80.m212111p(range);
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

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        C2981b c2981b = new C2981b(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = c2981b;
        return c2981b;
    }

    @Override // p153l.lkc0
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        C2981b c2981b = new C2981b(this, this.rangesByLowerBound.values());
        this.asRanges = c2981b;
        return c2981b;
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p153l.lkc0
    public lkc0<C> complement() {
        lkc0<C> lkc0Var = this.complement;
        if (lkc0Var != null) {
            return lkc0Var;
        }
        Complement complement = new Complement();
        this.complement = complement;
        return complement;
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    public boolean encloses(Range<C> range) {
        xn80.m212111p(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p153l.AbstractC20250t7
    public boolean intersects(Range<C> range) {
        xn80.m212111p(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p153l.AbstractC20250t7
    public Range<C> rangeContaining(C c) {
        xn80.m212111p(c);
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
    @Override // p153l.AbstractC20250t7
    public void remove(Range<C> range) {
        xn80.m212111p(range);
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

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry != null && entryLastEntry != null) {
            return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
        }
        mor.m159308a();
        return null;
    }

    @Override // p153l.lkc0
    public lkc0<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$b */
    public final class C2981b extends l2j<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: a */
        public final Collection<Range<C>> f11202a;

        public C2981b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f11202a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16170a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16173d(this);
        }

        @Override // p153l.l2j, p153l.v2j
        public Collection<Range<C>> delegate() {
            return this.f11202a;
        }
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ void addAll(lkc0 lkc0Var) {
        super.addAll(lkc0Var);
    }

    @Override // p153l.AbstractC20250t7, p153l.lkc0
    public /* bridge */ /* synthetic */ void removeAll(lkc0 lkc0Var) {
        super.removeAll(lkc0Var);
    }

    @Override // p153l.AbstractC20250t7
    public /* bridge */ /* synthetic */ boolean enclosesAll(lkc0 lkc0Var) {
        return super.enclosesAll(lkc0Var);
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d */
    public static final class C2983d<C extends Comparable<?>> extends AbstractC2987c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<Cut<C>, Range<C>> f11214a;

        /* JADX INFO: renamed from: b */
        public final Range<Cut<C>> f11215b;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f11216c;

            public a(Iterator it) {
                this.f11216c = it;
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
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                if (!this.f11216c.hasNext()) {
                    return (Map.Entry) m15620b();
                }
                Range range = (Range) this.f11216c.next();
                return C2983d.this.f11215b.upperBound.isLessThan(range.upperBound) ? (Map.Entry) m15620b() : Maps.m16089j(range.upperBound, range);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$d$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ sq60 f11218c;

            public b(sq60 sq60Var) {
                this.f11218c = sq60Var;
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
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                if (!this.f11218c.hasNext()) {
                    return (Map.Entry) m15620b();
                }
                Range range = (Range) this.f11218c.next();
                return C2983d.this.f11215b.lowerBound.isLessThan(range.upperBound) ? Maps.m16089j(range.upperBound, range) : (Map.Entry) m15620b();
            }
        }

        public C2983d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f11214a = navigableMap;
            this.f11215b = Range.all();
        }

        /* JADX INFO: renamed from: g */
        private NavigableMap<Cut<C>, Range<C>> m16291g(Range<Cut<C>> range) {
            return range.isConnected(this.f11215b) ? new C2983d(this.f11214a, range.intersection(this.f11215b)) : ImmutableSortedMap.m15845of();
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
        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15664a() {
            Iterator<Range<C>> it;
            boolean zHasLowerBound = this.f11215b.hasLowerBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11214a;
            if (zHasLowerBound) {
                Map.Entry<Cut<C>, Range<C>> entryLowerEntry = navigableMap.lowerEntry((Cut) this.f11215b.lowerEndpoint());
                if (entryLowerEntry == null) {
                    it = this.f11214a.values().iterator();
                } else {
                    boolean zIsLessThan = this.f11215b.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound);
                    NavigableMap<Cut<C>, Range<C>> navigableMap2 = this.f11214a;
                    it = zIsLessThan ? navigableMap2.tailMap(entryLowerEntry.getKey(), true).values().iterator() : navigableMap2.tailMap((Cut) this.f11215b.lowerEndpoint(), true).values().iterator();
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
        @Override // com.google.common.collect.AbstractC2987c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16282b() {
            boolean zHasUpperBound = this.f11215b.hasUpperBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11214a;
            sq60 sq60VarM15944t = Iterators.m15944t((zHasUpperBound ? navigableMap.headMap((Cut) this.f11215b.upperEndpoint(), false).descendingMap().values() : navigableMap.descendingMap().values()).iterator());
            if (sq60VarM15944t.hasNext() && this.f11215b.upperBound.isLessThan(((Range) sq60VarM15944t.peek()).upperBound)) {
                sq60VarM15944t.next();
            }
            return new b(sq60VarM15944t);
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
                    if (this.f11215b.contains(cut) && (entryLowerEntry = this.f11214a.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
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
            return m16291g(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16291g(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16291g(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f11215b.equals(Range.all())) {
                return this.f11214a.isEmpty();
            }
            return !mo15664a().hasNext();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11215b.equals(Range.all()) ? this.f11214a.size() : Iterators.m15950z(mo15664a());
        }

        public C2983d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f11214a = navigableMap;
            this.f11215b = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(lkc0<C> lkc0Var) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(lkc0Var);
        return treeRangeSetCreate;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c */
    public static final class C2982c<C extends Comparable<?>> extends AbstractC2987c<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<Cut<C>, Range<C>> f11203a;

        /* JADX INFO: renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f11204b;

        /* JADX INFO: renamed from: c */
        public final Range<Cut<C>> f11205c;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c$a */
        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public Cut<C> f11206c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11207d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sq60 f11208e;

            public a(Cut cut, sq60 sq60Var) {
                this.f11207d = cut;
                this.f11208e = sq60Var;
                this.f11206c = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                Range rangeCreate;
                if (C2982c.this.f11205c.upperBound.isLessThan(this.f11206c) || this.f11206c == Cut.aboveAll()) {
                    return (Map.Entry) m15620b();
                }
                if (this.f11208e.hasNext()) {
                    Range range = (Range) this.f11208e.next();
                    rangeCreate = Range.create(this.f11206c, range.lowerBound);
                    this.f11206c = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.f11206c, Cut.aboveAll());
                    this.f11206c = Cut.aboveAll();
                }
                return Maps.m16089j(rangeCreate.lowerBound, rangeCreate);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$c$b */
        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: c */
            public Cut<C> f11210c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Cut f11211d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sq60 f11212e;

            public b(Cut cut, sq60 sq60Var) {
                this.f11211d = cut;
                this.f11212e = sq60Var;
                this.f11210c = cut;
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
            public Map.Entry<Cut<C>, Range<C>> mo15619a() {
                if (this.f11210c == Cut.belowAll()) {
                    return (Map.Entry) m15620b();
                }
                if (this.f11212e.hasNext()) {
                    Range range = (Range) this.f11212e.next();
                    Range rangeCreate = Range.create(range.upperBound, this.f11210c);
                    this.f11210c = range.lowerBound;
                    if (C2982c.this.f11205c.lowerBound.isLessThan(rangeCreate.lowerBound)) {
                        return Maps.m16089j(rangeCreate.lowerBound, rangeCreate);
                    }
                } else if (C2982c.this.f11205c.lowerBound.isLessThan(Cut.belowAll())) {
                    Range rangeCreate2 = Range.create(Cut.belowAll(), this.f11210c);
                    this.f11210c = Cut.belowAll();
                    return Maps.m16089j(Cut.belowAll(), rangeCreate2);
                }
                return (Map.Entry) m15620b();
            }
        }

        public C2982c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f11203a = navigableMap;
            this.f11204b = new C2983d(navigableMap);
            this.f11205c = range;
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo15664a() {
            Collection<Range<C>> collectionValues;
            Cut cutBelowAll;
            boolean zHasLowerBound = this.f11205c.hasLowerBound();
            NavigableMap<Cut<C>, Range<C>> navigableMap = this.f11204b;
            if (zHasLowerBound) {
                collectionValues = navigableMap.tailMap((Cut) this.f11205c.lowerEndpoint(), this.f11205c.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = navigableMap.values();
            }
            sq60 sq60VarM15944t = Iterators.m15944t(collectionValues.iterator());
            if (this.f11205c.contains(Cut.belowAll()) && (!sq60VarM15944t.hasNext() || ((Range) sq60VarM15944t.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else {
                if (!sq60VarM15944t.hasNext()) {
                    return Iterators.m15933i();
                }
                cutBelowAll = ((Range) sq60VarM15944t.next()).upperBound;
            }
            return new a(cutBelowAll, sq60VarM15944t);
        }

        @Override // com.google.common.collect.AbstractC2987c
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo16282b() {
            Cut<C> cutHigherKey;
            sq60 sq60VarM15944t = Iterators.m15944t(this.f11204b.headMap(this.f11205c.hasUpperBound() ? (Cut) this.f11205c.upperEndpoint() : Cut.aboveAll(), this.f11205c.hasUpperBound() && this.f11205c.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (sq60VarM15944t.hasNext()) {
                cutHigherKey = ((Range) sq60VarM15944t.peek()).upperBound == Cut.aboveAll() ? ((Range) sq60VarM15944t.next()).lowerBound : this.f11203a.higherKey(((Range) sq60VarM15944t.peek()).upperBound);
            } else {
                if (!this.f11205c.contains(Cut.belowAll()) || this.f11203a.containsKey(Cut.belowAll())) {
                    return Iterators.m15933i();
                }
                cutHigherKey = this.f11203a.higherKey(Cut.belowAll());
            }
            return new b((Cut) C2677a.m15480a(cutHigherKey, Cut.aboveAll()), sq60VarM15944t);
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
            return m16286g(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m16286g(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        /* JADX INFO: renamed from: g */
        public final NavigableMap<Cut<C>, Range<C>> m16286g(Range<Cut<C>> range) {
            if (!this.f11205c.isConnected(range)) {
                return ImmutableSortedMap.m15845of();
            }
            return new C2982c(this.f11203a, range.intersection(this.f11205c));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m16286g(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m15950z(mo15664a());
        }

        public C2982c(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }
    }
}
