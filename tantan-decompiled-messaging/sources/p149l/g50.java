package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class g50 {

    /* JADX INFO: renamed from: a */
    public static boolean f100597a = false;

    /* JADX INFO: renamed from: b */
    private static String f100598b;

    /* JADX INFO: renamed from: c */
    private static final Application.ActivityLifecycleCallbacks f100599c = new C16998a();

    /* JADX INFO: renamed from: b */
    public static void m124432b(Application application) {
        m124433c(application, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m124433c(Application application, String str) {
        if (application == null) {
            Logger.m5869i("Application instance is null/system API is too old");
            return;
        }
        if (f100597a) {
            Logger.m5873v("Lifecycle callbacks have already been registered");
            return;
        }
        f100598b = str;
        f100597a = true;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f100599c;
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        Logger.m5869i("Activity Lifecycle Callback successfully registered");
    }

    /* JADX INFO: renamed from: l.g50$a */
    public class C16998a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
            CleverTapAPI.m5764a0(activity, g50.f100598b);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            CleverTapAPI.m5765b0();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            CleverTapAPI.m5767c0(activity, g50.f100598b);
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
