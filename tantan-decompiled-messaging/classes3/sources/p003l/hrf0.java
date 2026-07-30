package p003l;

import l.jfd0;
import p014rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class hrf0<E> extends nn2<E> {
    public hrf0() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        m6556i(linkedQueueNode);
        m6555h(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.a("null elements not allowed");
            return false;
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
        m6552c().soNext(linkedQueueNode);
        m6556i(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = m6551a().lvNext();
        if (linkedQueueNodeLvNext != null) {
            return linkedQueueNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = m6551a().lvNext();
        if (linkedQueueNodeLvNext == null) {
            return null;
        }
        E andNullValue = linkedQueueNodeLvNext.getAndNullValue();
        m6555h(linkedQueueNodeLvNext);
        return andNullValue;
    }
}
