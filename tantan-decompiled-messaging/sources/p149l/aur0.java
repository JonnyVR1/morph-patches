package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class aur0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f71851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f71852b;

    public aur0(dur0 dur0Var, Activity activity, Bundle bundle) {
        this.f71851a = activity;
        this.f71852b = bundle;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f71851a, this.f71852b);
    }
}
