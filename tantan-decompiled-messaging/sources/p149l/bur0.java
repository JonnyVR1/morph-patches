package p149l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class bur0 implements cur0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f77366a;

    public bur0(dur0 dur0Var, Activity activity) {
        this.f77366a = activity;
    }

    @Override // p149l.cur0
    /* JADX INFO: renamed from: a */
    public final void mo99037a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f77366a);
    }
}
