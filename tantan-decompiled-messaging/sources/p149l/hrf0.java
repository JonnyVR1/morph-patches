package p149l;

import p133rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
public final class hrf0<E> extends nn2<E> {
    public hrf0() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        m160172i(linkedQueueNode);
        m160171h(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.m141176a("null elements not allowed");
            return false;
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
        m160168c().soNext(linkedQueueNode);
        m160172i(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = m160167a().lvNext();
        if (linkedQueueNodeLvNext != null) {
            return linkedQueueNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = m160167a().lvNext();
        if (linkedQueueNodeLvNext == null) {
            return null;
        }
        E andNullValue = linkedQueueNodeLvNext.getAndNullValue();
        m160171h(linkedQueueNodeLvNext);
        return andNullValue;
    }
}
