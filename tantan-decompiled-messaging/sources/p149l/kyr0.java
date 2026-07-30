package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class kyr0 implements myr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f125331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f125332b;

    public kyr0(nyr0 nyr0Var, Activity activity, Bundle bundle) {
        this.f125331a = activity;
        this.f125332b = bundle;
    }

    @Override // p149l.myr0
    /* JADX INFO: renamed from: a */
    public final void mo99582a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f125331a, this.f125332b);
    }
}
