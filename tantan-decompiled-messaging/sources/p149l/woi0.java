package p149l;

import android.app.Activity;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p047rx.rxthread.ThreadMonitorManager;

/* JADX INFO: loaded from: classes9.dex */
public class woi0 implements sy0.InterfaceC20069a {

    /* JADX INFO: renamed from: a */
    public long f187430a;

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: b */
    public void mo81053b(boolean z) {
        if (!z) {
            this.f187430a = SystemClock.elapsedRealtime();
        } else {
            if (this.f187430a == 0 || SystemClock.elapsedRealtime() - this.f187430a <= Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                return;
            }
            ThreadMonitorManager.m20802b().m20809h(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m204818e() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadMonitorManager.m20802b().m20808g(true).m20810i(200L).m20807f(w8i0.m202177i().m202178h(iAvailableProcessors * 2, iAvailableProcessors * 3, 15L, Math.max(iAvailableProcessors * 6, 20), true));
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: a */
    public void mo81052a(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: c */
    public void mo81054c(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: d */
    public void mo81055d(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStopped(Activity activity) {
    }
}
