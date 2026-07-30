package com.google.common.collect;

import com.google.common.base.C2677a;
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
import p153l.akq;
import p153l.aqg0;
import p153l.k350;
import p153l.mor;
import p153l.nof0;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class TreeMultiset<E> extends AbstractC2988d<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient C2978e<E> header;
    private final transient GeneralRange<E> range;
    private final transient C2979f<C2978e<E>> rootReference;

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$a */
    public class C2974a extends Multisets.AbstractC2920b<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2978e f11183a;

        public C2974a(C2978e c2978e) {
            this.f11183a = c2978e;
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public int getCount() {
            int iM16275w = this.f11183a.m16275w();
            return iM16275w == 0 ? TreeMultiset.this.count(getElement()) : iM16275w;
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public E getElement() {
            return (E) this.f11183a.m16276x();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$b */
    public class C2975b implements Iterator<InterfaceC2995k.a<E>> {

        /* JADX INFO: renamed from: a */
        public C2978e<E> f11185a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2995k.a<E> f11186b;

        public C2975b() {
            this.f11185a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2995k.a<E> next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            C2978e<E> c2978e = this.f11185a;
            Objects.requireNonNull(c2978e);
            InterfaceC2995k.a<E> aVarWrapEntry = treeMultiset.wrapEntry(c2978e);
            this.f11186b = aVarWrapEntry;
            if (this.f11185a.m16266L() == TreeMultiset.this.header) {
                this.f11185a = null;
                return aVarWrapEntry;
            }
            this.f11185a = this.f11185a.m16266L();
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11185a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.tooHigh(this.f11185a.m16276x())) {
                return true;
            }
            this.f11185a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212118w(this.f11186b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f11186b.getElement(), 0);
            this.f11186b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$c */
    public class C2976c implements Iterator<InterfaceC2995k.a<E>> {

        /* JADX INFO: renamed from: a */
        public C2978e<E> f11188a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2995k.a<E> f11189b = null;

        public C2976c() {
            this.f11188a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2995k.a<E> next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            Objects.requireNonNull(this.f11188a);
            InterfaceC2995k.a<E> aVarWrapEntry = TreeMultiset.this.wrapEntry(this.f11188a);
            this.f11189b = aVarWrapEntry;
            if (this.f11188a.m16277z() == TreeMultiset.this.header) {
                this.f11188a = null;
                return aVarWrapEntry;
            }
            this.f11188a = this.f11188a.m16277z();
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11188a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.tooLow(this.f11188a.m16276x())) {
                return true;
            }
            this.f11188a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212118w(this.f11189b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f11189b.getElement(), 0);
            this.f11189b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$d */
    public static /* synthetic */ class C2977d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11191a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f11191a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11191a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        C2978e<E> c2978e = new C2978e<>();
        this.header = c2978e;
        successor(c2978e, c2978e);
        this.rootReference = new C2979f<>(null);
    }

    private long aggregateAboveRange(Aggregate aggregate, C2978e<E> c2978e) {
        long jTreeAggregate;
        long jAggregateAboveRange;
        if (c2978e == null) {
            return 0L;
        }
        int iCompare = comparator().compare(k350.m147997a(this.range.getUpperEndpoint()), c2978e.m16276x());
        if (iCompare > 0) {
            return aggregateAboveRange(aggregate, c2978e.f11198g);
        }
        if (iCompare == 0) {
            int i = C2977d.f11191a[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c2978e.f11198g);
                }
                aqg0.m99478a();
                return 0L;
            }
            jTreeAggregate = aggregate.nodeAggregate(c2978e);
            jAggregateAboveRange = aggregate.treeAggregate(c2978e.f11198g);
        } else {
            jTreeAggregate = aggregate.treeAggregate(c2978e.f11198g) + ((long) aggregate.nodeAggregate(c2978e));
            jAggregateAboveRange = aggregateAboveRange(aggregate, c2978e.f11197f);
        }
        return jTreeAggregate + jAggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, C2978e<E> c2978e) {
        long jTreeAggregate;
        long jAggregateBelowRange;
        if (c2978e == null) {
            return 0L;
        }
        int iCompare = comparator().compare(k350.m147997a(this.range.getLowerEndpoint()), c2978e.m16276x());
        if (iCompare < 0) {
            return aggregateBelowRange(aggregate, c2978e.f11197f);
        }
        if (iCompare == 0) {
            int i = C2977d.f11191a[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c2978e.f11197f);
                }
                aqg0.m99478a();
                return 0L;
            }
            jTreeAggregate = aggregate.nodeAggregate(c2978e);
            jAggregateBelowRange = aggregate.treeAggregate(c2978e.f11197f);
        } else {
            jTreeAggregate = aggregate.treeAggregate(c2978e.f11197f) + ((long) aggregate.nodeAggregate(c2978e));
            jAggregateBelowRange = aggregateBelowRange(aggregate, c2978e.f11198g);
        }
        return jTreeAggregate + jAggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        long jTreeAggregate = aggregate.treeAggregate(c2978eM16280c);
        if (this.range.hasLowerBound()) {
            jTreeAggregate -= aggregateBelowRange(aggregate, c2978eM16280c);
        }
        return this.range.hasUpperBound() ? jTreeAggregate - aggregateAboveRange(aggregate, c2978eM16280c) : jTreeAggregate;
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.natural()) : new TreeMultiset<>(comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2978e<E> firstNode() {
        C2978e<E> c2978eM16266L;
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        if (c2978eM16280c == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            Object objM147997a = k350.m147997a(this.range.getLowerEndpoint());
            c2978eM16266L = c2978eM16280c.m16271s(comparator(), objM147997a);
            if (c2978eM16266L == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(objM147997a, c2978eM16266L.m16276x()) == 0) {
                c2978eM16266L = c2978eM16266L.m16266L();
            }
        } else {
            c2978eM16266L = this.header.m16266L();
        }
        if (c2978eM16266L == this.header || !this.range.contains(c2978eM16266L.m16276x())) {
            return null;
        }
        return c2978eM16266L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2978e<E> lastNode() {
        C2978e<E> c2978eM16277z;
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        if (c2978eM16280c == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            Object objM147997a = k350.m147997a(this.range.getUpperEndpoint());
            c2978eM16277z = c2978eM16280c.m16274v(comparator(), objM147997a);
            if (c2978eM16277z == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(objM147997a, c2978eM16277z.m16276x()) == 0) {
                c2978eM16277z = c2978eM16277z.m16277z();
            }
        } else {
            c2978eM16277z = this.header.m16277z();
        }
        if (c2978eM16277z == this.header || !this.range.contains(c2978eM16277z.m16276x())) {
            return null;
        }
        return c2978eM16277z;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C2999o.m16358a(AbstractC2988d.class, "comparator").m16370b(this, comparator);
        C2999o.m16358a(TreeMultiset.class, "range").m16370b(this, GeneralRange.all(comparator));
        C2999o.m16358a(TreeMultiset.class, "rootReference").m16370b(this, new C2979f(null));
        C2978e c2978e = new C2978e();
        C2999o.m16358a(TreeMultiset.class, "header").m16370b(this, c2978e);
        successor(c2978e, c2978e);
        C2999o.m16363f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C2978e<T> c2978e, C2978e<T> c2978e2) {
        c2978e.f11200i = c2978e2;
        c2978e2.f11199h = c2978e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC2995k.a<E> wrapEntry(C2978e<E> c2978e) {
        return new C2974a(c2978e);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        C2999o.m16368k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int add(E e, int i) {
        se5.m185516b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        xn80.m212099d(this.range.contains(e));
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        if (c2978eM16280c != null) {
            int[] iArr = new int[1];
            this.rootReference.m16278a(c2978eM16280c, c2978eM16280c.m16267o(comparator(), e, i, iArr));
            return iArr[0];
        }
        comparator().compare(e, e);
        C2978e<E> c2978e = new C2978e<>(e, i);
        C2978e<E> c2978e2 = this.header;
        successor(c2978e2, c2978e, c2978e2);
        this.rootReference.m16278a(c2978eM16280c, c2978e);
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Iterators.m15929e(entryIterator());
            return;
        }
        C2978e<E> c2978eM16266L = this.header.m16266L();
        while (true) {
            C2978e<E> c2978e = this.header;
            if (c2978eM16266L == c2978e) {
                successor(c2978e, c2978e);
                this.rootReference.m16279b();
                return;
            }
            C2978e<E> c2978eM16266L2 = c2978eM16266L.m16266L();
            c2978eM16266L.f11193b = 0;
            c2978eM16266L.f11197f = null;
            c2978eM16266L.f11198g = null;
            c2978eM16266L.f11199h = null;
            c2978eM16266L.f11200i = null;
            c2978eM16266L = c2978eM16266L2;
        }
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p, p153l.auf0
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.InterfaceC2995k
    public int count(Object obj) {
        try {
            C2978e<E> c2978eM16280c = this.rootReference.m16280c();
            if (this.range.contains(obj) && c2978eM16280c != null) {
                return c2978eM16280c.m16272t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2988d
    public Iterator<InterfaceC2995k.a<E>> descendingEntryIterator() {
        return new C2976c();
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC3000p descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public int distinctElements() {
        return Ints.m16523m(aggregateForEntries(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractC2986b
    public Iterator<E> elementIterator() {
        return Multisets.m16148e(entryIterator());
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public Iterator<InterfaceC2995k.a<E>> entryIterator() {
        return new C2975b();
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC2995k.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2995k
    public Iterator<E> iterator() {
        return Multisets.m16152i(this);
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC2995k.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC2995k.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC2995k.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int remove(Object obj, int i) {
        se5.m185516b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && c2978eM16280c != null) {
                this.rootReference.m16278a(c2978eM16280c, c2978eM16280c.m16259E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public boolean setCount(E e, int i, int i2) {
        se5.m185516b(i2, "newCount");
        se5.m185516b(i, "oldCount");
        xn80.m212099d(this.range.contains(e));
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        if (c2978eM16280c != null) {
            int[] iArr = new int[1];
            this.rootReference.m16278a(c2978eM16280c, c2978eM16280c.m16264J(comparator(), e, i, i2, iArr));
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

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int size() {
        return Ints.m16523m(aggregateForEntries(Aggregate.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2988d, com.google.common.collect.InterfaceC3000p
    public /* bridge */ /* synthetic */ InterfaceC3000p subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }

    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C2978e<?> c2978e) {
                return c2978e.f11193b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(C2978e<?> c2978e) {
                if (c2978e == null) {
                    return 0L;
                }
                return c2978e.f11195d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C2978e<?> c2978e) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(C2978e<?> c2978e) {
                if (c2978e == null) {
                    return 0L;
                }
                return c2978e.f11194c;
            }
        };

        public abstract int nodeAggregate(C2978e<?> c2978e);

        public abstract long treeAggregate(C2978e<?> c2978e);

        /* synthetic */ Aggregate(C2974a c2974a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$f */
    public static final class C2979f<T> {

        /* JADX INFO: renamed from: a */
        public T f11201a;

        public C2979f() {
        }

        /* JADX INFO: renamed from: a */
        public void m16278a(T t, T t2) {
            if (this.f11201a == t) {
                this.f11201a = t2;
            } else {
                nof0.m164126a();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16279b() {
            this.f11201a = null;
        }

        /* JADX INFO: renamed from: c */
        public T m16280c() {
            return this.f11201a;
        }

        public /* synthetic */ C2979f(C2974a c2974a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C2978e<T> c2978e, C2978e<T> c2978e2, C2978e<T> c2978e3) {
        successor(c2978e, c2978e2);
        successor(c2978e2, c2978e3);
    }

    public static int distinctElements(C2978e<?> c2978e) {
        if (c2978e == null) {
            return 0;
        }
        return c2978e.f11194c;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        akq.m98593a(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$e */
    public static final class C2978e<E> {

        /* JADX INFO: renamed from: a */
        public final E f11192a;

        /* JADX INFO: renamed from: b */
        public int f11193b;

        /* JADX INFO: renamed from: c */
        public int f11194c;

        /* JADX INFO: renamed from: d */
        public long f11195d;

        /* JADX INFO: renamed from: e */
        public int f11196e;

        /* JADX INFO: renamed from: f */
        public C2978e<E> f11197f;

        /* JADX INFO: renamed from: g */
        public C2978e<E> f11198g;

        /* JADX INFO: renamed from: h */
        public C2978e<E> f11199h;

        /* JADX INFO: renamed from: i */
        public C2978e<E> f11200i;

        public C2978e(E e, int i) {
            xn80.m212099d(i > 0);
            this.f11192a = e;
            this.f11193b = i;
            this.f11195d = i;
            this.f11194c = 1;
            this.f11196e = 1;
            this.f11197f = null;
            this.f11198g = null;
        }

        /* JADX INFO: renamed from: M */
        public static long m16239M(C2978e<?> c2978e) {
            if (c2978e == null) {
                return 0L;
            }
            return c2978e.f11195d;
        }

        /* JADX INFO: renamed from: y */
        public static int m16254y(C2978e<?> c2978e) {
            if (c2978e == null) {
                return 0;
            }
            return c2978e.f11196e;
        }

        /* JADX INFO: renamed from: A */
        public final C2978e<E> m16255A() {
            int iM16270r = m16270r();
            if (iM16270r == -2) {
                Objects.requireNonNull(this.f11198g);
                if (this.f11198g.m16270r() > 0) {
                    this.f11198g = this.f11198g.m16263I();
                }
                return m16262H();
            }
            if (iM16270r != 2) {
                m16257C();
                return this;
            }
            Objects.requireNonNull(this.f11197f);
            if (this.f11197f.m16270r() < 0) {
                this.f11197f = this.f11197f.m16262H();
            }
            return m16263I();
        }

        /* JADX INFO: renamed from: B */
        public final void m16256B() {
            m16258D();
            m16257C();
        }

        /* JADX INFO: renamed from: C */
        public final void m16257C() {
            this.f11196e = Math.max(m16254y(this.f11197f), m16254y(this.f11198g)) + 1;
        }

        /* JADX INFO: renamed from: D */
        public final void m16258D() {
            this.f11194c = TreeMultiset.distinctElements(this.f11197f) + 1 + TreeMultiset.distinctElements(this.f11198g);
            this.f11195d = ((long) this.f11193b) + m16239M(this.f11197f) + m16239M(this.f11198g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: E */
        public C2978e<E> m16259E(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f11197f = c2978e.m16259E(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f11194c--;
                        this.f11195d -= (long) i2;
                    } else {
                        this.f11195d -= (long) i;
                    }
                }
                return i2 == 0 ? this : m16255A();
            }
            if (iCompare <= 0) {
                int i3 = this.f11193b;
                iArr[0] = i3;
                if (i >= i3) {
                    return m16273u();
                }
                this.f11193b = i3 - i;
                this.f11195d -= (long) i;
                return this;
            }
            C2978e<E> c2978e2 = this.f11198g;
            if (c2978e2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f11198g = c2978e2.m16259E(comparator, e, i, iArr);
            int i4 = iArr[0];
            if (i4 > 0) {
                if (i >= i4) {
                    this.f11194c--;
                    this.f11195d -= (long) i4;
                } else {
                    this.f11195d -= (long) i;
                }
            }
            return m16255A();
        }

        /* JADX INFO: renamed from: F */
        public final C2978e<E> m16260F(C2978e<E> c2978e) {
            C2978e<E> c2978e2 = this.f11198g;
            if (c2978e2 == null) {
                return this.f11197f;
            }
            this.f11198g = c2978e2.m16260F(c2978e);
            this.f11194c--;
            this.f11195d -= (long) c2978e.f11193b;
            return m16255A();
        }

        /* JADX INFO: renamed from: G */
        public final C2978e<E> m16261G(C2978e<E> c2978e) {
            C2978e<E> c2978e2 = this.f11197f;
            if (c2978e2 == null) {
                return this.f11198g;
            }
            this.f11197f = c2978e2.m16261G(c2978e);
            this.f11194c--;
            this.f11195d -= (long) c2978e.f11193b;
            return m16255A();
        }

        /* JADX INFO: renamed from: H */
        public final C2978e<E> m16262H() {
            xn80.m212117v(this.f11198g != null);
            C2978e<E> c2978e = this.f11198g;
            this.f11198g = c2978e.f11197f;
            c2978e.f11197f = this;
            c2978e.f11195d = this.f11195d;
            c2978e.f11194c = this.f11194c;
            m16256B();
            c2978e.m16257C();
            return c2978e;
        }

        /* JADX INFO: renamed from: I */
        public final C2978e<E> m16263I() {
            xn80.m212117v(this.f11197f != null);
            C2978e<E> c2978e = this.f11197f;
            this.f11197f = c2978e.f11198g;
            c2978e.f11198g = this;
            c2978e.f11195d = this.f11195d;
            c2978e.f11194c = this.f11194c;
            m16256B();
            c2978e.m16257C();
            return c2978e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: J */
        public C2978e<E> m16264J(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e != null) {
                    this.f11197f = c2978e.m16264J(comparator, e, i, i2, iArr);
                    int i3 = iArr[0];
                    if (i3 == i) {
                        if (i2 == 0 && i3 != 0) {
                            this.f11194c--;
                        } else if (i2 > 0 && i3 == 0) {
                            this.f11194c++;
                        }
                        this.f11195d += (long) (i2 - i3);
                    }
                    return m16255A();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    return m16268p(e, i2);
                }
            } else if (iCompare > 0) {
                C2978e<E> c2978e2 = this.f11198g;
                if (c2978e2 != null) {
                    this.f11198g = c2978e2.m16264J(comparator, e, i, i2, iArr);
                    int i4 = iArr[0];
                    if (i4 == i) {
                        if (i2 == 0 && i4 != 0) {
                            this.f11194c--;
                        } else if (i2 > 0 && i4 == 0) {
                            this.f11194c++;
                        }
                        this.f11195d += (long) (i2 - i4);
                    }
                    return m16255A();
                }
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    return m16269q(e, i2);
                }
            } else {
                int i5 = this.f11193b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return m16273u();
                    }
                    this.f11195d += (long) (i2 - i5);
                    this.f11193b = i2;
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: K */
        public C2978e<E> m16265K(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e == null) {
                    iArr[0] = 0;
                    return i > 0 ? m16268p(e, i) : this;
                }
                this.f11197f = c2978e.m16265K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f11194c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f11194c++;
                }
                this.f11195d += (long) (i - iArr[0]);
                return m16255A();
            }
            if (iCompare <= 0) {
                int i2 = this.f11193b;
                iArr[0] = i2;
                if (i == 0) {
                    return m16273u();
                }
                this.f11195d += (long) (i - i2);
                this.f11193b = i;
                return this;
            }
            C2978e<E> c2978e2 = this.f11198g;
            if (c2978e2 == null) {
                iArr[0] = 0;
                return i > 0 ? m16269q(e, i) : this;
            }
            this.f11198g = c2978e2.m16265K(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.f11194c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.f11194c++;
            }
            this.f11195d += (long) (i - iArr[0]);
            return m16255A();
        }

        /* JADX INFO: renamed from: L */
        public final C2978e<E> m16266L() {
            C2978e<E> c2978e = this.f11200i;
            Objects.requireNonNull(c2978e);
            return c2978e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: o */
        public C2978e<E> m16267o(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e == null) {
                    iArr[0] = 0;
                    return m16268p(e, i);
                }
                int i2 = c2978e.f11196e;
                C2978e<E> c2978eM16267o = c2978e.m16267o(comparator, e, i, iArr);
                this.f11197f = c2978eM16267o;
                if (iArr[0] == 0) {
                    this.f11194c++;
                }
                this.f11195d += (long) i;
                if (c2978eM16267o.f11196e != i2) {
                    return m16255A();
                }
            } else {
                if (iCompare <= 0) {
                    int i3 = this.f11193b;
                    iArr[0] = i3;
                    long j = i;
                    xn80.m212099d(((long) i3) + j <= 2147483647L);
                    this.f11193b += i;
                    this.f11195d += j;
                    return this;
                }
                C2978e<E> c2978e2 = this.f11198g;
                if (c2978e2 == null) {
                    iArr[0] = 0;
                    return m16269q(e, i);
                }
                int i4 = c2978e2.f11196e;
                C2978e<E> c2978eM16267o2 = c2978e2.m16267o(comparator, e, i, iArr);
                this.f11198g = c2978eM16267o2;
                if (iArr[0] == 0) {
                    this.f11194c++;
                }
                this.f11195d += (long) i;
                if (c2978eM16267o2.f11196e != i4) {
                    return m16255A();
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public final C2978e<E> m16268p(E e, int i) {
            this.f11197f = new C2978e<>(e, i);
            TreeMultiset.successor(m16277z(), this.f11197f, this);
            this.f11196e = Math.max(2, this.f11196e);
            this.f11194c++;
            this.f11195d += (long) i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final C2978e<E> m16269q(E e, int i) {
            C2978e<E> c2978e = new C2978e<>(e, i);
            this.f11198g = c2978e;
            TreeMultiset.successor(this, c2978e, m16266L());
            this.f11196e = Math.max(2, this.f11196e);
            this.f11194c++;
            this.f11195d += (long) i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public final int m16270r() {
            return m16254y(this.f11197f) - m16254y(this.f11198g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: s */
        public final C2978e<E> m16271s(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e != null) {
                    return (C2978e) C2677a.m15480a(c2978e.m16271s(comparator, e), this);
                }
            } else if (iCompare != 0) {
                C2978e<E> c2978e2 = this.f11198g;
                if (c2978e2 == null) {
                    return null;
                }
                return c2978e2.m16271s(comparator, e);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: t */
        public int m16272t(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare < 0) {
                C2978e<E> c2978e = this.f11197f;
                if (c2978e == null) {
                    return 0;
                }
                return c2978e.m16272t(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f11193b;
            }
            C2978e<E> c2978e2 = this.f11198g;
            if (c2978e2 == null) {
                return 0;
            }
            return c2978e2.m16272t(comparator, e);
        }

        public String toString() {
            return Multisets.m16150g(m16276x(), m16275w()).toString();
        }

        /* JADX INFO: renamed from: u */
        public final C2978e<E> m16273u() {
            int i = this.f11193b;
            this.f11193b = 0;
            TreeMultiset.successor(m16277z(), m16266L());
            C2978e<E> c2978e = this.f11197f;
            C2978e<E> c2978e2 = this.f11198g;
            if (c2978e == null) {
                return c2978e2;
            }
            if (c2978e2 == null) {
                return c2978e;
            }
            if (c2978e.f11196e >= c2978e2.f11196e) {
                C2978e<E> c2978eM16277z = m16277z();
                c2978eM16277z.f11197f = this.f11197f.m16260F(c2978eM16277z);
                c2978eM16277z.f11198g = this.f11198g;
                c2978eM16277z.f11194c = this.f11194c - 1;
                c2978eM16277z.f11195d = this.f11195d - ((long) i);
                return c2978eM16277z.m16255A();
            }
            C2978e<E> c2978eM16266L = m16266L();
            c2978eM16266L.f11198g = this.f11198g.m16261G(c2978eM16266L);
            c2978eM16266L.f11197f = this.f11197f;
            c2978eM16266L.f11194c = this.f11194c - 1;
            c2978eM16266L.f11195d = this.f11195d - ((long) i);
            return c2978eM16266L.m16255A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: v */
        public final C2978e<E> m16274v(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, m16276x());
            if (iCompare > 0) {
                C2978e<E> c2978e = this.f11198g;
                if (c2978e != null) {
                    return (C2978e) C2677a.m15480a(c2978e.m16274v(comparator, e), this);
                }
            } else if (iCompare != 0) {
                C2978e<E> c2978e2 = this.f11197f;
                if (c2978e2 == null) {
                    return null;
                }
                return c2978e2.m16274v(comparator, e);
            }
            return this;
        }

        /* JADX INFO: renamed from: w */
        public int m16275w() {
            return this.f11193b;
        }

        /* JADX INFO: renamed from: x */
        public E m16276x() {
            return (E) k350.m147997a(this.f11192a);
        }

        /* JADX INFO: renamed from: z */
        public final C2978e<E> m16277z() {
            C2978e<E> c2978e = this.f11199h;
            Objects.requireNonNull(c2978e);
            return c2978e;
        }

        public C2978e() {
            this.f11192a = null;
            this.f11193b = 1;
        }
    }

    public TreeMultiset(C2979f<C2978e<E>> c2979f, GeneralRange<E> generalRange, C2978e<E> c2978e) {
        super(generalRange.comparator());
        this.rootReference = c2979f;
        this.range = generalRange;
        this.header = c2978e;
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int setCount(E e, int i) {
        se5.m185516b(i, "count");
        if (!this.range.contains(e)) {
            xn80.m212099d(i == 0);
            return 0;
        }
        C2978e<E> c2978eM16280c = this.rootReference.m16280c();
        if (c2978eM16280c == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m16278a(c2978eM16280c, c2978eM16280c.m16265K(comparator(), e, i, iArr));
        return iArr[0];
    }
}
