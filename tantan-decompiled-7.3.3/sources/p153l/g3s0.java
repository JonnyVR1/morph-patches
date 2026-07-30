package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class g3s0 implements i3s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f102019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f102020b;

    public g3s0(j3s0 j3s0Var, Activity activity, Bundle bundle) {
        this.f102019a = activity;
        this.f102020b = bundle;
    }

    @Override // p153l.i3s0
    /* JADX INFO: renamed from: a */
    public final void mo102358a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f102019a, this.f102020b);
    }
}
