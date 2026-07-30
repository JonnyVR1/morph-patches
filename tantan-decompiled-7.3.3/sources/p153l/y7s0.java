package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y7s0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Activity f197820a;

    /* JADX INFO: renamed from: b */
    public Context f197821b;

    /* JADX INFO: renamed from: h */
    public Runnable f197827h;

    /* JADX INFO: renamed from: j */
    public long f197829j;

    /* JADX INFO: renamed from: c */
    public final Object f197822c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f197823d = true;

    /* JADX INFO: renamed from: e */
    public boolean f197824e = false;

    /* JADX INFO: renamed from: f */
    public final List f197825f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final List f197826g = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f197828i = false;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m214598a() {
        return this.f197820a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Context m214599b() {
        return this.f197821b;
    }

    /* JADX INFO: renamed from: f */
    public final void m214600f(z7s0 z7s0Var) {
        synchronized (this.f197822c) {
            this.f197825f.add(z7s0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m214601g(Application application, Context context) {
        if (this.f197828i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m214603k((Activity) context);
        }
        this.f197821b = application;
        this.f197829j = ((Long) jas0.m144075c().m176505a(sgs0.f168132S0)).longValue();
        this.f197828i = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m214602h(z7s0 z7s0Var) {
        synchronized (this.f197822c) {
            this.f197825f.remove(z7s0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m214603k(Activity activity) {
        synchronized (this.f197822c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f197820a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f197822c) {
            try {
                Activity activity2 = this.f197820a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f197820a = null;
                }
                Iterator it = this.f197826g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((n8s0) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        bxy0.m106933q().m120275w(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        dct0.m115296e("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m214603k(activity);
        synchronized (this.f197822c) {
            Iterator it = this.f197826g.iterator();
            while (it.hasNext()) {
                try {
                    ((n8s0) it.next()).zzb();
                } catch (Exception e) {
                    bxy0.m106933q().m120275w(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    dct0.m115296e("", e);
                }
            }
        }
        this.f197824e = true;
        Runnable runnable = this.f197827h;
        if (runnable != null) {
            C2098b.f9751l.removeCallbacks(runnable);
        }
        ukw0 ukw0Var = C2098b.f9751l;
        x7s0 x7s0Var = new x7s0(this);
        this.f197827h = x7s0Var;
        ukw0Var.postDelayed(x7s0Var, this.f197829j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m214603k(activity);
        this.f197824e = false;
        boolean z = this.f197823d;
        this.f197823d = true;
        Runnable runnable = this.f197827h;
        if (runnable != null) {
            C2098b.f9751l.removeCallbacks(runnable);
        }
        synchronized (this.f197822c) {
            Iterator it = this.f197826g.iterator();
            while (it.hasNext()) {
                try {
                    ((n8s0) it.next()).zzc();
                } catch (Exception e) {
                    bxy0.m106933q().m120275w(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    dct0.m115296e("", e);
                }
            }
            if (z) {
                dct0.m115293b("App is still foreground.");
            } else {
                Iterator it2 = this.f197825f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((z7s0) it2.next()).mo120216a(true);
                    } catch (Exception e2) {
                        dct0.m115296e("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m214603k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
