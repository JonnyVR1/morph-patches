package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class ayr0 implements myr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f72305a;

    public ayr0(nyr0 nyr0Var, Activity activity) {
        this.f72305a = activity;
    }

    @Override // p149l.myr0
    /* JADX INFO: renamed from: a */
    public final void mo99582a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f72305a);
    }
}
