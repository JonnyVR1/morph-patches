package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class ztr0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f204752a;

    public ztr0(dur0 dur0Var, Activity activity) {
        this.f204752a = activity;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f204752a);
    }
}
