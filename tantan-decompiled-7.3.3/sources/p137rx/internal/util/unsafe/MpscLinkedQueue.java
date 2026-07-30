package p137rx.internal.util.unsafe;

import p137rx.internal.util.atomic.LinkedQueueNode;
import p153l.iuw0;
import p153l.mnd0;

/* JADX INFO: loaded from: classes3.dex */
public final class MpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public MpscLinkedQueue() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        this.consumerNode = linkedQueueNode;
        xchgProducerNode(linkedQueueNode);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            mnd0.m159157a("null elements not allowed");
            return false;
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
        xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        LinkedQueueNode<E> linkedQueueNodeLvNext2 = linkedQueueNode.lvNext();
        if (linkedQueueNodeLvNext2 != null) {
            return linkedQueueNodeLvNext2.lpValue();
        }
        if (linkedQueueNode == lvProducerNode()) {
            return null;
        }
        do {
            linkedQueueNodeLvNext = linkedQueueNode.lvNext();
        } while (linkedQueueNodeLvNext == null);
        return linkedQueueNodeLvNext.lpValue();
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeLpConsumerNode = lpConsumerNode();
        LinkedQueueNode<E> linkedQueueNodeLvNext2 = linkedQueueNodeLpConsumerNode.lvNext();
        if (linkedQueueNodeLvNext2 != null) {
            E andNullValue = linkedQueueNodeLvNext2.getAndNullValue();
            spConsumerNode(linkedQueueNodeLvNext2);
            return andNullValue;
        }
        if (linkedQueueNodeLpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            linkedQueueNodeLvNext = linkedQueueNodeLpConsumerNode.lvNext();
        } while (linkedQueueNodeLvNext == null);
        E andNullValue2 = linkedQueueNodeLvNext.getAndNullValue();
        this.consumerNode = linkedQueueNodeLvNext;
        return andNullValue2;
    }

    public LinkedQueueNode<E> xchgProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        while (true) {
            LinkedQueueNode<E> linkedQueueNode2 = this.producerNode;
            MpscLinkedQueue<E> mpscLinkedQueue = this;
            LinkedQueueNode<E> linkedQueueNode3 = linkedQueueNode;
            if (iuw0.m142236a(UnsafeAccess.UNSAFE, mpscLinkedQueue, BaseLinkedQueueProducerNodeRef.P_NODE_OFFSET, linkedQueueNode2, linkedQueueNode3)) {
                return linkedQueueNode2;
            }
            this = mpscLinkedQueue;
            linkedQueueNode = linkedQueueNode3;
        }
    }
}
