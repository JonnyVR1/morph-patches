package p003l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l.jfd0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class frf0<E> extends h31<E> {

    /* JADX INFO: renamed from: g */
    public static final Integer f3688g = Integer.getInteger("jctools.spsc.max.lookahead.step", PKIFailureInfo.certConfirmed);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f3689c;

    /* JADX INFO: renamed from: d */
    public long f3690d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f3691e;

    /* JADX INFO: renamed from: f */
    public final int f3692f;

    public frf0(int i) {
        super(i);
        this.f3689c = new AtomicLong();
        this.f3691e = new AtomicLong();
        this.f3692f = Math.min(i / 4, f3688g.intValue());
    }

    @Override // p003l.h31, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX INFO: renamed from: i */
    public final long m4395i() {
        return this.f3691e.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m4396j() == m4395i();
    }

    @Override // p003l.h31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final long m4396j() {
        return this.f3689c.get();
    }

    /* JADX INFO: renamed from: l */
    public final void m4397l(long j) {
        this.f3691e.lazySet(j);
    }

    /* JADX INFO: renamed from: o */
    public final void m4398o(long j) {
        this.f3689c.lazySet(j);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.a("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f4102a;
        int i = this.f4103b;
        long j = this.f3689c.get();
        int iM4908c = m4908c(j, i);
        if (j >= this.f3690d) {
            long j2 = ((long) this.f3692f) + j;
            if (m4910g(atomicReferenceArray, m4908c(j2, i)) == null) {
                this.f3690d = j2;
            } else if (m4910g(atomicReferenceArray, iM4908c) != null) {
                return false;
            }
        }
        m4911h(atomicReferenceArray, iM4908c, e);
        m4398o(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m4909f(m4907a(this.f3691e.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.f3691e.get();
        int iM4907a = m4907a(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f4102a;
        E eM4910g = m4910g(atomicReferenceArray, iM4907a);
        if (eM4910g == null) {
            return null;
        }
        m4911h(atomicReferenceArray, iM4907a, null);
        m4397l(j + 1);
        return eM4910g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM4395i = m4395i();
        while (true) {
            long jM4396j = m4396j();
            long jM4395i2 = m4395i();
            if (jM4395i == jM4395i2) {
                return (int) (jM4396j - jM4395i2);
            }
            jM4395i = jM4395i2;
        }
    }
}
