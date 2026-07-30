package p003l;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p014rx.internal.schedulers.C1149a;
import p014rx.internal.util.unsafe.MpmcArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class q050<T> implements fud0 {

    /* JADX INFO: renamed from: a */
    public Queue<T> f6559a;

    /* JADX INFO: renamed from: b */
    public final int f6560b;

    /* JADX INFO: renamed from: c */
    public final int f6561c;

    /* JADX INFO: renamed from: d */
    public final long f6562d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<Future<?>> f6563e;

    /* JADX INFO: renamed from: l.q050$a */
    public class RunnableC0488a implements Runnable {
        public RunnableC0488a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = q050.this.f6559a.size();
            q050 q050Var = q050.this;
            int i = 0;
            if (size < q050Var.f6560b) {
                int i2 = q050Var.f6561c - size;
                while (i < i2) {
                    q050 q050Var2 = q050.this;
                    q050Var2.f6559a.add((T) q050Var2.mo6976b());
                    i++;
                }
                return;
            }
            int i3 = q050Var.f6561c;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    q050.this.f6559a.poll();
                    i++;
                }
            }
        }
    }

    public q050(int i, int i2, long j) {
        this.f6560b = i;
        this.f6561c = i2;
        this.f6562d = j;
        this.f6563e = new AtomicReference<>();
        m6977c(i);
        start();
    }

    /* JADX INFO: renamed from: a */
    public T m6975a() {
        T tPoll = this.f6559a.poll();
        return tPoll == null ? mo6976b() : tPoll;
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo6976b();

    /* JADX INFO: renamed from: c */
    public final void m6977c(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.f6559a = new MpmcArrayQueue(Math.max(this.f6561c, 1024));
        } else {
            this.f6559a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f6559a.add(mo6976b());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6978d(T t) {
        if (t == null) {
            return;
        }
        this.f6559a.offer(t);
    }

    @Override // p003l.fud0
    public void shutdown() {
        Future<?> andSet = this.f6563e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // p003l.fud0
    public void start() {
        while (this.f6563e.get() == null) {
            ScheduledExecutorService scheduledExecutorServiceM9916a = C1149a.m9916a();
            try {
                RunnableC0488a runnableC0488a = new RunnableC0488a();
                long j = this.f6562d;
                ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = scheduledExecutorServiceM9916a.scheduleAtFixedRate(runnableC0488a, j, j, TimeUnit.SECONDS);
                if (f31.a(this.f6563e, (Object) null, scheduledFutureScheduleAtFixedRate)) {
                    return;
                } else {
                    scheduledFutureScheduleAtFixedRate.cancel(false);
                }
            } catch (RejectedExecutionException e) {
                ejd0.m3864j(e);
                return;
            }
        }
    }

    public q050() {
        this(0, 0, 67L);
    }
}
