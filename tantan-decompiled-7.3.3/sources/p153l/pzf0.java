package p153l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p137rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class pzf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f154833i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f154834j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f154835a;

    /* JADX INFO: renamed from: b */
    public int f154836b;

    /* JADX INFO: renamed from: c */
    public long f154837c;

    /* JADX INFO: renamed from: d */
    public int f154838d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f154839e;

    /* JADX INFO: renamed from: f */
    public int f154840f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f154841g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f154842h;

    public pzf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f154839e = atomicReferenceArray;
        this.f154838d = i2;
        m174420a(iRoundToPowerOfTwo);
        this.f154841g = atomicReferenceArray;
        this.f154840f = i2;
        this.f154837c = iRoundToPowerOfTwo - 2;
        this.f154835a = new AtomicLong();
        this.f154842h = new AtomicLong();
    }

    /* JADX INFO: renamed from: f */
    public static int m174416f(long j, int i) {
        return m174415c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m174417j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: x */
    public static void m174418x(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m174419A(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m174418x(atomicReferenceArray, i, t);
        m174432z(j + 1);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m174420a(int i) {
        this.f154836b = Math.min(i / 4, f154833i);
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
    public final long m174421g() {
        return this.f154842h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m174422h() {
        return this.f154835a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m174423i() {
        return this.f154842h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m174425o() == m174423i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m174424l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m174417j(atomicReferenceArray, m174415c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m174425o() {
        return this.f154835a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f154839e;
        long jM174422h = m174422h();
        int i = this.f154838d;
        int iM174416f = m174416f(jM174422h, i);
        if (jM174422h < this.f154837c) {
            return m174419A(atomicReferenceArray, t, jM174422h, iM174416f);
        }
        long j = ((long) this.f154836b) + jM174422h;
        if (m174417j(atomicReferenceArray, m174416f(j, i)) == null) {
            this.f154837c = j - 1;
            return m174419A(atomicReferenceArray, t, jM174422h, iM174416f);
        }
        if (m174417j(atomicReferenceArray, m174416f(jM174422h + 1, i)) == null) {
            return m174419A(atomicReferenceArray, t, jM174422h, iM174416f);
        }
        m174429v(atomicReferenceArray, jM174422h, iM174416f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m174426p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f154841g = atomicReferenceArray;
        return (T) m174417j(atomicReferenceArray, m174416f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f154841g;
        long jM174421g = m174421g();
        int i = this.f154840f;
        T t = (T) m174417j(atomicReferenceArray, m174416f(jM174421g, i));
        return t == f154834j ? m174426p(m174424l(atomicReferenceArray), jM174421g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f154841g;
        long jM174421g = m174421g();
        int i = this.f154840f;
        int iM174416f = m174416f(jM174421g, i);
        T t = (T) m174417j(atomicReferenceArray, iM174416f);
        boolean z = t == f154834j;
        if (t == null || z) {
            if (z) {
                return m174427r(m174424l(atomicReferenceArray), jM174421g, i);
            }
            return null;
        }
        m174418x(atomicReferenceArray, iM174416f, null);
        m174430w(jM174421g + 1);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m174427r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f154841g = atomicReferenceArray;
        int iM174416f = m174416f(j, i);
        T t = (T) m174417j(atomicReferenceArray, iM174416f);
        if (t == null) {
            return null;
        }
        m174418x(atomicReferenceArray, iM174416f, null);
        m174430w(j + 1);
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
    public boolean m174428s(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f154839e;
        long jM174425o = m174425o();
        int i = this.f154838d;
        long j = 2 + jM174425o;
        if (m174417j(atomicReferenceArray, m174416f(j, i)) == null) {
            int iM174416f = m174416f(jM174425o, i);
            m174418x(atomicReferenceArray, iM174416f + 1, t2);
            m174418x(atomicReferenceArray, iM174416f, t);
            m174432z(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f154839e = atomicReferenceArray2;
        int iM174416f2 = m174416f(jM174425o, i);
        m174418x(atomicReferenceArray2, iM174416f2 + 1, t2);
        m174418x(atomicReferenceArray2, iM174416f2, t);
        m174431y(atomicReferenceArray, atomicReferenceArray2);
        m174418x(atomicReferenceArray, iM174416f2, f154834j);
        m174432z(j);
        return true;
    }

    @Override // java.util.Collection
    public int size() {
        long jM174423i = m174423i();
        while (true) {
            long jM174425o = m174425o();
            long jM174423i2 = m174423i();
            if (jM174423i == jM174423i2) {
                return (int) (jM174425o - jM174423i2);
            }
            jM174423i = jM174423i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m174429v(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f154839e = atomicReferenceArray2;
        this.f154837c = (j2 + j) - 1;
        m174418x(atomicReferenceArray2, i, t);
        m174431y(atomicReferenceArray, atomicReferenceArray2);
        m174418x(atomicReferenceArray, i, f154834j);
        m174432z(j + 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m174430w(long j) {
        this.f154842h.lazySet(j);
    }

    /* JADX INFO: renamed from: y */
    public final void m174431y(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m174418x(atomicReferenceArray, m174415c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: z */
    public final void m174432z(long j) {
        this.f154835a.lazySet(j);
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
    public static int m174415c(int i) {
        return i;
    }
}
