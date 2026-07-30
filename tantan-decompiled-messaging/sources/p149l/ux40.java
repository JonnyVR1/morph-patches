package p149l;

import android.app.Activity;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class ux40 implements sy0.InterfaceC20069a {

    /* JADX INFO: renamed from: a */
    public k850 f178702a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f178703b;

    /* JADX INFO: renamed from: c */
    public long f178704c;

    public ux40(k850 k850Var) {
        this.f178702a = k850Var;
        sy0.m186556c().m186563h(this);
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: b */
    public void mo81053b(boolean z) {
        if (!z) {
            this.f178704c = SystemClock.elapsedRealtime();
        } else if (this.f178704c != 0) {
            this.f178703b = SystemClock.elapsedRealtime() - this.f178704c > Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        }
    }

    /* JADX INFO: renamed from: e */
    public k850 m196146e() {
        if (this.f178703b) {
            synchronized (this) {
                try {
                    if (this.f178703b) {
                        this.f178702a = this.f178702a.m144867v().m144886g(new gw5()).m144882c();
                        this.f178703b = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f178702a;
    }

    /* JADX INFO: renamed from: f */
    public void m196147f(yp4 yp4Var) {
        synchronized (this) {
            this.f178702a = this.f178702a.m144867v().m144884e(yp4Var).m144886g(new gw5()).m144882c();
            this.f178703b = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m196148g(boolean z) {
        this.f178703b = z;
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
