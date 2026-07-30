package p153l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.schedulers.ScheduledAction;
import p137rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class ky3 extends f2e0 implements j2e0 {

    /* JADX INFO: renamed from: d */
    public static final TimeUnit f129263d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e */
    public static final C18299c f129264e;

    /* JADX INFO: renamed from: f */
    public static final C18297a f129265f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f129266b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C18297a> f129267c = new AtomicReference<>(f129265f);

    /* JADX INFO: renamed from: l.ky3$a */
    public static final class C18297a {

        /* JADX INFO: renamed from: a */
        public final ThreadFactory f129268a;

        /* JADX INFO: renamed from: b */
        public final long f129269b;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<C18299c> f129270c;

        /* JADX INFO: renamed from: d */
        public final ft5 f129271d;

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f129272e;

        /* JADX INFO: renamed from: f */
        public final Future<?> f129273f;

        /* JADX INFO: renamed from: l.ky3$a$a */
        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ThreadFactory f129274a;

            public a(ThreadFactory threadFactory) {
                this.f129274a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f129274a.newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            }
        }

        /* JADX INFO: renamed from: l.ky3$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C18297a.this.m151943a();
            }
        }

        public C18297a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f129268a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f129269b = nanos;
            this.f129270c = new ConcurrentLinkedQueue<>();
            this.f129271d = new ft5();
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new a(threadFactory));
                lj40.m154461l(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f129272e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f129273f = scheduledFutureScheduleWithFixedDelay;
        }

        /* JADX INFO: renamed from: a */
        public void m151943a() {
            if (this.f129270c.isEmpty()) {
                return;
            }
            long jM151945c = m151945c();
            for (C18299c c18299c : this.f129270c) {
                if (c18299c.m151948m() > jM151945c) {
                    return;
                }
                if (this.f129270c.remove(c18299c)) {
                    this.f129271d.m127300d(c18299c);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C18299c m151944b() {
            if (this.f129271d.isUnsubscribed()) {
                return ky3.f129264e;
            }
            while (!this.f129270c.isEmpty()) {
                C18299c c18299cPoll = this.f129270c.poll();
                if (c18299cPoll != null) {
                    return c18299cPoll;
                }
            }
            C18299c c18299c = new C18299c(this.f129268a);
            this.f129271d.m127297a(c18299c);
            return c18299c;
        }

        /* JADX INFO: renamed from: c */
        public long m151945c() {
            return System.nanoTime();
        }

        /* JADX INFO: renamed from: d */
        public void m151946d(C18299c c18299c) {
            c18299c.m151949n(m151945c() + this.f129269b);
            this.f129270c.offer(c18299c);
        }

        /* JADX INFO: renamed from: e */
        public void m151947e() {
            try {
                Future<?> future = this.f129273f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f129272e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f129271d.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.ky3$b */
    public static final class C18298b extends f2e0.AbstractC16877a {

        /* JADX INFO: renamed from: b */
        public final C18297a f129278b;

        /* JADX INFO: renamed from: c */
        public final C18299c f129279c;

        /* JADX INFO: renamed from: a */
        public final ft5 f129277a = new ft5();

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f129280d = new AtomicBoolean();

        /* JADX INFO: renamed from: l.ky3$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x20 f129281a;

            public a(x20 x20Var) {
                this.f129281a = x20Var;
            }

            @Override // p153l.x20
            public void call() {
                if (C18298b.this.isUnsubscribed()) {
                    return;
                }
                this.f129281a.call();
            }
        }

        public C18298b(C18297a c18297a) {
            this.f129278b = c18297a;
            this.f129279c = c18297a.m151944b();
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            return mo102837c(x20Var, 0L, null);
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            if (this.f129277a.isUnsubscribed()) {
                return pcg0.m171651d();
            }
            ScheduledAction scheduledActionM154462i = this.f129279c.m154462i(new a(x20Var), j, timeUnit);
            this.f129277a.m127297a(scheduledActionM154462i);
            scheduledActionM154462i.addParent(this.f129277a);
            return scheduledActionM154462i;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f129277a.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (this.f129280d.compareAndSet(false, true)) {
                this.f129278b.m151946d(this.f129279c);
            }
            this.f129277a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.ky3$c */
    public static final class C18299c extends lj40 {

        /* JADX INFO: renamed from: i */
        public long f129283i;

        public C18299c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f129283i = 0L;
        }

        /* JADX INFO: renamed from: m */
        public long m151948m() {
            return this.f129283i;
        }

        /* JADX INFO: renamed from: n */
        public void m151949n(long j) {
            this.f129283i = j;
        }
    }

    static {
        C18299c c18299c = new C18299c(RxThreadFactory.NONE);
        f129264e = c18299c;
        c18299c.unsubscribe();
        C18297a c18297a = new C18297a(null, 0L, null);
        f129265f = c18297a;
        c18297a.m151947e();
    }

    public ky3(ThreadFactory threadFactory) {
        this.f129266b = threadFactory;
        start();
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C18298b(this.f129267c.get());
    }

    @Override // p153l.j2e0
    public void shutdown() {
        C18297a c18297a;
        C18297a c18297a2;
        do {
            c18297a = this.f129267c.get();
            c18297a2 = f129265f;
            if (c18297a == c18297a2) {
                return;
            }
        } while (!m31.m156916a(this.f129267c, c18297a, c18297a2));
        c18297a.m151947e();
    }

    @Override // p153l.j2e0
    public void start() {
        C18297a c18297a = new C18297a(this.f129266b, 60L, f129263d);
        if (m31.m156916a(this.f129267c, f129265f, c18297a)) {
            return;
        }
        c18297a.m151947e();
    }
}
