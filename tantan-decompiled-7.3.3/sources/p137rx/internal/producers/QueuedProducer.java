package p137rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.util.unsafe.SpscLinkedQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.bb50;
import p153l.gcg0;
import p153l.j6f;
import p153l.qzf0;
import p153l.rc2;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class QueuedProducer<T> extends AtomicLong implements vk90, bb50<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final gcg0<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(gcg0<? super T> gcg0Var) {
        this(gcg0Var, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new qzf0());
    }

    private boolean checkTerminated(boolean z, boolean z2) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            this.queue.clear();
            this.child.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.child.onCompleted();
        return true;
    }

    private void drain() {
        if (this.wip.getAndIncrement() == 0) {
            gcg0<? super T> gcg0Var = this.child;
            Queue<Object> queue = this.queue;
            while (!checkTerminated(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.done;
                    Object objPoll = queue.poll();
                    if (checkTerminated(z, objPoll == null)) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            gcg0Var.onNext(null);
                        } else {
                            gcg0Var.onNext(objPoll);
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

    @Override // p153l.bb50
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        if (offer(t)) {
            return;
        }
        onError(new MissingBackpressureException());
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

    public QueuedProducer(gcg0<? super T> gcg0Var, Queue<Object> queue) {
        this.child = gcg0Var;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
