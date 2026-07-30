package p149l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class frf0<E> extends h31<E> {

    /* JADX INFO: renamed from: g */
    public static final Integer f98927g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f98928c;

    /* JADX INFO: renamed from: d */
    public long f98929d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f98930e;

    /* JADX INFO: renamed from: f */
    public final int f98931f;

    public frf0(int i) {
        super(i);
        this.f98928c = new AtomicLong();
        this.f98930e = new AtomicLong();
        this.f98931f = Math.min(i / 4, f98927g.intValue());
    }

    @Override // p149l.h31, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX INFO: renamed from: i */
    public final long m122809i() {
        return this.f98930e.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m122810j() == m122809i();
    }

    @Override // p149l.h31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final long m122810j() {
        return this.f98928c.get();
    }

    /* JADX INFO: renamed from: l */
    public final void m122811l(long j) {
        this.f98930e.lazySet(j);
    }

    /* JADX INFO: renamed from: o */
    public final void m122812o(long j) {
        this.f98928c.lazySet(j);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.m141176a("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f105572a;
        int i = this.f105573b;
        long j = this.f98928c.get();
        int iM129152c = m129152c(j, i);
        if (j >= this.f98929d) {
            long j2 = ((long) this.f98931f) + j;
            if (m129154g(atomicReferenceArray, m129152c(j2, i)) == null) {
                this.f98929d = j2;
            } else if (m129154g(atomicReferenceArray, iM129152c) != null) {
                return false;
            }
        }
        m129155h(atomicReferenceArray, iM129152c, e);
        m122812o(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m129153f(m129151a(this.f98930e.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.f98930e.get();
        int iM129151a = m129151a(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f105572a;
        E eM129154g = m129154g(atomicReferenceArray, iM129151a);
        if (eM129154g == null) {
            return null;
        }
        m129155h(atomicReferenceArray, iM129151a, null);
        m122811l(j + 1);
        return eM129154g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM122809i = m122809i();
        while (true) {
            long jM122810j = m122810j();
            long jM122809i2 = m122809i();
            if (jM122809i == jM122809i2) {
                return (int) (jM122810j - jM122809i2);
            }
            jM122809i = jM122809i2;
        }
    }
}
