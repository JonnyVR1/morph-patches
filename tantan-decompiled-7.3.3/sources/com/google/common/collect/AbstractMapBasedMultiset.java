package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import p153l.mor;
import p153l.nof0;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractC2986b<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient C2996l<E> backingMap;
    transient long size;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    public class C2757a extends AbstractMapBasedMultiset<E>.AbstractC2759c<E> {
        public C2757a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC2759c
        /* JADX INFO: renamed from: b */
        public E mo15658b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m16333i(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    public class C2758b extends AbstractMapBasedMultiset<E>.AbstractC2759c<InterfaceC2995k.a<E>> {
        public C2758b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC2759c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2995k.a<E> mo15658b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m16332g(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    public abstract class AbstractC2759c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10846a;

        /* JADX INFO: renamed from: b */
        public int f10847b = -1;

        /* JADX INFO: renamed from: c */
        public int f10848c;

        public AbstractC2759c() {
            this.f10846a = AbstractMapBasedMultiset.this.backingMap.mo16330e();
            this.f10848c = AbstractMapBasedMultiset.this.backingMap.f11246d;
        }

        /* JADX INFO: renamed from: a */
        public final void m15660a() {
            if (AbstractMapBasedMultiset.this.backingMap.f11246d == this.f10848c) {
                return;
            }
            nof0.m164126a();
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo15658b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15660a();
            return this.f10846a >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            T tMo15658b = mo15658b(this.f10846a);
            int i = this.f10846a;
            this.f10847b = i;
            this.f10846a = AbstractMapBasedMultiset.this.backingMap.mo16340s(i);
            return tMo15658b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15660a();
            se5.m185519e(this.f10847b != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.m16345x(this.f10847b);
            this.f10846a = AbstractMapBasedMultiset.this.backingMap.mo16341t(this.f10846a, this.f10847b);
            this.f10847b = -1;
            this.f10848c = AbstractMapBasedMultiset.this.backingMap.f11246d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iM16365h = C2999o.m16365h(objectInputStream);
        this.backingMap = newBackingMap(3);
        C2999o.m16364g(this, objectInputStream, iM16365h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2999o.m16368k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        xn80.m212101f(i > 0, "occurrences cannot be negative: %s", i);
        int iM16336m = this.backingMap.m16336m(e);
        C2996l<E> c2996l = this.backingMap;
        if (iM16336m == -1) {
            c2996l.m16342u(e, i);
            this.size += (long) i;
            return 0;
        }
        int iM16334k = c2996l.m16334k(iM16336m);
        long j = i;
        long j2 = ((long) iM16334k) + j;
        xn80.m212103h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.m16326B(iM16336m, (int) j2);
        this.size += j;
        return iM16334k;
    }

    public void addTo(InterfaceC2995k<? super E> interfaceC2995k) {
        xn80.m212111p(interfaceC2995k);
        int iMo16330e = this.backingMap.mo16330e();
        while (iMo16330e >= 0) {
            interfaceC2995k.add(this.backingMap.m16333i(iMo16330e), this.backingMap.m16334k(iMo16330e));
            iMo16330e = this.backingMap.mo16340s(iMo16330e);
        }
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.mo16328a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.InterfaceC2995k
    public final int count(Object obj) {
        return this.backingMap.m16331f(obj);
    }

    @Override // com.google.common.collect.AbstractC2986b
    public final int distinctElements() {
        return this.backingMap.m16327C();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public final Iterator<E> elementIterator() {
        return new C2757a();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public final Iterator<InterfaceC2995k.a<E>> entryIterator() {
        return new C2758b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2995k
    public final Iterator<E> iterator() {
        return Multisets.m16152i(this);
    }

    public abstract C2996l<E> newBackingMap(int i);

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        xn80.m212101f(i > 0, "occurrences cannot be negative: %s", i);
        int iM16336m = this.backingMap.m16336m(obj);
        if (iM16336m == -1) {
            return 0;
        }
        int iM16334k = this.backingMap.m16334k(iM16336m);
        C2996l<E> c2996l = this.backingMap;
        if (iM16334k > i) {
            c2996l.m16326B(iM16336m, iM16334k - i);
        } else {
            c2996l.m16345x(iM16336m);
            i = iM16334k;
        }
        this.size -= (long) i;
        return iM16334k;
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public final boolean setCount(E e, int i, int i2) {
        se5.m185516b(i, "oldCount");
        se5.m185516b(i2, "newCount");
        int iM16336m = this.backingMap.m16336m(e);
        if (iM16336m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.m16342u(e, i2);
                this.size += (long) i2;
            }
            return true;
        }
        if (this.backingMap.m16334k(iM16336m) != i) {
            return false;
        }
        C2996l<E> c2996l = this.backingMap;
        if (i2 == 0) {
            c2996l.m16345x(iM16336m);
            this.size -= (long) i;
        } else {
            c2996l.m16326B(iM16336m, i2);
            this.size += (long) (i2 - i);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public final int size() {
        return Ints.m16523m(this.size);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public final int setCount(E e, int i) {
        se5.m185516b(i, "count");
        C2996l<E> c2996l = this.backingMap;
        int iM16343v = i == 0 ? c2996l.m16343v(e) : c2996l.m16342u(e, i);
        this.size += (long) (i - iM16343v);
        return iM16343v;
    }
}
