package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class wtr0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f188050a;

    public wtr0(dur0 dur0Var, Activity activity) {
        this.f188050a = activity;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f188050a);
    }
}
