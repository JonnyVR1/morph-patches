package p153l;

import android.app.Activity;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p052rx.rxthread.ThreadMonitorManager;

/* JADX INFO: loaded from: classes9.dex */
public class yxi0 implements zy0.InterfaceC21927a {

    /* JADX INFO: renamed from: a */
    public long f201977a;

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: b */
    public void mo82236b(boolean z) {
        if (!z) {
            this.f201977a = SystemClock.elapsedRealtime();
        } else {
            if (this.f201977a == 0 || SystemClock.elapsedRealtime() - this.f201977a <= Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                return;
            }
            ThreadMonitorManager.m21801b().m21808h(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m217718e() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadMonitorManager.m21801b().m21807g(true).m21809i(200L).m21806f(whi0.m206362i().m206363h(iAvailableProcessors * 2, iAvailableProcessors * 3, 15L, Math.max(iAvailableProcessors * 6, 20), true));
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: a */
    public void mo82235a(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: c */
    public void mo82237c(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: d */
    public void mo82238d(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStopped(Activity activity) {
    }
}
