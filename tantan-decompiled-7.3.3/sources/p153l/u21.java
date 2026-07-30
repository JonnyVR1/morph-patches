package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class u21 {

    /* JADX INFO: renamed from: d */
    public static u21 f177166d;

    /* JADX INFO: renamed from: a */
    public final int f177167a = 1;

    /* JADX INFO: renamed from: b */
    public ExecutorService f177168b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20466a(), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* JADX INFO: renamed from: c */
    public Handler f177169c;

    /* JADX INFO: renamed from: l.u21$a */
    public class ThreadFactoryC20466a implements ThreadFactory {
        public ThreadFactoryC20466a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "beatles-thread");
            thread.setPriority(10);
            return thread;
        }
    }

    /* JADX INFO: renamed from: l.u21$b */
    public class RunnableC20467b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f177171a;

        public RunnableC20467b(Runnable runnable) {
            this.f177171a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            u21.this.f177168b.execute(this.f177171a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m194238b(Runnable runnable) {
        m194240g().m194241d(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m194239c(Runnable runnable, long j) {
        m194240g().m194242e(runnable, j);
    }

    /* JADX INFO: renamed from: g */
    public static u21 m194240g() {
        if (f177166d == null) {
            synchronized (u21.class) {
                try {
                    if (f177166d == null) {
                        f177166d = new u21();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f177166d;
    }

    /* JADX INFO: renamed from: d */
    public final void m194241d(Runnable runnable) {
        this.f177168b.execute(runnable);
    }

    /* JADX INFO: renamed from: e */
    public final void m194242e(Runnable runnable, long j) {
        m194243f().postDelayed(new RunnableC20467b(runnable), j);
    }

    /* JADX INFO: renamed from: f */
    public final Handler m194243f() {
        Handler handler;
        synchronized (this) {
            try {
                if (this.f177169c == null) {
                    this.f177169c = new Handler(Looper.getMainLooper());
                }
                handler = this.f177169c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
