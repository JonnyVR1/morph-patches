package p149l;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class p6w0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public boolean f147452a;

    /* JADX INFO: renamed from: b */
    public boolean f147453b;

    /* JADX INFO: renamed from: c */
    public o6w0 f147454c;

    /* JADX INFO: renamed from: a */
    public final void m167693a(boolean z) {
        if (this.f147453b != z) {
            this.f147453b = z;
            if (this.f147452a) {
                mo153309b(z);
                o6w0 o6w0Var = this.f147454c;
                if (o6w0Var != null) {
                    o6w0Var.mo148783a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo153310c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m167694d(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m167695e(o6w0 o6w0Var) {
        this.f147454c = o6w0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m167696f() {
        this.f147452a = true;
        boolean zM167698h = m167698h();
        this.f147453b = zM167698h;
        mo153309b(zM167698h);
    }

    /* JADX INFO: renamed from: g */
    public final void m167697g() {
        this.f147452a = false;
        this.f147454c = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m167698h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || mo153310c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m167693a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m167693a(m167698h());
    }

    /* JADX INFO: renamed from: b */
    public void mo153309b(boolean z) {
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
