package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p149l.aiq;
import p149l.oh80;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.collect.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C2968g {
    /* JADX INFO: renamed from: a */
    public static boolean m16258a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m16259b(int i) {
        sd5.m183444b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16260c(Collection<?> collection, Object obj) {
        sf80.m183894p(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16261d(Collection<?> collection, Object obj) {
        sf80.m183894p(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m16262e(Collection<?> collection) {
        StringBuilder sbM16259b = m16259b(collection.size());
        sbM16259b.append('[');
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbM16259b.append(", ");
            }
            if (obj == collection) {
                sbM16259b.append("(this Collection)");
            } else {
                sbM16259b.append(obj);
            }
            z = false;
        }
        sbM16259b.append(']');
        return sbM16259b.toString();
    }

    /* JADX INFO: renamed from: com.google.common.collect.g$a */
    public static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a */
        public final Collection<E> f11200a;

        /* JADX INFO: renamed from: b */
        public final oh80<? super E> f11201b;

        public a(Collection<E> collection, oh80<? super E> oh80Var) {
            this.f11200a = collection;
            this.f11201b = oh80Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            sf80.m183882d(this.f11201b.apply(e));
            return this.f11200a.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                sf80.m183882d(this.f11201b.apply(it.next()));
            }
            return this.f11200a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            aiq.m96886l(this.f11200a, this.f11201b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C2968g.m16260c(this.f11200a, obj)) {
                return this.f11201b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C2968g.m16258a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !aiq.m96876b(this.f11200a, this.f11201b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.m15882l(this.f11200a.iterator(), this.f11201b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f11200a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f11200a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f11201b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f11200a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f11201b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f11200a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f11201b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.m15925l(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.m15925l(iterator()).toArray(tArr);
        }
    }
}
