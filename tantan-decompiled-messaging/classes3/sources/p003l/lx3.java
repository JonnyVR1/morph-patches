package p003l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p014rx.internal.schedulers.ScheduledAction;
import p014rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class lx3 extends bud0 implements fud0 {

    /* JADX INFO: renamed from: d */
    public static final TimeUnit f5455d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e */
    public static final C0417c f5456e;

    /* JADX INFO: renamed from: f */
    public static final C0415a f5457f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f5458b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C0415a> f5459c = new AtomicReference<>(f5457f);

    /* JADX INFO: renamed from: l.lx3$a */
    public static final class C0415a {

        /* JADX INFO: renamed from: a */
        public final ThreadFactory f5460a;

        /* JADX INFO: renamed from: b */
        public final long f5461b;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<C0417c> f5462c;

        /* JADX INFO: renamed from: d */
        public final bs5 f5463d;

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f5464e;

        /* JADX INFO: renamed from: f */
        public final Future<?> f5465f;

        /* JADX INFO: renamed from: l.lx3$a$a */
        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ThreadFactory f5466a;

            public a(ThreadFactory threadFactory) {
                this.f5466a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f5466a.newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            }
        }

        /* JADX INFO: renamed from: l.lx3$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0415a.this.m6184a();
            }
        }

        public C0415a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f5460a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f5461b = nanos;
            this.f5462c = new ConcurrentLinkedQueue<>();
            this.f5463d = new bs5();
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new a(threadFactory));
                xa40.m8694l(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f5464e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f5465f = scheduledFutureScheduleWithFixedDelay;
        }

        /* JADX INFO: renamed from: a */
        public void m6184a() {
            if (this.f5462c.isEmpty()) {
                return;
            }
            long jM6186c = m6186c();
            for (C0417c c0417c : this.f5462c) {
                if (c0417c.m6189m() > jM6186c) {
                    return;
                }
                if (this.f5462c.remove(c0417c)) {
                    this.f5463d.m3167d(c0417c);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C0417c m6185b() {
            if (this.f5463d.isUnsubscribed()) {
                return lx3.f5456e;
            }
            while (!this.f5462c.isEmpty()) {
                C0417c c0417cPoll = this.f5462c.poll();
                if (c0417cPoll != null) {
                    return c0417cPoll;
                }
            }
            C0417c c0417c = new C0417c(this.f5460a);
            this.f5463d.m3164a(c0417c);
            return c0417c;
        }

        /* JADX INFO: renamed from: c */
        public long m6186c() {
            return System.nanoTime();
        }

        /* JADX INFO: renamed from: d */
        public void m6187d(C0417c c0417c) {
            c0417c.m6190n(m6186c() + this.f5461b);
            this.f5462c.offer(c0417c);
        }

        /* JADX INFO: renamed from: e */
        public void m6188e() {
            try {
                Future<?> future = this.f5465f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f5464e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f5463d.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.lx3$b */
    public static final class C0416b extends bud0.AbstractC0185a {

        /* JADX INFO: renamed from: b */
        public final C0415a f5470b;

        /* JADX INFO: renamed from: c */
        public final C0417c f5471c;

        /* JADX INFO: renamed from: a */
        public final bs5 f5469a = new bs5();

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f5472d = new AtomicBoolean();

        /* JADX INFO: renamed from: l.lx3$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f5473a;

            public a(d30 d30Var) {
                this.f5473a = d30Var;
            }

            @Override // p003l.d30
            public void call() {
                if (C0416b.this.isUnsubscribed()) {
                    return;
                }
                this.f5473a.call();
            }
        }

        public C0416b(C0415a c0415a) {
            this.f5470b = c0415a;
            this.f5471c = c0415a.m6185b();
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            return mo2915c(d30Var, 0L, null);
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (this.f5469a.isUnsubscribed()) {
                return h4g0.m4917d();
            }
            ScheduledAction scheduledActionM8695i = this.f5471c.m8695i(new a(d30Var), j, timeUnit);
            this.f5469a.m3164a(scheduledActionM8695i);
            scheduledActionM8695i.addParent(this.f5469a);
            return scheduledActionM8695i;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f5469a.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (this.f5472d.compareAndSet(false, true)) {
                this.f5470b.m6187d(this.f5471c);
            }
            this.f5469a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.lx3$c */
    public static final class C0417c extends xa40 {

        /* JADX INFO: renamed from: i */
        public long f5475i;

        public C0417c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f5475i = 0L;
        }

        /* JADX INFO: renamed from: m */
        public long m6189m() {
            return this.f5475i;
        }

        /* JADX INFO: renamed from: n */
        public void m6190n(long j) {
            this.f5475i = j;
        }
    }

    static {
        C0417c c0417c = new C0417c(RxThreadFactory.NONE);
        f5456e = c0417c;
        c0417c.unsubscribe();
        C0415a c0415a = new C0415a(null, 0L, null);
        f5457f = c0415a;
        c0415a.m6188e();
    }

    public lx3(ThreadFactory threadFactory) {
        this.f5458b = threadFactory;
        start();
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C0416b(this.f5459c.get());
    }

    @Override // p003l.fud0
    public void shutdown() {
        C0415a c0415a;
        C0415a c0415a2;
        do {
            c0415a = this.f5459c.get();
            c0415a2 = f5457f;
            if (c0415a == c0415a2) {
                return;
            }
        } while (!f31.a(this.f5459c, c0415a, c0415a2));
        c0415a.m6188e();
    }

    @Override // p003l.fud0
    public void start() {
        C0415a c0415a = new C0415a(this.f5458b, 60L, f5455d);
        if (f31.a(this.f5459c, f5457f, c0415a)) {
            return;
        }
        c0415a.m6188e();
    }
}
