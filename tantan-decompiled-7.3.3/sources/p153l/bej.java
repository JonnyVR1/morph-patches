package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p051p1.mobile.putong.floatview.view.FxManagerView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001eR\u0018\u0010\"\u001a\u00020\u001d*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m88121d2 = {"Ll/bej;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Ll/sdj;", "helper", "Ll/rdj;", "control", "", "b", "(Ll/sdj;Ll/rdj;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "a", "Ll/sdj;", "Ll/rdj;", "appControl", "", "()Z", "enableFx", "c", "(Landroid/app/Activity;)Z", "isParent", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bej implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public sdj helper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public rdj appControl;

    /* JADX INFO: renamed from: a */
    public final boolean m103701a() {
        sdj sdjVar = this.helper;
        if (sdjVar != null) {
            return sdjVar.enableFx;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m103702b(@NotNull sdj helper, @NotNull rdj control) {
        helper.getClass();
        control.getClass();
        this.helper = helper;
        this.appControl = control;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m103703c(Activity activity) {
        FxManagerView fxManagerViewMo155944a;
        rdj rdjVar = this.appControl;
        return ((rdjVar == null || (fxManagerViewMo155944a = rdjVar.getManagerView()) == null) ? null : fxManagerViewMo155944a.getParent()) == dej.m115419b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        rdj rdjVar;
        activity.getClass();
        if (m103701a() && m103703c(activity) && (rdjVar = this.appControl) != null) {
            rdjVar.m180856r(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        rdj rdjVar;
        activity.getClass();
        if (!m103701a() || m103703c(activity) || (rdjVar = this.appControl) == null) {
            return;
        }
        rdjVar.m180854p(activity);
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
