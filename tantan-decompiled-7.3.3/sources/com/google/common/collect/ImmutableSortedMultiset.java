package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p153l.nym;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements InterfaceC3000p<E> {
    transient ImmutableSortedMultiset<E> descendingMultiset;

    public static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        public SerializedForm(InterfaceC3000p<E> interfaceC3000p) {
            this.comparator = interfaceC3000p.comparator();
            int size = interfaceC3000p.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (InterfaceC2995k.a<E> aVar : interfaceC3000p.entrySet()) {
                this.elements[i] = aVar.getElement();
                this.counts[i] = aVar.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.elements.length;
            C2831a c2831a = new C2831a(this.comparator);
            for (int i = 0; i < length; i++) {
                c2831a.mo15809j(this.elements[i], this.counts[i]);
            }
            return c2831a.mo15810k();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMultiset$a */
    public static class C2831a<E> extends ImmutableMultiset.C2817b<E> {

        /* JADX INFO: renamed from: d */
        public final Comparator<? super E> f10968d;

        /* JADX INFO: renamed from: e */
        public E[] f10969e;

        /* JADX INFO: renamed from: f */
        public int[] f10970f;

        /* JADX INFO: renamed from: g */
        public int f10971g;

        /* JADX INFO: renamed from: h */
        public boolean f10972h;

        public C2831a(Comparator<? super E> comparator) {
            super(true);
            this.f10968d = (Comparator) xn80.m212111p(comparator);
            this.f10969e = (E[]) new Object[4];
            this.f10970f = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C2831a<E> mo15737a(E e) {
            return mo15809j(e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C2831a<E> mo15806g(E... eArr) {
            for (E e : eArr) {
                mo15737a(e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2831a<E> mo15807h(Iterable<? extends E> iterable) {
            if (iterable instanceof InterfaceC2995k) {
                for (InterfaceC2995k.a<E> aVar : ((InterfaceC2995k) iterable).entrySet()) {
                    mo15809j(aVar.getElement(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    mo15737a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2831a<E> mo15808i(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15737a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2831a<E> mo15809j(E e, int i) {
            xn80.m212111p(e);
            se5.m185516b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            m15891u();
            E[] eArr = this.f10969e;
            int i2 = this.f10971g;
            eArr[i2] = e;
            this.f10970f[i2] = i;
            this.f10971g = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2817b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> mo15810k() {
            m15890t();
            int i = this.f10971g;
            Comparator<? super E> comparator = this.f10968d;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.construct(comparator, i, this.f10969e);
            long[] jArr = new long[this.f10971g + 1];
            int i2 = 0;
            while (i2 < this.f10971g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f10970f[i2]);
                i2 = i3;
            }
            this.f10972h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f10971g);
        }

        /* JADX INFO: renamed from: s */
        public final void m15889s(boolean z) {
            int i = this.f10971g;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f10969e, i);
            Arrays.sort(objArr, this.f10968d);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.f10968d.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.f10971g, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f10971g;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, nym.m165347h(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.f10971g; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f10969e[i6], this.f10968d);
                int i7 = this.f10970f[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.f10969e = (E[]) objArr;
            this.f10970f = iArr;
            this.f10971g = i2;
        }

        /* JADX INFO: renamed from: t */
        public final void m15890t() {
            m15889s(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f10971g;
                if (i >= i3) {
                    Arrays.fill(this.f10969e, i2, i3, (Object) null);
                    Arrays.fill(this.f10970f, i2, this.f10971g, 0);
                    this.f10971g = i2;
                    return;
                }
                int[] iArr = this.f10970f;
                int i4 = iArr[i];
                if (i4 > 0) {
                    E[] eArr = this.f10969e;
                    eArr[i2] = eArr[i];
                    iArr[i2] = i4;
                    i2++;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m15891u() {
            int i = this.f10971g;
            E[] eArr = this.f10969e;
            if (i == eArr.length) {
                m15889s(true);
            } else if (this.f10972h) {
                this.f10969e = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f10972h = false;
        }
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new C2831a(comparator).mo15807h(iterable).mo15810k();
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(InterfaceC3000p<E> interfaceC3000p) {
        return copyOfSortedEntries(interfaceC3000p.comparator(), Lists.m15978k(interfaceC3000p.entrySet()));
    }

    private static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<InterfaceC2995k.a<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (InterfaceC2995k.a<E> aVar : collection) {
            c2804a.mo15737a(aVar.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) aVar.getCount());
            i = i2;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(c2804a.m15756m(), comparator), jArr, 0, collection.size());
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return Ordering.natural().equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> C2831a<E> naturalOrder() {
        return new C2831a<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15882of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListM15981n = Lists.m15981n(comparableArr.length + 6);
        Collections.addAll(arrayListM15981n, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListM15981n, comparableArr);
        return copyOf(Ordering.natural(), arrayListM15981n);
    }

    public static <E> C2831a<E> orderedBy(Comparator<E> comparator) {
        return new C2831a<>(comparator);
    }

    public static <E extends Comparable<?>> C2831a<E> reverseOrder() {
        return new C2831a<>(Ordering.natural().reverse());
    }

    @Override // com.google.common.collect.InterfaceC3000p, p153l.auf0
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableSortedMultisetFauxverideShim, com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public abstract /* synthetic */ int count(Object obj);

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultisetEmptyMultiset = this.descendingMultiset;
        if (immutableSortedMultisetEmptyMultiset == null) {
            immutableSortedMultisetEmptyMultiset = isEmpty() ? emptyMultiset(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.descendingMultiset = immutableSortedMultisetEmptyMultiset;
        }
        return immutableSortedMultisetEmptyMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract /* synthetic */ InterfaceC2995k.a firstEntry();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract /* synthetic */ InterfaceC2995k.a lastEntry();

    @Override // com.google.common.collect.InterfaceC3000p
    @Deprecated
    public final InterfaceC2995k.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    @Deprecated
    public final InterfaceC2995k.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.InterfaceC3000p
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        xn80.m212107l(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((Object) e, boundType).headMultiset((Object) e2, boundType2);
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15877of(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.m15899of(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15878of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15879of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15880of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15881of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m15876of() {
        return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        xn80.m212111p(comparator);
        return new C2831a(comparator).mo15808i(it).mo15810k();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }
}
