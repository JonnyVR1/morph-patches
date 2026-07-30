package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
class yy0 {
    /* JADX INFO: renamed from: c */
    public static void m217919c(Application application) {
        application.registerActivityLifecycleCallbacks(new C21720a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m217920d() {
        gzv.m133125e().m133131i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m217921e() {
        gzv.m133125e().m133130h();
    }

    /* JADX INFO: renamed from: l.yy0$a */
    public class C21720a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        private int f202071a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            int i = this.f202071a + 1;
            this.f202071a = i;
            if (i == 1) {
                yy0.m217921e();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            int i = this.f202071a - 1;
            this.f202071a = i;
            if (i == 0) {
                yy0.m217920d();
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
