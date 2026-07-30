package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class dur0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f88009a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f88010b;

    /* JADX INFO: renamed from: c */
    public boolean f88011c = false;

    public dur0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f88010b = new WeakReference(activityLifecycleCallbacks);
        this.f88009a = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m113746a(cur0 cur0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f88010b.get();
            if (activityLifecycleCallbacks != null) {
                cur0Var.mo99037a(activityLifecycleCallbacks);
            } else {
                if (this.f88011c) {
                    return;
                }
                this.f88009a.unregisterActivityLifecycleCallbacks(this);
                this.f88011c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m113746a(new vtr0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m113746a(new bur0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m113746a(new ytr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m113746a(new xtr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m113746a(new aur0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m113746a(new wtr0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m113746a(new ztr0(this, activity));
    }
}
