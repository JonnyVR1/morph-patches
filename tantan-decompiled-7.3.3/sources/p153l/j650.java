package p153l;

import android.app.Activity;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class j650 implements zy0.InterfaceC21927a {

    /* JADX INFO: renamed from: a */
    public rg50 f118522a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f118523b;

    /* JADX INFO: renamed from: c */
    public long f118524c;

    public j650(rg50 rg50Var) {
        this.f118522a = rg50Var;
        zy0.m222096c().m222103h(this);
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: b */
    public void mo82236b(boolean z) {
        if (!z) {
            this.f118524c = SystemClock.elapsedRealtime();
        } else if (this.f118524c != 0) {
            this.f118523b = SystemClock.elapsedRealtime() - this.f118524c > Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        }
    }

    /* JADX INFO: renamed from: e */
    public rg50 m143603e() {
        if (this.f118523b) {
            synchronized (this) {
                try {
                    if (this.f118523b) {
                        this.f118522a = this.f118522a.m181359v().m181369g(new lx5()).m181365c();
                        this.f118523b = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f118522a;
    }

    /* JADX INFO: renamed from: f */
    public void m143604f(xq4 xq4Var) {
        synchronized (this) {
            this.f118522a = this.f118522a.m181359v().m181367e(xq4Var).m181369g(new lx5()).m181365c();
            this.f118523b = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m143605g(boolean z) {
        this.f118523b = z;
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
