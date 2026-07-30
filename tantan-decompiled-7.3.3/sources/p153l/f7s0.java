package p153l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class f7s0 implements s7s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f97596a;

    public f7s0(t7s0 t7s0Var, Activity activity) {
        this.f97596a = activity;
    }

    @Override // p153l.s7s0
    /* JADX INFO: renamed from: a */
    public final void mo108326a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f97596a);
    }
}
