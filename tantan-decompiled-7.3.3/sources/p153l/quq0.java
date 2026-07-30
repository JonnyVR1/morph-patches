package p153l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class quq0 {

    /* JADX INFO: renamed from: d */
    private static long f159608d;

    /* JADX INFO: renamed from: a */
    private final grq0 f159609a;

    /* JADX INFO: renamed from: b */
    private boolean f159610b = false;

    /* JADX INFO: renamed from: c */
    private final Runnable f159611c;

    /* JADX INFO: renamed from: l.quq0$a */
    public class RunnableC19678a implements Runnable {
        public RunnableC19678a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (quq0.this.f159610b) {
                return;
            }
            quq0.this.f159609a.m131855s();
            long unused = quq0.f159608d = SystemClock.uptimeMillis();
            c5r0.m108080b().m179946f(quq0.this.f159611c, 500L);
            kuq0.m151621c(quq0.f159608d);
        }
    }

    public quq0(grq0 grq0Var) {
        RunnableC19678a runnableC19678a = new RunnableC19678a();
        this.f159611c = runnableC19678a;
        this.f159609a = grq0Var;
        c5r0.m108080b().m179946f(runnableC19678a, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: b */
    public void m178223b() {
        if (this.f159610b) {
            return;
        }
        c5r0.m108080b().m179946f(this.f159611c, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }
}
