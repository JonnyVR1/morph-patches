package p149l;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class auc0 {

    /* JADX INFO: renamed from: l.auc0$a */
    public static class ThreadFactoryC15722a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f71743a;

        /* JADX INFO: renamed from: b */
        public int f71744b;

        /* JADX INFO: renamed from: l.auc0$a$a */
        public static class a extends Thread {

            /* JADX INFO: renamed from: a */
            public final int f71745a;

            public a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f71745a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f71745a);
                super.run();
            }
        }

        public ThreadFactoryC15722a(@NonNull String str, int i) {
            this.f71743a = str;
            this.f71744b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.f71743a, this.f71744b);
        }
    }

    /* JADX INFO: renamed from: l.auc0$b */
    public static class RunnableC15723b<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        @NonNull
        public Callable<T> f71746a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public wz5<T> f71747b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public Handler f71748c;

        /* JADX INFO: renamed from: l.auc0$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ wz5 f71749a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f71750b;

            public a(wz5 wz5Var, Object obj) {
                this.f71749a = wz5Var;
                this.f71750b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f71749a.accept(this.f71750b);
            }
        }

        public RunnableC15723b(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull wz5<T> wz5Var) {
            this.f71746a = callable;
            this.f71747b = wz5Var;
            this.f71748c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f71746a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f71748c.post(new a(this.f71747b, tCall));
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m98964a(@NonNull String str, int i, @IntRange(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC15722a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m98965b(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull wz5<T> wz5Var) {
        executor.execute(new RunnableC15723b(e84.m115238a(), callable, wz5Var));
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m98966c(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @IntRange(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            aag0.m95543a(e2);
            return null;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
