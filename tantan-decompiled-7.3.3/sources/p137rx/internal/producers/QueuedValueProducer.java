package p137rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.internal.util.unsafe.SpscLinkedQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.gcg0;
import p153l.j6f;
import p153l.qzf0;
import p153l.rc2;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class QueuedValueProducer<T> extends AtomicLong implements vk90 {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final gcg0<? super T> child;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedValueProducer(gcg0<? super T> gcg0Var) {
        this(gcg0Var, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new qzf0());
    }

    private void drain() {
        Object objPoll;
        if (this.wip.getAndIncrement() == 0) {
            gcg0<? super T> gcg0Var = this.child;
            Queue<Object> queue = this.queue;
            while (!gcg0Var.isUnsubscribed()) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0 && (objPoll = queue.poll()) != null) {
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            gcg0Var.onNext(null);
                        } else {
                            gcg0Var.onNext(objPoll);
                        }
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        j--;
                        j2++;
                    } catch (Throwable th) {
                        if (objPoll == NULL_SENTINEL) {
                            objPoll = null;
                        }
                        j6f.m143665g(th, gcg0Var, objPoll);
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t) {
        Queue<Object> queue = this.queue;
        if (t == null) {
            if (!queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!queue.offer(t)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // p153l.vk90
    public void request(long j) {
        if (j < 0) {
            wg3.m206174a("n >= 0 required");
        } else if (j > 0) {
            rc2.m180770b(this, j);
            drain();
        }
    }

    public QueuedValueProducer(gcg0<? super T> gcg0Var, Queue<Object> queue) {
        this.child = gcg0Var;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
