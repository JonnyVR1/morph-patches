package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class b3s0 implements i3s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f74812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f74813b;

    public b3s0(j3s0 j3s0Var, Activity activity, Bundle bundle) {
        this.f74812a = activity;
        this.f74813b = bundle;
    }

    @Override // p153l.i3s0
    /* JADX INFO: renamed from: a */
    public final void mo102358a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f74812a, this.f74813b);
    }
}
