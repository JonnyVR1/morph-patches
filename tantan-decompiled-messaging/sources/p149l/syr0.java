package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class syr0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Activity f166979a;

    /* JADX INFO: renamed from: b */
    public Context f166980b;

    /* JADX INFO: renamed from: h */
    public Runnable f166986h;

    /* JADX INFO: renamed from: j */
    public long f166988j;

    /* JADX INFO: renamed from: c */
    public final Object f166981c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f166982d = true;

    /* JADX INFO: renamed from: e */
    public boolean f166983e = false;

    /* JADX INFO: renamed from: f */
    public final List f166984f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final List f166985g = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f166987i = false;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m186722a() {
        return this.f166979a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Context m186723b() {
        return this.f166980b;
    }

    /* JADX INFO: renamed from: f */
    public final void m186724f(tyr0 tyr0Var) {
        synchronized (this.f166981c) {
            this.f166984f.add(tyr0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m186725g(Application application, Context context) {
        if (this.f166987i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m186727k((Activity) context);
        }
        this.f166980b = application;
        this.f166988j = ((Long) d1s0.m109677c().m144697a(m7s0.f132061S0)).longValue();
        this.f166987i = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m186726h(tyr0 tyr0Var) {
        synchronized (this.f166981c) {
            this.f166984f.remove(tyr0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m186727k(Activity activity) {
        synchronized (this.f166981c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f166979a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f166981c) {
            try {
                Activity activity2 = this.f166979a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f166979a = null;
                }
                Iterator it = this.f166985g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((hzr0) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        vny0.m199079q().m212290w(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        x2t0.m206867e("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m186727k(activity);
        synchronized (this.f166981c) {
            Iterator it = this.f166985g.iterator();
            while (it.hasNext()) {
                try {
                    ((hzr0) it.next()).zzb();
                } catch (Exception e) {
                    vny0.m199079q().m212290w(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    x2t0.m206867e("", e);
                }
            }
        }
        this.f166983e = true;
        Runnable runnable = this.f166986h;
        if (runnable != null) {
            C2075b.f9714l.removeCallbacks(runnable);
        }
        obw0 obw0Var = C2075b.f9714l;
        ryr0 ryr0Var = new ryr0(this);
        this.f166986h = ryr0Var;
        obw0Var.postDelayed(ryr0Var, this.f166988j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m186727k(activity);
        this.f166983e = false;
        boolean z = this.f166982d;
        this.f166982d = true;
        Runnable runnable = this.f166986h;
        if (runnable != null) {
            C2075b.f9714l.removeCallbacks(runnable);
        }
        synchronized (this.f166981c) {
            Iterator it = this.f166985g.iterator();
            while (it.hasNext()) {
                try {
                    ((hzr0) it.next()).zzc();
                } catch (Exception e) {
                    vny0.m199079q().m212290w(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    x2t0.m206867e("", e);
                }
            }
            if (z) {
                x2t0.m206864b("App is still foreground.");
            } else {
                Iterator it2 = this.f166984f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((tyr0) it2.next()).mo104920a(true);
                    } catch (Exception e2) {
                        x2t0.m206867e("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m186727k(activity);
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
