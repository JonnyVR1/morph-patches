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
import p153l.adj;
import p153l.k950;
import p153l.mor;
import p153l.nym;
import p153l.se5;
import p153l.xgj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (E[]) ((Object[]) xn80.m212111p(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            xn80.m212109n(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return nym.m165347h(this.rest.length, 1);
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // java.util.List
        public Character get(int i) {
            xn80.m212109n(i, size());
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
            xn80.m212116u(i, i2, size());
            return Lists.m15970c(this.string.substring(i, i2));
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final adj<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$a */
        public class C2855a extends xgj0<F, T> {
            public C2855a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p153l.wgj0
            /* JADX INFO: renamed from: a */
            public T mo15951a(F f) {
                return TransformingRandomAccessList.this.function.apply(f);
            }
        }

        public TransformingRandomAccessList(List<F> list, adj<? super F, ? extends T> adjVar) {
            this.fromList = (List) xn80.m212111p(list);
            this.function = (adj) xn80.m212111p(adjVar);
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
            return new C2855a(this.fromList.listIterator(i));
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
        final adj<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$TransformingSequentialList$a */
        public class C2856a extends xgj0<F, T> {
            public C2856a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p153l.wgj0
            /* JADX INFO: renamed from: a */
            public T mo15951a(F f) {
                return TransformingSequentialList.this.function.apply(f);
            }
        }

        public TransformingSequentialList(List<F> list, adj<? super F, ? extends T> adjVar) {
            this.fromList = (List) xn80.m212111p(list);
            this.function = (adj) xn80.m212111p(adjVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C2856a(this.fromList.listIterator(i));
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
            this.rest = (E[]) ((Object[]) xn80.m212111p(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            xn80.m212109n(i, size());
            return this.rest[i - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return nym.m165347h(this.rest.length, 2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$a */
    public static class C2857a<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: a */
        public final List<T> f11042a;

        /* JADX INFO: renamed from: b */
        public final int f11043b;

        public C2857a(List<T> list, int i) {
            this.f11042a = list;
            this.f11043b = i;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i) {
            xn80.m212109n(i, size());
            int i2 = this.f11043b;
            int i3 = i * i2;
            return this.f11042a.subList(i3, Math.min(i2 + i3, this.f11042a.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f11042a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return nym.m165342c(this.f11042a.size(), this.f11043b, RoundingMode.CEILING);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$b */
    public static class C2858b<T> extends C2857a<T> implements RandomAccess {
        public C2858b(List<T> list, int i) {
            super(list, i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$c */
    public static class C2859c<T> extends C2860d<T> implements RandomAccess {
        public C2859c(List<T> list) {
            super(list);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$d */
    public static class C2860d<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f11044a;

        /* JADX INFO: renamed from: com.google.common.collect.Lists$d$a */
        public class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f11045a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListIterator f11046b;

            public a(ListIterator listIterator) {
                this.f11046b = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(T t) {
                this.f11046b.add(t);
                this.f11046b.previous();
                this.f11045a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f11046b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f11046b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (hasNext()) {
                    this.f11045a = true;
                    return (T) this.f11046b.previous();
                }
                mor.m159308a();
                return null;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return C2860d.this.m15990g(this.f11046b.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (hasPrevious()) {
                    this.f11045a = true;
                    return (T) this.f11046b.next();
                }
                mor.m159308a();
                return null;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                se5.m185519e(this.f11045a);
                this.f11046b.remove();
                this.f11045a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t) {
                xn80.m212117v(this.f11045a);
                this.f11046b.set(t);
            }
        }

        public C2860d(List<T> list) {
            this.f11044a = (List) xn80.m212111p(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.f11044a.add(m15990g(i), t);
        }

        /* JADX INFO: renamed from: c */
        public List<T> m15988c() {
            return this.f11044a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f11044a.clear();
        }

        /* JADX INFO: renamed from: f */
        public final int m15989f(int i) {
            int size = size();
            xn80.m212109n(i, size);
            return (size - 1) - i;
        }

        /* JADX INFO: renamed from: g */
        public final int m15990g(int i) {
            int size = size();
            xn80.m212114s(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.f11044a.get(m15989f(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.f11044a.listIterator(m15990g(i)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f11044a.remove(m15989f(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return this.f11044a.set(m15989f(i), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11044a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            return Lists.m15984q(this.f11044a.subList(m15990g(i2), m15990g(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static <E> List<E> m15968a(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    /* JADX INFO: renamed from: b */
    public static <T> List<T> m15969b(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* JADX INFO: renamed from: c */
    public static ImmutableList<Character> m15970c(String str) {
        return new StringAsImmutableList((String) xn80.m212111p(str));
    }

    /* JADX INFO: renamed from: d */
    public static int m15971d(int i) {
        se5.m185516b(i, "arraySize");
        return Ints.m16523m(((long) i) + 5 + ((long) (i / 10)));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15972e(List<?> list, Object obj) {
        if (obj == xn80.m212111p(list)) {
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
            return Iterators.m15932h(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!k950.m148863a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m15973f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m15974g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (k950.m148863a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m15974g(List<?> list, Object obj) {
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
    public static int m15975h(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m15976i(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (k950.m148863a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m15976i(List<?> list, Object obj) {
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
    public static <E> ArrayList<E> m15977j() {
        return new ArrayList<>();
    }

    /* JADX INFO: renamed from: k */
    public static <E> ArrayList<E> m15978k(Iterable<? extends E> iterable) {
        xn80.m212111p(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : m15979l(iterable.iterator());
    }

    /* JADX INFO: renamed from: l */
    public static <E> ArrayList<E> m15979l(Iterator<? extends E> it) {
        ArrayList<E> arrayListM15977j = m15977j();
        Iterators.m15925a(arrayListM15977j, it);
        return arrayListM15977j;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: m */
    public static <E> ArrayList<E> m15980m(E... eArr) {
        xn80.m212111p(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m15971d(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static <E> ArrayList<E> m15981n(int i) {
        se5.m185516b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* JADX INFO: renamed from: o */
    public static <E> ArrayList<E> m15982o(int i) {
        return new ArrayList<>(m15971d(i));
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<List<T>> m15983p(List<T> list, int i) {
        xn80.m212111p(list);
        xn80.m212099d(i > 0);
        return list instanceof RandomAccess ? new C2858b(list, i) : new C2857a(list, i);
    }

    /* JADX INFO: renamed from: q */
    public static <T> List<T> m15984q(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof C2860d) {
            return ((C2860d) list).m15988c();
        }
        return list instanceof RandomAccess ? new C2859c(list) : new C2860d(list);
    }

    /* JADX INFO: renamed from: r */
    public static <F, T> List<T> m15985r(List<F> list, adj<? super F, ? extends T> adjVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, adjVar) : new TransformingSequentialList(list, adjVar);
    }
}
