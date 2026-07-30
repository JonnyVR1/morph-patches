package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public abstract class wbr implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    protected boolean f185610a = true;

    /* JADX INFO: renamed from: b */
    protected long f185611b = 0;

    /* JADX INFO: renamed from: c */
    private boolean m202580c(Activity activity) {
        return activity == mo80970a();
    }

    /* JADX INFO: renamed from: a */
    public abstract Activity mo80970a();

    /* JADX INFO: renamed from: b */
    public abstract void mo80971b();

    /* JADX INFO: renamed from: d */
    public void m202581d(boolean z) {
        Activity activityMo80970a = mo80970a();
        if (activityMo80970a != null) {
            activityMo80970a.getApplication().unregisterActivityLifecycleCallbacks(this);
            if (z) {
                activityMo80970a.getApplication().registerActivityLifecycleCallbacks(this);
                this.f185610a = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo80972e();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (m202580c(activity)) {
            mo80972e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (m202580c(activity)) {
            this.f185610a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (m202580c(activity)) {
            this.f185610a = true;
            this.f185611b = xsi0.m210767h();
            mo80971b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
