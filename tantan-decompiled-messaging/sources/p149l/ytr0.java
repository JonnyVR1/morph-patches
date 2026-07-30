package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class ytr0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f200011a;

    public ytr0(dur0 dur0Var, Activity activity) {
        this.f200011a = activity;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f200011a);
    }
}
