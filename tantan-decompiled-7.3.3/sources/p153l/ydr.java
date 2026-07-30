package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ydr implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    protected boolean f198623a = true;

    /* JADX INFO: renamed from: b */
    protected long f198624b = 0;

    /* JADX INFO: renamed from: c */
    private boolean m215276c(Activity activity) {
        return activity == mo82153a();
    }

    /* JADX INFO: renamed from: a */
    public abstract Activity mo82153a();

    /* JADX INFO: renamed from: b */
    public abstract void mo82154b();

    /* JADX INFO: renamed from: d */
    public void m215277d(boolean z) {
        Activity activityMo82153a = mo82153a();
        if (activityMo82153a != null) {
            activityMo82153a.getApplication().unregisterActivityLifecycleCallbacks(this);
            if (z) {
                activityMo82153a.getApplication().registerActivityLifecycleCallbacks(this);
                this.f198623a = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo82155e();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (m215276c(activity)) {
            mo82155e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (m215276c(activity)) {
            this.f198623a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (m215276c(activity)) {
            this.f198623a = true;
            this.f198624b = a2j0.m95705h();
            mo82154b();
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
