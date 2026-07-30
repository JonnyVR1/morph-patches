package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class deg0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: e */
    public static final String f85793e = "SudGIP ".concat(deg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public int f85794a = 1;

    /* JADX INFO: renamed from: b */
    public final ArrayList f85795b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f85796c;

    /* JADX INFO: renamed from: d */
    public Activity f85797d;

    /* JADX INFO: renamed from: a */
    public final void m111257a(Application application) {
        if (this.f85796c) {
            return;
        }
        this.f85796c = true;
        Activity activityM197629b = vag0.m197629b();
        if (activityM197629b != null) {
            this.f85797d = activityM197629b;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        SudLogger.m221565d(f85793e, "onActivityCreated:" + activity);
        LogUtils.file("SudActivityManager", "onActivityCreated:" + activity);
        this.f85797d = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        SudLogger.m221565d(f85793e, "onActivityDestroyed:" + activity);
        LogUtils.file("SudActivityManager", "onActivityDestroyed:" + activity);
        if (this.f85797d == activity) {
            this.f85797d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SudLogger.m221565d(f85793e, "onActivityPaused:" + activity);
        LogUtils.file("SudActivityManager", "onActivityPaused:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        SudLogger.m221565d(f85793e, "onActivityResumed:" + activity);
        LogUtils.file("SudActivityManager", "onActivityResumed:" + activity);
        this.f85797d = activity;
        if (this.f85794a != 3) {
            this.f85794a = 3;
            Iterator it = this.f85795b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        SudLogger.m221565d(f85793e, "onActivitySaveInstanceState:" + activity);
        LogUtils.file("SudActivityManager", "onActivitySaveInstanceState:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        SudLogger.m221565d(f85793e, "onActivityStarted:" + activity);
        LogUtils.file("SudActivityManager", "onActivityStarted:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        SudLogger.m221565d(f85793e, "onActivityStopped:" + activity);
        LogUtils.file("SudActivityManager", "onActivityStopped:" + activity);
        Activity activity2 = this.f85797d;
        if (activity2 == null || activity2 != activity || this.f85794a == 2) {
            return;
        }
        this.f85794a = 2;
        Iterator it = this.f85795b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
