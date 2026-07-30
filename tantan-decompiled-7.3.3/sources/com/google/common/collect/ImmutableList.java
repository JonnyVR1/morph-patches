package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p153l.AbstractC17659i7;
import p153l.akq;
import p153l.gyj0;
import p153l.iyj0;
import p153l.se5;
import p153l.xn80;
import p153l.y850;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final iyj0<Object> EMPTY_ITR = new C2805b(RegularImmutableList.EMPTY, 0);

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableList$b */
    public static class C2805b<E> extends AbstractC17659i7<E> {

        /* JADX INFO: renamed from: c */
        public final ImmutableList<E> f10921c;

        public C2805b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f10921c = immutableList;
        }

        @Override // p153l.AbstractC17659i7
        /* JADX INFO: renamed from: a */
        public E mo15662a(int i) {
            return this.f10921c.get(i);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        return i == 0 ? m15739of() : new RegularImmutableList(objArr, i);
    }

    public static <E> C2804a<E> builder() {
        return new C2804a<>();
    }

    public static <E> C2804a<E> builderWithExpectedSize(int i) {
        se5.m185516b(i, "expectedSize");
        return new C2804a<>(i);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(y850.m214723b(objArr));
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m15739of();
        }
        E next = it.next();
        return !it.hasNext() ? m15740of((Object) next) : new C2804a().mo15737a(next).m15755l(it).m15756m();
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15751of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        xn80.m212100e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) akq.m98609q(iterable, new Comparable[0]);
        y850.m214723b(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return Lists.m15972e(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m15973f(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m15975h(this, obj);
    }

    @Override // java.util.List
    public iyj0<E> listIterator(int i) {
        xn80.m212114s(i, size());
        return isEmpty() ? (iyj0<E>) EMPTY_ITR : new C2805b(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i, int i2) {
        xn80.m212116u(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? m15739of() : subListUnchecked(i, i2);
    }

    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.forwardList = immutableList;
        }

        private int reverseIndex(int i) {
            return (size() - 1) - i;
        }

        private int reversePosition(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            xn80.m212109n(i, size());
            return this.forwardList.get(reverseIndex(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.forwardList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return reverseIndex(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.forwardList.indexOf(obj);
            if (iIndexOf >= 0) {
                return reverseIndex(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.forwardList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public class SubList extends ImmutableList<E> {
        final transient int length;
        final transient int offset;

        public SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        @Override // java.util.List
        public E get(int i) {
            xn80.m212109n(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            xn80.m212116u(i, i2, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C2804a<E> extends ImmutableCollection.AbstractC2800a<E> {
        public C2804a() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2801b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C2804a<E> mo15737a(E e) {
            super.m15733f(e);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2804a<E> m15753j(E... eArr) {
            super.mo15731b(eArr);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2804a<E> m15754k(Iterable<? extends E> iterable) {
            super.mo15732c(iterable);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2804a<E> m15755l(Iterator<? extends E> it) {
            super.m15738d(it);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public ImmutableList<E> m15756m() {
            this.f10920c = true;
            return ImmutableList.asImmutableList(this.f10918a, this.f10919b);
        }

        public C2804a(int i) {
            super(i);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public gyj0<E> iterator() {
        return listIterator();
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        xn80.m212111p(comparator);
        Object[] objArrM98608p = akq.m98608p(iterable);
        y850.m214723b(objArrM98608p);
        Arrays.sort(objArrM98608p, comparator);
        return asImmutableList(objArrM98608p);
    }

    @Override // java.util.List
    public iyj0<E> listIterator() {
        return listIterator(0);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(collection.toArray());
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        xn80.m212111p(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m15739of();
        }
        return construct((Object[]) eArr.clone());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15740of(E e) {
        return construct(e);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15741of(E e, E e2) {
        return construct(e, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15742of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15743of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15744of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15745of(E e, E e2, E e3, E e4, E e5, E e6) {
        return construct(e, e2, e3, e4, e5, e6);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15746of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e, e2, e3, e4, e5, e6, e7);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15747of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15748of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15749of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15750of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m15739of() {
        return (ImmutableList<E>) RegularImmutableList.EMPTY;
    }
}
