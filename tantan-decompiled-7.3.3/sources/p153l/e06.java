package p153l;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class e06 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: h */
    public static final Class<?> f91414h = e06.class;

    /* JADX INFO: renamed from: a */
    public final String f91415a;

    /* JADX INFO: renamed from: b */
    public final Executor f91416b;

    /* JADX INFO: renamed from: c */
    public volatile int f91417c;

    /* JADX INFO: renamed from: d */
    public final BlockingQueue<Runnable> f91418d;

    /* JADX INFO: renamed from: e */
    public final RunnableC16673a f91419e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f91420f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f91421g;

    /* JADX INFO: renamed from: l.e06$a */
    public class RunnableC16673a implements Runnable {
        public RunnableC16673a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) e06.this.f91418d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    huf.m137187o(e06.f91414h, "%s: Worker has nothing to run", e06.this.f91415a);
                }
            } finally {
                int iDecrementAndGet = e06.this.f91420f.decrementAndGet();
                if (e06.this.f91418d.isEmpty()) {
                    huf.m137188p(e06.f91414h, "%s: worker finished; %d workers left", e06.this.f91415a, Integer.valueOf(iDecrementAndGet));
                } else {
                    e06.this.m118783m();
                }
            }
        }
    }

    public e06(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            wg3.m206174a("max concurrency must be > 0");
            throw null;
        }
        this.f91415a = str;
        this.f91416b = executor;
        this.f91417c = i;
        this.f91418d = blockingQueue;
        this.f91419e = new RunnableC16673a();
        this.f91420f = new AtomicInteger(0);
        this.f91421g = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            mnd0.m159157a("runnable parameter is null");
            return;
        }
        if (this.f91418d.offer(runnable)) {
            int size = this.f91418d.size();
            int i = this.f91421g.get();
            if (size > i && this.f91421g.compareAndSet(i, size)) {
                huf.m137188p(f91414h, "%s: max pending work in queue = %d", this.f91415a, Integer.valueOf(size));
            }
            m118783m();
            return;
        }
        throw new RejectedExecutionException(this.f91415a + " queue is full, size=" + this.f91418d.size());
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
    public final void m118783m() {
        int i = this.f91420f.get();
        while (i < this.f91417c) {
            int i2 = i + 1;
            boolean zCompareAndSet = this.f91420f.compareAndSet(i, i2);
            String str = this.f91415a;
            if (zCompareAndSet) {
                huf.m137189q(f91414h, "%s: starting worker %d of %d", str, Integer.valueOf(i2), Integer.valueOf(this.f91417c));
                this.f91416b.execute(this.f91419e);
                return;
            } else {
                huf.m137187o(f91414h, "%s: race in startWorkerIfNeeded; retrying", str);
                i = this.f91420f.get();
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
