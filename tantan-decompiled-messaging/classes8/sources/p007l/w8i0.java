package p007l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class w8i0 implements o4m {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f5015a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f5016b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f5017c = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    public final AtomicLong f5018d = new AtomicLong(0);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f5019e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public final AtomicLong f5020f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public ThreadGroup f5021g;

    /* JADX INFO: renamed from: h */
    public zx00 f5022h;

    /* JADX INFO: renamed from: i */
    public ThreadPoolExecutor f5023i;

    /* JADX INFO: renamed from: l.w8i0$a */
    public class C0749a extends zx00 {
        public C0749a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        }

        @Override // p007l.zx00
        /* JADX INFO: renamed from: h */
        public void mo11325h(long j) {
            w8i0.this.f5019e.getAndIncrement();
            w8i0.this.f5020f.getAndAdd(j);
        }

        @Override // p007l.zx00
        /* JADX INFO: renamed from: i */
        public void mo11326i(long j) {
            w8i0.this.f5017c.getAndIncrement();
            w8i0.this.f5018d.getAndAdd(j);
        }
    }

    /* JADX INFO: renamed from: l.w8i0$b */
    public static class C0750b {
        private static final w8i0 INSTANCE = new w8i0();
    }

    /* JADX INFO: renamed from: i */
    public static w8i0 m11320i() {
        return C0750b.INSTANCE;
    }

    @Override // p007l.o4m
    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor mo10173a() {
        return this.f5022h;
    }

    /* JADX INFO: renamed from: h */
    public w8i0 m11321h(int i, int i2, long j, int i3, boolean z) {
        this.f5021g = new ThreadGroup("tt_io_group");
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(i3);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: l.u8i0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f4870a.m11322j(runnable);
            }
        };
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() { // from class: l.v8i0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                this.f4961a.m11323k(runnable, threadPoolExecutor);
            }
        };
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C0749a c0749a = new C0749a(i, i2, j, timeUnit, linkedBlockingQueue, threadFactory, rejectedExecutionHandler);
        this.f5022h = c0749a;
        c0749a.allowCoreThreadTimeOut(z);
        this.f5023i = new ThreadPoolExecutor(1, 1, 8L, timeUnit, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new RxThreadFactory("TTRxBackup-"));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Thread m11322j(Runnable runnable) {
        int andIncrement = this.f5015a.getAndIncrement();
        return new xjd0(this.f5021g, runnable, "TTRxIo-t-" + andIncrement);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m11323k(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f5016b.getAndIncrement();
        m11324l(runnable);
    }

    /* JADX INFO: renamed from: l */
    public final void m11324l(Runnable runnable) {
        this.f5023i.execute(runnable);
    }
}
