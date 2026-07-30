package p153l;

import android.annotation.NonNull;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.floatview.view.FxManagerView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010 \u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001c2\u000f\b\u0001\u0010\u001f\u001a\t\u0018\u00010\u001e¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010\u000eJ\u001f\u0010#\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010\u000eJ\u001f\u0010$\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b$\u0010\u000eJ.\u0010%\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001c2\r\b\u0001\u0010\u001f\u001a\u00070\u001e¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b%\u0010!J\u001f\u0010&\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010'\u001a\u00020\f2\r\b\u0001\u0010\u001d\u001a\u00070\n¢\u0006\u0002\b\u001cH\u0096\u0001¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Ll/rdj;", "Ll/udj;", "Ll/jul;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Ll/sdj;", "helper", "Ll/bej;", "proxyLifecycleImpl", "<init>", "(Ll/sdj;Ll/bej;)V", "Landroid/app/Activity;", "activity", "", "r", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "", "p", "(Landroid/app/Activity;)Z", "Landroid/view/ViewGroup;", "container", "g", "(Landroid/view/ViewGroup;)V", "k", "()V", "m", "Lkotlin/jvm/internal/EnhancedNullability;", "p0", "Landroid/os/Bundle;", "p1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", BLiveStormDanmakuGiftResourceType.f45294s, "q", "f", "Ll/sdj;", "Ll/bej;", "Ll/il50;", "h", "Ll/il50;", "windowsInsetsListener", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rdj extends udj implements jul, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final sdj helper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final bej proxyLifecycleImpl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final il50 windowsInsetsListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdj(@NotNull sdj sdjVar, @NotNull bej bejVar) {
        super(sdjVar);
        sdjVar.getClass();
        bejVar.getClass();
        this.helper = sdjVar;
        this.proxyLifecycleImpl = bejVar;
        bejVar.m103702b(sdjVar, this);
        this.windowsInsetsListener = new il50() { // from class: l.qdj
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return rdj.m180849o(this.f156737a, view, dgq0Var);
            }
        };
    }

    /* JADX INFO: renamed from: o */
    public static dgq0 m180849o(rdj rdjVar, View view, dgq0 dgq0Var) {
        view.getClass();
        dgq0Var.getClass();
        int iM115681g = dgq0Var.m115681g();
        sdj sdjVar = rdjVar.helper;
        if (sdjVar.statsBarHeight != iM115681g) {
            sdjVar.statsBarHeight = iM115681g;
        }
        return dgq0Var;
    }

    @Override // p153l.udj
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo180850e() {
        Application applicationM217317d = yti.INSTANCE.m217317d();
        applicationM217317d.getClass();
        return applicationM217317d;
    }

    @Override // p153l.udj
    /* JADX INFO: renamed from: g */
    public void mo180851g(@Nullable ViewGroup container) {
        super.mo180851g(container);
        m195483c();
    }

    @Override // p153l.udj
    /* JADX INFO: renamed from: k */
    public void mo180852k() {
        m180855q();
        super.mo180852k();
        m180857s();
    }

    @Override // p153l.udj
    /* JADX INFO: renamed from: m */
    public void mo180853m() {
        m180855q();
        super.mo180853m();
        yti.INSTANCE.m217321i(this.helper.getTag(), this);
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
    public final boolean m180854p(@NotNull Activity activity) {
        FxManagerView fxManagerViewMo155944a;
        activity.getClass();
        FrameLayout frameLayoutM115419b = dej.m115419b(activity);
        if (frameLayoutM115419b == null) {
            return true;
        }
        if (m195487i() == frameLayoutM115419b) {
            return false;
        }
        if (getManagerView() == null) {
            this.helper.m185467d(activity);
            this.helper.m185468e(activity);
            m195489l();
        } else {
            FxManagerView fxManagerViewMo155944a2 = getManagerView();
            if ((fxManagerViewMo155944a2 == null || fxManagerViewMo155944a2.getVisibility() != 0) && (fxManagerViewMo155944a = getManagerView()) != null) {
                fxManagerViewMo155944a.setVisibility(0);
            }
            m195485f();
        }
        m195490n(frameLayoutM115419b);
        nul nulVar = this.helper.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo120544b();
        }
        ViewGroup viewGroupM195487i = m195487i();
        if (viewGroupM195487i == null) {
            return true;
        }
        viewGroupM195487i.addView(getManagerView());
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m180855q() {
        FxManagerView fxManagerViewMo155944a = getManagerView();
        if (fxManagerViewMo155944a == null) {
            return;
        }
        kkl0.m150194y0(fxManagerViewMo155944a, null);
    }

    /* JADX INFO: renamed from: r */
    public void m180856r(@NotNull Activity activity) {
        activity.getClass();
        FrameLayout frameLayoutM115419b = dej.m115419b(activity);
        if (frameLayoutM115419b != null) {
            mo180851g(frameLayoutM115419b);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m180857s() {
        FxManagerView fxManagerViewMo155944a = getManagerView();
        if (fxManagerViewMo155944a != null) {
            kkl0.m150194y0(fxManagerViewMo155944a, this.windowsInsetsListener);
            fxManagerViewMo155944a.requestApplyInsets();
        }
    }
}
