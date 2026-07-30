package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.adj;
import p153l.akq;
import p153l.aqg0;
import p153l.c5j0;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Ordering<T> implements Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        public IncomparableValueException(Object obj) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Cannot compare value: ");
            sb.append(strValueOf);
            super(sb.toString());
            this.value = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Ordering$a */
    public static class C2926a extends Ordering<Object> {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f11119a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<Object, Integer> f11120b = C2997m.m16357i(new MapMaker()).m15999i();

        /* JADX INFO: renamed from: a */
        public final Integer m16163a(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f11120b.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f11120b.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f11119a.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        /* JADX INFO: renamed from: b */
        public int m16164b(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iM16164b = m16164b(obj);
            int iM16164b2 = m16164b(obj2);
            if (iM16164b != iM16164b2) {
                return iM16164b < iM16164b2 ? -1 : 1;
            }
            int iCompareTo = m16163a(obj).compareTo(m16163a(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            aqg0.m99478a();
            return 0;
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Ordering$b */
    public static class C2927b {

        /* JADX INFO: renamed from: a */
        public static final Ordering<Object> f11121a = new C2926a();
    }

    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return C2927b.f11121a;
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.m15968a(t, tArr));
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, T t) {
        return Collections.binarySearch(list, t, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) xn80.m212111p(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
        xn80.m212111p(it);
        se5.m185516b(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i < 1073741823) {
            c5j0 c5j0VarM108056a = c5j0.m108056a(i, this);
            c5j0VarM108056a.m108058c(it);
            return c5j0VarM108056a.m108061f();
        }
        ArrayList arrayListM15979l = Lists.m15979l(it);
        Collections.sort(arrayListM15979l, this);
        if (arrayListM15979l.size() > i) {
            arrayListM15979l.subList(i, arrayListM15979l.size()).clear();
        }
        arrayListM15979l.trimToSize();
        return Collections.unmodifiableList(arrayListM15979l);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <E extends T> E max(E e, E e2, E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    public <E extends T> E min(E e, E e2, E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.m16091l());
    }

    public <F> Ordering<F> onResultOf(adj<F, ? extends T> adjVar) {
        return new ByFunctionOrdering(adjVar, this);
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrM98608p = akq.m98608p(iterable);
        Arrays.sort(objArrM98608p, this);
        return Lists.m15978k(Arrays.asList(objArrM98608p));
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) xn80.m212111p(ordering);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E max(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E min(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }
}
