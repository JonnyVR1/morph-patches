package p137rx.internal.util.unsafe;

import p153l.mnd0;

/* JADX INFO: loaded from: classes3.dex */
public class MpmcArrayQueue<E> extends MpmcArrayQueueConsumerField<E> {
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;
    long p40;
    long p41;
    long p42;
    long p43;
    long p44;
    long p45;
    long p46;

    public MpmcArrayQueue(int i) {
        super(Math.max(2, i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p137rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.Queue, p137rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e) {
        long j;
        long[] jArr;
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        if (e == null) {
            mnd0.m159157a("Null is not a valid element");
            return false;
        }
        long j2 = 1;
        long j3 = mpmcArrayQueue.mask + 1;
        long[] jArr2 = mpmcArrayQueue.sequenceBuffer;
        long j4 = Long.MAX_VALUE;
        while (true) {
            long jLvProducerIndex = mpmcArrayQueue.lvProducerIndex();
            long j5 = j3;
            long jCalcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(jLvProducerIndex);
            long jLvSequence = mpmcArrayQueue.lvSequence(jArr2, jCalcSequenceOffset) - jLvProducerIndex;
            if (jLvSequence == 0) {
                j = j2;
                long j6 = jLvProducerIndex + j;
                if (mpmcArrayQueue.casProducerIndex(jLvProducerIndex, j6)) {
                    mpmcArrayQueue.spElement(mpmcArrayQueue.calcElementOffset(jLvProducerIndex), e);
                    mpmcArrayQueue.soSequence(jArr2, jCalcSequenceOffset, j6);
                    return true;
                }
                jArr = jArr2;
            } else {
                j = j2;
                jArr = jArr2;
                if (jLvSequence < 0) {
                    long j7 = jLvProducerIndex - j5;
                    if (j7 <= j4) {
                        long jLvConsumerIndex = lvConsumerIndex();
                        if (j7 <= jLvConsumerIndex) {
                            return false;
                        }
                        j4 = jLvConsumerIndex;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            jArr2 = jArr;
            j3 = j5;
            j2 = j;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.Queue, p137rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        long jLvConsumerIndex;
        E eLpElement;
        do {
            jLvConsumerIndex = lvConsumerIndex();
            eLpElement = lpElement(calcElementOffset(jLvConsumerIndex));
            if (eLpElement != null) {
                break;
            }
        } while (jLvConsumerIndex != lvProducerIndex());
        return eLpElement;
    }

    @Override // java.util.Queue, p137rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = mpmcArrayQueue.lvConsumerIndex();
            long j = jLvProducerIndex;
            long jCalcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(jLvConsumerIndex);
            long j2 = jLvConsumerIndex + 1;
            long jLvSequence = mpmcArrayQueue.lvSequence(jArr, jCalcSequenceOffset) - j2;
            if (jLvSequence != 0) {
                if (jLvSequence < 0 && jLvConsumerIndex >= j) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                }
                mpmcArrayQueue = this;
            } else if (mpmcArrayQueue.casConsumerIndex(jLvConsumerIndex, j2)) {
                long jCalcElementOffset = mpmcArrayQueue.calcElementOffset(jLvConsumerIndex);
                E eLpElement = mpmcArrayQueue.lpElement(jCalcElementOffset);
                mpmcArrayQueue.spElement(jCalcElementOffset, null);
                mpmcArrayQueue.soSequence(jArr, jCalcSequenceOffset, jLvConsumerIndex + mpmcArrayQueue.mask + 1);
                return eLpElement;
            }
            jLvProducerIndex = j;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p137rx.internal.util.unsafe.MessagePassingQueue
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
