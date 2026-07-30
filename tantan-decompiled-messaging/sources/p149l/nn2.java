package p149l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nn2<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<LinkedQueueNode<E>> f139692a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<LinkedQueueNode<E>> f139693b = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final LinkedQueueNode<E> m160167a() {
        return this.f139693b.get();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedQueueNode<E> m160168c() {
        return this.f139692a.get();
    }

    /* JADX INFO: renamed from: f */
    public final LinkedQueueNode<E> m160169f() {
        return this.f139693b.get();
    }

    /* JADX INFO: renamed from: g */
    public final LinkedQueueNode<E> m160170g() {
        return this.f139692a.get();
    }

    /* JADX INFO: renamed from: h */
    public final void m160171h(LinkedQueueNode<E> linkedQueueNode) {
        this.f139693b.lazySet(linkedQueueNode);
    }

    /* JADX INFO: renamed from: i */
    public final void m160172i(LinkedQueueNode<E> linkedQueueNode) {
        this.f139692a.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m160169f() == m160170g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeM160169f = m160169f();
        LinkedQueueNode<E> linkedQueueNodeM160170g = m160170g();
        int i = 0;
        while (linkedQueueNodeM160169f != linkedQueueNodeM160170g && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeM160169f.lvNext();
            } while (linkedQueueNodeLvNext == null);
            i++;
            linkedQueueNodeM160169f = linkedQueueNodeLvNext;
        }
        return i;
    }
}
