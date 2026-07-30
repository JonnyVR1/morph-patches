package p006l;

import android.app.Activity;
import android.os.SystemClock;
import l.gw5;
import l.k850;
import l.sy0;
import l.yp4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ux40 implements sy0.a {

    /* JADX INFO: renamed from: a */
    public k850 f23786a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f23787b;

    /* JADX INFO: renamed from: c */
    public long f23788c;

    public ux40(k850 k850Var) {
        this.f23786a = k850Var;
        sy0.c().h(this);
    }

    /* JADX INFO: renamed from: b */
    public void m25582b(boolean z) {
        if (!z) {
            this.f23788c = SystemClock.elapsedRealtime();
        } else if (this.f23788c != 0) {
            this.f23787b = SystemClock.elapsedRealtime() - this.f23788c > 300000;
        }
    }

    /* JADX INFO: renamed from: e */
    public k850 m25585e() {
        if (this.f23787b) {
            synchronized (this) {
                try {
                    if (this.f23787b) {
                        this.f23786a = this.f23786a.v().g(new gw5()).c();
                        this.f23787b = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f23786a;
    }

    /* JADX INFO: renamed from: f */
    public void m25586f(yp4 yp4Var) {
        synchronized (this) {
            this.f23786a = this.f23786a.v().e(yp4Var).g(new gw5()).c();
            this.f23787b = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m25587g(boolean z) {
        this.f23787b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m25581a(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    public void m25583c(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    public void m25584d(Activity activity) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
