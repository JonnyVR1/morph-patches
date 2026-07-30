package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class n21 {

    /* JADX INFO: renamed from: d */
    public static n21 f136755d;

    /* JADX INFO: renamed from: a */
    public final int f136756a = 1;

    /* JADX INFO: renamed from: b */
    public ExecutorService f136757b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18607a(), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* JADX INFO: renamed from: c */
    public Handler f136758c;

    /* JADX INFO: renamed from: l.n21$a */
    public class ThreadFactoryC18607a implements ThreadFactory {
        public ThreadFactoryC18607a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "beatles-thread");
            thread.setPriority(10);
            return thread;
        }
    }

    /* JADX INFO: renamed from: l.n21$b */
    public class RunnableC18608b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f136760a;

        public RunnableC18608b(Runnable runnable) {
            this.f136760a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            n21.this.f136757b.execute(this.f136760a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m157541b(Runnable runnable) {
        m157543g().m157544d(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m157542c(Runnable runnable, long j) {
        m157543g().m157545e(runnable, j);
    }

    /* JADX INFO: renamed from: g */
    public static n21 m157543g() {
        if (f136755d == null) {
            synchronized (n21.class) {
                try {
                    if (f136755d == null) {
                        f136755d = new n21();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136755d;
    }

    /* JADX INFO: renamed from: d */
    public final void m157544d(Runnable runnable) {
        this.f136757b.execute(runnable);
    }

    /* JADX INFO: renamed from: e */
    public final void m157545e(Runnable runnable, long j) {
        m157546f().postDelayed(new RunnableC18608b(runnable), j);
    }

    /* JADX INFO: renamed from: f */
    public final Handler m157546f() {
        Handler handler;
        synchronized (this) {
            try {
                if (this.f136758c == null) {
                    this.f136758c = new Handler(Looper.getMainLooper());
                }
                handler = this.f136758c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
