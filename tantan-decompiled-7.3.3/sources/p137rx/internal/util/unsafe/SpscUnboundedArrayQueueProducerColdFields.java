package p137rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class SpscUnboundedArrayQueueProducerColdFields<E> extends SpscUnboundedArrayQueueProducerFields<E> {
    protected E[] producerBuffer;
    protected long producerLookAhead;
    protected int producerLookAheadStep;
    protected long producerMask;
}
