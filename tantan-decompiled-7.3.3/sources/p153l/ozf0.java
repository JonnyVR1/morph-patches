package p153l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ozf0<E> extends o31<E> {

    /* JADX INFO: renamed from: g */
    public static final Integer f149880g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f149881c;

    /* JADX INFO: renamed from: d */
    public long f149882d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f149883e;

    /* JADX INFO: renamed from: f */
    public final int f149884f;

    public ozf0(int i) {
        super(i);
        this.f149881c = new AtomicLong();
        this.f149883e = new AtomicLong();
        this.f149884f = Math.min(i / 4, f149880g.intValue());
    }

    @Override // p153l.o31, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX INFO: renamed from: i */
    public final long m169931i() {
        return this.f149883e.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m169932j() == m169931i();
    }

    @Override // p153l.o31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final long m169932j() {
        return this.f149881c.get();
    }

    /* JADX INFO: renamed from: l */
    public final void m169933l(long j) {
        this.f149883e.lazySet(j);
    }

    /* JADX INFO: renamed from: o */
    public final void m169934o(long j) {
        this.f149881c.lazySet(j);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            mnd0.m159157a("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f144814a;
        int i = this.f144815b;
        long j = this.f149881c.get();
        int iM165837c = m165837c(j, i);
        if (j >= this.f149882d) {
            long j2 = ((long) this.f149884f) + j;
            if (m165839g(atomicReferenceArray, m165837c(j2, i)) == null) {
                this.f149882d = j2;
            } else if (m165839g(atomicReferenceArray, iM165837c) != null) {
                return false;
            }
        }
        m165840h(atomicReferenceArray, iM165837c, e);
        m169934o(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m165838f(m165836a(this.f149883e.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.f149883e.get();
        int iM165836a = m165836a(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f144814a;
        E eM165839g = m165839g(atomicReferenceArray, iM165836a);
        if (eM165839g == null) {
            return null;
        }
        m165840h(atomicReferenceArray, iM165836a, null);
        m169933l(j + 1);
        return eM165839g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM169931i = m169931i();
        while (true) {
            long jM169932j = m169932j();
            long jM169931i2 = m169931i();
            if (jM169931i == jM169931i2) {
                return (int) (jM169932j - jM169931i2);
            }
            jM169931i = jM169931i2;
        }
    }
}
