package p003l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p014rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class irf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f4473i = Integer.getInteger("jctools.spsc.max.lookahead.step", PKIFailureInfo.certConfirmed).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f4474j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f4475a;

    /* JADX INFO: renamed from: b */
    public int f4476b;

    /* JADX INFO: renamed from: c */
    public long f4477c;

    /* JADX INFO: renamed from: d */
    public int f4478d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f4479e;

    /* JADX INFO: renamed from: f */
    public int f4480f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f4481g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f4482h;

    public irf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = iRoundToPowerOfTwo - 1;
        this.f4475a = new AtomicLong();
        this.f4482h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f4479e = atomicReferenceArray;
        this.f4478d = i2;
        m5232a(iRoundToPowerOfTwo);
        this.f4481g = atomicReferenceArray;
        this.f4480f = i2;
        this.f4477c = iRoundToPowerOfTwo - 2;
        m5243y(0L);
    }

    /* JADX INFO: renamed from: f */
    public static int m5229f(long j, int i) {
        return m5228c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m5230j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m5231w(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m5232a(int i) {
        this.f4476b = Math.min(i / 4, f4473i);
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
    public final long m5233g() {
        return this.f4482h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m5234h() {
        return this.f4475a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m5235i() {
        return this.f4482h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m5237o() == m5235i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m5236l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m5230j(atomicReferenceArray, m5228c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m5237o() {
        return this.f4475a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4479e;
        long jM5234h = m5234h();
        int i = this.f4478d;
        int iM5229f = m5229f(jM5234h, i);
        if (jM5234h < this.f4477c) {
            return m5244z(atomicReferenceArray, t, jM5234h, iM5229f);
        }
        long j = ((long) this.f4476b) + jM5234h;
        if (m5230j(atomicReferenceArray, m5229f(j, i)) == null) {
            this.f4477c = j - 1;
            return m5244z(atomicReferenceArray, t, jM5234h, iM5229f);
        }
        if (m5230j(atomicReferenceArray, m5229f(jM5234h + 1, i)) != null) {
            return m5244z(atomicReferenceArray, t, jM5234h, iM5229f);
        }
        m5240s(atomicReferenceArray, jM5234h, iM5229f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m5238p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f4481g = atomicReferenceArray;
        return (T) m5230j(atomicReferenceArray, m5229f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4481g;
        long jM5233g = m5233g();
        int i = this.f4480f;
        T t = (T) m5230j(atomicReferenceArray, m5229f(jM5233g, i));
        return t == f4474j ? m5238p(m5236l(atomicReferenceArray), jM5233g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4481g;
        long jM5233g = m5233g();
        int i = this.f4480f;
        int iM5229f = m5229f(jM5233g, i);
        T t = (T) m5230j(atomicReferenceArray, iM5229f);
        boolean z = t == f4474j;
        if (t == null || z) {
            if (z) {
                return m5239r(m5236l(atomicReferenceArray), jM5233g, i);
            }
            return null;
        }
        m5241v(jM5233g + 1);
        m5231w(atomicReferenceArray, iM5229f, null);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m5239r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f4481g = atomicReferenceArray;
        int iM5229f = m5229f(j, i);
        T t = (T) m5230j(atomicReferenceArray, iM5229f);
        if (t == null) {
            return null;
        }
        m5241v(j + 1);
        m5231w(atomicReferenceArray, iM5229f, null);
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
    public final void m5240s(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f4479e = atomicReferenceArray2;
        this.f4477c = (j2 + j) - 1;
        m5243y(j + 1);
        m5231w(atomicReferenceArray2, i, t);
        m5242x(atomicReferenceArray, atomicReferenceArray2);
        m5231w(atomicReferenceArray, i, f4474j);
    }

    @Override // java.util.Collection
    public int size() {
        long jM5235i = m5235i();
        while (true) {
            long jM5237o = m5237o();
            long jM5235i2 = m5235i();
            if (jM5235i == jM5235i2) {
                return (int) (jM5237o - jM5235i2);
            }
            jM5235i = jM5235i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m5241v(long j) {
        this.f4482h.lazySet(j);
    }

    /* JADX INFO: renamed from: x */
    public final void m5242x(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m5231w(atomicReferenceArray, m5228c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: y */
    public final void m5243y(long j) {
        this.f4475a.lazySet(j);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5244z(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m5243y(j + 1);
        m5231w(atomicReferenceArray, i, t);
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
    public static int m5228c(int i) {
        return i;
    }
}
