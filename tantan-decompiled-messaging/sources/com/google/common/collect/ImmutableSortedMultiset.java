package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p149l.mwm;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements InterfaceC2977p<E> {
    transient ImmutableSortedMultiset<E> descendingMultiset;

    public static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        public SerializedForm(InterfaceC2977p<E> interfaceC2977p) {
            this.comparator = interfaceC2977p.comparator();
            int size = interfaceC2977p.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (InterfaceC2972k.a<E> aVar : interfaceC2977p.entrySet()) {
                this.elements[i] = aVar.getElement();
                this.counts[i] = aVar.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.elements.length;
            C2808a c2808a = new C2808a(this.comparator);
            for (int i = 0; i < length; i++) {
                c2808a.mo15755j(this.elements[i], this.counts[i]);
            }
            return c2808a.mo15756k();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMultiset$a */
    public static class C2808a<E> extends ImmutableMultiset.C2794b<E> {

        /* JADX INFO: renamed from: d */
        public final Comparator<? super E> f10931d;

        /* JADX INFO: renamed from: e */
        public E[] f10932e;

        /* JADX INFO: renamed from: f */
        public int[] f10933f;

        /* JADX INFO: renamed from: g */
        public int f10934g;

        /* JADX INFO: renamed from: h */
        public boolean f10935h;

        public C2808a(Comparator<? super E> comparator) {
            super(true);
            this.f10931d = (Comparator) sf80.m183894p(comparator);
            this.f10932e = (E[]) new Object[4];
            this.f10933f = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C2808a<E> mo15683a(E e) {
            return mo15755j(e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C2808a<E> mo15752g(E... eArr) {
            for (E e : eArr) {
                mo15683a(e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2808a<E> mo15753h(Iterable<? extends E> iterable) {
            if (iterable instanceof InterfaceC2972k) {
                for (InterfaceC2972k.a<E> aVar : ((InterfaceC2972k) iterable).entrySet()) {
                    mo15755j(aVar.getElement(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    mo15683a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2808a<E> mo15754i(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15683a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2808a<E> mo15755j(E e, int i) {
            sf80.m183894p(e);
            sd5.m183444b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            m15837u();
            E[] eArr = this.f10932e;
            int i2 = this.f10934g;
            eArr[i2] = e;
            this.f10933f[i2] = i;
            this.f10934g = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.C2794b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> mo15756k() {
            m15836t();
            int i = this.f10934g;
            Comparator<? super E> comparator = this.f10931d;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.construct(comparator, i, this.f10932e);
            long[] jArr = new long[this.f10934g + 1];
            int i2 = 0;
            while (i2 < this.f10934g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f10933f[i2]);
                i2 = i3;
            }
            this.f10935h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f10934g);
        }

        /* JADX INFO: renamed from: s */
        public final void m15835s(boolean z) {
            int i = this.f10934g;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f10932e, i);
            Arrays.sort(objArr, this.f10931d);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.f10931d.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.f10934g, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f10934g;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, mwm.m156757h(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.f10934g; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f10932e[i6], this.f10931d);
                int i7 = this.f10933f[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.f10932e = (E[]) objArr;
            this.f10933f = iArr;
            this.f10934g = i2;
        }

        /* JADX INFO: renamed from: t */
        public final void m15836t() {
            m15835s(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f10934g;
                if (i >= i3) {
                    Arrays.fill(this.f10932e, i2, i3, (Object) null);
                    Arrays.fill(this.f10933f, i2, this.f10934g, 0);
                    this.f10934g = i2;
                    return;
                }
                int[] iArr = this.f10933f;
                int i4 = iArr[i];
                if (i4 > 0) {
                    E[] eArr = this.f10932e;
                    eArr[i2] = eArr[i];
                    iArr[i2] = i4;
                    i2++;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m15837u() {
            int i = this.f10934g;
            E[] eArr = this.f10932e;
            if (i == eArr.length) {
                m15835s(true);
            } else if (this.f10935h) {
                this.f10932e = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f10935h = false;
        }
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new C2808a(comparator).mo15753h(iterable).mo15756k();
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(InterfaceC2977p<E> interfaceC2977p) {
        return copyOfSortedEntries(interfaceC2977p.comparator(), Lists.m15924k(interfaceC2977p.entrySet()));
    }

    private static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<InterfaceC2972k.a<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (InterfaceC2972k.a<E> aVar : collection) {
            c2781a.mo15683a(aVar.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) aVar.getCount());
            i = i2;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(c2781a.m15702m(), comparator), jArr, 0, collection.size());
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return Ordering.natural().equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> C2808a<E> naturalOrder() {
        return new C2808a<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15828of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListM15927n = Lists.m15927n(comparableArr.length + 6);
        Collections.addAll(arrayListM15927n, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListM15927n, comparableArr);
        return copyOf(Ordering.natural(), arrayListM15927n);
    }

    public static <E> C2808a<E> orderedBy(Comparator<E> comparator) {
        return new C2808a<>(comparator);
    }

    public static <E extends Comparable<?>> C2808a<E> reverseOrder() {
        return new C2808a<>(Ordering.natural().reverse());
    }

    @Override // com.google.common.collect.InterfaceC2977p, p149l.rlf0
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableSortedMultisetFauxverideShim, com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
    public abstract /* synthetic */ int count(Object obj);

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultisetEmptyMultiset = this.descendingMultiset;
        if (immutableSortedMultisetEmptyMultiset == null) {
            immutableSortedMultisetEmptyMultiset = isEmpty() ? emptyMultiset(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.descendingMultiset = immutableSortedMultisetEmptyMultiset;
        }
        return immutableSortedMultisetEmptyMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract /* synthetic */ InterfaceC2972k.a firstEntry();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract /* synthetic */ InterfaceC2972k.a lastEntry();

    @Override // com.google.common.collect.InterfaceC2977p
    @Deprecated
    public final InterfaceC2972k.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    @Deprecated
    public final InterfaceC2972k.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.InterfaceC2977p
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        sf80.m183890l(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((Object) e, boundType).headMultiset((Object) e2, boundType2);
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15823of(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.m15845of(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15824of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15825of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15826of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMultiset m15827of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m15822of() {
        return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        sf80.m183894p(comparator);
        return new C2808a(comparator).mo15754i(it).mo15756k();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }
}
