package p153l;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class vfw0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public boolean f183982a;

    /* JADX INFO: renamed from: b */
    public boolean f183983b;

    /* JADX INFO: renamed from: c */
    public ufw0 f183984c;

    /* JADX INFO: renamed from: a */
    public final void m201190a(boolean z) {
        if (this.f183983b != z) {
            this.f183983b = z;
            if (this.f183982a) {
                mo185675b(z);
                ufw0 ufw0Var = this.f183984c;
                if (ufw0Var != null) {
                    ufw0Var.mo120811a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo185676c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m201191d(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m201192e(ufw0 ufw0Var) {
        this.f183984c = ufw0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m201193f() {
        this.f183982a = true;
        boolean zM201195h = m201195h();
        this.f183983b = zM201195h;
        mo185675b(zM201195h);
    }

    /* JADX INFO: renamed from: g */
    public final void m201194g() {
        this.f183982a = false;
        this.f183984c = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m201195h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || mo185676c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m201190a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m201190a(m201195h());
    }

    /* JADX INFO: renamed from: b */
    public void mo185675b(boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
