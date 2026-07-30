package p149l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p133rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class irf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f114626i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f114627j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f114628a;

    /* JADX INFO: renamed from: b */
    public int f114629b;

    /* JADX INFO: renamed from: c */
    public long f114630c;

    /* JADX INFO: renamed from: d */
    public int f114631d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f114632e;

    /* JADX INFO: renamed from: f */
    public int f114633f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f114634g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f114635h;

    public irf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = iRoundToPowerOfTwo - 1;
        this.f114628a = new AtomicLong();
        this.f114635h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f114632e = atomicReferenceArray;
        this.f114631d = i2;
        m137878a(iRoundToPowerOfTwo);
        this.f114634g = atomicReferenceArray;
        this.f114633f = i2;
        this.f114630c = iRoundToPowerOfTwo - 2;
        m137889y(0L);
    }

    /* JADX INFO: renamed from: f */
    public static int m137875f(long j, int i) {
        return m137874c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m137876j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m137877w(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m137878a(int i) {
        this.f114629b = Math.min(i / 4, f114626i);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public final long m137879g() {
        return this.f114635h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m137880h() {
        return this.f114628a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m137881i() {
        return this.f114635h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m137883o() == m137881i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m137882l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m137876j(atomicReferenceArray, m137874c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m137883o() {
        return this.f114628a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f114632e;
        long jM137880h = m137880h();
        int i = this.f114631d;
        int iM137875f = m137875f(jM137880h, i);
        if (jM137880h < this.f114630c) {
            return m137890z(atomicReferenceArray, t, jM137880h, iM137875f);
        }
        long j = ((long) this.f114629b) + jM137880h;
        if (m137876j(atomicReferenceArray, m137875f(j, i)) == null) {
            this.f114630c = j - 1;
            return m137890z(atomicReferenceArray, t, jM137880h, iM137875f);
        }
        if (m137876j(atomicReferenceArray, m137875f(jM137880h + 1, i)) != null) {
            return m137890z(atomicReferenceArray, t, jM137880h, iM137875f);
        }
        m137886s(atomicReferenceArray, jM137880h, iM137875f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m137884p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f114634g = atomicReferenceArray;
        return (T) m137876j(atomicReferenceArray, m137875f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f114634g;
        long jM137879g = m137879g();
        int i = this.f114633f;
        T t = (T) m137876j(atomicReferenceArray, m137875f(jM137879g, i));
        return t == f114627j ? m137884p(m137882l(atomicReferenceArray), jM137879g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f114634g;
        long jM137879g = m137879g();
        int i = this.f114633f;
        int iM137875f = m137875f(jM137879g, i);
        T t = (T) m137876j(atomicReferenceArray, iM137875f);
        boolean z = t == f114627j;
        if (t == null || z) {
            if (z) {
                return m137885r(m137882l(atomicReferenceArray), jM137879g, i);
            }
            return null;
        }
        m137887v(jM137879g + 1);
        m137877w(atomicReferenceArray, iM137875f, null);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m137885r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f114634g = atomicReferenceArray;
        int iM137875f = m137875f(j, i);
        T t = (T) m137876j(atomicReferenceArray, iM137875f);
        if (t == null) {
            return null;
        }
        m137887v(j + 1);
        m137877w(atomicReferenceArray, iM137875f, null);
        return t;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: s */
    public final void m137886s(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f114632e = atomicReferenceArray2;
        this.f114630c = (j2 + j) - 1;
        m137889y(j + 1);
        m137877w(atomicReferenceArray2, i, t);
        m137888x(atomicReferenceArray, atomicReferenceArray2);
        m137877w(atomicReferenceArray, i, f114627j);
    }

    @Override // java.util.Collection
    public int size() {
        long jM137881i = m137881i();
        while (true) {
            long jM137883o = m137883o();
            long jM137881i2 = m137881i();
            if (jM137881i == jM137881i2) {
                return (int) (jM137883o - jM137881i2);
            }
            jM137881i = jM137881i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m137887v(long j) {
        this.f114635h.lazySet(j);
    }

    /* JADX INFO: renamed from: x */
    public final void m137888x(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m137877w(atomicReferenceArray, m137874c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: y */
    public final void m137889y(long j) {
        this.f114628a.lazySet(j);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m137890z(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m137889y(j + 1);
        m137877w(atomicReferenceArray, i, t);
        return true;
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public static int m137874c(int i) {
        return i;
    }
}
