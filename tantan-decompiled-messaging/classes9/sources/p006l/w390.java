package p006l;

import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.svq;
import l.vcl0;
import l.w2b0;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ll/w390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", "v", "(Z)V", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", "s", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w390 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w390(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m26171t(w390 w390Var, View view) {
        zvf0.r(w390Var.mo11695h(), w390Var.m11751f());
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        w390Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: u */
    public static final void m26172u(w390 w390Var, View view) {
        j760[] j760VarArrM24175R = src0.m24159r().m24175R();
        zvf0.u("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrM24175R, j760VarArrM24175R.length));
        zvf0.r(w390Var.m26175s(), w390Var.m11751f());
        if (src0.m24159r().m24190z()) {
            src0.m24159r().m24176S(w390Var.getPrivilegeEntranceInfo().a(), src0.m24159r().m24179l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
            return;
        }
        String strC = w2b0.c("p_navigation,privilege_button", 1);
        if (src0.m24159r().m24172M()) {
            CoreModule.m1854P().m11706a().m5338Rm(w390Var.getPrivilegeEntranceInfo().a(), strC);
            return;
        }
        Act actA = w390Var.getPrivilegeEntranceInfo().a();
        strC.getClass();
        c.O1(actA, strC, (Privilege) null, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 508, (Object) null);
    }

    /* JADX INFO: renamed from: v */
    private final void m26173v(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, (Object) null);
                xdl0.M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.Q0(sVGAnimationView, new e30() { // from class: l.t390
                    public final void call(Object obj) {
                        w390.m26174w(this.f21857a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC0495a5.m11748l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m26174w(w390 w390Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC0495a5.m11748l(w390Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return zb90.h() && !xma.m27351F3() && src0.m24159r().m24172M() && !src0.m24159r().m24189y();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().a());
        linearLayout.setOrientation(1);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        linearLayout.addView(this._top_view, layoutParams);
        this._bottom_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        linearLayout.addView(this._bottom_view, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(getPrivilegeEntranceInfo().a());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().a(), (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, svq.c(138)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        getPrivilegeEntranceInfo().c().addView(frameLayout);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_svipautorecovery";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            m26173v(true);
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.w8);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.t3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.g6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.q8);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(zb90.d(SummarizedPrivilegesId.get("svip")));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            xdl0.M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.u390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w390.m26171t(this.f22451a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.E8);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText(R.string.j7);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E6D35006"));
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#CCD35006"));
            privilegeEntrancePromotionBottomView.get_buy_tip().setText("开通订阅即可限时恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.x8);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("去恢复");
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.v390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w390.m26172u(this.f24111a, view);
                }
            });
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.a(sVGAnimationView, svq.c(10));
            m26173v(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m26175s() {
        return "e_privilege_button_svipautorecovery";
    }
}
