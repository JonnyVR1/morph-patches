package p014rx.internal.util.unsafe;

import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class SpscArrayQueue<E> extends SpscArrayQueueL3Pad<E> {
    public SpscArrayQueue(int i) {
        super(i);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET);
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET);
    }

    private void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET, j);
    }

    private void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p014rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // java.util.Queue, p014rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e) {
        if (e == null) {
            jfd0.a("null elements not allowed");
            return false;
        }
        E[] eArr = this.buffer;
        long j = this.producerIndex;
        long jCalcElementOffset = calcElementOffset(j);
        if (lvElement(eArr, jCalcElementOffset) != null) {
            return false;
        }
        soElement(eArr, jCalcElementOffset, e);
        soProducerIndex(j + 1);
        return true;
    }

    @Override // java.util.Queue, p014rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    @Override // java.util.Queue, p014rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        long j = this.consumerIndex;
        long jCalcElementOffset = calcElementOffset(j);
        E[] eArr = this.buffer;
        E eLvElement = lvElement(eArr, jCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soElement(eArr, jCalcElementOffset, null);
        soConsumerIndex(j + 1);
        return eLvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p014rx.internal.util.unsafe.MessagePassingQueue
    public int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }
}
