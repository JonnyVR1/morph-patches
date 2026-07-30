package p133rx.internal.util.unsafe;

import p133rx.internal.util.atomic.LinkedQueueNode;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public final class SpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        spProducerNode(new LinkedQueueNode<>());
        spConsumerNode(this.producerNode);
        this.consumerNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.m141176a("null elements not allowed");
            return false;
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
        this.producerNode.soNext(linkedQueueNode);
        this.producerNode = linkedQueueNode;
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = this.consumerNode.lvNext();
        if (linkedQueueNodeLvNext != null) {
            return linkedQueueNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = this.consumerNode.lvNext();
        if (linkedQueueNodeLvNext == null) {
            return null;
        }
        E andNullValue = linkedQueueNodeLvNext.getAndNullValue();
        this.consumerNode = linkedQueueNodeLvNext;
        return andNullValue;
    }
}
