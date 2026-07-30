package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p153l.akq;
import p153l.se5;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.collect.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C2991g {
    /* JADX INFO: renamed from: a */
    public static boolean m16312a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m16313b(int i) {
        se5.m185516b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16314c(Collection<?> collection, Object obj) {
        xn80.m212111p(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16315d(Collection<?> collection, Object obj) {
        xn80.m212111p(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m16316e(Collection<?> collection) {
        StringBuilder sbM16313b = m16313b(collection.size());
        sbM16313b.append('[');
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbM16313b.append(", ");
            }
            if (obj == collection) {
                sbM16313b.append("(this Collection)");
            } else {
                sbM16313b.append(obj);
            }
            z = false;
        }
        sbM16313b.append(']');
        return sbM16313b.toString();
    }

    /* JADX INFO: renamed from: com.google.common.collect.g$a */
    public static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a */
        public final Collection<E> f11237a;

        /* JADX INFO: renamed from: b */
        public final tp80<? super E> f11238b;

        public a(Collection<E> collection, tp80<? super E> tp80Var) {
            this.f11237a = collection;
            this.f11238b = tp80Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            xn80.m212099d(this.f11238b.apply(e));
            return this.f11237a.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                xn80.m212099d(this.f11238b.apply(it.next()));
            }
            return this.f11237a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            akq.m98604l(this.f11237a, this.f11238b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C2991g.m16314c(this.f11237a, obj)) {
                return this.f11238b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C2991g.m16312a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !akq.m98594b(this.f11237a, this.f11238b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.m15936l(this.f11237a.iterator(), this.f11238b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f11237a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f11237a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f11238b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f11237a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f11238b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f11237a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f11238b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.m15979l(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.m15979l(iterator()).toArray(tArr);
        }
    }
}
