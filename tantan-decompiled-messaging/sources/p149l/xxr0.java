package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class xxr0 implements myr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f194908a;

    public xxr0(nyr0 nyr0Var, Activity activity) {
        this.f194908a = activity;
    }

    @Override // p149l.myr0
    /* JADX INFO: renamed from: a */
    public final void mo99582a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f194908a);
    }
}
