package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class c7s0 implements s7s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f80139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f80140b;

    public c7s0(t7s0 t7s0Var, Activity activity, Bundle bundle) {
        this.f80139a = activity;
        this.f80140b = bundle;
    }

    @Override // p153l.s7s0
    /* JADX INFO: renamed from: a */
    public final void mo108326a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f80139a, this.f80140b);
    }
}
