package p133rx.internal.util.unsafe;

import java.util.Iterator;
import p149l.jfd0;
import p149l.qkq0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public class SpscUnboundedArrayQueue<E> extends SpscUnboundedArrayQueueConsumerField<E> implements QueueProgressIndicators {
    private static final long C_INDEX_OFFSET;
    private static final long P_INDEX_OFFSET;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != iArrayIndexScale) {
                qkq0.m175383a("Unknown pointer size");
                return;
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(Object[].class);
        try {
            P_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                C_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                InternalError internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = iRoundToPowerOfTwo - 1;
        E[] eArr = (E[]) new Object[iRoundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        this.producerLookAhead = j - 1;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i) {
        this.producerLookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static long calcDirectOffset(long j) {
        return REF_ARRAY_BASE + (j << REF_ELEMENT_SHIFT);
    }

    private static long calcWrappedOffset(long j, long j2) {
        return calcDirectOffset(j & j2);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private static <E> Object lvElement(E[] eArr, long j) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    private E[] lvNext(E[] eArr) {
        return (E[]) ((Object[]) lvElement(eArr, calcDirectOffset(eArr.length - 1)));
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private E newBufferPeek(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        return (E) lvElement(eArr, calcWrappedOffset(j, j2));
    }

    private E newBufferPoll(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        long jCalcWrappedOffset = calcWrappedOffset(j, j2);
        E e = (E) lvElement(eArr, jCalcWrappedOffset);
        if (e == null) {
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j + 1);
        return e;
    }

    private void resize(E[] eArr, long j, long j2, E e, long j3) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j3 + j) - 1;
        soElement(eArr2, j2, e);
        soNext(eArr, eArr2);
        soElement(eArr, j2, HAS_NEXT);
        soProducerIndex(j + 1);
    }

    private void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }

    private static void soElement(Object[] objArr, long j, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j, obj);
    }

    private void soNext(E[] eArr, E[] eArr2) {
        soElement(eArr, calcDirectOffset(eArr.length - 1), eArr2);
    }

    private void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    private boolean writeToQueue(E[] eArr, E e, long j, long j2) {
        soElement(eArr, j2, e);
        soProducerIndex(j + 1);
        return true;
    }

    @Override // p133rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // p133rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            jfd0.m141176a("Null is not a valid element");
            return false;
        }
        E[] eArr = this.producerBuffer;
        long j = this.producerIndex;
        long j2 = this.producerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j, j2);
        if (j < this.producerLookAhead) {
            return writeToQueue(eArr, e, j, jCalcWrappedOffset);
        }
        long j3 = ((long) this.producerLookAheadStep) + j;
        if (lvElement(eArr, calcWrappedOffset(j3, j2)) == null) {
            this.producerLookAhead = j3 - 1;
            return writeToQueue(eArr, e, j, jCalcWrappedOffset);
        }
        if (lvElement(eArr, calcWrappedOffset(j + 1, j2)) != null) {
            return writeToQueue(eArr, e, j, jCalcWrappedOffset);
        }
        resize(eArr, j, jCalcWrappedOffset, e, j2);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E e = (E) lvElement(eArr, calcWrappedOffset(j, j2));
        return e == HAS_NEXT ? newBufferPeek(lvNext(eArr), j, j2) : e;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j, j2);
        E e = (E) lvElement(eArr, jCalcWrappedOffset);
        boolean z = e == HAS_NEXT;
        if (e == null || z) {
            if (z) {
                return newBufferPoll(lvNext(eArr), j, j2);
            }
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j + 1);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
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
