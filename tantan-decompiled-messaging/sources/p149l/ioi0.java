package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class ioi0 {

    /* JADX INFO: renamed from: a */
    private static Handler f114165a = null;

    /* JADX INFO: renamed from: b */
    private static HandlerThread f114166b = null;

    /* JADX INFO: renamed from: c */
    private static ExecutorService f114167c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f114168d = false;

    /* JADX INFO: renamed from: e */
    private static Runnable f114169e = new RunnableC17589a();

    /* JADX INFO: renamed from: l.ioi0$a */
    public class RunnableC17589a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            List<Runnable> listShutdownNow;
            ExecutorService executorService = ioi0.f114167c;
            if (executorService != null && (listShutdownNow = executorService.shutdownNow()) != null && listShutdownNow.size() > 0) {
                String.valueOf(listShutdownNow.size());
            }
            ExecutorService unused = ioi0.f114167c = null;
            bvk.m104047d(ioi0.f114166b);
            HandlerThread unused2 = ioi0.f114166b = null;
            Handler unused3 = ioi0.f114165a = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static ExecutorService m137340f() {
        if (f114167c == null) {
            synchronized (ioi0.class) {
                try {
                    if (f114167c == null) {
                        f114167c = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f114167c;
    }

    /* JADX INFO: renamed from: g */
    private static Handler m137341g() {
        if (f114165a == null) {
            synchronized (ioi0.class) {
                try {
                    if (f114165a == null) {
                        f114166b = bvk.m104046c("SingleThreadControl");
                        f114165a = new Handler(f114166b.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f114165a;
    }

    /* JADX INFO: renamed from: h */
    public static void m137342h(Runnable runnable) {
        m137344j();
        if (runnable != null) {
            ExecutorService executorServiceM137340f = m137340f();
            if (executorServiceM137340f == null || executorServiceM137340f.isShutdown()) {
                m137343i(runnable);
            } else {
                executorServiceM137340f.execute(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m137343i(Runnable runnable) {
        m137344j();
        if (runnable != null) {
            Handler handlerM137341g = m137341g();
            if (handlerM137341g != null) {
                handlerM137341g.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m137344j() {
        Handler handlerM137341g = m137341g();
        if (handlerM137341g != null) {
            handlerM137341g.removeCallbacks(f114169e);
            if (f114168d) {
                return;
            }
            handlerM137341g.postDelayed(f114169e, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
        }
    }
}
