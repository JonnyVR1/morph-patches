package p149l;

import android.annotation.NonNull;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.floatview.view.FxManagerView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010 \u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001c2\u000f\b\u0001\u0010\u001f\u001a\t\u0018\u00010\u001e¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010\u000eJ\u001f\u0010#\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010\u000eJ\u001f\u0010$\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b$\u0010\u000eJ.\u0010%\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001c2\r\b\u0001\u0010\u001f\u001a\u00070\u001e¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b%\u0010!J\u001f\u0010&\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010'\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Ll/xaj;", "Ll/abj;", "Ll/vrl;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Ll/yaj;", "helper", "Ll/hbj;", "proxyLifecycleImpl", "<init>", "(Ll/yaj;Ll/hbj;)V", "Landroid/app/Activity;", "activity", "", "r", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "", "p", "(Landroid/app/Activity;)Z", "Landroid/view/ViewGroup;", "container", "g", "(Landroid/view/ViewGroup;)V", "k", "()V", "m", "Lkotlin/jvm/internal/EnhancedNullability;", "p0", "Landroid/os/Bundle;", "p1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", BLiveStormDanmakuGiftResourceType.f44446s, "q", "f", "Ll/yaj;", "Ll/hbj;", "Ll/bd50;", "h", "Ll/bd50;", "windowsInsetsListener", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xaj extends abj implements vrl, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final yaj helper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final hbj proxyLifecycleImpl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final bd50 windowsInsetsListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaj(@NotNull yaj yajVar, @NotNull hbj hbjVar) {
        super(yajVar);
        yajVar.getClass();
        hbjVar.getClass();
        this.helper = yajVar;
        this.proxyLifecycleImpl = hbjVar;
        hbjVar.m130332b(yajVar, this);
        this.windowsInsetsListener = new bd50() { // from class: l.waj
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return xaj.m207573o(this.f185473a, view, y6q0Var);
            }
        };
    }

    /* JADX INFO: renamed from: o */
    public static y6q0 m207573o(xaj xajVar, View view, y6q0 y6q0Var) {
        view.getClass();
        y6q0Var.getClass();
        int iM213180g = y6q0Var.m213180g();
        yaj yajVar = xajVar.helper;
        if (yajVar.statsBarHeight != iM213180g) {
            yajVar.statsBarHeight = iM213180g;
        }
        return y6q0Var;
    }

    @Override // p149l.abj
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo95657e() {
        Application applicationM108372d = cri.INSTANCE.m108372d();
        applicationM108372d.getClass();
        return applicationM108372d;
    }

    @Override // p149l.abj
    /* JADX INFO: renamed from: g */
    public void mo95659g(@Nullable ViewGroup container) {
        super.mo95659g(container);
        m95655c();
    }

    @Override // p149l.abj
    /* JADX INFO: renamed from: k */
    public void mo95663k() {
        m207575q();
        super.mo95663k();
        m207577s();
    }

    @Override // p149l.abj
    /* JADX INFO: renamed from: m */
    public void mo95665m() {
        m207575q();
        super.mo95665m();
        cri.INSTANCE.m108376i(this.helper.getTag(), this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull @NotNull Activity p0, @android.annotation.Nullable @Nullable Bundle p1) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityCreated(p0, p1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull @NotNull Activity p0) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityDestroyed(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull @NotNull Activity p0) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityPaused(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull @NotNull Activity p0) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityResumed(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull @NotNull Activity p0, @NonNull @NotNull Bundle p1) {
        p0.getClass();
        p1.getClass();
        this.proxyLifecycleImpl.onActivitySaveInstanceState(p0, p1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull @NotNull Activity p0) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityStarted(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull @NotNull Activity p0) {
        p0.getClass();
        this.proxyLifecycleImpl.onActivityStopped(p0);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m207574p(@NotNull Activity activity) {
        FxManagerView managerView;
        activity.getClass();
        FrameLayout frameLayoutM140783b = jbj.m140783b(activity);
        if (frameLayoutM140783b == null) {
            return true;
        }
        if (m95661i() == frameLayoutM140783b) {
            return false;
        }
        if (getManagerView() == null) {
            this.helper.m213845d(activity);
            this.helper.m213846e(activity);
            m95664l();
        } else {
            FxManagerView managerView2 = getManagerView();
            if ((managerView2 == null || managerView2.getVisibility() != 0) && (managerView = getManagerView()) != null) {
                managerView.setVisibility(0);
            }
            m95658f();
        }
        m95666n(frameLayoutM140783b);
        zrl zrlVar = this.helper.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145303b();
        }
        ViewGroup viewGroupM95661i = m95661i();
        if (viewGroupM95661i == null) {
            return true;
        }
        viewGroupM95661i.addView(getManagerView());
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m207575q() {
        FxManagerView managerView = getManagerView();
        if (managerView == null) {
            return;
        }
        gbl0.m125231y0(managerView, null);
    }

    /* JADX INFO: renamed from: r */
    public void m207576r(@NotNull Activity activity) {
        activity.getClass();
        FrameLayout frameLayoutM140783b = jbj.m140783b(activity);
        if (frameLayoutM140783b != null) {
            mo95659g(frameLayoutM140783b);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m207577s() {
        FxManagerView managerView = getManagerView();
        if (managerView != null) {
            gbl0.m125231y0(managerView, this.windowsInsetsListener);
            managerView.requestApplyInsets();
        }
    }
}
