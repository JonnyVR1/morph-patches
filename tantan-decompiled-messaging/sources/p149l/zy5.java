package p149l;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class zy5 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: h */
    public static final Class<?> f205606h = zy5.class;

    /* JADX INFO: renamed from: a */
    public final String f205607a;

    /* JADX INFO: renamed from: b */
    public final Executor f205608b;

    /* JADX INFO: renamed from: c */
    public volatile int f205609c;

    /* JADX INFO: renamed from: d */
    public final BlockingQueue<Runnable> f205610d;

    /* JADX INFO: renamed from: e */
    public final RunnableC21820a f205611e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f205612f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f205613g;

    /* JADX INFO: renamed from: l.zy5$a */
    public class RunnableC21820a implements Runnable {
        public RunnableC21820a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) zy5.this.f205610d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    tsf.m190549o(zy5.f205606h, "%s: Worker has nothing to run", zy5.this.f205607a);
                }
            } finally {
                int iDecrementAndGet = zy5.this.f205612f.decrementAndGet();
                if (zy5.this.f205610d.isEmpty()) {
                    tsf.m190550p(zy5.f205606h, "%s: worker finished; %d workers left", zy5.this.f205607a, Integer.valueOf(iDecrementAndGet));
                } else {
                    zy5.this.m220887m();
                }
            }
        }
    }

    public zy5(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            ig3.m135964a("max concurrency must be > 0");
            throw null;
        }
        this.f205607a = str;
        this.f205608b = executor;
        this.f205609c = i;
        this.f205610d = blockingQueue;
        this.f205611e = new RunnableC21820a();
        this.f205612f = new AtomicInteger(0);
        this.f205613g = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            jfd0.m141176a("runnable parameter is null");
            return;
        }
        if (this.f205610d.offer(runnable)) {
            int size = this.f205610d.size();
            int i = this.f205613g.get();
            if (size > i && this.f205613g.compareAndSet(i, size)) {
                tsf.m190550p(f205606h, "%s: max pending work in queue = %d", this.f205607a, Integer.valueOf(size));
            }
            m220887m();
            return;
        }
        throw new RejectedExecutionException(this.f205607a + " queue is full, size=" + this.f205610d.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m220887m() {
        int i = this.f205612f.get();
        while (i < this.f205609c) {
            int i2 = i + 1;
            boolean zCompareAndSet = this.f205612f.compareAndSet(i, i2);
            String str = this.f205607a;
            if (zCompareAndSet) {
                tsf.m190551q(f205606h, "%s: starting worker %d of %d", str, Integer.valueOf(i2), Integer.valueOf(this.f205609c));
                this.f205608b.execute(this.f205611e);
                return;
            } else {
                tsf.m190549o(f205606h, "%s: race in startWorkerIfNeeded; retrying", str);
                i = this.f205612f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
