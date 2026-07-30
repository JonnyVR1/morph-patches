package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class q7s0 implements s7s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f156000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f156001b;

    public q7s0(t7s0 t7s0Var, Activity activity, Bundle bundle) {
        this.f156000a = activity;
        this.f156001b = bundle;
    }

    @Override // p153l.s7s0
    /* JADX INFO: renamed from: a */
    public final void mo108326a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f156000a, this.f156001b);
    }
}
