package p149l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.internal.schedulers.ScheduledAction;
import p133rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class lx3 extends bud0 implements fud0 {

    /* JADX INFO: renamed from: d */
    public static final TimeUnit f130335d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e */
    public static final C18343c f130336e;

    /* JADX INFO: renamed from: f */
    public static final C18341a f130337f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f130338b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C18341a> f130339c = new AtomicReference<>(f130337f);

    /* JADX INFO: renamed from: l.lx3$a */
    public static final class C18341a {

        /* JADX INFO: renamed from: a */
        public final ThreadFactory f130340a;

        /* JADX INFO: renamed from: b */
        public final long f130341b;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<C18343c> f130342c;

        /* JADX INFO: renamed from: d */
        public final bs5 f130343d;

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f130344e;

        /* JADX INFO: renamed from: f */
        public final Future<?> f130345f;

        /* JADX INFO: renamed from: l.lx3$a$a */
        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ThreadFactory f130346a;

            public a(ThreadFactory threadFactory) {
                this.f130346a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f130346a.newThread(runnable);
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
                C18341a.this.m152038a();
            }
        }

        public C18341a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f130340a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f130341b = nanos;
            this.f130342c = new ConcurrentLinkedQueue<>();
            this.f130343d = new bs5();
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new a(threadFactory));
                xa40.m207525l(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f130344e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f130345f = scheduledFutureScheduleWithFixedDelay;
        }

        /* JADX INFO: renamed from: a */
        public void m152038a() {
            if (this.f130342c.isEmpty()) {
                return;
            }
            long jM152040c = m152040c();
            for (C18343c c18343c : this.f130342c) {
                if (c18343c.m152043m() > jM152040c) {
                    return;
                }
                if (this.f130342c.remove(c18343c)) {
                    this.f130343d.m103658d(c18343c);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C18343c m152039b() {
            if (this.f130343d.isUnsubscribed()) {
                return lx3.f130336e;
            }
            while (!this.f130342c.isEmpty()) {
                C18343c c18343cPoll = this.f130342c.poll();
                if (c18343cPoll != null) {
                    return c18343cPoll;
                }
            }
            C18343c c18343c = new C18343c(this.f130340a);
            this.f130343d.m103655a(c18343c);
            return c18343c;
        }

        /* JADX INFO: renamed from: c */
        public long m152040c() {
            return System.nanoTime();
        }

        /* JADX INFO: renamed from: d */
        public void m152041d(C18343c c18343c) {
            c18343c.m152044n(m152040c() + this.f130341b);
            this.f130342c.offer(c18343c);
        }

        /* JADX INFO: renamed from: e */
        public void m152042e() {
            try {
                Future<?> future = this.f130345f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f130344e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f130343d.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.lx3$b */
    public static final class C18342b extends bud0.AbstractC15976a {

        /* JADX INFO: renamed from: b */
        public final C18341a f130350b;

        /* JADX INFO: renamed from: c */
        public final C18343c f130351c;

        /* JADX INFO: renamed from: a */
        public final bs5 f130349a = new bs5();

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f130352d = new AtomicBoolean();

        /* JADX INFO: renamed from: l.lx3$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f130353a;

            public a(d30 d30Var) {
                this.f130353a = d30Var;
            }

            @Override // p149l.d30
            public void call() {
                if (C18342b.this.isUnsubscribed()) {
                    return;
                }
                this.f130353a.call();
            }
        }

        public C18342b(C18341a c18341a) {
            this.f130350b = c18341a;
            this.f130351c = c18341a.m152039b();
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            return mo99202c(d30Var, 0L, null);
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (this.f130349a.isUnsubscribed()) {
                return h4g0.m129243d();
            }
            ScheduledAction scheduledActionM207526i = this.f130351c.m207526i(new a(d30Var), j, timeUnit);
            this.f130349a.m103655a(scheduledActionM207526i);
            scheduledActionM207526i.addParent(this.f130349a);
            return scheduledActionM207526i;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f130349a.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.f130352d.compareAndSet(false, true)) {
                this.f130350b.m152041d(this.f130351c);
            }
            this.f130349a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.lx3$c */
    public static final class C18343c extends xa40 {

        /* JADX INFO: renamed from: i */
        public long f130355i;

        public C18343c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f130355i = 0L;
        }

        /* JADX INFO: renamed from: m */
        public long m152043m() {
            return this.f130355i;
        }

        /* JADX INFO: renamed from: n */
        public void m152044n(long j) {
            this.f130355i = j;
        }
    }

    static {
        C18343c c18343c = new C18343c(RxThreadFactory.NONE);
        f130336e = c18343c;
        c18343c.unsubscribe();
        C18341a c18341a = new C18341a(null, 0L, null);
        f130337f = c18341a;
        c18341a.m152042e();
    }

    public lx3(ThreadFactory threadFactory) {
        this.f130338b = threadFactory;
        start();
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C18342b(this.f130339c.get());
    }

    @Override // p149l.fud0
    public void shutdown() {
        C18341a c18341a;
        C18341a c18341a2;
        do {
            c18341a = this.f130339c.get();
            c18341a2 = f130337f;
            if (c18341a == c18341a2) {
                return;
            }
        } while (!f31.m119248a(this.f130339c, c18341a, c18341a2));
        c18341a.m152042e();
    }

    @Override // p149l.fud0
    public void start() {
        C18341a c18341a = new C18341a(this.f130338b, 60L, f130335d);
        if (f31.m119248a(this.f130339c, f130337f, c18341a)) {
            return;
        }
        c18341a.m152042e();
    }
}
