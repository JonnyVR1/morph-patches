package p153l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p137rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o31<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray<E> f144814a;

    /* JADX INFO: renamed from: b */
    public final int f144815b;

    public o31(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f144815b = iRoundToPowerOfTwo - 1;
        this.f144814a = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    /* JADX INFO: renamed from: a */
    public final int m165836a(long j) {
        return this.f144815b & ((int) j);
    }

    /* JADX INFO: renamed from: c */
    public final int m165837c(long j, int i) {
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
    public final E m165838f(int i) {
        return m165839g(this.f144814a, i);
    }

    /* JADX INFO: renamed from: g */
    public final E m165839g(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m165840h(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
