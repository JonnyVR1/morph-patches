package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.consent_sdk.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class zsr0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Activity f204636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ywr0 f204637b;

    public zsr0(ywr0 ywr0Var, Activity activity) {
        this.f204637b = ywr0Var;
        this.f204636a = activity;
    }

    /* JADX INFO: renamed from: b */
    public final void m220080b() {
        this.f204637b.f200525a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
        ywr0 ywr0Var = this.f204637b;
        if (ywr0Var.f200530f == null || !ywr0Var.f200536l) {
            return;
        }
        ywr0Var.f200530f.setOwnerActivity(activity);
        ywr0 ywr0Var2 = this.f204637b;
        if (ywr0Var2.f200526b != null) {
            ywr0Var2.f200526b.m199052a(activity);
        }
        zsr0 zsr0Var = (zsr0) this.f204637b.f200535k.getAndSet(null);
        if (zsr0Var != null) {
            zsr0Var.m220080b();
            ywr0 ywr0Var3 = this.f204637b;
            zsr0 zsr0Var2 = new zsr0(ywr0Var3, activity);
            ywr0Var3.f200525a.registerActivityLifecycleCallbacks(zsr0Var2);
            this.f204637b.f200535k.set(zsr0Var2);
        }
        ywr0 ywr0Var4 = this.f204637b;
        if (ywr0Var4.f200530f != null) {
            ywr0Var4.f200530f.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f204636a) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            ywr0 ywr0Var = this.f204637b;
            if (ywr0Var.f200536l && ywr0Var.f200530f != null) {
                ywr0Var.f200530f.dismiss();
                return;
            }
        }
        this.f204637b.m216419i(new zzg(3, "Activity is destroyed."));
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
