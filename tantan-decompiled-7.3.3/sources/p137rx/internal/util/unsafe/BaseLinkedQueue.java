package p137rx.internal.util.unsafe;

import java.util.Iterator;
import p137rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseLinkedQueue<E> extends BaseLinkedQueueConsumerNodeRef<E> {
    long p00;
    long p01;
    long p02;
    long p03;
    long p04;
    long p05;
    long p06;
    long p07;
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeLvConsumerNode = lvConsumerNode();
        LinkedQueueNode<E> linkedQueueNodeLvProducerNode = lvProducerNode();
        int i = 0;
        while (linkedQueueNodeLvConsumerNode != linkedQueueNodeLvProducerNode && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeLvConsumerNode.lvNext();
            } while (linkedQueueNodeLvNext == null);
            i++;
            linkedQueueNodeLvConsumerNode = linkedQueueNodeLvNext;
        }
        return i;
    }
}
