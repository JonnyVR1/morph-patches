package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class j3s0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f118213a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f118214b;

    /* JADX INFO: renamed from: c */
    public boolean f118215c = false;

    public j3s0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f118214b = new WeakReference(activityLifecycleCallbacks);
        this.f118213a = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m143364a(i3s0 i3s0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f118214b.get();
            if (activityLifecycleCallbacks != null) {
                i3s0Var.mo102358a(activityLifecycleCallbacks);
            } else {
                if (this.f118215c) {
                    return;
                }
                this.f118213a.unregisterActivityLifecycleCallbacks(this);
                this.f118215c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m143364a(new b3s0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m143364a(new h3s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m143364a(new e3s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m143364a(new d3s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m143364a(new g3s0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m143364a(new c3s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m143364a(new f3s0(this, activity));
    }
}
