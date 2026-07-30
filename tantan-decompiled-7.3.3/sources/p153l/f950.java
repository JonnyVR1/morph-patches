package p153l;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.schedulers.C22471a;
import p137rx.internal.util.unsafe.MpmcArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f950<T> implements j2e0 {

    /* JADX INFO: renamed from: a */
    public Queue<T> f97823a;

    /* JADX INFO: renamed from: b */
    public final int f97824b;

    /* JADX INFO: renamed from: c */
    public final int f97825c;

    /* JADX INFO: renamed from: d */
    public final long f97826d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<Future<?>> f97827e;

    /* JADX INFO: renamed from: l.f950$a */
    public class RunnableC16926a implements Runnable {
        public RunnableC16926a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = f950.this.f97823a.size();
            f950 f950Var = f950.this;
            int i = 0;
            if (size < f950Var.f97824b) {
                int i2 = f950Var.f97825c - size;
                while (i < i2) {
                    f950 f950Var2 = f950.this;
                    f950Var2.f97823a.add((T) f950Var2.mo124628b());
                    i++;
                }
                return;
            }
            int i3 = f950Var.f97825c;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    f950.this.f97823a.poll();
                    i++;
                }
            }
        }
    }

    public f950(int i, int i2, long j) {
        this.f97824b = i;
        this.f97825c = i2;
        this.f97826d = j;
        this.f97827e = new AtomicReference<>();
        m124629c(i);
        start();
    }

    /* JADX INFO: renamed from: a */
    public T m124627a() {
        T tPoll = this.f97823a.poll();
        return tPoll == null ? mo124628b() : tPoll;
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo124628b();

    /* JADX INFO: renamed from: c */
    public final void m124629c(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.f97823a = new MpmcArrayQueue(Math.max(this.f97825c, 1024));
        } else {
            this.f97823a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f97823a.add(mo124628b());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m124630d(T t) {
        if (t == null) {
            return;
        }
        this.f97823a.offer(t);
    }

    @Override // p153l.j2e0
    public void shutdown() {
        Future<?> andSet = this.f97827e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // p153l.j2e0
    public void start() {
        while (this.f97827e.get() == null) {
            ScheduledExecutorService scheduledExecutorServiceM222705a = C22471a.m222705a();
            try {
                RunnableC16926a runnableC16926a = new RunnableC16926a();
                long j = this.f97826d;
                ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = scheduledExecutorServiceM222705a.scheduleAtFixedRate(runnableC16926a, j, j, TimeUnit.SECONDS);
                if (m31.m156916a(this.f97827e, null, scheduledFutureScheduleAtFixedRate)) {
                    return;
                } else {
                    scheduledFutureScheduleAtFixedRate.cancel(false);
                }
            } catch (RejectedExecutionException e) {
                hrd0.m136792j(e);
                return;
            }
        }
    }

    public f950() {
        this(0, 0, 67L);
    }
}
