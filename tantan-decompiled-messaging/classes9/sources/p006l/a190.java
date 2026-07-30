package p006l;

import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.svq;
import l.vcl0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Ll/a190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", "a", "()Z", "b", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", "t", "x", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a190 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a190(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m11687r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: u */
    private final void m11689u() {
        this.merchandise = (Merchandise) vwb.r(CoreModule.f1534c.f3643j0.m2507D5(ProductCategory.get("tttVip")), new w9j() { // from class: l.z090
            public final Object call(Object obj) {
                return a190.m11687r((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m11690v(a190 a190Var, View view) {
        zvf0.r(a190Var.mo11695h(), a190Var.m11751f());
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        a190Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m11691w(a190 a190Var, View view) {
        zvf0.r(a190Var.mo11698t(), a190Var.m11751f());
        zvf0.u("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "oDiamond")});
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        a190Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: y */
    public static final void m11692y(a190 a190Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC0495a5.m11748l(a190Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return !xma.m27368Y3() && sj20.m23814a().m23815b() && xma.m27355L3() && !CoreModule.f1534c.f3587Q1.f4106R.m6697N() && sj20.m23814a().m23817d();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        m11689u();
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().a());
        linearLayout.setOrientation(1);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
        int iC = svq.c(5);
        this._bottom_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(52));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        linearLayout.addView(this._bottom_view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getPrivilegeEntranceInfo().a());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().a(), (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, svq.c(137)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        getPrivilegeEntranceInfo().c().addView(frameLayout);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_hwbefore24hodsvip";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            m11699x(true);
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.s3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().a().drawable(d3c0.v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.g6);
            String strD = zb90.d(SummarizedPrivilegesId.get("svip"));
            boolean zM24172M = src0.m24159r().m24172M();
            boolean zM24189y = src0.m24159r().m24189y();
            if (zM24172M && zM24189y) {
                strD = CoreModule.m1854P().m11706a().m5412c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.u));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.C9);
            xdl0.M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.x090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a190.m11690v(this.f25643a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m15592o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.p5);
                xdl0.M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.Q));
                xdl0.M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(d3c0.q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                xdl0.M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.o3);
                qib0.f19782G.m12767Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                xdl0.M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                xdl0.M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            xdl0.E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.y090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a190.m11691w(this.f27834a, view);
                }
            });
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "oDiamond")});
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.a(sVGAnimationView, svq.c(10));
            m11699x(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String mo11698t() {
        return "e_privilege_button_hwbefore24hodsvip";
    }

    /* JADX INFO: renamed from: x */
    public final void m11699x(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, (Object) null);
                xdl0.M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.Q0(sVGAnimationView, new e30() { // from class: l.w090
                    public final void call(Object obj) {
                        a190.m11692y(this.f24579a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC0495a5.m11748l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }
}
