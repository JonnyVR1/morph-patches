package p003l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p014rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class h31<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray<E> f4102a;

    /* JADX INFO: renamed from: b */
    public final int f4103b;

    public h31(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f4103b = iRoundToPowerOfTwo - 1;
        this.f4102a = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    /* JADX INFO: renamed from: a */
    public final int m4907a(long j) {
        return this.f4103b & ((int) j);
    }

    /* JADX INFO: renamed from: c */
    public final int m4908c(long j, int i) {
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
    public final E m4909f(int i) {
        return m4910g(this.f4102a, i);
    }

    /* JADX INFO: renamed from: g */
    public final E m4910g(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m4911h(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
