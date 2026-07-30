package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class t7s0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f172465a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f172466b;

    /* JADX INFO: renamed from: c */
    public boolean f172467c = false;

    public t7s0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f172466b = new WeakReference(activityLifecycleCallbacks);
        this.f172465a = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m189633a(s7s0 s7s0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f172466b.get();
            if (activityLifecycleCallbacks != null) {
                s7s0Var.mo108326a(activityLifecycleCallbacks);
            } else {
                if (this.f172467c) {
                    return;
                }
                this.f172465a.unregisterActivityLifecycleCallbacks(this);
                this.f172467c = true;
            }
        } catch (Exception e) {
            dct0.m115296e("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m189633a(new c7s0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m189633a(new r7s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m189633a(new f7s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m189633a(new e7s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m189633a(new q7s0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m189633a(new d7s0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m189633a(new g7s0(this, activity));
    }
}
