package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lmg0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: e */
    public static final String f132690e = "SudGIP ".concat(lmg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public int f132691a = 1;

    /* JADX INFO: renamed from: b */
    public final ArrayList f132692b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f132693c;

    /* JADX INFO: renamed from: d */
    public Activity f132694d;

    /* JADX INFO: renamed from: a */
    public final void m154862a(Application application) {
        if (this.f132693c) {
            return;
        }
        this.f132693c = true;
        Activity activityM116093b = djg0.m116093b();
        if (activityM116093b != null) {
            this.f132694d = activityM116093b;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        SudLogger.m222811d(f132690e, "onActivityCreated:" + activity);
        LogUtils.file("SudActivityManager", "onActivityCreated:" + activity);
        this.f132694d = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        SudLogger.m222811d(f132690e, "onActivityDestroyed:" + activity);
        LogUtils.file("SudActivityManager", "onActivityDestroyed:" + activity);
        if (this.f132694d == activity) {
            this.f132694d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SudLogger.m222811d(f132690e, "onActivityPaused:" + activity);
        LogUtils.file("SudActivityManager", "onActivityPaused:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        SudLogger.m222811d(f132690e, "onActivityResumed:" + activity);
        LogUtils.file("SudActivityManager", "onActivityResumed:" + activity);
        this.f132694d = activity;
        if (this.f132691a != 3) {
            this.f132691a = 3;
            Iterator it = this.f132692b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        SudLogger.m222811d(f132690e, "onActivitySaveInstanceState:" + activity);
        LogUtils.file("SudActivityManager", "onActivitySaveInstanceState:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        SudLogger.m222811d(f132690e, "onActivityStarted:" + activity);
        LogUtils.file("SudActivityManager", "onActivityStarted:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        SudLogger.m222811d(f132690e, "onActivityStopped:" + activity);
        LogUtils.file("SudActivityManager", "onActivityStopped:" + activity);
        Activity activity2 = this.f132694d;
        if (activity2 == null || activity2 != activity || this.f132691a == 2) {
            return;
        }
        this.f132691a = 2;
        Iterator it = this.f132692b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
