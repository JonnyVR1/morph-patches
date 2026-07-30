package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b50 {

    /* JADX INFO: renamed from: a */
    public static boolean f75008a = false;

    /* JADX INFO: renamed from: b */
    private static String f75009b;

    /* JADX INFO: renamed from: c */
    private static final Application.ActivityLifecycleCallbacks f75010c = new C15928a();

    /* JADX INFO: renamed from: b */
    public static void m102546b(Application application) {
        m102547c(application, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m102547c(Application application, String str) {
        if (application == null) {
            Logger.m5923i("Application instance is null/system API is too old");
            return;
        }
        if (f75008a) {
            Logger.m5927v("Lifecycle callbacks have already been registered");
            return;
        }
        f75009b = str;
        f75008a = true;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f75010c;
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        Logger.m5923i("Activity Lifecycle Callback successfully registered");
    }

    /* JADX INFO: renamed from: l.b50$a */
    public class C15928a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
            CleverTapAPI.m5818a0(activity, b50.f75009b);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            CleverTapAPI.m5819b0();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            CleverTapAPI.m5821c0(activity, b50.f75009b);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
