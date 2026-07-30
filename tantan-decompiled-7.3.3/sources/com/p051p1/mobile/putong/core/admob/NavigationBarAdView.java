package com.p051p1.mobile.putong.core.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p153l.adc0;
import p153l.bnl0;
import p153l.fsw;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.o2n;
import p153l.u2n;
import p153l.w1e;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/admob/NavigationBarAdView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "L", "(Lcom/p1/mobile/android/app/Act;)V", "E", "G", "M", "", "byUser", "B", "(Z)V", "K", "F", "a", "Lv/VFrame;", "adContainer", "Landroid/view/View;", "b", "Landroid/view/View;", "admobClose", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static /* synthetic */ void m30989C(NavigationBarAdView navigationBarAdView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        navigationBarAdView.m30996B(z);
    }

    /* JADX INFO: renamed from: p */
    public static void m30990p(String str) {
        NavigationBarAdmobHelper.INSTANCE.m37146d();
        i4g0.m138492A("e_intl_ad_request_call", "p_intl_main_ad_view", jyb.m147494Y("load_result", "fail_no_fill"));
    }

    /* JADX INFO: renamed from: s */
    public static void m30991s(NavigationBarAdView navigationBarAdView, String str) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m37147e();
        if (navigationBarAdmobHelper.m37166x()) {
            bnl0.m105524M(navigationBarAdView, false);
            navigationBarAdView.m31000K();
            return;
        }
        bnl0.m105524M(navigationBarAdView, true);
        navigationBarAdView.m31000K();
        i4g0.m138492A("e_intl_ad_request_call", "p_intl_main_ad_view", jyb.m147494Y("load_result", "success"));
        l4g0 l4g0Var = new l4g0("p_intl_main_ad_view", NavigationBarAdView.class.getName());
        l4g0Var.m152781p(jyb.m147494Y("ad_unit_id", "ca-app-pub-6567608331519569/1242795139"), jyb.m147494Y("request_type", navigationBarAdmobHelper.m37155m() == 1 ? "cold_start" : "tab_refresh"));
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: u */
    public static Unit m30992u(NavigationBarAdView navigationBarAdView) {
        m30989C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static void m30993v(NavigationBarAdView navigationBarAdView, String str) {
        navigationBarAdView.m30996B(true);
    }

    /* JADX INFO: renamed from: w */
    public static void m30994w(NavigationBarAdView navigationBarAdView, View view) {
        navigationBarAdView.m30996B(true);
    }

    /* JADX INFO: renamed from: z */
    public static Unit m30995z(NavigationBarAdView navigationBarAdView) {
        m30989C(navigationBarAdView, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m30996B(boolean byUser) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m37145c();
        m30998F();
        if (byUser) {
            i4g0.m138495D("e_intl_ad_banner_close", "p_intl_main_ad_view", jyb.m147494Y("session_swipe_count", Integer.valueOf(navigationBarAdmobHelper.m37156n())));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m30997E() {
        if (bnl0.m105529O0(this)) {
            bnl0.m105524M(this, false);
            m31000K();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m30998F() {
        VFrame vFrame = this.adContainer;
        if (vFrame != null) {
            vFrame.removeAllViews();
            bnl0.m105524M(this, false);
            m31000K();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m30999G() {
        if (!NavigationBarAdmobHelper.INSTANCE.m37158p() || bnl0.m105529O0(this)) {
            return;
        }
        bnl0.m105524M(this, true);
        m31000K();
    }

    /* JADX INFO: renamed from: K */
    public final void m31000K() {
        NavigationBarAdmobHelper.INSTANCE.m37168z(getVisibility() == 0 ? NavigationBarAdmobHelper.INSTANCE.m37150h() : 0);
    }

    /* JADX INFO: renamed from: L */
    public final void m31001L(@NotNull Act act) {
        act.getClass();
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.m37149g(new Function0() { // from class: l.ff20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationBarAdView.m30995z(this.f98741a);
            }
        })) {
            navigationBarAdmobHelper.m37148f();
            o2n o2nVarM194294j = u2n.m194285l().m194294j(11);
            o2nVarM194294j.getClass();
            fsw fswVar = (fsw) o2nVarM194294j;
            fswVar.m127272t(new y20() { // from class: l.gf20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NavigationBarAdView.m30991s(this.f103874a, (String) obj);
                }
            }, new y20() { // from class: l.hf20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NavigationBarAdView.m30993v(this.f109215a, (String) obj);
                }
            }, new y20() { // from class: l.if20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NavigationBarAdView.m30990p((String) obj);
                }
            });
            fswVar.mo125406h(act, this.adContainer);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m31002M() {
        if (this.adContainer == null) {
            return;
        }
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        if (navigationBarAdmobHelper.m37158p()) {
            navigationBarAdmobHelper.m37149g(new Function0() { // from class: l.ef20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationBarAdView.m30992u(this.f93697a);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        bnl0.m105524M(this, false);
        View viewInflate = View.inflate(getContext(), kec0.f126005pe, null);
        viewInflate.getClass();
        addView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        this.adContainer = (VFrame) findViewById(adc0.f70411k);
        View viewFindViewById = findViewById(adc0.f70649y);
        this.admobClose = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.df20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationBarAdView.m30994w(this.f88110a, view);
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
