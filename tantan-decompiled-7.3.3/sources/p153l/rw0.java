package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class rw0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public static rw0 f165089b;

    /* JADX INFO: renamed from: a */
    public int f165090a = 0;

    /* JADX INFO: renamed from: a */
    public static void m183334a(Application application) {
        if (f165089b == null) {
            rw0 rw0Var = new rw0();
            f165089b = rw0Var;
            application.registerActivityLifecycleCallbacks(rw0Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull @NotNull Activity activity) {
        this.f165090a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull @NotNull Activity activity) {
        this.f165090a--;
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
