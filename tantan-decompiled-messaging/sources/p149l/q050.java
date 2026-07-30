package p149l;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.internal.schedulers.C22356a;
import p133rx.internal.util.unsafe.MpmcArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q050<T> implements fud0 {

    /* JADX INFO: renamed from: a */
    public Queue<T> f152003a;

    /* JADX INFO: renamed from: b */
    public final int f152004b;

    /* JADX INFO: renamed from: c */
    public final int f152005c;

    /* JADX INFO: renamed from: d */
    public final long f152006d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<Future<?>> f152007e;

    /* JADX INFO: renamed from: l.q050$a */
    public class RunnableC19383a implements Runnable {
        public RunnableC19383a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = q050.this.f152003a.size();
            q050 q050Var = q050.this;
            int i = 0;
            if (size < q050Var.f152004b) {
                int i2 = q050Var.f152005c - size;
                while (i < i2) {
                    q050 q050Var2 = q050.this;
                    q050Var2.f152003a.add((T) q050Var2.mo172286b());
                    i++;
                }
                return;
            }
            int i3 = q050Var.f152005c;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    q050.this.f152003a.poll();
                    i++;
                }
            }
        }
    }

    public q050(int i, int i2, long j) {
        this.f152004b = i;
        this.f152005c = i2;
        this.f152006d = j;
        this.f152007e = new AtomicReference<>();
        m172287c(i);
        start();
    }

    /* JADX INFO: renamed from: a */
    public T m172285a() {
        T tPoll = this.f152003a.poll();
        return tPoll == null ? mo172286b() : tPoll;
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo172286b();

    /* JADX INFO: renamed from: c */
    public final void m172287c(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.f152003a = new MpmcArrayQueue(Math.max(this.f152005c, 1024));
        } else {
            this.f152003a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f152003a.add(mo172286b());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m172288d(T t) {
        if (t == null) {
            return;
        }
        this.f152003a.offer(t);
    }

    @Override // p149l.fud0
    public void shutdown() {
        Future<?> andSet = this.f152007e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // p149l.fud0
    public void start() {
        while (this.f152007e.get() == null) {
            ScheduledExecutorService scheduledExecutorServiceM221459a = C22356a.m221459a();
            try {
                RunnableC19383a runnableC19383a = new RunnableC19383a();
                long j = this.f152006d;
                ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = scheduledExecutorServiceM221459a.scheduleAtFixedRate(runnableC19383a, j, j, TimeUnit.SECONDS);
                if (f31.m119248a(this.f152007e, null, scheduledFutureScheduleAtFixedRate)) {
                    return;
                } else {
                    scheduledFutureScheduleAtFixedRate.cancel(false);
                }
            } catch (RejectedExecutionException e) {
                ejd0.m116793j(e);
                return;
            }
        }
    }

    public q050() {
        this(0, 0, 67L);
    }
}
