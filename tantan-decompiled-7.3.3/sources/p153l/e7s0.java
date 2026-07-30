package p153l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class e7s0 implements s7s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f92463a;

    public e7s0(t7s0 t7s0Var, Activity activity) {
        this.f92463a = activity;
    }

    @Override // p153l.s7s0
    /* JADX INFO: renamed from: a */
    public final void mo108326a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f92463a);
    }
}
