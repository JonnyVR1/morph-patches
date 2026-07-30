package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class kw0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public static kw0 f124814b;

    /* JADX INFO: renamed from: a */
    public int f124815a = 0;

    /* JADX INFO: renamed from: a */
    public static void m147407a(Application application) {
        if (f124814b == null) {
            kw0 kw0Var = new kw0();
            f124814b = kw0Var;
            application.registerActivityLifecycleCallbacks(kw0Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull @NotNull Activity activity) {
        this.f124815a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull @NotNull Activity activity) {
        this.f124815a--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull @NotNull Activity activity, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull @NotNull Activity activity, @NonNull @NotNull Bundle bundle) {
    }
}
