package p137rx.internal.util.unsafe;

import p137rx.internal.util.atomic.LinkedQueueNode;
import p153l.mnd0;

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
            mnd0.m159157a("null elements not allowed");
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
