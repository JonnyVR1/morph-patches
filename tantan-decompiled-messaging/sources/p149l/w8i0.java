package p149l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public class w8i0 implements o4m {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f185217a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f185218b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f185219c = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    public final AtomicLong f185220d = new AtomicLong(0);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f185221e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public final AtomicLong f185222f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public ThreadGroup f185223g;

    /* JADX INFO: renamed from: h */
    public zx00 f185224h;

    /* JADX INFO: renamed from: i */
    public ThreadPoolExecutor f185225i;

    /* JADX INFO: renamed from: l.w8i0$a */
    public class C20832a extends zx00 {
        public C20832a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        }

        @Override // p149l.zx00
        /* JADX INFO: renamed from: h */
        public void mo202182h(long j) {
            w8i0.this.f185221e.getAndIncrement();
            w8i0.this.f185222f.getAndAdd(j);
        }

        @Override // p149l.zx00
        /* JADX INFO: renamed from: i */
        public void mo202183i(long j) {
            w8i0.this.f185219c.getAndIncrement();
            w8i0.this.f185220d.getAndAdd(j);
        }
    }

    /* JADX INFO: renamed from: l.w8i0$b */
    public static class C20833b {
        private static final w8i0 INSTANCE = new w8i0();
    }

    /* JADX INFO: renamed from: i */
    public static w8i0 m202177i() {
        return C20833b.INSTANCE;
    }

    @Override // p149l.o4m
    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor mo162607a() {
        return this.f185224h;
    }

    /* JADX INFO: renamed from: h */
    public w8i0 m202178h(int i, int i2, long j, int i3, boolean z) {
        this.f185223g = new ThreadGroup("tt_io_group");
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(i3);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: l.u8i0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f175139a.m202179j(runnable);
            }
        };
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() { // from class: l.v8i0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                this.f180536a.m202180k(runnable, threadPoolExecutor);
            }
        };
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C20832a c20832a = new C20832a(i, i2, j, timeUnit, linkedBlockingQueue, threadFactory, rejectedExecutionHandler);
        this.f185224h = c20832a;
        c20832a.allowCoreThreadTimeOut(z);
        this.f185225i = new ThreadPoolExecutor(1, 1, 8L, timeUnit, new LinkedBlockingQueue(), new RxThreadFactory("TTRxBackup-"));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Thread m202179j(Runnable runnable) {
        int andIncrement = this.f185217a.getAndIncrement();
        return new xjd0(this.f185223g, runnable, "TTRxIo-t-" + andIncrement);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m202180k(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f185218b.getAndIncrement();
        m202181l(runnable);
    }

    /* JADX INFO: renamed from: l */
    public final void m202181l(Runnable runnable) {
        this.f185225i.execute(runnable);
    }
}
