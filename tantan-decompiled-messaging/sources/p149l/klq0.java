package p149l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class klq0 {

    /* JADX INFO: renamed from: d */
    private static long f123684d;

    /* JADX INFO: renamed from: a */
    private final biq0 f123685a;

    /* JADX INFO: renamed from: b */
    private boolean f123686b = false;

    /* JADX INFO: renamed from: c */
    private final Runnable f123687c;

    /* JADX INFO: renamed from: l.klq0$a */
    public class RunnableC18044a implements Runnable {
        public RunnableC18044a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (klq0.this.f123686b) {
                return;
            }
            klq0.this.f123685a.m102110s();
            long unused = klq0.f123684d = SystemClock.uptimeMillis();
            wvq0.m205758b().m151993f(klq0.this.f123687c, 500L);
            elq0.m117153c(klq0.f123684d);
        }
    }

    public klq0(biq0 biq0Var) {
        RunnableC18044a runnableC18044a = new RunnableC18044a();
        this.f123687c = runnableC18044a;
        this.f123685a = biq0Var;
        wvq0.m205758b().m151993f(runnableC18044a, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: b */
    public void m146436b() {
        if (this.f123686b) {
            return;
        }
        wvq0.m205758b().m151993f(this.f123687c, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }
}
