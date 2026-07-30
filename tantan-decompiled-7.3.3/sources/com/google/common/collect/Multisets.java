package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p153l.k950;
import p153l.mor;
import p153l.se5;
import p153l.wgj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Multisets {

    public static class ImmutableEntry<E> extends AbstractC2920b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            se5.m185516b(i, "count");
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Multisets$a */
    public class C2919a<E> extends wgj0<InterfaceC2995k.a<E>, E> {
        public C2919a(Iterator it) {
            super(it);
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E mo15951a(InterfaceC2995k.a<E> aVar) {
            return aVar.getElement();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$b */
    public static abstract class AbstractC2920b<E> implements InterfaceC2995k.a<E> {
        public boolean equals(Object obj) {
            if (obj instanceof InterfaceC2995k.a) {
                InterfaceC2995k.a aVar = (InterfaceC2995k.a) obj;
                if (getCount() == aVar.getCount() && k950.m148863a(getElement(), aVar.getElement())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            E element = getElement();
            return getCount() ^ (element == null ? 0 : element.hashCode());
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
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
    public static abstract class AbstractC2921c<E> extends Sets.AbstractC2941e<E> {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC2995k<E> mo16161a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo16161a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo16161a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo16161a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo16161a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return mo16161a().remove(obj, Api.BaseClientBuilder.API_PRIORITY_OTHER) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo16161a().entrySet().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$d */
    public static abstract class AbstractC2922d<E> extends Sets.AbstractC2941e<InterfaceC2995k.a<E>> {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC2995k<E> mo15687a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15687a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2995k.a) {
                InterfaceC2995k.a aVar = (InterfaceC2995k.a) obj;
                if (aVar.getCount() > 0 && mo15687a().count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof InterfaceC2995k.a) {
                InterfaceC2995k.a aVar = (InterfaceC2995k.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo15687a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$e */
    public static final class C2923e<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2995k<E> f11111a;

        /* JADX INFO: renamed from: b */
        public final Iterator<InterfaceC2995k.a<E>> f11112b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2995k.a<E> f11113c;

        /* JADX INFO: renamed from: d */
        public int f11114d;

        /* JADX INFO: renamed from: e */
        public int f11115e;

        /* JADX INFO: renamed from: f */
        public boolean f11116f;

        public C2923e(InterfaceC2995k<E> interfaceC2995k, Iterator<InterfaceC2995k.a<E>> it) {
            this.f11111a = interfaceC2995k;
            this.f11112b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11114d > 0 || this.f11112b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            if (this.f11114d == 0) {
                InterfaceC2995k.a<E> next = this.f11112b.next();
                this.f11113c = next;
                int count = next.getCount();
                this.f11114d = count;
                this.f11115e = count;
            }
            this.f11114d--;
            this.f11116f = true;
            InterfaceC2995k.a<E> aVar = this.f11113c;
            Objects.requireNonNull(aVar);
            return aVar.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            se5.m185519e(this.f11116f);
            if (this.f11115e == 1) {
                this.f11112b.remove();
            } else {
                InterfaceC2995k<E> interfaceC2995k = this.f11111a;
                InterfaceC2995k.a<E> aVar = this.f11113c;
                Objects.requireNonNull(aVar);
                interfaceC2995k.remove(aVar.getElement());
            }
            this.f11115e--;
            this.f11116f = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <E> boolean m16144a(InterfaceC2995k<E> interfaceC2995k, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(interfaceC2995k);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static <E> boolean m16145b(InterfaceC2995k<E> interfaceC2995k, InterfaceC2995k<? extends E> interfaceC2995k2) {
        if (interfaceC2995k2 instanceof AbstractMapBasedMultiset) {
            return m16144a(interfaceC2995k, (AbstractMapBasedMultiset) interfaceC2995k2);
        }
        if (interfaceC2995k2.isEmpty()) {
            return false;
        }
        for (InterfaceC2995k.a<? extends E> aVar : interfaceC2995k2.entrySet()) {
            interfaceC2995k.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static <E> boolean m16146c(InterfaceC2995k<E> interfaceC2995k, Collection<? extends E> collection) {
        xn80.m212111p(interfaceC2995k);
        xn80.m212111p(collection);
        if (collection instanceof InterfaceC2995k) {
            return m16145b(interfaceC2995k, m16147d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.m15925a(interfaceC2995k, collection.iterator());
    }

    /* JADX INFO: renamed from: d */
    public static <T> InterfaceC2995k<T> m16147d(Iterable<T> iterable) {
        return (InterfaceC2995k) iterable;
    }

    /* JADX INFO: renamed from: e */
    public static <E> Iterator<E> m16148e(Iterator<InterfaceC2995k.a<E>> it) {
        return new C2919a(it);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16149f(InterfaceC2995k<?> interfaceC2995k, Object obj) {
        if (obj == interfaceC2995k) {
            return true;
        }
        if (obj instanceof InterfaceC2995k) {
            InterfaceC2995k interfaceC2995k2 = (InterfaceC2995k) obj;
            if (interfaceC2995k.size() == interfaceC2995k2.size() && interfaceC2995k.entrySet().size() == interfaceC2995k2.entrySet().size()) {
                for (InterfaceC2995k.a aVar : interfaceC2995k2.entrySet()) {
                    if (interfaceC2995k.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static <E> InterfaceC2995k.a<E> m16150g(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    /* JADX INFO: renamed from: h */
    public static int m16151h(Iterable<?> iterable) {
        if (iterable instanceof InterfaceC2995k) {
            return ((InterfaceC2995k) iterable).elementSet().size();
        }
        return 11;
    }

    /* JADX INFO: renamed from: i */
    public static <E> Iterator<E> m16152i(InterfaceC2995k<E> interfaceC2995k) {
        return new C2923e(interfaceC2995k, interfaceC2995k.entrySet().iterator());
    }

    /* JADX INFO: renamed from: j */
    public static int m16153j(InterfaceC2995k<?> interfaceC2995k) {
        Iterator<InterfaceC2995k.a<?>> it = interfaceC2995k.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return Ints.m16523m(count);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16154k(InterfaceC2995k<?> interfaceC2995k, Collection<?> collection) {
        if (collection instanceof InterfaceC2995k) {
            collection = ((InterfaceC2995k) collection).elementSet();
        }
        return interfaceC2995k.elementSet().removeAll(collection);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16155l(InterfaceC2995k<?> interfaceC2995k, Collection<?> collection) {
        xn80.m212111p(collection);
        if (collection instanceof InterfaceC2995k) {
            collection = ((InterfaceC2995k) collection).elementSet();
        }
        return interfaceC2995k.elementSet().retainAll(collection);
    }

    /* JADX INFO: renamed from: m */
    public static <E> int m16156m(InterfaceC2995k<E> interfaceC2995k, E e, int i) {
        se5.m185516b(i, "count");
        int iCount = interfaceC2995k.count(e);
        int i2 = i - iCount;
        if (i2 > 0) {
            interfaceC2995k.add(e, i2);
            return iCount;
        }
        if (i2 < 0) {
            interfaceC2995k.remove(e, -i2);
        }
        return iCount;
    }

    /* JADX INFO: renamed from: n */
    public static <E> boolean m16157n(InterfaceC2995k<E> interfaceC2995k, E e, int i, int i2) {
        se5.m185516b(i, "oldCount");
        se5.m185516b(i2, "newCount");
        if (interfaceC2995k.count(e) != i) {
            return false;
        }
        interfaceC2995k.setCount(e, i2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static <E> InterfaceC2995k<E> m16158o(InterfaceC2995k<? extends E> interfaceC2995k) {
        return ((interfaceC2995k instanceof UnmodifiableMultiset) || (interfaceC2995k instanceof ImmutableMultiset)) ? interfaceC2995k : new UnmodifiableMultiset((InterfaceC2995k) xn80.m212111p(interfaceC2995k));
    }

    /* JADX INFO: renamed from: p */
    public static <E> InterfaceC3000p<E> m16159p(InterfaceC3000p<E> interfaceC3000p) {
        return new UnmodifiableSortedMultiset((InterfaceC3000p) xn80.m212111p(interfaceC3000p));
    }

    public static class UnmodifiableMultiset<E> extends AbstractC2993i<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final InterfaceC2995k<? extends E> delegate;
        transient Set<E> elementSet;
        transient Set<InterfaceC2995k.a<E>> entrySet;

        public UnmodifiableMultiset(InterfaceC2995k<? extends E> interfaceC2995k) {
            this.delegate = interfaceC2995k;
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.l2j, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public Set<InterfaceC2995k.a<E>> entrySet() {
            Set<InterfaceC2995k.a<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<InterfaceC2995k.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.m15924C(this.delegate.iterator());
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2993i, p153l.l2j, p153l.v2j
        public InterfaceC2995k<E> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }
}
