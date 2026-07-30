package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
class ry0 {
    /* JADX INFO: renamed from: c */
    public static void m181656c(Application application) {
        application.registerActivityLifecycleCallbacks(new C19813a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m181657d() {
        hxv.m133419e().m133425i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m181658e() {
        hxv.m133419e().m133424h();
    }

    /* JADX INFO: renamed from: l.ry0$a */
    public class C19813a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        private int f161530a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            int i = this.f161530a + 1;
            this.f161530a = i;
            if (i == 1) {
                ry0.m181658e();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            int i = this.f161530a - 1;
            this.f161530a = i;
            if (i == 0) {
                ry0.m181657d();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
