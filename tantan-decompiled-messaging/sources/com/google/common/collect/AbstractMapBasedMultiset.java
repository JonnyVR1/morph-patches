package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import p149l.ggf0;
import p149l.lmr;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractC2963b<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient C2973l<E> backingMap;
    transient long size;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    public class C2734a extends AbstractMapBasedMultiset<E>.AbstractC2736c<E> {
        public C2734a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC2736c
        /* JADX INFO: renamed from: b */
        public E mo15604b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m16279i(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    public class C2735b extends AbstractMapBasedMultiset<E>.AbstractC2736c<InterfaceC2972k.a<E>> {
        public C2735b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC2736c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> mo15604b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m16278g(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    public abstract class AbstractC2736c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10809a;

        /* JADX INFO: renamed from: b */
        public int f10810b = -1;

        /* JADX INFO: renamed from: c */
        public int f10811c;

        public AbstractC2736c() {
            this.f10809a = AbstractMapBasedMultiset.this.backingMap.mo16276e();
            this.f10811c = AbstractMapBasedMultiset.this.backingMap.f11209d;
        }

        /* JADX INFO: renamed from: a */
        public final void m15606a() {
            if (AbstractMapBasedMultiset.this.backingMap.f11209d == this.f10811c) {
                return;
            }
            ggf0.m125962a();
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo15604b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15606a();
            return this.f10809a >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            T tMo15604b = mo15604b(this.f10809a);
            int i = this.f10809a;
            this.f10810b = i;
            this.f10809a = AbstractMapBasedMultiset.this.backingMap.mo16286s(i);
            return tMo15604b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15606a();
            sd5.m183447e(this.f10810b != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.m16291x(this.f10810b);
            this.f10809a = AbstractMapBasedMultiset.this.backingMap.mo16287t(this.f10809a, this.f10810b);
            this.f10810b = -1;
            this.f10811c = AbstractMapBasedMultiset.this.backingMap.f11209d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iM16311h = C2976o.m16311h(objectInputStream);
        this.backingMap = newBackingMap(3);
        C2976o.m16310g(this, objectInputStream, iM16311h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2976o.m16314k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        sf80.m183884f(i > 0, "occurrences cannot be negative: %s", i);
        int iM16282m = this.backingMap.m16282m(e);
        C2973l<E> c2973l = this.backingMap;
        if (iM16282m == -1) {
            c2973l.m16288u(e, i);
            this.size += (long) i;
            return 0;
        }
        int iM16280k = c2973l.m16280k(iM16282m);
        long j = i;
        long j2 = ((long) iM16280k) + j;
        sf80.m183886h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.m16272B(iM16282m, (int) j2);
        this.size += j;
        return iM16280k;
    }

    public void addTo(InterfaceC2972k<? super E> interfaceC2972k) {
        sf80.m183894p(interfaceC2972k);
        int iMo16276e = this.backingMap.mo16276e();
        while (iMo16276e >= 0) {
            interfaceC2972k.add(this.backingMap.m16279i(iMo16276e), this.backingMap.m16280k(iMo16276e));
            iMo16276e = this.backingMap.mo16286s(iMo16276e);
        }
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.mo16274a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.InterfaceC2972k
    public final int count(Object obj) {
        return this.backingMap.m16277f(obj);
    }

    @Override // com.google.common.collect.AbstractC2963b
    public final int distinctElements() {
        return this.backingMap.m16273C();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public final Iterator<E> elementIterator() {
        return new C2734a();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public final Iterator<InterfaceC2972k.a<E>> entryIterator() {
        return new C2735b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2972k
    public final Iterator<E> iterator() {
        return Multisets.m16098i(this);
    }

    public abstract C2973l<E> newBackingMap(int i);

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        sf80.m183884f(i > 0, "occurrences cannot be negative: %s", i);
        int iM16282m = this.backingMap.m16282m(obj);
        if (iM16282m == -1) {
            return 0;
        }
        int iM16280k = this.backingMap.m16280k(iM16282m);
        C2973l<E> c2973l = this.backingMap;
        if (iM16280k > i) {
            c2973l.m16272B(iM16282m, iM16280k - i);
        } else {
            c2973l.m16291x(iM16282m);
            i = iM16280k;
        }
        this.size -= (long) i;
        return iM16280k;
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public final boolean setCount(E e, int i, int i2) {
        sd5.m183444b(i, "oldCount");
        sd5.m183444b(i2, "newCount");
        int iM16282m = this.backingMap.m16282m(e);
        if (iM16282m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.m16288u(e, i2);
                this.size += (long) i2;
            }
            return true;
        }
        if (this.backingMap.m16280k(iM16282m) != i) {
            return false;
        }
        C2973l<E> c2973l = this.backingMap;
        if (i2 == 0) {
            c2973l.m16291x(iM16282m);
            this.size -= (long) i;
        } else {
            c2973l.m16272B(iM16282m, i2);
            this.size += (long) (i2 - i);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public final int size() {
        return Ints.m16468m(this.size);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public final int setCount(E e, int i) {
        sd5.m183444b(i, "count");
        C2973l<E> c2973l = this.backingMap;
        int iM16289v = i == 0 ? c2973l.m16289v(e) : c2973l.m16288u(e, i);
        this.size += (long) (i - iM16289v);
        return iM16289v;
    }
}
