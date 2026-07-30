package com.p046p1.mobile.putong.core.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p149l.cwf0;
import p149l.e30;
import p149l.f6c0;
import p149l.gpw;
import p149l.i0e;
import p149l.o0n;
import p149l.u0n;
import p149l.u4c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/admob/NavigationBarAdView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "L", "(Lcom/p1/mobile/android/app/Act;)V", "E", "G", "M", "", "byUser", "B", "(Z)V", "K", "F", "a", "Lv/VFrame;", "adContainer", "Landroid/view/View;", "b", "Landroid/view/View;", "admobClose", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NavigationBarAdView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public VFrame adContainer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View admobClose;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NavigationBarAdView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m29991C(NavigationBarAdView navigationBarAdView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        navigationBarAdView.m29998B(z);
    }

    /* JADX INFO: renamed from: p */
    public static void m29992p(String str) {
        NavigationBarAdmobHelper.INSTANCE.m36143d();
        zvf0.m220368A("e_intl_ad_request_call", "p_intl_main_ad_view", vwb.m200311Y("load_result", "fail_no_fill"));
    }

    /* JADX INFO: renamed from: s */
    public static void m29993s(NavigationBarAdView navigationBarAdView, String str) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m36144e();
        if (navigationBarAdmobHelper.m36163x()) {
            xdl0.m208344M(navigationBarAdView, false);
            navigationBarAdView.m30002K();
            return;
        }
        xdl0.m208344M(navigationBarAdView, true);
        navigationBarAdView.m30002K();
        zvf0.m220368A("e_intl_ad_request_call", "p_intl_main_ad_view", vwb.m200311Y("load_result", "success"));
        cwf0 cwf0Var = new cwf0("p_intl_main_ad_view", NavigationBarAdView.class.getName());
        cwf0Var.m109040p(vwb.m200311Y("ad_unit_id", "ca-app-pub-6567608331519569/1242795139"), vwb.m200311Y("request_type", navigationBarAdmobHelper.m36152m() == 1 ? "cold_start" : "tab_refresh"));
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: u */
    public static Unit m29994u(NavigationBarAdView navigationBarAdView) {
        m29991C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static void m29995v(NavigationBarAdView navigationBarAdView, String str) {
        navigationBarAdView.m29998B(true);
    }

    /* JADX INFO: renamed from: w */
    public static void m29996w(NavigationBarAdView navigationBarAdView, View view) {
        navigationBarAdView.m29998B(true);
    }

    /* JADX INFO: renamed from: z */
    public static Unit m29997z(NavigationBarAdView navigationBarAdView) {
        m29991C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m29998B(boolean byUser) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m36142c();
        m30000F();
        if (byUser) {
            zvf0.m220371D("e_intl_ad_banner_close", "p_intl_main_ad_view", vwb.m200311Y("session_swipe_count", Integer.valueOf(navigationBarAdmobHelper.m36153n())));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m29999E() {
        if (xdl0.m208349O0(this)) {
            xdl0.m208344M(this, false);
            m30002K();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m30000F() {
        VFrame vFrame = this.adContainer;
        if (vFrame != null) {
            vFrame.removeAllViews();
            xdl0.m208344M(this, false);
            m30002K();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m30001G() {
        if (!NavigationBarAdmobHelper.INSTANCE.m36155p() || xdl0.m208349O0(this)) {
            return;
        }
        xdl0.m208344M(this, true);
        m30002K();
    }

    /* JADX INFO: renamed from: K */
    public final void m30002K() {
        NavigationBarAdmobHelper.INSTANCE.m36165z(getVisibility() == 0 ? NavigationBarAdmobHelper.INSTANCE.m36147h() : 0);
    }

    /* JADX INFO: renamed from: L */
    public final void m30003L(@NotNull Act act) {
        act.getClass();
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.m36146g(new Function0() { // from class: l.x620
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationBarAdView.m29997z(this.f191210a);
            }
        })) {
            navigationBarAdmobHelper.m36145f();
            o0n o0nVarM191362j = u0n.m191353l().m191362j(11);
            o0nVarM191362j.getClass();
            gpw gpwVar = (gpw) o0nVarM191362j;
            gpwVar.m127494t(new e30() { // from class: l.y620
                @Override // p149l.e30
                public final void call(Object obj) {
                    NavigationBarAdView.m29993s(this.f196506a, (String) obj);
                }
            }, new e30() { // from class: l.z620
                @Override // p149l.e30
                public final void call(Object obj) {
                    NavigationBarAdView.m29995v(this.f201884a, (String) obj);
                }
            }, new e30() { // from class: l.a720
                @Override // p149l.e30
                public final void call(Object obj) {
                    NavigationBarAdView.m29992p((String) obj);
                }
            });
            gpwVar.mo100438h(act, this.adContainer);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m30004M() {
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.m36155p()) {
            navigationBarAdmobHelper.m36146g(new Function0() { // from class: l.w620
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationBarAdView.m29994u(this.f184804a);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        xdl0.m208344M(this, false);
        View viewInflate = View.inflate(getContext(), f6c0.f95833ie, null);
        viewInflate.getClass();
        addView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        this.adContainer = (VFrame) findViewById(u4c0.f174320k);
        View viewFindViewById = findViewById(u4c0.f174558y);
        this.admobClose = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.v620
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationBarAdView.m29996w(this.f180151a, view);
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
