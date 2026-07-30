package p014rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import p003l.f5f;
import p003l.hrf0;
import p003l.kc2;
import p003l.m250;
import p003l.rc90;
import p003l.z3g0;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.util.unsafe.SpscLinkedQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class QueuedProducer<T> extends AtomicLong implements rc90, m250<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final z3g0<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(z3g0<? super T> z3g0Var) {
        this(z3g0Var, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new hrf0());
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
            z3g0<? super T> z3g0Var = this.child;
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
                            z3g0Var.onNext(null);
                        } else {
                            z3g0Var.onNext(objPoll);
                        }
                        j--;
                        j2++;
                    } catch (Throwable th) {
                        if (objPoll == NULL_SENTINEL) {
                            objPoll = null;
                        }
                        f5f.m3966g(th, z3g0Var, objPoll);
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

    @Override // p003l.m250
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // p003l.m250
    public void onNext(T t) {
        if (offer(t)) {
            return;
        }
        onError(new MissingBackpressureException());
    }

    @Override // p003l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.a("n >= 0 required");
        } else if (j > 0) {
            kc2.m5640b(this, j);
            drain();
        }
    }

    public QueuedProducer(z3g0<? super T> z3g0Var, Queue<Object> queue) {
        this.child = z3g0Var;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
