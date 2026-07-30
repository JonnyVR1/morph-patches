package p153l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class un2<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<LinkedQueueNode<E>> f179696a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<LinkedQueueNode<E>> f179697b = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final LinkedQueueNode<E> m196822a() {
        return this.f179697b.get();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedQueueNode<E> m196823c() {
        return this.f179696a.get();
    }

    /* JADX INFO: renamed from: f */
    public final LinkedQueueNode<E> m196824f() {
        return this.f179697b.get();
    }

    /* JADX INFO: renamed from: g */
    public final LinkedQueueNode<E> m196825g() {
        return this.f179696a.get();
    }

    /* JADX INFO: renamed from: h */
    public final void m196826h(LinkedQueueNode<E> linkedQueueNode) {
        this.f179697b.lazySet(linkedQueueNode);
    }

    /* JADX INFO: renamed from: i */
    public final void m196827i(LinkedQueueNode<E> linkedQueueNode) {
        this.f179696a.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m196824f() == m196825g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeM196824f = m196824f();
        LinkedQueueNode<E> linkedQueueNodeM196825g = m196825g();
        int i = 0;
        while (linkedQueueNodeM196824f != linkedQueueNodeM196825g && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeM196824f.lvNext();
            } while (linkedQueueNodeLvNext == null);
            i++;
            linkedQueueNodeM196824f = linkedQueueNodeLvNext;
        }
        return i;
    }
}
