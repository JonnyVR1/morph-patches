package p153l;

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
public class d2d0 {

    /* JADX INFO: renamed from: l.d2d0$a */
    public static class ThreadFactoryC16424a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f84769a;

        /* JADX INFO: renamed from: b */
        public int f84770b;

        /* JADX INFO: renamed from: l.d2d0$a$a */
        public static class a extends Thread {

            /* JADX INFO: renamed from: a */
            public final int f84771a;

            public a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f84771a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f84771a);
                super.run();
            }
        }

        public ThreadFactoryC16424a(@NonNull String str, int i) {
            this.f84769a = str;
            this.f84770b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.f84769a, this.f84770b);
        }
    }

    /* JADX INFO: renamed from: l.d2d0$b */
    public static class RunnableC16425b<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        @NonNull
        public Callable<T> f84772a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public b16<T> f84773b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public Handler f84774c;

        /* JADX INFO: renamed from: l.d2d0$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b16 f84775a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f84776b;

            public a(b16 b16Var, Object obj) {
                this.f84775a = b16Var;
                this.f84776b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f84775a.accept(this.f84776b);
            }
        }

        public RunnableC16425b(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull b16<T> b16Var) {
            this.f84772a = callable;
            this.f84773b = b16Var;
            this.f84774c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f84772a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f84774c.post(new a(this.f84773b, tCall));
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m113686a(@NonNull String str, int i, @IntRange(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC16424a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m113687b(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull b16<T> b16Var) {
        executor.execute(new RunnableC16425b(d94.m114994a(), callable, b16Var));
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m113688c(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @IntRange(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            iig0.m140070a(e2);
            return null;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
