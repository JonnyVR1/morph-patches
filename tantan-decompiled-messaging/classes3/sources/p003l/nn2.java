package p003l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p014rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class nn2<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<LinkedQueueNode<E>> f5928a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<LinkedQueueNode<E>> f5929b = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final LinkedQueueNode<E> m6551a() {
        return this.f5929b.get();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedQueueNode<E> m6552c() {
        return this.f5928a.get();
    }

    /* JADX INFO: renamed from: f */
    public final LinkedQueueNode<E> m6553f() {
        return this.f5929b.get();
    }

    /* JADX INFO: renamed from: g */
    public final LinkedQueueNode<E> m6554g() {
        return this.f5928a.get();
    }

    /* JADX INFO: renamed from: h */
    public final void m6555h(LinkedQueueNode<E> linkedQueueNode) {
        this.f5929b.lazySet(linkedQueueNode);
    }

    /* JADX INFO: renamed from: i */
    public final void m6556i(LinkedQueueNode<E> linkedQueueNode) {
        this.f5928a.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m6553f() == m6554g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeM6553f = m6553f();
        LinkedQueueNode<E> linkedQueueNodeM6554g = m6554g();
        int i = 0;
        while (linkedQueueNodeM6553f != linkedQueueNodeM6554g && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeM6553f.lvNext();
            } while (linkedQueueNodeLvNext == null);
            i++;
            linkedQueueNodeM6553f = linkedQueueNodeLvNext;
        }
        return i;
    }
}
