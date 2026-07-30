package p137rx.internal.util.unsafe;

import p137rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseLinkedQueueProducerNodeRef<E> extends BaseLinkedQueuePad0<E> {
    protected static final long P_NODE_OFFSET = UnsafeAccess.addressOf(BaseLinkedQueueProducerNodeRef.class, "producerNode");
    protected LinkedQueueNode<E> producerNode;

    public final LinkedQueueNode<E> lpProducerNode() {
        return this.producerNode;
    }

    public final LinkedQueueNode<E> lvProducerNode() {
        return (LinkedQueueNode) UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    public final void spProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }
}
