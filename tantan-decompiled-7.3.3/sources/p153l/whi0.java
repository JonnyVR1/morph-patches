package p153l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public class whi0 implements e7m {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f189156a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f189157b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f189158c = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    public final AtomicLong f189159d = new AtomicLong(0);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f189160e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public final AtomicLong f189161f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public ThreadGroup f189162g;

    /* JADX INFO: renamed from: h */
    public j610 f189163h;

    /* JADX INFO: renamed from: i */
    public ThreadPoolExecutor f189164i;

    /* JADX INFO: renamed from: l.whi0$a */
    public class C21121a extends j610 {
        public C21121a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        }

        @Override // p153l.j610
        /* JADX INFO: renamed from: h */
        public void mo143600h(long j) {
            whi0.this.f189160e.getAndIncrement();
            whi0.this.f189161f.getAndAdd(j);
        }

        @Override // p153l.j610
        /* JADX INFO: renamed from: i */
        public void mo143601i(long j) {
            whi0.this.f189158c.getAndIncrement();
            whi0.this.f189159d.getAndAdd(j);
        }
    }

    /* JADX INFO: renamed from: l.whi0$b */
    public static class C21122b {
        private static final whi0 INSTANCE = new whi0();
    }

    /* JADX INFO: renamed from: i */
    public static whi0 m206362i() {
        return C21122b.INSTANCE;
    }

    @Override // p153l.e7m
    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor mo119713a() {
        return this.f189163h;
    }

    /* JADX INFO: renamed from: h */
    public whi0 m206363h(int i, int i2, long j, int i3, boolean z) {
        this.f189162g = new ThreadGroup("tt_io_group");
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(i3);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: l.uhi0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f179029a.m206364j(runnable);
            }
        };
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() { // from class: l.vhi0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                this.f184172a.m206365k(runnable, threadPoolExecutor);
            }
        };
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C21121a c21121a = new C21121a(i, i2, j, timeUnit, linkedBlockingQueue, threadFactory, rejectedExecutionHandler);
        this.f189163h = c21121a;
        c21121a.allowCoreThreadTimeOut(z);
        this.f189164i = new ThreadPoolExecutor(1, 1, 8L, timeUnit, new LinkedBlockingQueue(), new RxThreadFactory("TTRxBackup-"));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Thread m206364j(Runnable runnable) {
        int andIncrement = this.f189156a.getAndIncrement();
        return new asd0(this.f189162g, runnable, "TTRxIo-t-" + andIncrement);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m206365k(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f189157b.getAndIncrement();
        m206366l(runnable);
    }

    /* JADX INFO: renamed from: l */
    public final void m206366l(Runnable runnable) {
        this.f189164i.execute(runnable);
    }
}
