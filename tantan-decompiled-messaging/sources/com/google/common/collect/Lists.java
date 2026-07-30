package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p149l.gaj;
import p149l.lmr;
import p149l.mwm;
import p149l.sd5;
import p149l.sf80;
import p149l.t7j0;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (E[]) ((Object[]) sf80.m183894p(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            sf80.m183892n(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return mwm.m156757h(this.rest.length, 1);
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // java.util.List
        public Character get(int i) {
            sf80.m183892n(i, size());
            return Character.valueOf(this.string.charAt(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i, int i2) {
            sf80.m183899u(i, i2, size());
            return Lists.m15916c(this.string.substring(i, i2));
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final gaj<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$a */
        public class C2832a extends t7j0<F, T> {
            public C2832a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: a */
            public T mo15897a(F f) {
                return TransformingRandomAccessList.this.function.apply(f);
            }
        }

        public TransformingRandomAccessList(List<F> list, gaj<? super F, ? extends T> gajVar) {
            this.fromList = (List) sf80.m183894p(list);
            this.function = (gaj) sf80.m183894p(gajVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C2832a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final gaj<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$TransformingSequentialList$a */
        public class C2833a extends t7j0<F, T> {
            public C2833a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: a */
            public T mo15897a(F f) {
                return TransformingSequentialList.this.function.apply(f);
            }
        }

        public TransformingSequentialList(List<F> list, gaj<? super F, ? extends T> gajVar) {
            this.fromList = (List) sf80.m183894p(list);
            this.function = (gaj) sf80.m183894p(gajVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C2833a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;
        final E second;

        public TwoPlusArrayList(E e, E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            this.rest = (E[]) ((Object[]) sf80.m183894p(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            sf80.m183892n(i, size());
            return this.rest[i - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return mwm.m156757h(this.rest.length, 2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$a */
    public static class C2834a<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: a */
        public final List<T> f11005a;

        /* JADX INFO: renamed from: b */
        public final int f11006b;

        public C2834a(List<T> list, int i) {
            this.f11005a = list;
            this.f11006b = i;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i) {
            sf80.m183892n(i, size());
            int i2 = this.f11006b;
            int i3 = i * i2;
            return this.f11005a.subList(i3, Math.min(i2 + i3, this.f11005a.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f11005a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return mwm.m156752c(this.f11005a.size(), this.f11006b, RoundingMode.CEILING);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$b */
    public static class C2835b<T> extends C2834a<T> implements RandomAccess {
        public C2835b(List<T> list, int i) {
            super(list, i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$c */
    public static class C2836c<T> extends C2837d<T> implements RandomAccess {
        public C2836c(List<T> list) {
            super(list);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$d */
    public static class C2837d<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f11007a;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$d$a */
        public class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f11008a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListIterator f11009b;

            public a(ListIterator listIterator) {
                this.f11009b = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(T t) {
                this.f11009b.add(t);
                this.f11009b.previous();
                this.f11008a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f11009b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f11009b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (hasNext()) {
                    this.f11008a = true;
                    return (T) this.f11009b.previous();
                }
                lmr.m150601a();
                return null;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return C2837d.this.m15936g(this.f11009b.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (hasPrevious()) {
                    this.f11008a = true;
                    return (T) this.f11009b.next();
                }
                lmr.m150601a();
                return null;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                sd5.m183447e(this.f11008a);
                this.f11009b.remove();
                this.f11008a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t) {
                sf80.m183900v(this.f11008a);
                this.f11009b.set(t);
            }
        }

        public C2837d(List<T> list) {
            this.f11007a = (List) sf80.m183894p(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.f11007a.add(m15936g(i), t);
        }

        /* JADX INFO: renamed from: c */
        public List<T> m15934c() {
            return this.f11007a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f11007a.clear();
        }

        /* JADX INFO: renamed from: f */
        public final int m15935f(int i) {
            int size = size();
            sf80.m183892n(i, size);
            return (size - 1) - i;
        }

        /* JADX INFO: renamed from: g */
        public final int m15936g(int i) {
            int size = size();
            sf80.m183897s(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.f11007a.get(m15935f(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.f11007a.listIterator(m15936g(i)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f11007a.remove(m15935f(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return this.f11007a.set(m15935f(i), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11007a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            sf80.m183899u(i, i2, size());
            return Lists.m15930q(this.f11007a.subList(m15936g(i2), m15936g(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static <E> List<E> m15914a(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    /* JADX INFO: renamed from: b */
    public static <T> List<T> m15915b(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* JADX INFO: renamed from: c */
    public static ImmutableList<Character> m15916c(String str) {
        return new StringAsImmutableList((String) sf80.m183894p(str));
    }

    /* JADX INFO: renamed from: d */
    public static int m15917d(int i) {
        sd5.m183444b(i, "arraySize");
        return Ints.m16468m(((long) i) + 5 + ((long) (i / 10)));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15918e(List<?> list, Object obj) {
        if (obj == sf80.m183894p(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.m15878h(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!v050.m196470a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m15919f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m15920g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (v050.m196470a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m15920g(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m15921h(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m15922i(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (v050.m196470a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m15922i(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static <E> ArrayList<E> m15923j() {
        return new ArrayList<>();
    }

    /* JADX INFO: renamed from: k */
    public static <E> ArrayList<E> m15924k(Iterable<? extends E> iterable) {
        sf80.m183894p(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : m15925l(iterable.iterator());
    }

    /* JADX INFO: renamed from: l */
    public static <E> ArrayList<E> m15925l(Iterator<? extends E> it) {
        ArrayList<E> arrayListM15923j = m15923j();
        Iterators.m15871a(arrayListM15923j, it);
        return arrayListM15923j;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: m */
    public static <E> ArrayList<E> m15926m(E... eArr) {
        sf80.m183894p(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m15917d(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static <E> ArrayList<E> m15927n(int i) {
        sd5.m183444b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* JADX INFO: renamed from: o */
    public static <E> ArrayList<E> m15928o(int i) {
        return new ArrayList<>(m15917d(i));
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<List<T>> m15929p(List<T> list, int i) {
        sf80.m183894p(list);
        sf80.m183882d(i > 0);
        return list instanceof RandomAccess ? new C2835b(list, i) : new C2834a(list, i);
    }

    /* JADX INFO: renamed from: q */
    public static <T> List<T> m15930q(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof C2837d) {
            return ((C2837d) list).m15934c();
        }
        return list instanceof RandomAccess ? new C2836c(list) : new C2837d(list);
    }

    /* JADX INFO: renamed from: r */
    public static <F, T> List<T> m15931r(List<F> list, gaj<? super F, ? extends T> gajVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, gajVar) : new TransformingSequentialList(list, gajVar);
    }
}
