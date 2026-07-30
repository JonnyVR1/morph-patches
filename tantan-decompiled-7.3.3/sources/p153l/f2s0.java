package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.consent_sdk.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class f2s0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Activity f96914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e6s0 f96915b;

    public f2s0(e6s0 e6s0Var, Activity activity) {
        this.f96915b = e6s0Var;
        this.f96914a = activity;
    }

    /* JADX INFO: renamed from: b */
    public final void m123670b() {
        this.f96915b.f92344a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
        e6s0 e6s0Var = this.f96915b;
        if (e6s0Var.f92349f == null || !e6s0Var.f92355l) {
            return;
        }
        e6s0Var.f92349f.setOwnerActivity(activity);
        e6s0 e6s0Var2 = this.f96915b;
        if (e6s0Var2.f92345b != null) {
            e6s0Var2.f92345b.m106903a(activity);
        }
        f2s0 f2s0Var = (f2s0) this.f96915b.f92354k.getAndSet(null);
        if (f2s0Var != null) {
            f2s0Var.m123670b();
            e6s0 e6s0Var3 = this.f96915b;
            f2s0 f2s0Var2 = new f2s0(e6s0Var3, activity);
            e6s0Var3.f92344a.registerActivityLifecycleCallbacks(f2s0Var2);
            this.f96915b.f92354k.set(f2s0Var2);
        }
        e6s0 e6s0Var4 = this.f96915b;
        if (e6s0Var4.f92349f != null) {
            e6s0Var4.f92349f.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f96914a) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            e6s0 e6s0Var = this.f96915b;
            if (e6s0Var.f92355l && e6s0Var.f92349f != null) {
                e6s0Var.f92349f.dismiss();
                return;
            }
        }
        this.f96915b.m119676i(new zzg(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
