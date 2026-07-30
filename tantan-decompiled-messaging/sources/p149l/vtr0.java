package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class vtr0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f182999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f183000b;

    public vtr0(dur0 dur0Var, Activity activity, Bundle bundle) {
        this.f182999a = activity;
        this.f183000b = bundle;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f182999a, this.f183000b);
    }
}
