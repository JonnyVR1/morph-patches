package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p046p1.mobile.putong.floatview.view.FxManagerView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001eR\u0018\u0010\"\u001a\u00020\u001d*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/hbj;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Ll/yaj;", "helper", "Ll/xaj;", "control", "", "b", "(Ll/yaj;Ll/xaj;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "a", "Ll/yaj;", "Ll/xaj;", "appControl", "", "()Z", "enableFx", "c", "(Landroid/app/Activity;)Z", "isParent", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hbj implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public yaj helper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public xaj appControl;

    /* JADX INFO: renamed from: a */
    public final boolean m130331a() {
        yaj yajVar = this.helper;
        if (yajVar != null) {
            return yajVar.enableFx;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m130332b(@NotNull yaj helper, @NotNull xaj control) {
        helper.getClass();
        control.getClass();
        this.helper = helper;
        this.appControl = control;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m130333c(Activity activity) {
        FxManagerView managerView;
        xaj xajVar = this.appControl;
        return ((xajVar == null || (managerView = xajVar.getManagerView()) == null) ? null : managerView.getParent()) == jbj.m140783b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        xaj xajVar;
        activity.getClass();
        if (m130331a() && m130333c(activity) && (xajVar = this.appControl) != null) {
            xajVar.m207576r(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        xaj xajVar;
        activity.getClass();
        if (!m130331a() || m130333c(activity) || (xajVar = this.appControl) == null) {
            return;
        }
        xajVar.m207574p(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
    }
}
