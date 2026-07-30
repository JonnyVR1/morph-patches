package p149l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p133rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h31<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray<E> f105572a;

    /* JADX INFO: renamed from: b */
    public final int f105573b;

    public h31(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f105573b = iRoundToPowerOfTwo - 1;
        this.f105572a = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    /* JADX INFO: renamed from: a */
    public final int m129151a(long j) {
        return this.f105573b & ((int) j);
    }

    /* JADX INFO: renamed from: c */
    public final int m129152c(long j, int i) {
        return ((int) j) & i;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final E m129153f(int i) {
        return m129154g(this.f105572a, i);
    }

    /* JADX INFO: renamed from: g */
    public final E m129154g(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m129155h(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
