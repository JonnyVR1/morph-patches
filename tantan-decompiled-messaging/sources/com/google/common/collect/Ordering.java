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
import p149l.aiq;
import p149l.gaj;
import p149l.sd5;
import p149l.sf80;
import p149l.shg0;
import p149l.yvi0;

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
    public static class C2903a extends Ordering<Object> {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f11082a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<Object, Integer> f11083b = C2974m.m16303i(new MapMaker()).m15945i();

        /* JADX INFO: renamed from: a */
        public final Integer m16109a(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f11083b.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f11083b.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f11082a.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        /* JADX INFO: renamed from: b */
        public int m16110b(Object obj) {
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
            int iM16110b = m16110b(obj);
            int iM16110b2 = m16110b(obj2);
            if (iM16110b != iM16110b2) {
                return iM16110b < iM16110b2 ? -1 : 1;
            }
            int iCompareTo = m16109a(obj).compareTo(m16109a(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            shg0.m184191a();
            return 0;
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Ordering$b */
    public static class C2904b {

        /* JADX INFO: renamed from: a */
        public static final Ordering<Object> f11084a = new C2903a();
    }

    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return C2904b.f11084a;
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.m15914a(t, tArr));
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
        return new CompoundOrdering(this, (Comparator) sf80.m183894p(comparator));
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
        sf80.m183894p(it);
        sd5.m183444b(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i < 1073741823) {
            yvi0 yvi0VarM216217a = yvi0.m216217a(i, this);
            yvi0VarM216217a.m216219c(it);
            return yvi0VarM216217a.m216222f();
        }
        ArrayList arrayListM15925l = Lists.m15925l(it);
        Collections.sort(arrayListM15925l, this);
        if (arrayListM15925l.size() > i) {
            arrayListM15925l.subList(i, arrayListM15925l.size()).clear();
        }
        arrayListM15925l.trimToSize();
        return Collections.unmodifiableList(arrayListM15925l);
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
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.m16037l());
    }

    public <F> Ordering<F> onResultOf(gaj<F, ? extends T> gajVar) {
        return new ByFunctionOrdering(gajVar, this);
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrM96890p = aiq.m96890p(iterable);
        Arrays.sort(objArrM96890p, this);
        return Lists.m15924k(Arrays.asList(objArrM96890p));
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
        return (Ordering) sf80.m183894p(ordering);
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
