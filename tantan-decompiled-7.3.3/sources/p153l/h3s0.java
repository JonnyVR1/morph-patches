package p153l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class h3s0 implements i3s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f107685a;

    public h3s0(j3s0 j3s0Var, Activity activity) {
        this.f107685a = activity;
    }

    @Override // p153l.i3s0
    /* JADX INFO: renamed from: a */
    public final void mo102358a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f107685a);
    }
}
