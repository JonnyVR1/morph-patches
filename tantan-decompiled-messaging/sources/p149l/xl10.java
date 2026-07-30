package p149l;

import android.os.SystemClock;
import com.cosmos.mdlog.MDLog;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class xl10 implements t2m {

    /* JADX INFO: renamed from: a */
    private v3m f193374a;

    /* JADX INFO: renamed from: b */
    private m4m f193375b;

    /* JADX INFO: renamed from: l.xl10$b */
    public class RunnableC21170b implements Runnable {

        /* JADX INFO: renamed from: a */
        private Runnable f193376a;

        /* JADX INFO: renamed from: b */
        private String f193377b;

        public RunnableC21170b(String str, Runnable runnable) {
            this.f193377b = str;
            this.f193376a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MDLog.m7390d("SYNC-MultiThreadScheduler", "thread: %s---run action, : %s", Thread.currentThread().getName(), this.f193376a);
            Runnable runnable = this.f193376a;
            if (runnable != null) {
                runnable.run();
            }
            MDLog.m7390d("SYNC-MultiThreadScheduler", "thread: %s---action done! action: %s, cast: %d", Thread.currentThread().getName(), this.f193376a, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            xl10.this.f193374a.mo106708a(this.f193377b);
        }

        public String toString() {
            return "action key: " + this.f193377b + " inner action: " + this.f193376a;
        }
    }

    /* JADX INFO: renamed from: l.xl10$c */
    public static class RejectedExecutionHandlerC21171c implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC21171c() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MDLog.m7391e("SYNC-MultiThreadScheduler", "Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString());
        }
    }

    /* JADX INFO: renamed from: l.xl10$d */
    public class C21172d implements m4m {

        /* JADX INFO: renamed from: a */
        private ThreadPoolExecutor f193379a;

        private C21172d() {
        }

        @Override // p149l.m4m
        /* JADX INFO: renamed from: a */
        public void mo153047a(Runnable runnable) {
            this.f193379a.execute(runnable);
        }

        @Override // p149l.m4m
        public void start() {
            if (this.f193379a == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new hiw(), new RejectedExecutionHandlerC21171c());
                this.f193379a = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        }
    }

    public xl10(v3m v3mVar) {
        if (v3mVar != null) {
            this.f193374a = v3mVar;
        } else {
            jfd0.m141176a("syncObjectPool must not be null!");
            throw null;
        }
    }

    @Override // p149l.t2m
    /* JADX INFO: renamed from: a */
    public void mo187021a(String str, Runnable runnable) {
        RunnableC21170b runnableC21170b = new RunnableC21170b(str, runnable);
        MDLog.m7390d("SYNC-MultiThreadScheduler", "schedule action: %s", runnableC21170b);
        this.f193374a.mo106710c(str);
        if (this.f193375b == null) {
            C21172d c21172d = new C21172d();
            this.f193375b = c21172d;
            c21172d.start();
        }
        this.f193375b.mo153047a(runnableC21170b);
    }
}
