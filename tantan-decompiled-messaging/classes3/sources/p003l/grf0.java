package p003l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p014rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class grf0<T> implements Queue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f3989i = Integer.getInteger("jctools.spsc.max.lookahead.step", PKIFailureInfo.certConfirmed).intValue();

    /* JADX INFO: renamed from: j */
    public static final Object f3990j = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f3991a;

    /* JADX INFO: renamed from: b */
    public int f3992b;

    /* JADX INFO: renamed from: c */
    public long f3993c;

    /* JADX INFO: renamed from: d */
    public int f3994d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f3995e;

    /* JADX INFO: renamed from: f */
    public int f3996f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray<Object> f3997g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f3998h;

    public grf0(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f3995e = atomicReferenceArray;
        this.f3994d = i2;
        m4686a(iRoundToPowerOfTwo);
        this.f3997g = atomicReferenceArray;
        this.f3996f = i2;
        this.f3993c = iRoundToPowerOfTwo - 2;
        this.f3991a = new AtomicLong();
        this.f3998h = new AtomicLong();
    }

    /* JADX INFO: renamed from: f */
    public static int m4682f(long j, int i) {
        return m4681c(((int) j) & i);
    }

    /* JADX INFO: renamed from: j */
    public static <E> Object m4683j(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: x */
    public static void m4684x(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4685A(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m4684x(atomicReferenceArray, i, t);
        m4698z(j + 1);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m4686a(int i) {
        this.f3992b = Math.min(i / 4, f3989i);
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
    public final long m4687g() {
        return this.f3998h.get();
    }

    /* JADX INFO: renamed from: h */
    public final long m4688h() {
        return this.f3991a.get();
    }

    /* JADX INFO: renamed from: i */
    public final long m4689i() {
        return this.f3998h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m4691o() == m4689i();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<Object> m4690l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m4683j(atomicReferenceArray, m4681c(atomicReferenceArray.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public final long m4691o() {
        return this.f3991a.get();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3995e;
        long jM4688h = m4688h();
        int i = this.f3994d;
        int iM4682f = m4682f(jM4688h, i);
        if (jM4688h < this.f3993c) {
            return m4685A(atomicReferenceArray, t, jM4688h, iM4682f);
        }
        long j = ((long) this.f3992b) + jM4688h;
        if (m4683j(atomicReferenceArray, m4682f(j, i)) == null) {
            this.f3993c = j - 1;
            return m4685A(atomicReferenceArray, t, jM4688h, iM4682f);
        }
        if (m4683j(atomicReferenceArray, m4682f(jM4688h + 1, i)) == null) {
            return m4685A(atomicReferenceArray, t, jM4688h, iM4682f);
        }
        m4695v(atomicReferenceArray, jM4688h, iM4682f, t, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final T m4692p(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f3997g = atomicReferenceArray;
        return (T) m4683j(atomicReferenceArray, m4682f(j, i));
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3997g;
        long jM4687g = m4687g();
        int i = this.f3996f;
        T t = (T) m4683j(atomicReferenceArray, m4682f(jM4687g, i));
        return t == f3990j ? m4692p(m4690l(atomicReferenceArray), jM4687g, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3997g;
        long jM4687g = m4687g();
        int i = this.f3996f;
        int iM4682f = m4682f(jM4687g, i);
        T t = (T) m4683j(atomicReferenceArray, iM4682f);
        boolean z = t == f3990j;
        if (t == null || z) {
            if (z) {
                return m4693r(m4690l(atomicReferenceArray), jM4687g, i);
            }
            return null;
        }
        m4684x(atomicReferenceArray, iM4682f, null);
        m4696w(jM4687g + 1);
        return t;
    }

    /* JADX INFO: renamed from: r */
    public final T m4693r(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f3997g = atomicReferenceArray;
        int iM4682f = m4682f(j, i);
        T t = (T) m4683j(atomicReferenceArray, iM4682f);
        if (t == null) {
            return null;
        }
        m4684x(atomicReferenceArray, iM4682f, null);
        m4696w(j + 1);
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
    public boolean m4694s(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3995e;
        long jM4691o = m4691o();
        int i = this.f3994d;
        long j = 2 + jM4691o;
        if (m4683j(atomicReferenceArray, m4682f(j, i)) == null) {
            int iM4682f = m4682f(jM4691o, i);
            m4684x(atomicReferenceArray, iM4682f + 1, t2);
            m4684x(atomicReferenceArray, iM4682f, t);
            m4698z(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f3995e = atomicReferenceArray2;
        int iM4682f2 = m4682f(jM4691o, i);
        m4684x(atomicReferenceArray2, iM4682f2 + 1, t2);
        m4684x(atomicReferenceArray2, iM4682f2, t);
        m4697y(atomicReferenceArray, atomicReferenceArray2);
        m4684x(atomicReferenceArray, iM4682f2, f3990j);
        m4698z(j);
        return true;
    }

    @Override // java.util.Collection
    public int size() {
        long jM4689i = m4689i();
        while (true) {
            long jM4691o = m4691o();
            long jM4689i2 = m4689i();
            if (jM4689i == jM4689i2) {
                return (int) (jM4691o - jM4689i2);
            }
            jM4689i = jM4689i2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: v */
    public final void m4695v(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f3995e = atomicReferenceArray2;
        this.f3993c = (j2 + j) - 1;
        m4684x(atomicReferenceArray2, i, t);
        m4697y(atomicReferenceArray, atomicReferenceArray2);
        m4684x(atomicReferenceArray, i, f3990j);
        m4698z(j + 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m4696w(long j) {
        this.f3998h.lazySet(j);
    }

    /* JADX INFO: renamed from: y */
    public final void m4697y(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m4684x(atomicReferenceArray, m4681c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* JADX INFO: renamed from: z */
    public final void m4698z(long j) {
        this.f3991a.lazySet(j);
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
    public static int m4681c(int i) {
        return i;
    }
}
