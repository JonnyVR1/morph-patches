package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class jxi0 {

    /* JADX INFO: renamed from: a */
    private static Handler f123033a = null;

    /* JADX INFO: renamed from: b */
    private static HandlerThread f123034b = null;

    /* JADX INFO: renamed from: c */
    private static ExecutorService f123035c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f123036d = false;

    /* JADX INFO: renamed from: e */
    private static Runnable f123037e = new RunnableC18051a();

    /* JADX INFO: renamed from: l.jxi0$a */
    public class RunnableC18051a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            List<Runnable> listShutdownNow;
            ExecutorService executorService = jxi0.f123035c;
            if (executorService != null && (listShutdownNow = executorService.shutdownNow()) != null && listShutdownNow.size() > 0) {
                String.valueOf(listShutdownNow.size());
            }
            ExecutorService unused = jxi0.f123035c = null;
            rxk.m183549d(jxi0.f123034b);
            HandlerThread unused2 = jxi0.f123034b = null;
            Handler unused3 = jxi0.f123033a = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static ExecutorService m147351f() {
        if (f123035c == null) {
            synchronized (jxi0.class) {
                try {
                    if (f123035c == null) {
                        f123035c = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123035c;
    }

    /* JADX INFO: renamed from: g */
    private static Handler m147352g() {
        if (f123033a == null) {
            synchronized (jxi0.class) {
                try {
                    if (f123033a == null) {
                        f123034b = rxk.m183548c("SingleThreadControl");
                        f123033a = new Handler(f123034b.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123033a;
    }

    /* JADX INFO: renamed from: h */
    public static void m147353h(Runnable runnable) {
        m147355j();
        if (runnable != null) {
            ExecutorService executorServiceM147351f = m147351f();
            if (executorServiceM147351f == null || executorServiceM147351f.isShutdown()) {
                m147354i(runnable);
            } else {
                executorServiceM147351f.execute(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m147354i(Runnable runnable) {
        m147355j();
        if (runnable != null) {
            Handler handlerM147352g = m147352g();
            if (handlerM147352g != null) {
                handlerM147352g.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m147355j() {
        Handler handlerM147352g = m147352g();
        if (handlerM147352g != null) {
            handlerM147352g.removeCallbacks(f123037e);
            if (f123036d) {
                return;
            }
            handlerM147352g.postDelayed(f123037e, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
        }
    }
}
