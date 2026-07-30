package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class wxr0 implements myr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f188510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f188511b;

    public wxr0(nyr0 nyr0Var, Activity activity, Bundle bundle) {
        this.f188510a = activity;
        this.f188511b = bundle;
    }

    @Override // p149l.myr0
    /* JADX INFO: renamed from: a */
    public final void mo99582a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f188510a, this.f188511b);
    }
}
