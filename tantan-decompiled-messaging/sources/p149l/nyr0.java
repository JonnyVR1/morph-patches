package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class nyr0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f141151a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f141152b;

    /* JADX INFO: renamed from: c */
    public boolean f141153c = false;

    public nyr0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f141152b = new WeakReference(activityLifecycleCallbacks);
        this.f141151a = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m162031a(myr0 myr0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f141152b.get();
            if (activityLifecycleCallbacks != null) {
                myr0Var.mo99582a(activityLifecycleCallbacks);
            } else {
                if (this.f141153c) {
                    return;
                }
                this.f141151a.unregisterActivityLifecycleCallbacks(this);
                this.f141153c = true;
            }
        } catch (Exception e) {
            x2t0.m206867e("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m162031a(new wxr0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m162031a(new lyr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m162031a(new zxr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m162031a(new yxr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m162031a(new kyr0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m162031a(new xxr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m162031a(new ayr0(this, activity));
    }
}
