package p006l;

import android.app.Activity;
import android.os.SystemClock;
import com.p1.mobile.android.rx.rxthread.ThreadMonitorManager;
import l.sy0;
import l.w8i0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class woi0 implements sy0.a {

    /* JADX INFO: renamed from: a */
    public long f25267a;

    /* JADX INFO: renamed from: b */
    public void m26557b(boolean z) {
        if (!z) {
            this.f25267a = SystemClock.elapsedRealtime();
        } else {
            if (this.f25267a == 0 || SystemClock.elapsedRealtime() - this.f25267a <= 300000) {
                return;
            }
            ThreadMonitorManager.b().h(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m26560e() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadMonitorManager.b().g(true).i(200L).f(w8i0.i().h(iAvailableProcessors * 2, iAvailableProcessors * 3, 15L, Math.max(iAvailableProcessors * 6, 20), true));
    }

    /* JADX INFO: renamed from: a */
    public void m26556a(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    public void m26558c(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    public void m26559d(Activity activity) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
