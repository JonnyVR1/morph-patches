package com.google.common.collect;

import Sudchar.Sudfor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p149l.aiq;
import p149l.dpj0;
import p149l.j050;
import p149l.rlf0;
import p149l.sf80;
import p149l.slf0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, rlf0<E> {
    final transient Comparator<? super E> comparator;
    transient ImmutableSortedSet<E> descendingSet;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new C2809a(this.comparator).mo15776j(this.elements).mo15780n();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedSet$a */
    public static final class C2809a<E> extends ImmutableSet.C2802a<E> {

        /* JADX INFO: renamed from: f */
        public final Comparator<? super E> f10936f;

        public C2809a(Comparator<? super E> comparator) {
            this.f10936f = (Comparator) sf80.m183894p(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.C2802a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2809a<E> mo15683a(E e) {
            super.mo15683a(e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.C2802a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2809a<E> mo15776j(E... eArr) {
            super.mo15776j(eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.C2802a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2809a<E> mo15777k(Iterable<? extends E> iterable) {
            super.mo15777k(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.C2802a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C2809a<E> mo15778l(Iterator<? extends E> it) {
            super.mo15778l(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.C2802a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<E> mo15780n() {
            ImmutableSortedSet<E> immutableSortedSetConstruct = ImmutableSortedSet.construct(this.f10936f, this.f10882b, this.f10881a);
            this.f10882b = immutableSortedSetConstruct.size();
            this.f10883c = true;
            return immutableSortedSetConstruct;
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator);
        }
        j050.m139131c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Sudfor sudfor = (Object) eArr[i3];
            if (comparator.compare(sudfor, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = sudfor;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(eArr, i2), comparator);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        sf80.m183894p(comparator);
        if (slf0.m184801b(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] objArrM96890p = aiq.m96890p(iterable);
        return construct(comparator, objArrM96890p.length, objArrM96890p);
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparatorM184800a = slf0.m184800a(sortedSet);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) sortedSet);
        return immutableListCopyOf.isEmpty() ? emptySet(comparatorM184800a) : new RegularImmutableSortedSet(immutableListCopyOf, comparatorM184800a);
    }

    public static <E> RegularImmutableSortedSet<E> emptySet(Comparator<? super E> comparator) {
        return Ordering.natural().equals(comparator) ? (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET : new RegularImmutableSortedSet<>(ImmutableList.m15685of(), comparator);
    }

    public static <E extends Comparable<?>> C2809a<E> naturalOrder() {
        return new C2809a<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15850of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return construct(Ordering.natural(), length, comparableArr2);
    }

    public static <E> C2809a<E> orderedBy(Comparator<E> comparator) {
        return new C2809a<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C2809a<E> reverseOrder() {
        return new C2809a<>(Collections.reverseOrder());
    }

    public E ceiling(E e) {
        return (E) aiq.m96880f(tailSet((Object) e, true), null);
    }

    @Override // java.util.SortedSet, p149l.rlf0
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    public abstract dpj0<E> descendingIterator();

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetCreateDescendingSet = createDescendingSet();
        this.descendingSet = immutableSortedSetCreateDescendingSet;
        immutableSortedSetCreateDescendingSet.descendingSet = this;
        return immutableSortedSetCreateDescendingSet;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return (E) Iterators.m15886p(headSet((Object) e, true).descendingIterator(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return headSetImpl(sf80.m183894p(e), z);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    public E higher(E e) {
        return (E) aiq.m96880f(tailSet((Object) e, false), null);
    }

    public abstract int indexOf(Object obj);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract dpj0<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return (E) Iterators.m15886p(headSet((Object) e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        sf80.m183894p(e);
        sf80.m183894p(e2);
        sf80.m183882d(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return tailSetImpl(sf80.m183894p(e), z);
    }

    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }

    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet((Object) e, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet((Object) e, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet((Object) e, true, (Object) e2, false);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) Ordering.natural(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15845of(Comparable comparable) {
        return new RegularImmutableSortedSet(ImmutableList.m15686of(comparable), Ordering.natural());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15846of(Comparable comparable, Comparable comparable2) {
        return construct(Ordering.natural(), 2, comparable, comparable2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15847of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return construct(Ordering.natural(), 3, comparable, comparable2, comparable3);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new C2809a(comparator).mo15778l(it).mo15780n();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15848of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return construct(Ordering.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] comparableArr) {
        return construct(Ordering.natural(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m15849of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return construct(Ordering.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m15844of() {
        return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }
}
