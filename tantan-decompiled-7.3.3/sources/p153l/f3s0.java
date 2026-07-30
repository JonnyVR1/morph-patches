package p153l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class f3s0 implements i3s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f97008a;

    public f3s0(j3s0 j3s0Var, Activity activity) {
        this.f97008a = activity;
    }

    @Override // p153l.i3s0
    /* JADX INFO: renamed from: a */
    public final void mo102358a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f97008a);
    }
}
