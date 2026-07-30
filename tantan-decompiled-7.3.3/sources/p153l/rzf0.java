package p153l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p137rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class rzf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f165517i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f165518j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f165519a;

    /* JADX INFO: renamed from: b */
    public int f165520b;

    /* JADX INFO: renamed from: c */
    public long f165521c;

    /* JADX INFO: renamed from: d */
    public int f165522d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f165523e;

    /* JADX INFO: renamed from: f */
    public int f165524f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f165525g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f165526h;

    public rzf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = iRoundToPowerOfTwo - 1;
        this.f165519a = new AtomicLong();
        this.f165526h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f165523e = atomicReferenceArray;
        this.f165522d = i2;
        m183733a(iRoundToPowerOfTwo);
        this.f165525g = atomicReferenceArray;
        this.f165524f = i2;
        this.f165521c = iRoundToPowerOfTwo - 2;
        m183744y(0L);
    }

    /* JADX INFO: renamed from: f */
    public static int m183730f(long j, int i) {
        return m183729c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m183731j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m183732w(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m183733a(int i) {
        this.f165520b = Math.min(i / 4, f165517i);
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
    public final long m183734g() {
        return this.f165526h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m183735h() {
        return this.f165519a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m183736i() {
        return this.f165526h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m183738o() == m183736i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m183737l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m183731j(atomicReferenceArray, m183729c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m183738o() {
        return this.f165519a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f165523e;
        long jM183735h = m183735h();
        int i = this.f165522d;
        int iM183730f = m183730f(jM183735h, i);
        if (jM183735h < this.f165521c) {
            return m183745z(atomicReferenceArray, t, jM183735h, iM183730f);
        }
        long j = ((long) this.f165520b) + jM183735h;
        if (m183731j(atomicReferenceArray, m183730f(j, i)) == null) {
            this.f165521c = j - 1;
            return m183745z(atomicReferenceArray, t, jM183735h, iM183730f);
        }
        if (m183731j(atomicReferenceArray, m183730f(jM183735h + 1, i)) != null) {
            return m183745z(atomicReferenceArray, t, jM183735h, iM183730f);
        }
        m183741s(atomicReferenceArray, jM183735h, iM183730f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m183739p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f165525g = atomicReferenceArray;
        return (T) m183731j(atomicReferenceArray, m183730f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f165525g;
        long jM183734g = m183734g();
        int i = this.f165524f;
        T t = (T) m183731j(atomicReferenceArray, m183730f(jM183734g, i));
        return t == f165518j ? m183739p(m183737l(atomicReferenceArray), jM183734g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f165525g;
        long jM183734g = m183734g();
        int i = this.f165524f;
        int iM183730f = m183730f(jM183734g, i);
        T t = (T) m183731j(atomicReferenceArray, iM183730f);
        boolean z = t == f165518j;
        if (t == null || z) {
            if (z) {
                return m183740r(m183737l(atomicReferenceArray), jM183734g, i);
            }
            return null;
        }
        m183742v(jM183734g + 1);
        m183732w(atomicReferenceArray, iM183730f, null);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m183740r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f165525g = atomicReferenceArray;
        int iM183730f = m183730f(j, i);
        T t = (T) m183731j(atomicReferenceArray, iM183730f);
        if (t == null) {
            return null;
        }
        m183742v(j + 1);
        m183732w(atomicReferenceArray, iM183730f, null);
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
    public final void m183741s(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f165523e = atomicReferenceArray2;
        this.f165521c = (j2 + j) - 1;
        m183744y(j + 1);
        m183732w(atomicReferenceArray2, i, t);
        m183743x(atomicReferenceArray, atomicReferenceArray2);
        m183732w(atomicReferenceArray, i, f165518j);
    }

    @Override // java.util.Collection
    public int size() {
        long jM183736i = m183736i();
        while (true) {
            long jM183738o = m183738o();
            long jM183736i2 = m183736i();
            if (jM183736i == jM183736i2) {
                return (int) (jM183738o - jM183736i2);
            }
            jM183736i = jM183736i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m183742v(long j) {
        this.f165526h.lazySet(j);
    }

    /* JADX INFO: renamed from: x */
    public final void m183743x(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m183732w(atomicReferenceArray, m183729c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: y */
    public final void m183744y(long j) {
        this.f165519a.lazySet(j);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m183745z(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m183744y(j + 1);
        m183732w(atomicReferenceArray, i, t);
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
    public static int m183729c(int i) {
        return i;
    }
}
