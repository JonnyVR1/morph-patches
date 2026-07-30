package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class lpi0 {

    /* JADX INFO: renamed from: a */
    public static kza0 f129217a;

    /* JADX INFO: renamed from: b */
    public static kza0 f129218b;

    /* JADX INFO: renamed from: c */
    public static kza0 f129219c;

    /* JADX INFO: renamed from: d */
    public static kza0 f129220d;

    /* JADX INFO: renamed from: e */
    public static final TimeUnit f129221e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.lpi0$b */
    public static class C18281b extends Thread {
        public C18281b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.lpi0$c */
    public static class ThreadFactoryC18282c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f129222a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        public int f129223b;

        public ThreadFactoryC18282c(int i) {
            this.f129223b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C18281b c18281b = new C18281b(runnable, "MMT" + this.f129223b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f129222a.getAndIncrement() + " #");
            int i = this.f129223b;
            if (i == 2 || i == 3) {
                c18281b.setPriority(10);
                return c18281b;
            }
            c18281b.setPriority(1);
            return c18281b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m150871a(kza0 kza0Var, Runnable runnable) {
        kza0Var.execute(runnable);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m150872b(int i, Runnable runnable) {
        try {
            if (i == 1) {
                if (f129217a == null) {
                    kza0 kza0Var = new kza0("proxy_inner", 2, 2, 60L, f129221e, new LinkedBlockingQueue(), new ThreadFactoryC18282c(i), new RejectedExecutionHandlerC18283d());
                    f129217a = kza0Var;
                    kza0Var.allowCoreThreadTimeOut(true);
                }
                m150871a(f129217a, runnable);
            } else if (i == 2) {
                if (f129219c == null) {
                    kza0 kza0Var2 = new kza0("proxy_net", 10, 10, 120L, f129221e, new LinkedBlockingQueue(), new ThreadFactoryC18282c(i), new RejectedExecutionHandlerC18283d());
                    f129219c = kza0Var2;
                    kza0Var2.allowCoreThreadTimeOut(true);
                }
                m150871a(f129219c, runnable);
            } else if (i == 3) {
                if (f129218b == null) {
                    kza0 kza0Var3 = new kza0("proxy_local", 3, 3, 60L, f129221e, new LinkedBlockingQueue(), new ThreadFactoryC18282c(i), new RejectedExecutionHandlerC18283d());
                    f129218b = kza0Var3;
                    kza0Var3.allowCoreThreadTimeOut(true);
                }
                m150871a(f129218b, runnable);
            } else if (i == 4) {
                if (f129220d == null) {
                    kza0 kza0Var4 = new kza0("proxy_message", 1, 1, 60L, f129221e, new LinkedBlockingQueue(), new ThreadFactoryC18282c(i), new RejectedExecutionHandlerC18283d());
                    f129220d = kza0Var4;
                    kza0Var4.allowCoreThreadTimeOut(true);
                }
                m150871a(f129220d, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l.lpi0$d */
    public static class RejectedExecutionHandlerC18283d implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC18283d() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
