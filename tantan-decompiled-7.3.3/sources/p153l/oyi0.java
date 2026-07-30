package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class oyi0 {

    /* JADX INFO: renamed from: a */
    public static o7b0 f149797a;

    /* JADX INFO: renamed from: b */
    public static o7b0 f149798b;

    /* JADX INFO: renamed from: c */
    public static o7b0 f149799c;

    /* JADX INFO: renamed from: d */
    public static o7b0 f149800d;

    /* JADX INFO: renamed from: e */
    public static final TimeUnit f149801e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.oyi0$b */
    public static class C19245b extends Thread {
        public C19245b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.oyi0$c */
    public static class ThreadFactoryC19246c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f149802a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        public int f149803b;

        public ThreadFactoryC19246c(int i) {
            this.f149803b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C19245b c19245b = new C19245b(runnable, "MMT" + this.f149803b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f149802a.getAndIncrement() + " #");
            int i = this.f149803b;
            if (i == 2 || i == 3) {
                c19245b.setPriority(10);
                return c19245b;
            }
            c19245b.setPriority(1);
            return c19245b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m169868a(o7b0 o7b0Var, Runnable runnable) {
        o7b0Var.execute(runnable);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m169869b(int i, Runnable runnable) {
        try {
            if (i == 1) {
                if (f149797a == null) {
                    o7b0 o7b0Var = new o7b0("proxy_inner", 2, 2, 60L, f149801e, new LinkedBlockingQueue(), new ThreadFactoryC19246c(i), new RejectedExecutionHandlerC19247d());
                    f149797a = o7b0Var;
                    o7b0Var.allowCoreThreadTimeOut(true);
                }
                m169868a(f149797a, runnable);
            } else if (i == 2) {
                if (f149799c == null) {
                    o7b0 o7b0Var2 = new o7b0("proxy_net", 10, 10, 120L, f149801e, new LinkedBlockingQueue(), new ThreadFactoryC19246c(i), new RejectedExecutionHandlerC19247d());
                    f149799c = o7b0Var2;
                    o7b0Var2.allowCoreThreadTimeOut(true);
                }
                m169868a(f149799c, runnable);
            } else if (i == 3) {
                if (f149798b == null) {
                    o7b0 o7b0Var3 = new o7b0("proxy_local", 3, 3, 60L, f149801e, new LinkedBlockingQueue(), new ThreadFactoryC19246c(i), new RejectedExecutionHandlerC19247d());
                    f149798b = o7b0Var3;
                    o7b0Var3.allowCoreThreadTimeOut(true);
                }
                m169868a(f149798b, runnable);
            } else if (i == 4) {
                if (f149800d == null) {
                    o7b0 o7b0Var4 = new o7b0("proxy_message", 1, 1, 60L, f149801e, new LinkedBlockingQueue(), new ThreadFactoryC19246c(i), new RejectedExecutionHandlerC19247d());
                    f149800d = o7b0Var4;
                    o7b0Var4.allowCoreThreadTimeOut(true);
                }
                m169868a(f149800d, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l.oyi0$d */
    public static class RejectedExecutionHandlerC19247d implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC19247d() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
