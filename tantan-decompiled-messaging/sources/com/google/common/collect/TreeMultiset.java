package com.google.common.collect;

import com.google.common.base.C2654a;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import p149l.aiq;
import p149l.ggf0;
import p149l.lmr;
import p149l.sd5;
import p149l.sf80;
import p149l.shg0;
import p149l.vu40;

/* JADX INFO: loaded from: classes7.dex */
public final class TreeMultiset<E> extends AbstractC2965d<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient C2955e<E> header;
    private final transient GeneralRange<E> range;
    private final transient C2956f<C2955e<E>> rootReference;

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$a */
    public class C2951a extends Multisets.AbstractC2897b<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2955e f11146a;

        public C2951a(C2955e c2955e) {
            this.f11146a = c2955e;
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public int getCount() {
            int iM16221w = this.f11146a.m16221w();
            return iM16221w == 0 ? TreeMultiset.this.count(getElement()) : iM16221w;
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public E getElement() {
            return (E) this.f11146a.m16222x();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$b */
    public class C2952b implements Iterator<InterfaceC2972k.a<E>> {

        /* JADX INFO: renamed from: a */
        public C2955e<E> f11148a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2972k.a<E> f11149b;

        public C2952b() {
            this.f11148a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            C2955e<E> c2955e = this.f11148a;
            Objects.requireNonNull(c2955e);
            InterfaceC2972k.a<E> aVarWrapEntry = treeMultiset.wrapEntry(c2955e);
            this.f11149b = aVarWrapEntry;
            if (this.f11148a.m16212L() == TreeMultiset.this.header) {
                this.f11148a = null;
                return aVarWrapEntry;
            }
            this.f11148a = this.f11148a.m16212L();
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11148a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.tooHigh(this.f11148a.m16222x())) {
                return true;
            }
            this.f11148a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183901w(this.f11149b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f11149b.getElement(), 0);
            this.f11149b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$c */
    public class C2953c implements Iterator<InterfaceC2972k.a<E>> {

        /* JADX INFO: renamed from: a */
        public C2955e<E> f11151a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2972k.a<E> f11152b = null;

        public C2953c() {
            this.f11151a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            Objects.requireNonNull(this.f11151a);
            InterfaceC2972k.a<E> aVarWrapEntry = TreeMultiset.this.wrapEntry(this.f11151a);
            this.f11152b = aVarWrapEntry;
            if (this.f11151a.m16223z() == TreeMultiset.this.header) {
                this.f11151a = null;
                return aVarWrapEntry;
            }
            this.f11151a = this.f11151a.m16223z();
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11151a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.tooLow(this.f11151a.m16222x())) {
                return true;
            }
            this.f11151a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183901w(this.f11152b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f11152b.getElement(), 0);
            this.f11152b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$d */
    public static /* synthetic */ class C2954d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11154a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f11154a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11154a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        C2955e<E> c2955e = new C2955e<>();
        this.header = c2955e;
        successor(c2955e, c2955e);
        this.rootReference = new C2956f<>(null);
    }

    private long aggregateAboveRange(Aggregate aggregate, C2955e<E> c2955e) {
        long jTreeAggregate;
        long jAggregateAboveRange;
        if (c2955e == null) {
            return 0L;
        }
        int iCompare = comparator().compare(vu40.m200060a(this.range.getUpperEndpoint()), c2955e.m16222x());
        if (iCompare > 0) {
            return aggregateAboveRange(aggregate, c2955e.f11161g);
        }
        if (iCompare == 0) {
            int i = C2954d.f11154a[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c2955e.f11161g);
                }
                shg0.m184191a();
                return 0L;
            }
            jTreeAggregate = aggregate.nodeAggregate(c2955e);
            jAggregateAboveRange = aggregate.treeAggregate(c2955e.f11161g);
        } else {
            jTreeAggregate = aggregate.treeAggregate(c2955e.f11161g) + ((long) aggregate.nodeAggregate(c2955e));
            jAggregateAboveRange = aggregateAboveRange(aggregate, c2955e.f11160f);
        }
        return jTreeAggregate + jAggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, C2955e<E> c2955e) {
        long jTreeAggregate;
        long jAggregateBelowRange;
        if (c2955e == null) {
            return 0L;
        }
        int iCompare = comparator().compare(vu40.m200060a(this.range.getLowerEndpoint()), c2955e.m16222x());
        if (iCompare < 0) {
            return aggregateBelowRange(aggregate, c2955e.f11160f);
        }
        if (iCompare == 0) {
            int i = C2954d.f11154a[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c2955e.f11160f);
                }
                shg0.m184191a();
                return 0L;
            }
            jTreeAggregate = aggregate.nodeAggregate(c2955e);
            jAggregateBelowRange = aggregate.treeAggregate(c2955e.f11160f);
        } else {
            jTreeAggregate = aggregate.treeAggregate(c2955e.f11160f) + ((long) aggregate.nodeAggregate(c2955e));
            jAggregateBelowRange = aggregateBelowRange(aggregate, c2955e.f11161g);
        }
        return jTreeAggregate + jAggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        long jTreeAggregate = aggregate.treeAggregate(c2955eM16226c);
        if (this.range.hasLowerBound()) {
            jTreeAggregate -= aggregateBelowRange(aggregate, c2955eM16226c);
        }
        return this.range.hasUpperBound() ? jTreeAggregate - aggregateAboveRange(aggregate, c2955eM16226c) : jTreeAggregate;
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.natural()) : new TreeMultiset<>(comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2955e<E> firstNode() {
        C2955e<E> c2955eM16212L;
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        if (c2955eM16226c == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            Object objM200060a = vu40.m200060a(this.range.getLowerEndpoint());
            c2955eM16212L = c2955eM16226c.m16217s(comparator(), objM200060a);
            if (c2955eM16212L == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(objM200060a, c2955eM16212L.m16222x()) == 0) {
                c2955eM16212L = c2955eM16212L.m16212L();
            }
        } else {
            c2955eM16212L = this.header.m16212L();
        }
        if (c2955eM16212L == this.header || !this.range.contains(c2955eM16212L.m16222x())) {
            return null;
        }
        return c2955eM16212L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2955e<E> lastNode() {
        C2955e<E> c2955eM16223z;
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        if (c2955eM16226c == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            Object objM200060a = vu40.m200060a(this.range.getUpperEndpoint());
            c2955eM16223z = c2955eM16226c.m16220v(comparator(), objM200060a);
            if (c2955eM16223z == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(objM200060a, c2955eM16223z.m16222x()) == 0) {
                c2955eM16223z = c2955eM16223z.m16223z();
            }
        } else {
            c2955eM16223z = this.header.m16223z();
        }
        if (c2955eM16223z == this.header || !this.range.contains(c2955eM16223z.m16222x())) {
            return null;
        }
        return c2955eM16223z;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C2976o.m16304a(AbstractC2965d.class, "comparator").m16316b(this, comparator);
        C2976o.m16304a(TreeMultiset.class, "range").m16316b(this, GeneralRange.all(comparator));
        C2976o.m16304a(TreeMultiset.class, "rootReference").m16316b(this, new C2956f(null));
        C2955e c2955e = new C2955e();
        C2976o.m16304a(TreeMultiset.class, "header").m16316b(this, c2955e);
        successor(c2955e, c2955e);
        C2976o.m16309f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C2955e<T> c2955e, C2955e<T> c2955e2) {
        c2955e.f11163i = c2955e2;
        c2955e2.f11162h = c2955e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC2972k.a<E> wrapEntry(C2955e<E> c2955e) {
        return new C2951a(c2955e);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        C2976o.m16314k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int add(E e, int i) {
        sd5.m183444b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        sf80.m183882d(this.range.contains(e));
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        if (c2955eM16226c != null) {
            int[] iArr = new int[1];
            this.rootReference.m16224a(c2955eM16226c, c2955eM16226c.m16213o(comparator(), e, i, iArr));
            return iArr[0];
        }
        comparator().compare(e, e);
        C2955e<E> c2955e = new C2955e<>(e, i);
        C2955e<E> c2955e2 = this.header;
        successor(c2955e2, c2955e, c2955e2);
        this.rootReference.m16224a(c2955eM16226c, c2955e);
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Iterators.m15875e(entryIterator());
            return;
        }
        C2955e<E> c2955eM16212L = this.header.m16212L();
        while (true) {
            C2955e<E> c2955e = this.header;
            if (c2955eM16212L == c2955e) {
                successor(c2955e, c2955e);
                this.rootReference.m16225b();
                return;
            }
            C2955e<E> c2955eM16212L2 = c2955eM16212L.m16212L();
            c2955eM16212L.f11156b = 0;
            c2955eM16212L.f11160f = null;
            c2955eM16212L.f11161g = null;
            c2955eM16212L.f11162h = null;
            c2955eM16212L.f11163i = null;
            c2955eM16212L = c2955eM16212L2;
        }
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p, p149l.rlf0
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.InterfaceC2972k
    public int count(Object obj) {
        try {
            C2955e<E> c2955eM16226c = this.rootReference.m16226c();
            if (this.range.contains(obj) && c2955eM16226c != null) {
                return c2955eM16226c.m16218t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2965d
    public Iterator<InterfaceC2972k.a<E>> descendingEntryIterator() {
        return new C2953c();
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2977p descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public int distinctElements() {
        return Ints.m16468m(aggregateForEntries(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<E> elementIterator() {
        return Multisets.m16094e(entryIterator());
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<InterfaceC2972k.a<E>> entryIterator() {
        return new C2952b();
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2972k.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2972k
    public Iterator<E> iterator() {
        return Multisets.m16098i(this);
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2972k.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2972k.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2972k.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int remove(Object obj, int i) {
        sd5.m183444b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && c2955eM16226c != null) {
                this.rootReference.m16224a(c2955eM16226c, c2955eM16226c.m16205E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public boolean setCount(E e, int i, int i2) {
        sd5.m183444b(i2, "newCount");
        sd5.m183444b(i, "oldCount");
        sf80.m183882d(this.range.contains(e));
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        if (c2955eM16226c != null) {
            int[] iArr = new int[1];
            this.rootReference.m16224a(c2955eM16226c, c2955eM16226c.m16210J(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e, i2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public int size() {
        return Ints.m16468m(aggregateForEntries(Aggregate.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2965d, com.google.common.collect.InterfaceC2977p
    public /* bridge */ /* synthetic */ InterfaceC2977p subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }

    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C2955e<?> c2955e) {
                return c2955e.f11156b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(C2955e<?> c2955e) {
                if (c2955e == null) {
                    return 0L;
                }
                return c2955e.f11158d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C2955e<?> c2955e) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(C2955e<?> c2955e) {
                if (c2955e == null) {
                    return 0L;
                }
                return c2955e.f11157c;
            }
        };

        public abstract int nodeAggregate(C2955e<?> c2955e);

        public abstract long treeAggregate(C2955e<?> c2955e);

        /* synthetic */ Aggregate(C2951a c2951a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$f */
    public static final class C2956f<T> {

        /* JADX INFO: renamed from: a */
        public T f11164a;

        public C2956f() {
        }

        /* JADX INFO: renamed from: a */
        public void m16224a(T t, T t2) {
            if (this.f11164a == t) {
                this.f11164a = t2;
            } else {
                ggf0.m125962a();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16225b() {
            this.f11164a = null;
        }

        /* JADX INFO: renamed from: c */
        public T m16226c() {
            return this.f11164a;
        }

        public /* synthetic */ C2956f(C2951a c2951a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C2955e<T> c2955e, C2955e<T> c2955e2, C2955e<T> c2955e3) {
        successor(c2955e, c2955e2);
        successor(c2955e2, c2955e3);
    }

    public static int distinctElements(C2955e<?> c2955e) {
        if (c2955e == null) {
            return 0;
        }
        return c2955e.f11157c;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        aiq.m96875a(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$e */
    public static final class C2955e<E> {

        /* JADX INFO: renamed from: a */
        public final E f11155a;

        /* JADX INFO: renamed from: b */
        public int f11156b;

        /* JADX INFO: renamed from: c */
        public int f11157c;

        /* JADX INFO: renamed from: d */
        public long f11158d;

        /* JADX INFO: renamed from: e */
        public int f11159e;

        /* JADX INFO: renamed from: f */
        public C2955e<E> f11160f;

        /* JADX INFO: renamed from: g */
        public C2955e<E> f11161g;

        /* JADX INFO: renamed from: h */
        public C2955e<E> f11162h;

        /* JADX INFO: renamed from: i */
        public C2955e<E> f11163i;

        public C2955e(E e, int i) {
            sf80.m183882d(i > 0);
            this.f11155a = e;
            this.f11156b = i;
            this.f11158d = i;
            this.f11157c = 1;
            this.f11159e = 1;
            this.f11160f = null;
            this.f11161g = null;
        }

        /* JADX INFO: renamed from: M */
        public static long m16185M(C2955e<?> c2955e) {
            if (c2955e == null) {
                return 0L;
            }
            return c2955e.f11158d;
        }

        /* JADX INFO: renamed from: y */
        public static int m16200y(C2955e<?> c2955e) {
            if (c2955e == null) {
                return 0;
            }
            return c2955e.f11159e;
        }

        /* JADX INFO: renamed from: A */
        public final C2955e<E> m16201A() {
            int iM16216r = m16216r();
            if (iM16216r == -2) {
                Objects.requireNonNull(this.f11161g);
                if (this.f11161g.m16216r() > 0) {
                    this.f11161g = this.f11161g.m16209I();
                }
                return m16208H();
            }
            if (iM16216r != 2) {
                m16203C();
                return this;
            }
            Objects.requireNonNull(this.f11160f);
            if (this.f11160f.m16216r() < 0) {
                this.f11160f = this.f11160f.m16208H();
            }
            return m16209I();
        }

        /* JADX INFO: renamed from: B */
        public final void m16202B() {
            m16204D();
            m16203C();
        }

        /* JADX INFO: renamed from: C */
        public final void m16203C() {
            this.f11159e = Math.max(m16200y(this.f11160f), m16200y(this.f11161g)) + 1;
        }

        /* JADX INFO: renamed from: D */
        public final void m16204D() {
            this.f11157c = TreeMultiset.distinctElements(this.f11160f) + 1 + TreeMultiset.distinctElements(this.f11161g);
            this.f11158d = ((long) this.f11156b) + m16185M(this.f11160f) + m16185M(this.f11161g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: E */
        public C2955e<E> m16205E(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f11160f = c2955e.m16205E(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f11157c--;
                        this.f11158d -= (long) i2;
                    } else {
                        this.f11158d -= (long) i;
                    }
                }
                return i2 == 0 ? this : m16201A();
            }
            if (iCompare <= 0) {
                int i3 = this.f11156b;
                iArr[0] = i3;
                if (i >= i3) {
                    return m16219u();
                }
                this.f11156b = i3 - i;
                this.f11158d -= (long) i;
                return this;
            }
            C2955e<E> c2955e2 = this.f11161g;
            if (c2955e2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f11161g = c2955e2.m16205E(comparator, e, i, iArr);
            int i4 = iArr[0];
            if (i4 > 0) {
                if (i >= i4) {
                    this.f11157c--;
                    this.f11158d -= (long) i4;
                } else {
                    this.f11158d -= (long) i;
                }
            }
            return m16201A();
        }

        /* JADX INFO: renamed from: F */
        public final C2955e<E> m16206F(C2955e<E> c2955e) {
            C2955e<E> c2955e2 = this.f11161g;
            if (c2955e2 == null) {
                return this.f11160f;
            }
            this.f11161g = c2955e2.m16206F(c2955e);
            this.f11157c--;
            this.f11158d -= (long) c2955e.f11156b;
            return m16201A();
        }

        /* JADX INFO: renamed from: G */
        public final C2955e<E> m16207G(C2955e<E> c2955e) {
            C2955e<E> c2955e2 = this.f11160f;
            if (c2955e2 == null) {
                return this.f11161g;
            }
            this.f11160f = c2955e2.m16207G(c2955e);
            this.f11157c--;
            this.f11158d -= (long) c2955e.f11156b;
            return m16201A();
        }

        /* JADX INFO: renamed from: H */
        public final C2955e<E> m16208H() {
            sf80.m183900v(this.f11161g != null);
            C2955e<E> c2955e = this.f11161g;
            this.f11161g = c2955e.f11160f;
            c2955e.f11160f = this;
            c2955e.f11158d = this.f11158d;
            c2955e.f11157c = this.f11157c;
            m16202B();
            c2955e.m16203C();
            return c2955e;
        }

        /* JADX INFO: renamed from: I */
        public final C2955e<E> m16209I() {
            sf80.m183900v(this.f11160f != null);
            C2955e<E> c2955e = this.f11160f;
            this.f11160f = c2955e.f11161g;
            c2955e.f11161g = this;
            c2955e.f11158d = this.f11158d;
            c2955e.f11157c = this.f11157c;
            m16202B();
            c2955e.m16203C();
            return c2955e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: J */
        public C2955e<E> m16210J(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e != null) {
                    this.f11160f = c2955e.m16210J(comparator, e, i, i2, iArr);
                    int i3 = iArr[0];
                    if (i3 == i) {
                        if (i2 == 0 && i3 != 0) {
                            this.f11157c--;
                        } else if (i2 > 0 && i3 == 0) {
                            this.f11157c++;
                        }
                        this.f11158d += (long) (i2 - i3);
                    }
                    return m16201A();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    return m16214p(e, i2);
                }
            } else if (iCompare > 0) {
                C2955e<E> c2955e2 = this.f11161g;
                if (c2955e2 != null) {
                    this.f11161g = c2955e2.m16210J(comparator, e, i, i2, iArr);
                    int i4 = iArr[0];
                    if (i4 == i) {
                        if (i2 == 0 && i4 != 0) {
                            this.f11157c--;
                        } else if (i2 > 0 && i4 == 0) {
                            this.f11157c++;
                        }
                        this.f11158d += (long) (i2 - i4);
                    }
                    return m16201A();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    return m16215q(e, i2);
                }
            } else {
                int i5 = this.f11156b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return m16219u();
                    }
                    this.f11158d += (long) (i2 - i5);
                    this.f11156b = i2;
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: K */
        public C2955e<E> m16211K(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e == null) {
                    iArr[0] = 0;
                    return i > 0 ? m16214p(e, i) : this;
                }
                this.f11160f = c2955e.m16211K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f11157c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f11157c++;
                }
                this.f11158d += (long) (i - iArr[0]);
                return m16201A();
            }
            if (iCompare <= 0) {
                int i2 = this.f11156b;
                iArr[0] = i2;
                if (i == 0) {
                    return m16219u();
                }
                this.f11158d += (long) (i - i2);
                this.f11156b = i;
                return this;
            }
            C2955e<E> c2955e2 = this.f11161g;
            if (c2955e2 == null) {
                iArr[0] = 0;
                return i > 0 ? m16215q(e, i) : this;
            }
            this.f11161g = c2955e2.m16211K(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.f11157c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.f11157c++;
            }
            this.f11158d += (long) (i - iArr[0]);
            return m16201A();
        }

        /* JADX INFO: renamed from: L */
        public final C2955e<E> m16212L() {
            C2955e<E> c2955e = this.f11163i;
            Objects.requireNonNull(c2955e);
            return c2955e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: o */
        public C2955e<E> m16213o(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e == null) {
                    iArr[0] = 0;
                    return m16214p(e, i);
                }
                int i2 = c2955e.f11159e;
                C2955e<E> c2955eM16213o = c2955e.m16213o(comparator, e, i, iArr);
                this.f11160f = c2955eM16213o;
                if (iArr[0] == 0) {
                    this.f11157c++;
                }
                this.f11158d += (long) i;
                if (c2955eM16213o.f11159e != i2) {
                    return m16201A();
                }
            } else {
                if (iCompare <= 0) {
                    int i3 = this.f11156b;
                    iArr[0] = i3;
                    long j = i;
                    sf80.m183882d(((long) i3) + j <= 2147483647L);
                    this.f11156b += i;
                    this.f11158d += j;
                    return this;
                }
                C2955e<E> c2955e2 = this.f11161g;
                if (c2955e2 == null) {
                    iArr[0] = 0;
                    return m16215q(e, i);
                }
                int i4 = c2955e2.f11159e;
                C2955e<E> c2955eM16213o2 = c2955e2.m16213o(comparator, e, i, iArr);
                this.f11161g = c2955eM16213o2;
                if (iArr[0] == 0) {
                    this.f11157c++;
                }
                this.f11158d += (long) i;
                if (c2955eM16213o2.f11159e != i4) {
                    return m16201A();
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public final C2955e<E> m16214p(E e, int i) {
            this.f11160f = new C2955e<>(e, i);
            TreeMultiset.successor(m16223z(), this.f11160f, this);
            this.f11159e = Math.max(2, this.f11159e);
            this.f11157c++;
            this.f11158d += (long) i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final C2955e<E> m16215q(E e, int i) {
            C2955e<E> c2955e = new C2955e<>(e, i);
            this.f11161g = c2955e;
            TreeMultiset.successor(this, c2955e, m16212L());
            this.f11159e = Math.max(2, this.f11159e);
            this.f11157c++;
            this.f11158d += (long) i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public final int m16216r() {
            return m16200y(this.f11160f) - m16200y(this.f11161g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: s */
        public final C2955e<E> m16217s(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e != null) {
                    return (C2955e) C2654a.m15426a(c2955e.m16217s(comparator, e), this);
                }
            } else if (iCompare != 0) {
                C2955e<E> c2955e2 = this.f11161g;
                if (c2955e2 == null) {
                    return null;
                }
                return c2955e2.m16217s(comparator, e);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: t */
        public int m16218t(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare < 0) {
                C2955e<E> c2955e = this.f11160f;
                if (c2955e == null) {
                    return 0;
                }
                return c2955e.m16218t(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f11156b;
            }
            C2955e<E> c2955e2 = this.f11161g;
            if (c2955e2 == null) {
                return 0;
            }
            return c2955e2.m16218t(comparator, e);
        }

        public String toString() {
            return Multisets.m16096g(m16222x(), m16221w()).toString();
        }

        /* JADX INFO: renamed from: u */
        public final C2955e<E> m16219u() {
            int i = this.f11156b;
            this.f11156b = 0;
            TreeMultiset.successor(m16223z(), m16212L());
            C2955e<E> c2955e = this.f11160f;
            C2955e<E> c2955e2 = this.f11161g;
            if (c2955e == null) {
                return c2955e2;
            }
            if (c2955e2 == null) {
                return c2955e;
            }
            if (c2955e.f11159e >= c2955e2.f11159e) {
                C2955e<E> c2955eM16223z = m16223z();
                c2955eM16223z.f11160f = this.f11160f.m16206F(c2955eM16223z);
                c2955eM16223z.f11161g = this.f11161g;
                c2955eM16223z.f11157c = this.f11157c - 1;
                c2955eM16223z.f11158d = this.f11158d - ((long) i);
                return c2955eM16223z.m16201A();
            }
            C2955e<E> c2955eM16212L = m16212L();
            c2955eM16212L.f11161g = this.f11161g.m16207G(c2955eM16212L);
            c2955eM16212L.f11160f = this.f11160f;
            c2955eM16212L.f11157c = this.f11157c - 1;
            c2955eM16212L.f11158d = this.f11158d - ((long) i);
            return c2955eM16212L.m16201A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: v */
        public final C2955e<E> m16220v(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16222x());
            if (iCompare > 0) {
                C2955e<E> c2955e = this.f11161g;
                if (c2955e != null) {
                    return (C2955e) C2654a.m15426a(c2955e.m16220v(comparator, e), this);
                }
            } else if (iCompare != 0) {
                C2955e<E> c2955e2 = this.f11160f;
                if (c2955e2 == null) {
                    return null;
                }
                return c2955e2.m16220v(comparator, e);
            }
            return this;
        }

        /* JADX INFO: renamed from: w */
        public int m16221w() {
            return this.f11156b;
        }

        /* JADX INFO: renamed from: x */
        public E m16222x() {
            return (E) vu40.m200060a(this.f11155a);
        }

        /* JADX INFO: renamed from: z */
        public final C2955e<E> m16223z() {
            C2955e<E> c2955e = this.f11162h;
            Objects.requireNonNull(c2955e);
            return c2955e;
        }

        public C2955e() {
            this.f11155a = null;
            this.f11156b = 1;
        }
    }

    public TreeMultiset(C2956f<C2955e<E>> c2956f, GeneralRange<E> generalRange, C2955e<E> c2955e) {
        super(generalRange.comparator());
        this.rootReference = c2956f;
        this.range = generalRange;
        this.header = c2955e;
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int setCount(E e, int i) {
        sd5.m183444b(i, "count");
        if (!this.range.contains(e)) {
            sf80.m183882d(i == 0);
            return 0;
        }
        C2955e<E> c2955eM16226c = this.rootReference.m16226c();
        if (c2955eM16226c == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m16224a(c2955eM16226c, c2955eM16226c.m16211K(comparator(), e, i, iArr));
        return iArr[0];
    }
}
