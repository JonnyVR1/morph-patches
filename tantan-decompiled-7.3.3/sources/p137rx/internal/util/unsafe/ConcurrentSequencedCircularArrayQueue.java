package p137rx.internal.util.unsafe;

import p153l.wtq0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {
    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    protected final long[] sequenceBuffer;

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        if (8 != unsafe.arrayIndexScale(long[].class)) {
            wtq0.m207906a("Unexpected long[] element size");
            return;
        }
        int i = ConcurrentCircularArrayQueue.SPARSE_SHIFT;
        int i2 = i + 3;
        ELEMENT_SHIFT = i2;
        ARRAY_BASE = unsafe.arrayBaseOffset(long[].class) + (32 << (i2 - i));
    }

    public ConcurrentSequencedCircularArrayQueue(int i) {
        super(i);
        int i2 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i2 << ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64];
        for (long j = 0; j < i2; j++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j), j);
        }
    }

    public final long calcSequenceOffset(long j) {
        return ARRAY_BASE + ((j & this.mask) << ELEMENT_SHIFT);
    }

    public final long lvSequence(long[] jArr, long j) {
        return UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
    }

    public final void soSequence(long[] jArr, long j, long j2) {
        UnsafeAccess.UNSAFE.putOrderedLong(jArr, j, j2);
    }
}
