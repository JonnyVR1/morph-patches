package p149l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p133rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class grf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f104053i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f104054j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f104055a;

    /* JADX INFO: renamed from: b */
    public int f104056b;

    /* JADX INFO: renamed from: c */
    public long f104057c;

    /* JADX INFO: renamed from: d */
    public int f104058d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f104059e;

    /* JADX INFO: renamed from: f */
    public int f104060f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f104061g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f104062h;

    public grf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f104059e = atomicReferenceArray;
        this.f104058d = i2;
        m127698a(iRoundToPowerOfTwo);
        this.f104061g = atomicReferenceArray;
        this.f104060f = i2;
        this.f104057c = iRoundToPowerOfTwo - 2;
        this.f104055a = new AtomicLong();
        this.f104062h = new AtomicLong();
    }

    /* JADX INFO: renamed from: f */
    public static int m127694f(long j, int i) {
        return m127693c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m127695j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: x */
    public static void m127696x(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m127697A(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m127696x(atomicReferenceArray, i, t);
        m127710z(j + 1);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m127698a(int i) {
        this.f104056b = Math.min(i / 4, f104053i);
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
    public final long m127699g() {
        return this.f104062h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m127700h() {
        return this.f104055a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m127701i() {
        return this.f104062h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m127703o() == m127701i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m127702l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m127695j(atomicReferenceArray, m127693c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m127703o() {
        return this.f104055a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f104059e;
        long jM127700h = m127700h();
        int i = this.f104058d;
        int iM127694f = m127694f(jM127700h, i);
        if (jM127700h < this.f104057c) {
            return m127697A(atomicReferenceArray, t, jM127700h, iM127694f);
        }
        long j = ((long) this.f104056b) + jM127700h;
        if (m127695j(atomicReferenceArray, m127694f(j, i)) == null) {
            this.f104057c = j - 1;
            return m127697A(atomicReferenceArray, t, jM127700h, iM127694f);
        }
        if (m127695j(atomicReferenceArray, m127694f(jM127700h + 1, i)) == null) {
            return m127697A(atomicReferenceArray, t, jM127700h, iM127694f);
        }
        m127707v(atomicReferenceArray, jM127700h, iM127694f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m127704p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f104061g = atomicReferenceArray;
        return (T) m127695j(atomicReferenceArray, m127694f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f104061g;
        long jM127699g = m127699g();
        int i = this.f104060f;
        T t = (T) m127695j(atomicReferenceArray, m127694f(jM127699g, i));
        return t == f104054j ? m127704p(m127702l(atomicReferenceArray), jM127699g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f104061g;
        long jM127699g = m127699g();
        int i = this.f104060f;
        int iM127694f = m127694f(jM127699g, i);
        T t = (T) m127695j(atomicReferenceArray, iM127694f);
        boolean z = t == f104054j;
        if (t == null || z) {
            if (z) {
                return m127705r(m127702l(atomicReferenceArray), jM127699g, i);
            }
            return null;
        }
        m127696x(atomicReferenceArray, iM127694f, null);
        m127708w(jM127699g + 1);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m127705r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f104061g = atomicReferenceArray;
        int iM127694f = m127694f(j, i);
        T t = (T) m127695j(atomicReferenceArray, iM127694f);
        if (t == null) {
            return null;
        }
        m127696x(atomicReferenceArray, iM127694f, null);
        m127708w(j + 1);
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
    public boolean m127706s(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f104059e;
        long jM127703o = m127703o();
        int i = this.f104058d;
        long j = 2 + jM127703o;
        if (m127695j(atomicReferenceArray, m127694f(j, i)) == null) {
            int iM127694f = m127694f(jM127703o, i);
            m127696x(atomicReferenceArray, iM127694f + 1, t2);
            m127696x(atomicReferenceArray, iM127694f, t);
            m127710z(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f104059e = atomicReferenceArray2;
        int iM127694f2 = m127694f(jM127703o, i);
        m127696x(atomicReferenceArray2, iM127694f2 + 1, t2);
        m127696x(atomicReferenceArray2, iM127694f2, t);
        m127709y(atomicReferenceArray, atomicReferenceArray2);
        m127696x(atomicReferenceArray, iM127694f2, f104054j);
        m127710z(j);
        return true;
    }

    @Override // java.util.Collection
    public int size() {
        long jM127701i = m127701i();
        while (true) {
            long jM127703o = m127703o();
            long jM127701i2 = m127701i();
            if (jM127701i == jM127701i2) {
                return (int) (jM127703o - jM127701i2);
            }
            jM127701i = jM127701i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m127707v(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f104059e = atomicReferenceArray2;
        this.f104057c = (j2 + j) - 1;
        m127696x(atomicReferenceArray2, i, t);
        m127709y(atomicReferenceArray, atomicReferenceArray2);
        m127696x(atomicReferenceArray, i, f104054j);
        m127710z(j + 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m127708w(long j) {
        this.f104062h.lazySet(j);
    }

    /* JADX INFO: renamed from: y */
    public final void m127709y(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m127696x(atomicReferenceArray, m127693c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: z */
    public final void m127710z(long j) {
        this.f104055a.lazySet(j);
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
    public static int m127693c(int i) {
        return i;
    }
}
