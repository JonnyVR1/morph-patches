package com.p000p1.mobile.putong.core.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.cwf0;
import l.e30;
import l.i0e;
import l.j760;
import l.u0n;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.f6c0;
import p006l.gpw;
import p006l.o0n;
import p006l.u4c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/p1/mobile/putong/core/admob/NavigationBarAdView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "L", "(Lcom/p1/mobile/android/app/Act;)V", "E", "G", "M", "", "byUser", "B", "(Z)V", "K", "F", "a", "Lv/VFrame;", "adContainer", "Landroid/view/View;", "b", "Landroid/view/View;", "admobClose", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavigationBarAdView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public VFrame adContainer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View admobClose;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public NavigationBarAdView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m1919C(NavigationBarAdView navigationBarAdView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        navigationBarAdView.m1926B(z);
    }

    /* JADX INFO: renamed from: p */
    public static void m1920p(String str) {
        NavigationBarAdmobHelper.INSTANCE.d();
        zvf0.A("e_intl_ad_request_call", "p_intl_main_ad_view", new j760[]{vwb.Y("load_result", "fail_no_fill")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m1921s(NavigationBarAdView navigationBarAdView, String str) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.e();
        if (navigationBarAdmobHelper.x()) {
            xdl0.M(navigationBarAdView, false);
            navigationBarAdView.m1930K();
            return;
        }
        xdl0.M(navigationBarAdView, true);
        navigationBarAdView.m1930K();
        zvf0.A("e_intl_ad_request_call", "p_intl_main_ad_view", new j760[]{vwb.Y("load_result", "success")});
        cwf0 cwf0Var = new cwf0("p_intl_main_ad_view", NavigationBarAdView.class.getName());
        cwf0Var.p(new j760[]{vwb.Y("ad_unit_id", "ca-app-pub-6567608331519569/1242795139"), vwb.Y("request_type", navigationBarAdmobHelper.m() == 1 ? "cold_start" : "tab_refresh")});
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: u */
    public static Unit m1922u(NavigationBarAdView navigationBarAdView) {
        m1919C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static void m1923v(NavigationBarAdView navigationBarAdView, String str) {
        navigationBarAdView.m1926B(true);
    }

    /* JADX INFO: renamed from: w */
    public static void m1924w(NavigationBarAdView navigationBarAdView, View view) {
        navigationBarAdView.m1926B(true);
    }

    /* JADX INFO: renamed from: z */
    public static Unit m1925z(NavigationBarAdView navigationBarAdView) {
        m1919C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m1926B(boolean byUser) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.c();
        m1928F();
        if (byUser) {
            zvf0.D("e_intl_ad_banner_close", "p_intl_main_ad_view", new j760[]{vwb.Y("session_swipe_count", Integer.valueOf(navigationBarAdmobHelper.n()))});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m1927E() {
        if (xdl0.O0(this)) {
            xdl0.M(this, false);
            m1930K();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final void m1928F() {
        VFrame vFrame = this.adContainer;
        if (vFrame != null) {
            vFrame.removeAllViews();
            xdl0.M(this, false);
            m1930K();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m1929G() {
        if (!NavigationBarAdmobHelper.INSTANCE.p() || xdl0.O0(this)) {
            return;
        }
        xdl0.M(this, true);
        m1930K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m1930K() {
        NavigationBarAdmobHelper.INSTANCE.z(getVisibility() == 0 ? NavigationBarAdmobHelper.INSTANCE.h() : 0);
    }

    /* JADX INFO: renamed from: L */
    public final void m1931L(@NotNull Act act) {
        act.getClass();
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.g(new Function0() { // from class: l.x620
            public final Object invoke() {
                return NavigationBarAdView.m1925z(this.f27367a);
            }
        })) {
            navigationBarAdmobHelper.f();
            o0n o0nVarJ = u0n.l().j(11);
            o0nVarJ.getClass();
            gpw gpwVar = (gpw) o0nVarJ;
            gpwVar.m15916t(new e30() { // from class: l.y620
                public final void call(Object obj) {
                    NavigationBarAdView.m1921s(this.f28042a, (String) obj);
                }
            }, new e30() { // from class: l.z620
                public final void call(Object obj) {
                    NavigationBarAdView.m1923v(this.f28652a, (String) obj);
                }
            }, new e30() { // from class: l.a720
                public final void call(Object obj) {
                    NavigationBarAdView.m1920p((String) obj);
                }
            });
            gpwVar.mo12565h(act, this.adContainer);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1932M() {
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.p()) {
            navigationBarAdmobHelper.g(new Function0() { // from class: l.w620
                public final Object invoke() {
                    return NavigationBarAdView.m1922u(this.f24998a);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        xdl0.M(this, false);
        View viewInflate = View.inflate(getContext(), f6c0.f12247ie, null);
        viewInflate.getClass();
        addView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        this.adContainer = findViewById(u4c0.f23068k);
        View viewFindViewById = findViewById(u4c0.f23306y);
        this.admobClose = viewFindViewById;
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.v620
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationBarAdView.m1924w(this.f24161a, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NavigationBarAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ NavigationBarAdView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
