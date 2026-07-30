package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p149l.lmr;
import p149l.s7j0;
import p149l.sd5;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class Multisets {

    public static class ImmutableEntry<E> extends AbstractC2897b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            sd5.m183444b(i, "count");
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Multisets$a */
    public class C2896a<E> extends s7j0<InterfaceC2972k.a<E>, E> {
        public C2896a(Iterator it) {
            super(it);
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E mo15897a(InterfaceC2972k.a<E> aVar) {
            return aVar.getElement();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$b */
    public static abstract class AbstractC2897b<E> implements InterfaceC2972k.a<E> {
        public boolean equals(Object obj) {
            if (obj instanceof InterfaceC2972k.a) {
                InterfaceC2972k.a aVar = (InterfaceC2972k.a) obj;
                if (getCount() == aVar.getCount() && v050.m196470a(getElement(), aVar.getElement())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            E element = getElement();
            return getCount() ^ (element == null ? 0 : element.hashCode());
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
            sb.append(strValueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$c */
    public static abstract class AbstractC2898c<E> extends Sets.AbstractC2918e<E> {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC2972k<E> mo16107a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo16107a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo16107a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo16107a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo16107a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return mo16107a().remove(obj, Api.BaseClientBuilder.API_PRIORITY_OTHER) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo16107a().entrySet().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$d */
    public static abstract class AbstractC2899d<E> extends Sets.AbstractC2918e<InterfaceC2972k.a<E>> {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC2972k<E> mo15633a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15633a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2972k.a) {
                InterfaceC2972k.a aVar = (InterfaceC2972k.a) obj;
                if (aVar.getCount() > 0 && mo15633a().count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof InterfaceC2972k.a) {
                InterfaceC2972k.a aVar = (InterfaceC2972k.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo15633a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$e */
    public static final class C2900e<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2972k<E> f11074a;

        /* JADX INFO: renamed from: b */
        public final Iterator<InterfaceC2972k.a<E>> f11075b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2972k.a<E> f11076c;

        /* JADX INFO: renamed from: d */
        public int f11077d;

        /* JADX INFO: renamed from: e */
        public int f11078e;

        /* JADX INFO: renamed from: f */
        public boolean f11079f;

        public C2900e(InterfaceC2972k<E> interfaceC2972k, Iterator<InterfaceC2972k.a<E>> it) {
            this.f11074a = interfaceC2972k;
            this.f11075b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11077d > 0 || this.f11075b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            if (this.f11077d == 0) {
                InterfaceC2972k.a<E> next = this.f11075b.next();
                this.f11076c = next;
                int count = next.getCount();
                this.f11077d = count;
                this.f11078e = count;
            }
            this.f11077d--;
            this.f11079f = true;
            InterfaceC2972k.a<E> aVar = this.f11076c;
            Objects.requireNonNull(aVar);
            return aVar.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            sd5.m183447e(this.f11079f);
            if (this.f11078e == 1) {
                this.f11075b.remove();
            } else {
                InterfaceC2972k<E> interfaceC2972k = this.f11074a;
                InterfaceC2972k.a<E> aVar = this.f11076c;
                Objects.requireNonNull(aVar);
                interfaceC2972k.remove(aVar.getElement());
            }
            this.f11078e--;
            this.f11079f = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <E> boolean m16090a(InterfaceC2972k<E> interfaceC2972k, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(interfaceC2972k);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static <E> boolean m16091b(InterfaceC2972k<E> interfaceC2972k, InterfaceC2972k<? extends E> interfaceC2972k2) {
        if (interfaceC2972k2 instanceof AbstractMapBasedMultiset) {
            return m16090a(interfaceC2972k, (AbstractMapBasedMultiset) interfaceC2972k2);
        }
        if (interfaceC2972k2.isEmpty()) {
            return false;
        }
        for (InterfaceC2972k.a<? extends E> aVar : interfaceC2972k2.entrySet()) {
            interfaceC2972k.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static <E> boolean m16092c(InterfaceC2972k<E> interfaceC2972k, Collection<? extends E> collection) {
        sf80.m183894p(interfaceC2972k);
        sf80.m183894p(collection);
        if (collection instanceof InterfaceC2972k) {
            return m16091b(interfaceC2972k, m16093d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.m15871a(interfaceC2972k, collection.iterator());
    }

    /* JADX INFO: renamed from: d */
    public static <T> InterfaceC2972k<T> m16093d(Iterable<T> iterable) {
        return (InterfaceC2972k) iterable;
    }

    /* JADX INFO: renamed from: e */
    public static <E> Iterator<E> m16094e(Iterator<InterfaceC2972k.a<E>> it) {
        return new C2896a(it);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16095f(InterfaceC2972k<?> interfaceC2972k, Object obj) {
        if (obj == interfaceC2972k) {
            return true;
        }
        if (obj instanceof InterfaceC2972k) {
            InterfaceC2972k interfaceC2972k2 = (InterfaceC2972k) obj;
            if (interfaceC2972k.size() == interfaceC2972k2.size() && interfaceC2972k.entrySet().size() == interfaceC2972k2.entrySet().size()) {
                for (InterfaceC2972k.a aVar : interfaceC2972k2.entrySet()) {
                    if (interfaceC2972k.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static <E> InterfaceC2972k.a<E> m16096g(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    /* JADX INFO: renamed from: h */
    public static int m16097h(Iterable<?> iterable) {
        if (iterable instanceof InterfaceC2972k) {
            return ((InterfaceC2972k) iterable).elementSet().size();
        }
        return 11;
    }

    /* JADX INFO: renamed from: i */
    public static <E> Iterator<E> m16098i(InterfaceC2972k<E> interfaceC2972k) {
        return new C2900e(interfaceC2972k, interfaceC2972k.entrySet().iterator());
    }

    /* JADX INFO: renamed from: j */
    public static int m16099j(InterfaceC2972k<?> interfaceC2972k) {
        Iterator<InterfaceC2972k.a<?>> it = interfaceC2972k.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return Ints.m16468m(count);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16100k(InterfaceC2972k<?> interfaceC2972k, Collection<?> collection) {
        if (collection instanceof InterfaceC2972k) {
            collection = ((InterfaceC2972k) collection).elementSet();
        }
        return interfaceC2972k.elementSet().removeAll(collection);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16101l(InterfaceC2972k<?> interfaceC2972k, Collection<?> collection) {
        sf80.m183894p(collection);
        if (collection instanceof InterfaceC2972k) {
            collection = ((InterfaceC2972k) collection).elementSet();
        }
        return interfaceC2972k.elementSet().retainAll(collection);
    }

    /* JADX INFO: renamed from: m */
    public static <E> int m16102m(InterfaceC2972k<E> interfaceC2972k, E e, int i) {
        sd5.m183444b(i, "count");
        int iCount = interfaceC2972k.count(e);
        int i2 = i - iCount;
        if (i2 > 0) {
            interfaceC2972k.add(e, i2);
            return iCount;
        }
        if (i2 < 0) {
            interfaceC2972k.remove(e, -i2);
        }
        return iCount;
    }

    /* JADX INFO: renamed from: n */
    public static <E> boolean m16103n(InterfaceC2972k<E> interfaceC2972k, E e, int i, int i2) {
        sd5.m183444b(i, "oldCount");
        sd5.m183444b(i2, "newCount");
        if (interfaceC2972k.count(e) != i) {
            return false;
        }
        interfaceC2972k.setCount(e, i2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static <E> InterfaceC2972k<E> m16104o(InterfaceC2972k<? extends E> interfaceC2972k) {
        return ((interfaceC2972k instanceof UnmodifiableMultiset) || (interfaceC2972k instanceof ImmutableMultiset)) ? interfaceC2972k : new UnmodifiableMultiset((InterfaceC2972k) sf80.m183894p(interfaceC2972k));
    }

    /* JADX INFO: renamed from: p */
    public static <E> InterfaceC2977p<E> m16105p(InterfaceC2977p<E> interfaceC2977p) {
        return new UnmodifiableSortedMultiset((InterfaceC2977p) sf80.m183894p(interfaceC2977p));
    }

    public static class UnmodifiableMultiset<E> extends AbstractC2970i<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final InterfaceC2972k<? extends E> delegate;
        transient Set<E> elementSet;
        transient Set<InterfaceC2972k.a<E>> entrySet;

        public UnmodifiableMultiset(InterfaceC2972k<? extends E> interfaceC2972k) {
            this.delegate = interfaceC2972k;
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.qzi, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public Set<InterfaceC2972k.a<E>> entrySet() {
            Set<InterfaceC2972k.a<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<InterfaceC2972k.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.m15870C(this.delegate.iterator());
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2970i, p149l.qzi, p149l.a0j
        public InterfaceC2972k<E> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }
}
